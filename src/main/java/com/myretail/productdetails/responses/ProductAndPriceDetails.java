package com.myretail.productdetails.responses;

/**
 * Created by keerthiprasad on 8/17/16.
 */
public class ProductAndPriceDetails {

    private Integer productId;
    private String productName;
    private ProductPrice productPrice;


    /**
     * Gets product id.
     *
     * @return the product id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Sets product id.
     *
     * @param productId the product id
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Gets product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Gets product price.
     *
     * @return the product price
     */
    public ProductPrice getProductPrice() {
        return productPrice;
    }

    /**
     * Sets product price.
     *
     * @param productPrice the product price
     */
    public void setProductPrice(ProductPrice productPrice) {
        this.productPrice = productPrice;
    }
}
