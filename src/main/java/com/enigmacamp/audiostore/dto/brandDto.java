package com.enigmacamp.audiostore.dto;

public class brandDto {
    private Long id;
    private String namaBrand;
    private String gambar;

    public brandDto() {
        // TODO Auto-generated constructor stub
    }

    public brandDto(Long id, String namaBrand, String gambar) {
        super();
        this.id = id;
        this.namaBrand = namaBrand;
        this.gambar = gambar;
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


}
