package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController

public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping(value = "/productlist")
	public List<Product> getAll(){
		return productService.getAllProduct();
	}
	@GetMapping(value = "/productlist/{id}")
	public Product getById(@PathVariable Integer id) {
		return productService.getById(id);
	}
	
	@GetMapping(value = "/productlistprice/{price}")
	public List<Product> getByPrice(@PathVariable Integer price) {
		return productService.getAllByPrice(price);
	}

}
