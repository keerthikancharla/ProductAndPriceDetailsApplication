package com.myretail.productdetails.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by keerthiprasad on 8/21/16.
 */
@ConfigurationProperties
@Component
public class PropertyConfigurations {
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
