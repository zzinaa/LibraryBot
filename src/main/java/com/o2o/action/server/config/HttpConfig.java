package com.o2o.action.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpConfig {
    @Bean
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }
}
