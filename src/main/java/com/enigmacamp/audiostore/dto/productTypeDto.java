package com.enigmacamp.audiostore.dto;

public class productTypeDto {
    private Long id;
    private String namaProduk;
    private String gambar;

    public productTypeDto() {
        // TODO Auto-generated constructor stub
    }

    public productTypeDto(Long id, String namaProduk, String gambar) {
        super();
        this.id = id;
        this.namaProduk = namaProduk;
        this.gambar = gambar;
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
