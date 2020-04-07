package com.enigmacamp.audiostore.dto;

import java.math.BigDecimal;

public class productDto {
	private Long id;
	private String gambar;
	private String namaProduk;
	private String detail;
	private BigDecimal harga;
	
	public productDto() {
		// TODO Auto-generated constructor stub
	}

	public productDto(Long id, String gambar, String namaProduk, String detail, BigDecimal harga) {
		super();
		this.id = id;
		this.gambar = gambar;
		this.namaProduk = namaProduk;
		this.detail = detail;
		this.harga = harga;
	}
	
	public productDto(String gambar, String namaProduk, String detail, BigDecimal harga) {
		super();
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
