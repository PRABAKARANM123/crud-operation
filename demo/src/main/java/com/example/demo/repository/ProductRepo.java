package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Product;

public interface ProductRepo  extends JpaRepository<Product, Integer>{
	

	@Query(value = "SELECT * FROM productslist WHERE price < :maxPrice",nativeQuery = true)
	public List<Product> getProductWithMaxPrice(Integer maxPrice);
	
	

}
