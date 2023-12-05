package com.br.cleanarchcep.infra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cleanarchcep.application.gateway.UserGateway;
import com.br.cleanarchcep.core.domain.User;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserGateway userGateway;
	
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User userReturned =userGateway.createUser(user);
		return ResponseEntity.status(HttpStatus.OK).body(userReturned);
	}
	
}
