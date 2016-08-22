package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

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
     * @param feature
     */
    public Feature(String feature) {
        this.feature = feature;
    }

    /**
     * @return The feature
     */
    @JsonProperty("feature")
    public String getFeature() {
        return feature;
    }

    /**
     * @param feature The feature
     */
    @JsonProperty("feature")
    public void setFeature(String feature) {
        this.feature = feature;
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
