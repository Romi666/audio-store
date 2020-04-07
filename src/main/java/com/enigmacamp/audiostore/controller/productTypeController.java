package com.enigmacamp.audiostore.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enigmacamp.audiostore.dto.productTypeDto;
import com.enigmacamp.audiostore.dto.productTypeRequest;
import com.enigmacamp.audiostore.services.productTypeServices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api (value = "Gacor Audio Store")
@RestController
@EnableAutoConfiguration
@RequestMapping("productType")
@Validated
public class productTypeController {
	
	@Autowired
	productTypeServices services;
	
	
	@ApiOperation(value = "Create product type") 
	@PostMapping("")
	public productTypeDto saveProductType(@Valid @RequestBody productTypeRequest request) {
		return services.save(request);
	}
}
