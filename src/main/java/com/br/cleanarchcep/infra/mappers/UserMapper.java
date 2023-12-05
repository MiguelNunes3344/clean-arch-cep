package com.br.cleanarchcep.infra.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.cleanarchcep.core.domain.Adress;
import com.br.cleanarchcep.core.domain.User;
import com.br.cleanarchcep.infra.persistence.AdressEntity;
import com.br.cleanarchcep.infra.persistence.UserEntity;

@Component
public class UserMapper {

	@Autowired
	private AdressMapper adressMapper;
	
	public User toUser(UserEntity userEntity) {
		Adress adress= adressMapper.toAdress(userEntity.getAdress());
		return new User(userEntity.getId(),userEntity.getName(),userEntity.getUsername(),userEntity.getPassword(),adress);
	}
	public UserEntity toUserEntity(User user) {
		AdressEntity adress= adressMapper.toAdressEntity(user.getAdress());
		return new UserEntity(user.getId(),user.getName(),user.getUsername(),user.getPassword(),adress);
	}
}
