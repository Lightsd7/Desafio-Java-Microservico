package com.desafio.partner.VO;

import javax.persistence.Id;

//@Entity(name = "users")
public class User {

<<<<<<< HEAD
	@Id
=======
//	@Id
>>>>>>> cc4f82afc0b199b0c1960524ec3396306b2350d2
	private Long cpf;
	private String name;
	private String lastName;

	public User() {
		super();
	}

	public User(Long cpf, String name, String lastName) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.lastName = lastName;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
