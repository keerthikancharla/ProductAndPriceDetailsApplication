package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Product details.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "product_composite_response"
})
public class ProductDetails {

    @JsonProperty("product_composite_response")
    private ProductCompositeResponse productCompositeResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ProductDetails() {
    }

    /**
     * Instantiates a new Product details.
     *
     * @param productCompositeResponse the product composite response
     */
    public ProductDetails(ProductCompositeResponse productCompositeResponse) {
        this.productCompositeResponse = productCompositeResponse;
    }

    /**
     * Gets product composite response.
     *
     * @return The productCompositeResponse
     */
    @JsonProperty("product_composite_response")
    public ProductCompositeResponse getProductCompositeResponse() {
        return productCompositeResponse;
    }

    /**
     * Sets product composite response.
     *
     * @param productCompositeResponse The product_composite_response
     */
    @JsonProperty("product_composite_response")
    public void setProductCompositeResponse(ProductCompositeResponse productCompositeResponse) {
        this.productCompositeResponse = productCompositeResponse;
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
