package com.br.cleanarchcep.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.br.cleanarchcep.application.gateway.UserGateway;
import com.br.cleanarchcep.infra.gateways.UserGatewayImpl;

@Configuration
public class ConfigUser {

	@Bean
	public UserGateway userGateway() {
		return new UserGatewayImpl();
	}
	
	
}
