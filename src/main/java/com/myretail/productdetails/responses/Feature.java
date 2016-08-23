package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Feature.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "feature"
})
public class Feature {

    @JsonProperty("feature")
    private String feature;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Feature() {
    }

    /**
     * Instantiates a new Feature.
     *
     * @param feature the feature
     */
    public Feature(String feature) {
        this.feature = feature;
    }

    /**
     * Gets feature.
     *
     * @return The feature
     */
    @JsonProperty("feature")
    public String getFeature() {
        return feature;
    }

    /**
     * Sets feature.
     *
     * @param feature The feature
     */
    @JsonProperty("feature")
    public void setFeature(String feature) {
        this.feature = feature;
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
