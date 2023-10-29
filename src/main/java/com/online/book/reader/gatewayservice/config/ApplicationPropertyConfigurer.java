package com.online.book.reader.gatewayservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration("appConfig")
@Profile("!Dev")
public class ApplicationPropertyConfigurer {

	@Autowired
	private ApplicationProperty applicationProperty;

	@Autowired
	private Environment env;

	@Bean
	public ApplicationProperty getAppConfig() {

		applicationProperty.setJwtExpiration(env.getProperty("application.properties.access-token.expiration"));
		applicationProperty.setJwtSecret(env.getProperty("application.properties.access-token.secret"));
		return applicationProperty;
	}

}
