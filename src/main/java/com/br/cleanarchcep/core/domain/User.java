package com.br.cleanarchcep.core.domain;


public class User {

	private Long id;
	private String name;
	private String username;
	private String password;
	private Adress adress;
	
	public User() {
		
	}

	
	public User(Long id, String name, String username, String password, Adress adress) {
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

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	
}
