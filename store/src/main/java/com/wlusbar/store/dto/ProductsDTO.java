package com.wlusbar.store.dto;

import com.wlusbar.store.entities.Products;

public record ProductsDTO(Long id, String title, String image, Integer price) {
	
	public ProductsDTO(Products products) {
		this(products.getId(), products.getTitle(), products.getImage(), products.getPrice());
	}
}
