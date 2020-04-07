package com.enigmacamp.audiostore.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.enigmacamp.audiostore.enums.gender;

public class userRequest {
	
	@NotEmpty(message = "Account may not empty")
	@Size(min = 6, message = "Minimal 6 character")
	private String username;
	@NotEmpty(message = "Password may not empty")
	@Size(min = 6, message = "Minimal 6 character")
	private String password;
	@NotEmpty(message = "Role may not empty")
	private String role;
	@NotEmpty(message = "gender may not empty")
	private gender gender;
	
	
	public userRequest() {
		// TODO Auto-generated constructor stub
	}


	public userRequest(
			@NotEmpty(message = "Account may not empty") @Size(min = 6, message = "Minimal 6 character") String username,
			@NotEmpty(message = "Password may not empty") @Size(min = 6, message = "Minimal 6 character") String password,
			@NotEmpty(message = "Role may not empty") String role,
			com.enigmacamp.audiostore.enums.@NotEmpty(message = "gender may not empty") gender gender) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.gender = gender;
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


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public gender getGender() {
		return gender;
	}


	public void setGender(gender gender) {
		this.gender = gender;
	}
	
	
	
}
