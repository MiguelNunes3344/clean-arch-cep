package com.br.cleanarchcep.infra.mappers;

import org.springframework.stereotype.Component;

import com.br.cleanarchcep.core.domain.Adress;
import com.br.cleanarchcep.infra.persistence.AdressEntity;

@Component
public class AdressMapper {
	
	
	public AdressEntity toAdressEntity(Adress adressDomain) {
		return new AdressEntity(
				adressDomain.getCep(),
				adressDomain.getLogradouro(),
				adressDomain.getComplemento(),
				adressDomain.getBairro(),
				adressDomain.getLocalidade(),
				adressDomain.getUf(),
				adressDomain.getIbge(),
				adressDomain.getDdd()
				);
	}
	public Adress toAdress(AdressEntity adressEntity) {
		return new Adress(
				adressEntity.getCep(),
				adressEntity.getLogradouro(),
				adressEntity.getComplemento(),
				adressEntity.getBairro(),
				adressEntity.getLocalidade(),
				adressEntity.getUf(),
				adressEntity.getIbge(),
				adressEntity.getDdd());
	}
}
