package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

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
     * @param productCompositeResponse
     */
    public ProductDetails(ProductCompositeResponse productCompositeResponse) {
        this.productCompositeResponse = productCompositeResponse;
    }

    /**
     * @return The productCompositeResponse
     */
    @JsonProperty("product_composite_response")
    public ProductCompositeResponse getProductCompositeResponse() {
        return productCompositeResponse;
    }

    /**
     * @param productCompositeResponse The product_composite_response
     */
    @JsonProperty("product_composite_response")
    public void setProductCompositeResponse(ProductCompositeResponse productCompositeResponse) {
        this.productCompositeResponse = productCompositeResponse;
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
