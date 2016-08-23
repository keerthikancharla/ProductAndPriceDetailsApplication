package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Identifier.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id_type",
        "id",
        "is_primary",
        "source"
})
public class Identifier {

    @JsonProperty("id_type")
    private String idType;
    @JsonProperty("id")
    private String id;
    @JsonProperty("is_primary")
    private Object isPrimary;
    @JsonProperty("source")
    private String source;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Identifier() {
    }

    /**
     * Instantiates a new Identifier.
     *
     * @param idType    the id type
     * @param id        the id
     * @param isPrimary the is primary
     * @param source    the source
     */
    public Identifier(String idType, String id, Object isPrimary, String source) {
        this.idType = idType;
        this.id = id;
        this.isPrimary = isPrimary;
        this.source = source;
    }

    /**
     * Gets id type.
     *
     * @return The idType
     */
    @JsonProperty("id_type")
    public String getIdType() {
        return idType;
    }

    /**
     * Sets id type.
     *
     * @param idType The id_type
     */
    @JsonProperty("id_type")
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * Gets id.
     *
     * @return The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets is primary.
     *
     * @return The isPrimary
     */
    @JsonProperty("is_primary")
    public Object getIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets is primary.
     *
     * @param isPrimary The is_primary
     */
    @JsonProperty("is_primary")
    public void setIsPrimary(Object isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     * Gets source.
     *
     * @return The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * Sets source.
     *
     * @param source The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
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
