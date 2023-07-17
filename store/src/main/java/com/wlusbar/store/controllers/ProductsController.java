package com.wlusbar.store.controllers;

import java.util.List;
import java.util.stream.Stream;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wlusbar.store.dto.ProductsResponseDTO;
import com.wlusbar.store.dto.ProductsRequestDTO;
import com.wlusbar.store.entities.Products;
import com.wlusbar.store.repository.ProductsRepository;

@RestController
@RequestMapping("/")
public class ProductsController {

	 	@Autowired
	    ProductsRepository productsRepository;
	 
	 	@CrossOrigin(origins = "*", allowedHeaders = "*")
	    @GetMapping
	    public List<ProductsResponseDTO> getAll(){
	         List<ProductsResponseDTO>  productsList = productsRepository.findAll().stream().map(ProductsResponseDTO::new).toList();
	        return productsList;
	    }
	    
	    @CrossOrigin(origins = "*", allowedHeaders = "*")
	    @PostMapping
	    public void postProducts(@RequestBody ProductsRequestDTO date) {
	    	Products products = new Products(date);
	    	productsRepository.save(products);
	    	return;
	    }
}
