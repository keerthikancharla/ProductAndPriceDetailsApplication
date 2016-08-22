package com.myretail.productdetails.controllers;

import com.myretail.productdetails.exceptions.ProductNotFoundException;
import com.myretail.productdetails.responses.ProductAndPriceDetails;
import com.myretail.productdetails.responses.ProductPrice;
import com.myretail.productdetails.services.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by keerthiprasad on 8/17/16.
 */
@Controller
public class ProductDetailsController {
    @Autowired
    private ProductDetailsService productDetailsService;

    @RequestMapping(value = "/products/{productId}", method = RequestMethod.GET)
    public
    @ResponseBody
    ProductAndPriceDetails getProductAndPriceDetails(@PathVariable @NotNull Integer productId) {
        ProductAndPriceDetails productAndPriceDetails = new ProductAndPriceDetails();
        productAndPriceDetails.setProductId(productId);
        String productName = productDetailsService.getProductName(productId);
        if (productName == null)
            throw new ProductNotFoundException();

        productAndPriceDetails.setProductName(productName);
        ProductPrice productPrice = productDetailsService.getProductPrice(productId);
        if (productPrice == null)
            throw new ProductNotFoundException();
        productAndPriceDetails.setProductPrice(productPrice);
        return productAndPriceDetails;

    }

    @RequestMapping(value = "/products/{productId}", method = RequestMethod.PUT)
    public
    @ResponseBody
    String updatePriceDetails(@PathVariable @NotNull Integer productId, @RequestBody @Valid ProductPrice productPrice) {
        String responseMessage = null;
        try {
            responseMessage = productDetailsService.updateProductPrice(productId, productPrice);
        } catch (HttpClientErrorException e) {
            if (HttpStatus.NOT_FOUND == e.getStatusCode()) {
                throw new ProductNotFoundException();
            }
        }
        return responseMessage;
    }

}
