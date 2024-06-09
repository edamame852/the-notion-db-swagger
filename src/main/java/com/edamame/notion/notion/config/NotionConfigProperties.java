package com.edamame.notion.notion.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "notion")
public record NotionConfigProperties(String apiUrl, String apiVersion, String authToken, String databaseId) {
}
