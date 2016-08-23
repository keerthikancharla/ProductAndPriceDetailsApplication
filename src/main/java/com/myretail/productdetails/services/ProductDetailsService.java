package com.myretail.productdetails.services;

import com.myretail.productdetails.config.PropertyConfigurations;
import com.myretail.productdetails.exceptions.UnknownServerException;
import com.myretail.productdetails.responses.PriceDetails;
import com.myretail.productdetails.responses.ProductDetails;
import com.myretail.productdetails.responses.ProductPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by keerthiprasad on 8/17/16.
 */
@Service
public class ProductDetailsService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private PropertyConfigurations propertyConfigurations;

    private String productDetailsUrl = "https://api.target.com/products/v3/{id}?fields=descriptions&id_type=TCIN&key={apiKey}";
    private String productPriceUrl = "http://localhost:8654/price/{id}";
    private String priceUpdateUrl = "http://localhost:8654/price";


    /**
     * Gets product name.
     *
     * @param productId the product id
     * @return the product name
     * This method is used to get the product name using Target API for a given product ID
     */
    public String getProductName(Integer productId) {
        String url = productDetailsUrl.replace("{id}", String.valueOf(productId));
        url=url.replace("{apiKey}",propertyConfigurations.getApiKey());
        ResponseEntity<ProductDetails> response = restTemplate.getForEntity(url, ProductDetails.class);
        if (response.getStatusCode() == HttpStatus.OK) {
            ProductDetails productDetails = response.getBody();
            if (productDetails.getProductCompositeResponse().getItems().get(0).getOnlineDescription() != null) {
                return productDetails.getProductCompositeResponse().getItems().get(0).getOnlineDescription().getValue();
            }
        }
        return null;
    }

    /**
     * Gets product price.
     *
     * @param productId the product id
     * @return the product price
     * This method is used to get the product price using PriceDetails Service for a given product ID
     */
    public ProductPrice getProductPrice(Integer productId) {
        String url = productPriceUrl.replace("{id}", String.valueOf(productId));
        ProductPrice productPrice = null;
        try {
            ResponseEntity<PriceDetails> response = restTemplate.getForEntity(url, PriceDetails.class);
            if (response.getStatusCode() == HttpStatus.OK) {
                PriceDetails priceDetails = response.getBody();
                productPrice = new ProductPrice();
                productPrice.setCurrentPrice(priceDetails.getProductPrice().doubleValue());
                productPrice.setCurrencyCode(priceDetails.getCurrencyCode());
                return productPrice;
            }

        } catch (HttpClientErrorException e) {
            System.out.println(e.getMessage());
        }
        return productPrice;
    }

    /**
     * Update product price string.
     *
     * @param productId    the product id
     * @param productPrice the product price
     * @return the string
     * This method is used to update the product price using PriceDetails Service for a given product ID
     */
    public String updateProductPrice(Integer productId, ProductPrice productPrice) {
        PriceDetails priceDetails = new PriceDetails();
        priceDetails.setProductId(productId);
        priceDetails.setProductPrice(productPrice.getCurrentPrice());
        priceDetails.setCurrencyCode(productPrice.getCurrencyCode());
        try {
            restTemplate.put(priceUpdateUrl, priceDetails);
        } catch (HttpClientErrorException e) {
            System.out.println(e.getMessage());
            return "Product price update failed";
        }

        return "Product price is updated successfully";
    }
}
