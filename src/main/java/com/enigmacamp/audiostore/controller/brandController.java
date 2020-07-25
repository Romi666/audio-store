package com.enigmacamp.audiostore.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.enigmacamp.audiostore.dto.brandDto;
import com.enigmacamp.audiostore.dto.brandRequest;
import com.enigmacamp.audiostore.services.brandServices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Gacor Audio Store")
@RestController
@EnableAutoConfiguration
@RequestMapping("brand")
@Validated
@CrossOrigin(origins = "*")
public class brandController {
    @Autowired
    brandServices services;

    @ApiOperation(value = "Create brand")
    @PostMapping("")
    public brandDto createBrand(@Valid @RequestBody brandRequest request) {

        return services.save(request);
    }

    @GetMapping("search")
    @ApiOperation(value = "Search by brand name")
    public brandDto getByName(@RequestParam String name) {
        return services.getByName(name);
    }

}
