package com.enigmacamp.audiostore.dto;

import javax.validation.constraints.NotEmpty;

public class brandRequest {
	@NotEmpty(message = "Gambar/Logo brand tidak boleh kosong")
	private String gambar;
	@NotEmpty(message = "Nama brand/merek tidak boleh kosong")
	private String namaBrand;
	
	public brandRequest() {
		// TODO Auto-generated constructor stub
	}

	public brandRequest(@NotEmpty(message = "Gambar/Logo brand tidak boleh kosong") String gambar,
			@NotEmpty(message = "Nama brand/merek tidak boleh kosong") String namaBrand) {
		super();
		this.gambar = gambar;
		this.namaBrand = namaBrand;
	}

	public String getGambar() {
		return gambar;
	}

	public void setGambar(String gambar) {
		this.gambar = gambar;
	}

	public String getNamaBrand() {
		return namaBrand;
	}

	public void setNamaBrand(String namaBrand) {
		this.namaBrand = namaBrand;
	}
	
	
}
