package com.enigmacamp.audiostore.dto;

import javax.validation.constraints.NotEmpty;

public class productTypeRequest {
	@NotEmpty(message = "Nama produk tidak boleh kosong")
	private String namaProduk;
	@NotEmpty(message = "Gambar produk tidak boleh kosong")
	private String gambar;
	
	public productTypeRequest() {
		// TODO Auto-generated constructor stub
	}

	public productTypeRequest(@NotEmpty(message = "Nama produk tidak boleh kosong") String namaProduk,
			@NotEmpty(message = "Gambar produk tidak boleh kosong") String gambar) {
		super();
		this.namaProduk = namaProduk;
		this.gambar = gambar;
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
