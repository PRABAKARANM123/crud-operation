package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductRepo productRepo;
	
	public List<Product> getAllProduct(){
		return productRepo.findAll();		 
	}

	public Product getById(Integer id) {
		return productRepo.findById(id).get();
	}
	
	// Custom Query
	public List<Product> getAllByPrice(Integer price){
		return productRepo.getProductWithMaxPrice(price);		 
	}
	
	
	
	


}
