package com.enigmacamp.audiostore.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.GenerationType;


@Entity
@Table(name="product")
public class productEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "gambar")
	private String gambar;
	@Column(name = "nama_produk")
	private String namaProduk;
	@Column(name = "detail")
	private String detail;
	@Column(name = "harga")
	private BigDecimal harga;
	@ManyToOne
	@JoinColumn(name = "brandProduk")
	private brandEntity brandProduk;
	@ManyToOne
	@JoinColumn(name = "tipeProduk")
	private productTypeEntity tipeProduk;
	@ManyToOne
	@JoinColumn(name = "user")
	private userEntity user;
	
	
	
	public productEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public productEntity(Long id, String gambar, String namaProduk, String detail, BigDecimal harga) {
		super();
		this.id = id;
		this.gambar = gambar;
		this.namaProduk = namaProduk;
		this.detail = detail;
		this.harga = harga;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGambar() {
		return gambar;
	}
	public void setGambar(String gambar) {
		this.gambar = gambar;
	}
	public String getNamaProduk() {
		return namaProduk;
	}
	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public BigDecimal getHarga() {
		return harga;
	}
	public void setHarga(BigDecimal harga) {
		this.harga = harga;
	}
	
	
	
}
