package com.enigmacamp.audiostore.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class productRequest {
    @NotEmpty(message = "Masukan URL gambar produk")
    private String gambar;
    @NotEmpty(message = "Nama produk tidak boleh kosong")
    private String namaProduk;
    @NotEmpty(message = "Detail produk tidak boleh kosong")
    private String detail;
    @NotNull(message = "Harga produk tidak boleh kosong")
    private Double harga;
    @NotEmpty(message = "Brand/Merek produk tidak boleh kosong")
    private String brandProduk;
    @NotEmpty(message = "Tipe produk tidak boleh kosong")
    private String tipeProduk;

    public productRequest() {
        // TODO Auto-generated constructor stub
    }


    public productRequest(@NotEmpty(message = "Masukan URL gambar produk") String gambar,
                          @NotEmpty(message = "Nama produk tidak boleh kosong") String namaProduk,
                          @NotEmpty(message = "Detail produk tidak boleh kosong") String detail,
                          @NotNull(message = "Harga produk tidak boleh kosong") Double harga) {
        super();
        this.gambar = gambar;
        this.namaProduk = namaProduk;
        this.detail = detail;
        this.harga = harga;
    }

    public productRequest(@NotEmpty(message = "Masukan URL gambar produk") String gambar,
                          @NotEmpty(message = "Nama produk tidak boleh kosong") String namaProduk,
                          @NotEmpty(message = "Detail produk tidak boleh kosong") String detail,
                          @NotNull(message = "Harga produk tidak boleh kosong") Double harga,
                          @NotEmpty(message = "Brand/Merek produk tidak boleh kosong") String brandProduk,
                          @NotEmpty(message = "Tipe produk tidak boleh kosong") String tipeProduk) {
        super();
        this.gambar = gambar;
        this.namaProduk = namaProduk;
        this.detail = detail;
        this.harga = harga;
        this.brandProduk = brandProduk;
        this.tipeProduk = tipeProduk;
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


    public String getBrandProduk() {
        return brandProduk;
    }


    public void setBrandProduk(String brandProduk) {
        this.brandProduk = brandProduk;
    }

    public String getTipeProduk() {
        return tipeProduk;
    }

    public void setTipeProduk(String tipeProduk) {
        this.tipeProduk = tipeProduk;
    }

}
