package com.myretail.productdetails.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by keerthiprasad on 8/17/16.
 */
@Configuration
public class BeanConfigurations {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
