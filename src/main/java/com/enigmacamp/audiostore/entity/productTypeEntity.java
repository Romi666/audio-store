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
@Table(name = "product_type")
public class productTypeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "nama_produk")
	private String namaProduk;
	@Column(name = "gambar")
	private String gambar;
	@OneToMany(mappedBy = "tipeProduk")
	private List<productEntity> product;
	
	public productTypeEntity() {
		// TODO Auto-generated constructor stub
	}

	public productTypeEntity(Long id, String namaProduk, String gambar) {
		super();
		this.id = id;
		this.namaProduk = namaProduk;
		this.gambar = gambar;
	}
	
	

	public productTypeEntity(String namaProduk, String gambar, List<productEntity> product) {
		super();
		this.namaProduk = namaProduk;
		this.gambar = gambar;
		this.product = product;
	}
	
	

	public List<productEntity> getProduct() {
		return product;
	}

	public void setProduct(List<productEntity> product) {
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamaProduk() {
		return namaProduk;
	}

	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}

	public String getGambar() {
		return gambar;
	}

	public void setGambar(String gambar) {
		this.gambar = gambar;
	}
	
	
}
