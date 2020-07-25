package com.enigmacamp.audiostore.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigmacamp.audiostore.dto.productTypeDto;
import com.enigmacamp.audiostore.dto.productTypeRequest;
import com.enigmacamp.audiostore.entity.productTypeEntity;
import com.enigmacamp.audiostore.exception.NotFoundException;
import com.enigmacamp.audiostore.repository.productTypeRepository;

@Service
public class productTypeServices {


    @Autowired
    private productTypeRepository repo;

    public productTypeEntity convertProductTypeEntity(productTypeDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        productTypeEntity product = modelMapper.map(dto, productTypeEntity.class);
        return product;
    }

    public productTypeDto converProductTypeDto(productTypeEntity product) {
        ModelMapper modelMapper = new ModelMapper();
        productTypeDto dto = modelMapper.map(product, productTypeDto.class);
        return dto;
    }

    public productTypeDto converProductTypeOptional(Optional<productTypeEntity> productType) {
        ModelMapper modelMapper = new ModelMapper();
        productTypeDto dto = modelMapper.map(productType, productTypeDto.class);
        return dto;
    }

    public productTypeDto save(productTypeRequest request) {
        productTypeEntity check = repo.findBynamaProduk(request.getNamaProduk());
        if (check != null) {
            throw new NotFoundException("Tipe produk " + request.getNamaProduk() + " sudah ada");
        }
        ModelMapper modelMapper = new ModelMapper();
        productTypeEntity product = modelMapper.map(request, productTypeEntity.class);
        repo.save(product);
        return converProductTypeDto(product);
    }

    public productTypeDto getByName(String name) {
        System.out.println("tipe produk dari service product type" + name);
        productTypeEntity productType = repo.findBynamaProduk(name);
        return converProductTypeDto(productType);
    }

    public productTypeDto getById(Long id) {
        Optional<productTypeEntity> productType = repo.findById(id);
        productTypeDto dto = converProductTypeOptional(productType);
        return dto;
    }
}
