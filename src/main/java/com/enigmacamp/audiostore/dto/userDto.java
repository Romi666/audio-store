package com.enigmacamp.audiostore.dto;

import com.enigmacamp.audiostore.enums.gender;

public class userDto {
	private Long id;
	private String username;
	private String password;
	private gender gender;
	
	public userDto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public userDto(Long id, String username, String password, com.enigmacamp.audiostore.enums.gender gender) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.gender = gender;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public gender getGender() {
		return gender;
	}

	public void setGender(gender gender) {
		this.gender = gender;
	}
	
	
}
