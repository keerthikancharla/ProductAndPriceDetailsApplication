package com.myretail.productdetails.responses;

import javax.validation.constraints.NotNull;

/**
 * Created by keerthiprasad on 8/17/16.
 */
public class ProductPrice {
    private Double currentPrice;
    private String currencyCode = "USD";

    @NotNull
    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
