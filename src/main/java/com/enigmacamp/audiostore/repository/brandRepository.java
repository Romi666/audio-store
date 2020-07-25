package com.enigmacamp.audiostore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enigmacamp.audiostore.entity.brandEntity;

public interface brandRepository extends JpaRepository<brandEntity, Long> {
    brandEntity findBrandBynamaBrand(String namaBrand);

    Optional<brandEntity> findById(Long id);

}
