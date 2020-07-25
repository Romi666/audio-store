package com.enigmacamp.audiostore.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigmacamp.audiostore.dto.brandDto;
import com.enigmacamp.audiostore.dto.brandRequest;
import com.enigmacamp.audiostore.entity.brandEntity;
import com.enigmacamp.audiostore.exception.NotFoundException;
import com.enigmacamp.audiostore.repository.brandRepository;

@Service
public class brandServices {

    @Autowired
    private brandRepository repo;


    public brandEntity convertBrandEntity(brandDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        brandEntity brand = modelMapper.map(dto, brandEntity.class);
        return brand;
    }

    public brandDto convertBrandDto(brandEntity brand) {
        ModelMapper modelMapepr = new ModelMapper();
        brandDto dto = modelMapepr.map(brand, brandDto.class);
        return dto;
    }

    public brandDto convertOptionalBrand(Optional<brandEntity> brand) {
        ModelMapper modelMapper = new ModelMapper();
        brandDto dto = modelMapper.map(brand, brandDto.class);
        return dto;
    }

    public brandDto save(brandRequest request) {
        brandEntity checkBrand = repo.findBrandBynamaBrand(request.getNamaBrand());
        if (checkBrand != null) {
            throw new NotFoundException("Brand " + request.getNamaBrand() + " sudah ada");
        }
        ModelMapper modelMapper = new ModelMapper();
        brandEntity brand = modelMapper.map(request, brandEntity.class);
        repo.save(brand);
        return convertBrandDto(brand);
    }

    public brandDto getByName(String name) {
        System.out.println("brand name dari brand services" + name);
        brandEntity brand = repo.findBrandBynamaBrand(name);
        return convertBrandDto(brand);
    }

    public brandDto getById(Long id) {
        Optional<brandEntity> brand = repo.findById(id);
        return convertOptionalBrand(brand);
    }
}
