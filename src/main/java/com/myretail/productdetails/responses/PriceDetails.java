package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

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
     * @param currencyCode
     * @param productPrice
     * @param productId
     */
    public PriceDetails(Integer productId, Double productPrice, String currencyCode) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.currencyCode = currencyCode;
    }

    /**
     * @return The productId
     */
    @JsonProperty("productId")
    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId The productId
     */
    @JsonProperty("productId")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * @return The productPrice
     */
    @JsonProperty("productPrice")
    public Double getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice The productPrice
     */
    @JsonProperty("productPrice")
    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return The currencyCode
     */
    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * @param currencyCode The currencyCode
     */
    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}