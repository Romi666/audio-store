package com.enigmacamp.audiostore.dto;

public class productDto {
    private Long id;
    private String gambar;
    private String namaProduk;
    private String detail;
    private Double harga;
    private brandDto brandProduk;
    private productTypeDto tipeProduk;

    public productDto() {
        // TODO Auto-generated constructor stub
    }

    public productDto(Long id, String gambar, String namaProduk, String detail, Double harga) {
        super();
        this.id = id;
        this.gambar = gambar;
        this.namaProduk = namaProduk;
        this.detail = detail;
        this.harga = harga;
    }

    public productDto(String gambar, String namaProduk, String detail, Double harga, brandDto brandProduk, productTypeDto tipeProduk) {
        super();
        this.gambar = gambar;
        this.namaProduk = namaProduk;
        this.detail = detail;
        this.harga = harga;
        this.brandProduk = brandProduk;
        this.tipeProduk = tipeProduk;
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

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public brandDto getBrandProduk() {
        return brandProduk;
    }

    public void setBrandProduk(brandDto brandProduk) {
        this.brandProduk = brandProduk;
    }

    public productTypeDto getTipeProduk() {
        return tipeProduk;
    }

    public void setTipeProduk(productTypeDto tipeProduk) {
        this.tipeProduk = tipeProduk;
    }

    @Override
    public String toString() {
        return "productDto [id=" + id + ", gambar=" + gambar + ", namaProduk=" + namaProduk + ", detail=" + detail
                + ", harga=" + harga + ", brandProduk=" + brandProduk + ", tipeProduk=" + tipeProduk + ", getId()="
                + getId() + ", getGambar()=" + getGambar() + ", getNamaProduk()=" + getNamaProduk() + ", getDetail()="
                + getDetail() + ", getHarga()=" + getHarga() + ", getBrandProduk()=" + getBrandProduk()
                + ", getTipeProduk()=" + getTipeProduk() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }


}
