package com.diengsalla.appliweb;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "com.diengsalla.appliweb")
@Data
public class CustomProperties {
	
	private String apiUrl;

	public CustomProperties(String apiUrl) {
		super();
		this.apiUrl = apiUrl;
	}

	public CustomProperties() {
		super();
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}
	
	

}
