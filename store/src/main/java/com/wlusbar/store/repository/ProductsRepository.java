package com.wlusbar.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wlusbar.store.entities.Products;

public interface ProductsRepository extends JpaRepository<Products,Long>{

}
