package com.edamame.notion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.edamame.notion.notion.config.NotionConfigProperties;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableConfigurationProperties(NotionConfigProperties.class)
public class SwagApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwagApplication.class, args);
	}

}
