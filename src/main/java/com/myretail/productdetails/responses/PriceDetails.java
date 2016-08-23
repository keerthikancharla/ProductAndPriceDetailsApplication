package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Price details.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "productId",
        "productPrice",
        "currencyCode"
})
public class PriceDetails {

    @JsonProperty("productId")
    private Integer productId;
    @JsonProperty("productPrice")
    private Double productPrice;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public PriceDetails() {
    }

    /**
     * Instantiates a new Price details.
     *
     * @param productId    the product id
     * @param productPrice the product price
     * @param currencyCode the currency code
     */
    public PriceDetails(Integer productId, Double productPrice, String currencyCode) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.currencyCode = currencyCode;
    }

    /**
     * Gets product id.
     *
     * @return The productId
     */
    @JsonProperty("productId")
    public Integer getProductId() {
        return productId;
    }

    /**
     * Sets product id.
     *
     * @param productId The productId
     */
    @JsonProperty("productId")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Gets product price.
     *
     * @return The productPrice
     */
    @JsonProperty("productPrice")
    public Double getProductPrice() {
        return productPrice;
    }

    /**
     * Sets product price.
     *
     * @param productPrice The productPrice
     */
    @JsonProperty("productPrice")
    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * Gets currency code.
     *
     * @return The currencyCode
     */
    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets currency code.
     *
     * @param currencyCode The currencyCode
     */
    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Gets additional properties.
     *
     * @return the additional properties
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Sets additional property.
     *
     * @param name  the name
     * @param value the value
     */
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}