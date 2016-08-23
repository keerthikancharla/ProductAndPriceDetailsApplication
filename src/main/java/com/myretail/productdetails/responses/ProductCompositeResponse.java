package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Product composite response.
 */
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
     * Instantiates a new Product composite response.
     *
     * @param requestAttributes the request attributes
     * @param items             the items
     */
    public ProductCompositeResponse(List<RequestAttribute> requestAttributes, List<Item> items) {
        this.requestAttributes = requestAttributes;
        this.items = items;
    }

    /**
     * Gets request attributes.
     *
     * @return The requestAttributes
     */
    @JsonProperty("request_attributes")
    public List<RequestAttribute> getRequestAttributes() {
        return requestAttributes;
    }

    /**
     * Sets request attributes.
     *
     * @param requestAttributes The request_attributes
     */
    @JsonProperty("request_attributes")
    public void setRequestAttributes(List<RequestAttribute> requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     * Gets items.
     *
     * @return The items
     */
    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    /**
     * Sets items.
     *
     * @param items The items
     */
    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
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
