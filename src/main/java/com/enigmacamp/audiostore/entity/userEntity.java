package com.enigmacamp.audiostore.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.enigmacamp.audiostore.enums.gender;

@Entity
@Table (name = "user")
public class userEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "role")
	private String role;
	@Enumerated(EnumType.STRING)
	private gender gender;
	@OneToMany(mappedBy = "user")
	private List<productEntity> favoriteProductList;
	
	public userEntity() {
		// 	 Auto-generated constructor stub
	}
	
	public userEntity(Long id, String username, String password, String role,
			com.enigmacamp.audiostore.enums.gender gender) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
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
