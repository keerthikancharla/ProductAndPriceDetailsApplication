package com.myretail.productdetails.responses;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

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
     * @param processStatus
     */
    public BusinessProcessStatu(ProcessStatus processStatus) {
        this.processStatus = processStatus;
    }

    /**
     * @return The processStatus
     */
    @JsonProperty("process_status")
    public ProcessStatus getProcessStatus() {
        return processStatus;
    }

    /**
     * @param processStatus The process_status
     */
    @JsonProperty("process_status")
    public void setProcessStatus(ProcessStatus processStatus) {
        this.processStatus = processStatus;
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
