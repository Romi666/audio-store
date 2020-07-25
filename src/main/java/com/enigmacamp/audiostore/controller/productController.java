package com.enigmacamp.audiostore.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.enigmacamp.audiostore.dto.productDto;
import com.enigmacamp.audiostore.dto.productRequest;
import com.enigmacamp.audiostore.entity.productEntity;
import com.enigmacamp.audiostore.services.productServices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Gacor Audio Store")
@RestController
@EnableAutoConfiguration
@RequestMapping("product")
@Validated
@CrossOrigin(origins = "*")
public class productController {

    @Autowired
    productServices services;

    @ApiOperation(value = "Add product")
    @PostMapping("")
    public productDto create(@Valid @RequestBody productRequest request) {
        System.out.println(request.getBrandProduk() + request.getTipeProduk());
        return services.save(request);
    }

    @ApiOperation(value = "Find by brand name")
    @GetMapping("byBrand")
    public List<productEntity> getProductByBrandName(@Valid @RequestParam String name) {
        return services.getListProductByBrandName(name);
    }

    @ApiOperation(value = "Find Product")
    @GetMapping("search")
    public productDto findByName(@Valid @RequestParam String name) {
        return services.findByProductName(name);
    }

    @ApiOperation(value = "Filter by harga")
    @GetMapping("filterByHarga")
    public List<productEntity> getProductByHarga(@Valid @RequestParam Double min, Double max) {
        return services.getListProductByHarga(min, max);
    }

    @ApiOperation(value = "Delete product")
    @DeleteMapping("")
    public void deleteByName(@Valid @RequestParam Long id) {
        services.deleteById(id);
    }

    @ApiOperation(value = "Find by type product")
    @GetMapping("byProductType")
    public List<productEntity> getProductByProductType(@Valid @RequestParam String name) {
        return services.getListProductBytipeProduk(name);
    }

    @ApiOperation(value = "Filter by category")
    @GetMapping("filterByCategory")
    public List<productEntity> getProductByCategory(@Valid @RequestParam String namaBrand, String productType) {
        return services.getListProductByBrandNameAndtipeProduk(namaBrand, productType);
    }

    @ApiOperation(value = "Get all")
    @GetMapping("")
    public List<productEntity> getAll() {
        return services.getAll();
    }

    @GetMapping("/paging/{pageNo}")
    @ApiOperation("Get product with paging")
    public ResponseEntity<List<productEntity>> getProductWithPaging(@PathVariable Integer pageNo) {
        return ResponseEntity.ok().body(services.getProductWithPaging(pageNo));
    }

    @ApiOperation(value = "Get by id")
    @GetMapping("byId")
    public Optional<productEntity> getById(@Valid @RequestParam Long id) {
        return services.getById(id);
    }

    @ApiOperation(value = "Get List Product")
    @GetMapping("ContainsIgnoreCase")
    public List<productEntity> getProductContainsIgnoreCase(@Valid @RequestParam String name) {
        return services.getListBynamaProdukContainsIgnoreCase(name);
    }
}
