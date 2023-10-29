package com.online.book.reader.gatewayservice.config;

import org.springframework.stereotype.Component;



@Component
public class ApplicationProperty {
	
	private String jwtExpiration;
	private String jwtSecret;
	
	
	public String getJwtExpiration() {
		return jwtExpiration;
	}
	public void setJwtExpiration(String jwtExpiration) {
		this.jwtExpiration = jwtExpiration;
	}
	public String getJwtSecret() {
		return jwtSecret;
	}
	public void setJwtSecret(String jwtSecret) {
		this.jwtSecret = jwtSecret;
	}
	public ApplicationProperty() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
