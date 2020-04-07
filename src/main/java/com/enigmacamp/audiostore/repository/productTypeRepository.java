package com.enigmacamp.audiostore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enigmacamp.audiostore.entity.productTypeEntity;

public interface productTypeRepository extends JpaRepository<productTypeEntity, Long> {
	productTypeEntity findBynamaProduk(String namaProduk);
}
