package com.br.cleanarchcep.infra.gateways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.br.cleanarchcep.application.gateway.UserGateway;
import com.br.cleanarchcep.core.domain.Adress;
import com.br.cleanarchcep.core.domain.User;
import com.br.cleanarchcep.infra.mappers.AdressMapper;
import com.br.cleanarchcep.infra.mappers.UserMapper;
import com.br.cleanarchcep.infra.persistence.AdressEntity;
import com.br.cleanarchcep.infra.persistence.UserEntity;
import com.br.cleanarchcep.infra.persistence.UserRepository;

public class UserGatewayImpl implements UserGateway {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private AdressMapper adressMapper;
	
	@Override
	public User createUser(User user) {
		UserEntity userEntity= userMapper.toUserEntity(user);
		
		//Getting the adress 
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Adress> rest= restTemplate.getForEntity("https://viacep.com.br/ws/"+user.getAdress().getCep()+"/json/", Adress.class);
		
		AdressEntity adEntity = adressMapper.toAdressEntity(rest.getBody());
		userEntity.setAdress(adEntity);
		userEntity=userRepository.save(userEntity);
		User userDomain = userMapper.toUser(userEntity);
		return userDomain;
	}

}
