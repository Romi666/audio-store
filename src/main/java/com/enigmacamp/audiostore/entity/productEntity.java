package com.enigmacamp.audiostore.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.GenerationType;


@Entity
@Table(name = "product")
public class productEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "gambar")
    private String gambar;
    @Column(name = "nama_produk")
    private String namaProduk;
    @Column(name = "detail", columnDefinition = "LONGTEXT")
    private String detail;
    @Column(name = "harga")
    private Double harga;
    @ManyToOne
    @JoinColumn(name = "brandProduk")
    private brandEntity brandProduk;
    @ManyToOne
    @JoinColumn(name = "tipeProduk")
    private productTypeEntity tipeProduk;


    public productEntity() {
        // TODO Auto-generated constructor stub
    }

    public productEntity(Long id, String gambar, String namaProduk, String detail, Double harga) {
        super();
        this.id = id;
        this.gambar = gambar;
        this.namaProduk = namaProduk;
        this.detail = detail;
        this.harga = harga;
    }


    public productEntity(String gambar, String namaProduk, String detail, Double harga, brandEntity brandProduk,
                         productTypeEntity tipeProduk) {
        super();
        this.gambar = gambar;
        this.namaProduk = namaProduk;
        this.detail = detail;
        this.harga = harga;
        this.brandProduk = brandProduk;
        this.tipeProduk = tipeProduk;
    }

    public productEntity(String gambar, String namaProduk, String detail, Double harga) {
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

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public brandEntity getBrandProduk() {
        return brandProduk;
    }

    public void setBrandProduk(brandEntity brandProduk) {
        this.brandProduk = brandProduk;
    }

    public productTypeEntity getTipeProduk() {
        return tipeProduk;
    }

    public void setTipeProduk(productTypeEntity tipeProduk) {
        this.tipeProduk = tipeProduk;
    }
}
