package com.br.cleanarchcep.application.usecases;

import com.br.cleanarchcep.application.gateway.UserGateway;
import com.br.cleanarchcep.core.domain.User;

public class UserUseCase {

	private final UserGateway userGateway;
	
	
	public UserUseCase(UserGateway userGateway) {
		this.userGateway = userGateway;
	}
	
	public User createUser(User user) {
		return userGateway.createUser(user);
	
	}
}
