package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "request_attributes",
        "items"
})
public class ProductCompositeResponse {

    @JsonProperty("request_attributes")
    private List<RequestAttribute> requestAttributes = new ArrayList<RequestAttribute>();
    @JsonProperty("items")
    private List<Item> items = new ArrayList<Item>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ProductCompositeResponse() {
    }

    /**
     * @param items
     * @param requestAttributes
     */
    public ProductCompositeResponse(List<RequestAttribute> requestAttributes, List<Item> items) {
        this.requestAttributes = requestAttributes;
        this.items = items;
    }

    /**
     * @return The requestAttributes
     */
    @JsonProperty("request_attributes")
    public List<RequestAttribute> getRequestAttributes() {
        return requestAttributes;
    }

    /**
     * @param requestAttributes The request_attributes
     */
    @JsonProperty("request_attributes")
    public void setRequestAttributes(List<RequestAttribute> requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     * @return The items
     */
    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
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
