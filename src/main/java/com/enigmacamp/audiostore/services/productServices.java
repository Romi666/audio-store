package com.enigmacamp.audiostore.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.enigmacamp.audiostore.dto.brandDto;
import com.enigmacamp.audiostore.dto.productDto;
import com.enigmacamp.audiostore.dto.productRequest;
import com.enigmacamp.audiostore.dto.productTypeDto;
import com.enigmacamp.audiostore.entity.brandEntity;
import com.enigmacamp.audiostore.entity.productEntity;
import com.enigmacamp.audiostore.entity.productTypeEntity;
import com.enigmacamp.audiostore.exception.NotFoundException;
import com.enigmacamp.audiostore.repository.productRepository;

@Service
public class productServices {

    @Autowired
    productRepository repo;

    @Autowired
    brandServices servicesBrand;
    @Autowired
    productTypeServices servicesTypeProduct;

    public productEntity convertProductEntity(productDto dto) {
        ModelMapper modelMapper = new ModelMapper();
        productEntity product = modelMapper.map(dto, productEntity.class);
        return product;
    }

    public productDto convertProductDto(productEntity product) {
        ModelMapper modelMapper = new ModelMapper();
        productDto dto = modelMapper.map(product, productDto.class);
        return dto;
    }


    public List<productEntity> getAll() {
        return repo.findAll();
    }

    public Optional<productEntity> getById(Long id) {
        Optional<productEntity> product = repo.findById(id);
        return product;
    }

    public productDto update(productRequest request) {
        productEntity product = repo.findBynamaProduk(request.getNamaProduk());
        productTypeDto dtoProductType = servicesTypeProduct.getByName(request.getTipeProduk());
        brandDto dtoBrand = servicesBrand.getByName(request.getNamaProduk());
        if (dtoBrand == null && dtoProductType == null) {
            throw new NotFoundException("Brand " + request.getBrandProduk() + " atau tipe produk " + request.getTipeProduk() + " tidak ditemukan");
        }
        brandEntity brand = servicesBrand.convertBrandEntity(dtoBrand);
        productTypeEntity productType = servicesTypeProduct.convertProductTypeEntity(dtoProductType);
        product.setBrandProduk(brand);
        product.setTipeProduk(productType);
        product.setDetail(request.getDetail());
        product.setGambar(request.getGambar());
        product.setHarga(request.getHarga());
        product.setNamaProduk(request.getNamaProduk());
        return convertProductDto(product);
    }

    public productDto save(productRequest request) {
        brandDto dtoBrand = servicesBrand.getByName(request.getBrandProduk());
        productTypeDto dtoProductType = servicesTypeProduct.getByName(request.getTipeProduk());
        if (dtoBrand == null && dtoProductType == null) {
            throw new NotFoundException("Brand " + request.getBrandProduk() + " atau tipe produk " + request.getTipeProduk() + " tidak ditemukan");
        }
        brandEntity brand = servicesBrand.convertBrandEntity(dtoBrand);
        productTypeEntity productType = servicesTypeProduct.convertProductTypeEntity(dtoProductType);
        productEntity product = new productEntity(request.getGambar(), request.getNamaProduk(), request.getDetail(), request.getHarga(), brand, productType);
        repo.save(product);
        return convertProductDto(product);
    }

    public List<productEntity> getListProductByBrandName(String name) {
        brandDto brandDto = servicesBrand.getByName(name);
        if (brandDto == null) {
            throw new NotFoundException("Brand " + name + " tidak ada");
        }
        brandEntity brand = servicesBrand.convertBrandEntity(brandDto);
        List<productEntity> list = repo.findByBrandProduk(brand);
        return list;
    }

    public List<productEntity> getListBynamaProdukContainsIgnoreCase(String name) {
        List<productEntity> product = repo.findBynamaProdukContainsIgnoreCase(name);
        return product;
    }

    public List<productEntity> getListProductBytipeProduk(String name) {
        productTypeDto dtoProductTypeDto = servicesTypeProduct.getByName(name);
        if (dtoProductTypeDto.getNamaProduk() == null) {
            throw new NotFoundException("Tipe produk " + name + " tidak ada");
        }
        productTypeEntity productType = servicesTypeProduct.convertProductTypeEntity(dtoProductTypeDto);
        List<productEntity> list = repo.findBytipeProduk(productType);
        return list;
    }

    public List<productEntity> getListProductByHarga(Double min, Double max) {
        List<productEntity> list = repo.findAll();
        List<productEntity> listNew = new ArrayList<productEntity>();
        for (productEntity productEntity : list) {
            if (productEntity.getHarga() >= min && productEntity.getHarga() <= max) {
                listNew.add(productEntity);
            }
        }
        return listNew;
    }


    public List<productEntity> getListProductByBrandNameAndtipeProduk(String nameBrand, String tipeProduk) {
        brandDto dtoBrand = servicesBrand.getByName(nameBrand);
        productTypeDto dtoProductType = servicesTypeProduct.getByName(tipeProduk);
        if (dtoBrand == null && dtoProductType == null) {
            throw new NotFoundException("nama brand " + nameBrand + " atau tipe produk " + tipeProduk + " todal ada");
        }
        brandEntity brand = servicesBrand.convertBrandEntity(dtoBrand);
        productTypeEntity productType = servicesTypeProduct.convertProductTypeEntity(dtoProductType);
        List<productEntity> list = new ArrayList<productEntity>();
        List<productEntity> listProduct = repo.findAll();
        for (productEntity productEntity : listProduct) {
            if (productEntity.getBrandProduk() == brand && productEntity.getTipeProduk() == productType) {
                list.add(productEntity);
                System.out.println("Product " + productEntity.toString());
            }
        }
        return list;
    }

    public List<productEntity> getProductWithPaging(Integer pageNo) {
        Integer pageSize = 6;
        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<productEntity> pagedResult = repo.findAll(paging);
        return pagedResult.getContent();
    }

    public void deleteById(Long id) {

        repo.deleteById(id);
    }

    public productDto findByProductName(String name) {
        productEntity check = repo.findBynamaProduk(name);
        if (check == null) {
            throw new NotFoundException(name + " tidak ditemukan");
        }
        productEntity product = repo.findBynamaProduk(name);
        return convertProductDto(product);
    }
}
