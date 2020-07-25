package com.enigmacamp.audiostore.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enigmacamp.audiostore.entity.brandEntity;
import com.enigmacamp.audiostore.entity.productEntity;
import com.enigmacamp.audiostore.entity.productTypeEntity;


public interface productRepository extends JpaRepository<productEntity, Long> {
    productEntity findBynamaProduk(String name);

    void deleteByNamaProduk(String name);

    Optional<productEntity> findById(Long id);

    List<productEntity> findByBrandProduk(brandEntity brandProduk);

    List<productEntity> findBytipeProduk(productTypeEntity productType);

    List<productEntity> findAll();

    List<productEntity> findBynamaProdukContainsIgnoreCase(String name);
}