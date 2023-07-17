package com.wlusbar.store.controllers;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wlusbar.store.dto.ProductsDTO;
import com.wlusbar.store.repository.ProductsRepository;

@RestController
@RequestMapping("")
public class ProductsController {

	 	@Autowired
	    ProductsRepository productsRepository;
	 
	    @GetMapping
	    public List<ProductsDTO> getAll(){
	         List<ProductsDTO>  productsList = productsRepository.findAll().stream().map(ProductsDTO::new).toList();
	        return productsList;
	    }
}
