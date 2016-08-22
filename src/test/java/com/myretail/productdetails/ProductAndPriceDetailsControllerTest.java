package com.myretail.productdetails;

import com.myretail.productdetails.config.PropertyConfigurations;
import com.myretail.productdetails.controllers.ProductDetailsController;
import com.myretail.productdetails.responses.ProductPrice;
import com.myretail.productdetails.services.ProductDetailsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by keerthiprasad on 8/20/16.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ProductDetailsController.class)
public class ProductAndPriceDetailsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductDetailsService productDetailsService;
    @MockBean
    private RestTemplate restTemplate;
    @MockBean
    private PropertyConfigurations propertyConfigurations;

    @Test
    public void testGetProductDetails() throws Exception {

        given(productDetailsService.getProductName(anyInt())).willReturn("iPhone 6 Plus 128GB - Gold - AT&T");
        ProductPrice productPrice = new ProductPrice();
        productPrice.setCurrencyCode("USD");
        productPrice.setCurrentPrice(67.0);
        given(productDetailsService.getProductPrice(anyInt())).willReturn(productPrice);

        String jsonString = "{\"productId\":16483589,\"productName\":\"iPhone 6 Plus 128GB - Gold - AT&T\",\"productPrice\":{\"currentPrice\":67.0,\"currencyCode\":\"USD\"}}";
        mockMvc.perform(get("/products/16483589"))
                .andExpect(status().isOk())
                .andExpect(content().json(jsonString));
    }

    @Test
    public void testGetProductDetailsWithInvalidPath() throws Exception {

        mockMvc.perform(get("/products"))
                .andExpect(status().isNotFound());
    }

    @Test
    public void testGetProductDetailsWithInvalidProduct() throws Exception {

        given(productDetailsService.getProductName(anyInt())).willReturn("iPhone 6 Plus 128GB - Gold - AT&T");
        ProductPrice productPrice = new ProductPrice();
        given(productDetailsService.getProductPrice(anyInt())).willReturn(null);
        String jsonString = "{\"productId\":16483589,\"productName\":\"iPhone 6 Plus 128GB - Gold - AT&T\"}";
        mockMvc.perform(get("/products/16483589"))
                .andExpect(status().isNotFound());

    }

    @Test
    public void testUpdateProductDetails() throws Exception {

        ProductPrice productPrice = new ProductPrice();
        productPrice.setCurrencyCode("USD");
        productPrice.setCurrentPrice(68.0);
        given(productDetailsService.updateProductPrice(anyInt(), any(ProductPrice.class)))
                .willReturn("Product price is updated successfully");

        String jsonString = "{\"currentPrice\":68.0,\"currencyCode\":\"USD\"}";
        mockMvc.perform(put("/products/16483589").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(jsonString))
                .andExpect(status().isOk())
                .andExpect(content().string("Product price is updated successfully"));
    }

    @Test
    public void testUpdateProductDetailsWithInvalidProduct() throws Exception {

        ProductPrice productPrice = new ProductPrice();
        given(productDetailsService.updateProductPrice(anyInt(), any(ProductPrice.class))).willThrow(new HttpClientErrorException(HttpStatus.NOT_FOUND));
        String jsonString = "{\"currentPrice\":68.0,\"currencyCode\":\"USD\"}";
        mockMvc.perform(put("/products/16483589").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON).content(jsonString))
                .andExpect(status().isNotFound());

    }

    @Test
    public void testUpdateProductDetailsWithInvalidPath() throws Exception {

        mockMvc.perform(put("/products"))
                .andExpect(status().isNotFound());
    }

}
