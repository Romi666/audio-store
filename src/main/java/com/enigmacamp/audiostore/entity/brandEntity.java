package com.enigmacamp.audiostore.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
public class brandEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "nama_brand")
	private String namaBrand;
	@Column(name = "gambar")
	private String gambar;
	@OneToMany(mappedBy = "brandProduk")
	private List<productEntity> product;
	
	public brandEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public brandEntity(Long id, String namaBrand, String gambar) {
		super();
		this.id = id;
		this.namaBrand = namaBrand;
		this.gambar = gambar;
	}
	
	

	public brandEntity(String namaBrand, String gambar, List<productEntity> product) {
		super();
		this.namaBrand = namaBrand;
		this.gambar = gambar;
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamaBrand() {
		return namaBrand;
	}

	public void setNamaBrand(String namaBrand) {
		this.namaBrand = namaBrand;
	}

	public String getGambar() {
		return gambar;
	}

	public void setGambar(String gambar) {
		this.gambar = gambar;
	}

	public List<productEntity> getProduct() {
		return product;
	}

	public void setProduct(List<productEntity> product) {
		this.product = product;
	}
	
	
	
}
