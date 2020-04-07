package com.enigmacamp.audiostore.services;

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
	
	public brandDto save(brandRequest request) {
		brandEntity checkBrand = repo.findBrandBynamaBrand(request.getNamaBrand());
		if(checkBrand != null) {
			throw new NotFoundException("Brand " + request.getNamaBrand() + "sudah ada");	
		}
		ModelMapper modelMapper = new ModelMapper();
		brandEntity brand = modelMapper.map(request, brandEntity.class);
		repo.save(brand);
		return convertBrandDto(brand);
	}
}
