package com.enigmacamp.audiostore.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enigmacamp.audiostore.dto.userDto;
import com.enigmacamp.audiostore.dto.userRequest;
import com.enigmacamp.audiostore.services.userServices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Gacor Audio Store")
@RestController
@EnableAutoConfiguration
@RequestMapping("users")
@Validated
@CrossOrigin(origins = "*")
public class userController {

    @Autowired
    userServices services;

    @ApiOperation(value = "Create user")
    @PostMapping("")
    public userDto createUser(@Valid @RequestBody userRequest request) {
        return services.save(request);
    }

}
