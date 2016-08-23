package com.myretail.productdetails.responses;

import javax.validation.constraints.NotNull;

/**
 * Created by keerthiprasad on 8/17/16.
 */
public class ProductPrice {
    private Double currentPrice;
    private String currencyCode = "USD";

    /**
     * Gets current price.
     *
     * @return the current price
     */
    @NotNull
    public Double getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Sets current price.
     *
     * @param currentPrice the current price
     */
    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * Gets currency code.
     *
     * @return the currency code
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets currency code.
     *
     * @param currencyCode the currency code
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
