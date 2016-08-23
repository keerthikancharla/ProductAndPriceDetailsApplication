package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Business process statu.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "process_status"
})
public class BusinessProcessStatu {

    @JsonProperty("process_status")
    private ProcessStatus processStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public BusinessProcessStatu() {
    }

    /**
     * Instantiates a new Business process statu.
     *
     * @param processStatus the process status
     */
    public BusinessProcessStatu(ProcessStatus processStatus) {
        this.processStatus = processStatus;
    }

    /**
     * Gets process status.
     *
     * @return The processStatus
     */
    @JsonProperty("process_status")
    public ProcessStatus getProcessStatus() {
        return processStatus;
    }

    /**
     * Sets process status.
     *
     * @param processStatus The process_status
     */
    @JsonProperty("process_status")
    public void setProcessStatus(ProcessStatus processStatus) {
        this.processStatus = processStatus;
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
