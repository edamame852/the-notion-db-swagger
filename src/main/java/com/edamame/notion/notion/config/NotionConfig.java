package com.edamame.notion.notion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// Adding a new class for all notion configurations
@Configuration
public class NotionConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    } // This will now be made abaliable for dependency injection
}
