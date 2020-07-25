package com.enigmacamp.audiostore.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigmacamp.audiostore.dto.userDto;
import com.enigmacamp.audiostore.dto.userRequest;
import com.enigmacamp.audiostore.entity.userEntity;
import com.enigmacamp.audiostore.repository.userRepository;

@Service
public class userServices {

    @Autowired
    userRepository repo;

    public userEntity convertUserEntity(userDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        userEntity user = modelMapper.map(dto, userEntity.class);
        return user;
    }

    public userDto convertUserDto(userEntity user) {
        ModelMapper modelMapper = new ModelMapper();
        userDto dto = modelMapper.map(user, userDto.class);
        return dto;
    }


    public userDto save(userRequest request) {
        userEntity user = new userEntity(request.getUsername(), request.getPassword(), "customer");
        repo.save(user);
        return convertUserDto(user);
    }

}