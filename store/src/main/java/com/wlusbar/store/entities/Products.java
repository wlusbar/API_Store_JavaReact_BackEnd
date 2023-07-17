package com.wlusbar.store.entities;



import com.wlusbar.store.dto.ProductsRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "products")
@Entity(name = "products")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Products {		
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String title;
	    private String image;
	    private Integer price;	
	    
	    
	    
	    public Products(ProductsRequestDTO productsRequestDTO) {		
	    	this.image = productsRequestDTO.image();
	    	this.title = productsRequestDTO.title();
	    	this.price = productsRequestDTO.price();	    	
	    }
}
