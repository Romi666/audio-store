package com.enigmacamp.audiostore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.enigmacamp.audiostore.entity.productEntity;


public interface productRepository extends JpaRepository<productEntity, Long> {

}
