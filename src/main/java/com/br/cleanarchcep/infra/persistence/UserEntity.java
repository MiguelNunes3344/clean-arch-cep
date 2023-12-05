package com.br.cleanarchcep.infra.persistence;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;




@Entity
@Table(name = "tb_user")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String username;
	private String password;
	@OneToOne(mappedBy = "userEntity", cascade = CascadeType.ALL)
	private AdressEntity adress;
	
	public UserEntity() {
		
	}

	public UserEntity(Long id, String name, String username, String password,
			AdressEntity adress) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.adress = adress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AdressEntity getAdress() {
		return adress;
	}

	public void setAdress(AdressEntity adress) {
		this.adress = adress;
	}
	
	
}
