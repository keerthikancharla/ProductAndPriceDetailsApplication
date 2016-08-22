package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "is_ready",
        "operation_description",
        "operation_code"
})
public class ProcessStatus {

    @JsonProperty("is_ready")
    private Boolean isReady;
    @JsonProperty("operation_description")
    private String operationDescription;
    @JsonProperty("operation_code")
    private String operationCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ProcessStatus() {
    }

    /**
     * @param operationDescription
     * @param isReady
     * @param operationCode
     */
    public ProcessStatus(Boolean isReady, String operationDescription, String operationCode) {
        this.isReady = isReady;
        this.operationDescription = operationDescription;
        this.operationCode = operationCode;
    }

    /**
     * @return The isReady
     */
    @JsonProperty("is_ready")
    public Boolean getIsReady() {
        return isReady;
    }

    /**
     * @param isReady The is_ready
     */
    @JsonProperty("is_ready")
    public void setIsReady(Boolean isReady) {
        this.isReady = isReady;
    }

    /**
     * @return The operationDescription
     */
    @JsonProperty("operation_description")
    public String getOperationDescription() {
        return operationDescription;
    }

    /**
     * @param operationDescription The operation_description
     */
    @JsonProperty("operation_description")
    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    /**
     * @return The operationCode
     */
    @JsonProperty("operation_code")
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * @param operationCode The operation_code
     */
    @JsonProperty("operation_code")
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
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
