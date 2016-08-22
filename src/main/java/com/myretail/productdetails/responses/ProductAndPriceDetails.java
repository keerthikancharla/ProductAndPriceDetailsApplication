package com.myretail.productdetails.responses;

/**
 * Created by keerthiprasad on 8/17/16.
 */
public class ProductAndPriceDetails {

    private Integer productId;
    private String productName;
    private ProductPrice productPrice;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductPrice getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(ProductPrice productPrice) {
        this.productPrice = productPrice;
    }
}
