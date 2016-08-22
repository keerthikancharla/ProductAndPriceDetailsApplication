package com.myretail.productdetails;

import com.myretail.productdetails.config.PropertyConfigurations;
import com.myretail.productdetails.exceptions.UnknownServerException;
import com.myretail.productdetails.responses.*;
import com.myretail.productdetails.services.ProductDetailsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductAndPriceDetailsServicesTests {

    @MockBean
    private RestTemplate restTemplate;

    @MockBean
    private PropertyConfigurations propertyConfigurations;

    @Autowired
    private ProductDetailsService productDetailsService;

    @Test
    public void testGetProductNameWithInvalidProductId() throws Exception {
        ResponseEntity<Object> response = new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
        given(restTemplate.getForEntity(anyString(), any(Class.class)))
                .willReturn(response);
        given(propertyConfigurations.getApiKey()).willReturn("abcdefghijkl");
        String productName = productDetailsService.getProductName(123456789);
        assertThat(productName).isNull();
    }

    @Test
    public void testGetProductNameWithDummyProductId() throws Exception {
        OnlineDescription onlineDescription = null;
        List<Item> items = new ArrayList<>();
        Item item = new Item();
        item.setOnlineDescription(onlineDescription);
        items.add(item);
        ProductCompositeResponse productCompositeResponse = new ProductCompositeResponse();
        productCompositeResponse.setItems(items);
        ProductDetails productDetails = new ProductDetails();
        productDetails.setProductCompositeResponse(productCompositeResponse);
        ResponseEntity<Object> response = new ResponseEntity<Object>(productDetails, HttpStatus.OK);
        given(restTemplate.getForEntity(anyString(), any(Class.class)))
                .willReturn(response);
        given(propertyConfigurations.getApiKey()).willReturn("abcdefghijkl");
        String productName = productDetailsService.getProductName(123456789);
        assertThat(productName).isNull();
    }

    @Test
    public void testGetProductNameWithValidProductId() throws Exception {
        OnlineDescription onlineDescription = new OnlineDescription("value", "type");
        List<Item> items = new ArrayList<>();
        Item item = new Item();
        item.setOnlineDescription(onlineDescription);
        items.add(item);
        ProductCompositeResponse productCompositeResponse = new ProductCompositeResponse();
        productCompositeResponse.setItems(items);
        ProductDetails productDetails = new ProductDetails();
        productDetails.setProductCompositeResponse(productCompositeResponse);
        ResponseEntity<Object> response = new ResponseEntity<Object>(productDetails, HttpStatus.OK);
        given(restTemplate.getForEntity(anyString(), any(Class.class)))
                .willReturn(response);
        given(propertyConfigurations.getApiKey()).willReturn("abcdefghij");
        String productName = productDetailsService.getProductName(123456789);
        assertThat(productName).isEqualTo("value");
    }

    @Test
    public void testGetProductPriceWithInvalidProductId() throws Exception {
        ResponseEntity<Object> response = new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
        given(restTemplate.getForEntity(anyString(), any(Class.class)))
                .willReturn(response);
        ProductPrice productPrice = new ProductPrice();
        productPrice = productDetailsService.getProductPrice(123456789);
        assertThat(productPrice).isNull();
    }

    @Test
    public void testGetProductPriceWithValidProductId() throws Exception {
        ProductPrice productPrice = new ProductPrice();
        PriceDetails priceDetails = new PriceDetails();
        priceDetails.setProductPrice(55.5);
        productPrice.setCurrentPrice(priceDetails.getProductPrice());
        ResponseEntity<Object> response = new ResponseEntity<Object>(priceDetails, HttpStatus.OK);
        given(restTemplate.getForEntity(anyString(), any(Class.class)))
                .willReturn(response);
        productPrice = productDetailsService.getProductPrice(123456789);
        assertThat(productPrice.getCurrentPrice()).isEqualTo(55.5);
    }

    @Test
    public void testGetProductPriceWithException() throws Exception {
        ProductPrice productPrice = null;
        ResponseEntity<Object> response = new ResponseEntity<Object>(HttpStatus.OK);
        given(restTemplate.getForEntity(anyString(), any(Class.class)))
                .willThrow(new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR));
        try {
            productPrice = productDetailsService.getProductPrice(123456789);
        } catch (UnknownServerException e) {

        }
        assertThat(productPrice).isNull();
    }

    @Test
    public void testUpdateProductPriceWithException() throws Exception {
        ProductPrice productPrice = new ProductPrice();
        productPrice.setCurrentPrice(99.9);
        productPrice.setCurrencyCode("USD");
        String response = null;
        doThrow(new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR)).when(restTemplate).put(anyString(), any(Class.class));
        try {
            response = productDetailsService.updateProductPrice(123456789, productPrice);
        } catch (HttpClientErrorException e) {

        }
        assertThat(response).isEqualTo("Product price update failed");
    }

    @Test
    public void testUpdateProductPriceWithValidProduct() throws Exception {
        ProductPrice productPrice = new ProductPrice();
        productPrice.setCurrentPrice(99.9);
        productPrice.setCurrencyCode("USD");
        String response = null;
        doNothing().when(restTemplate).put(anyString(), any(Class.class));
        response = productDetailsService.updateProductPrice(123456789, productPrice);
        assertThat(response).isEqualTo("Product price is updated successfully");
    }
}
