package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.ProductDAO;
import com.example.demo.dto.ProductFilter;
import com.example.demo.entities.Product;

public class ProductController {
	
	@Autowired
	ProductDAO productDAO;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts() {
		return new ResponseEntity<>(
				productDAO.getAllProducts(),
				HttpStatus.OK
	    );
	}
	
	@GetMapping("/products-filtered")
	public ResponseEntity<List<Product>> getAllProductsByFilter(@RequestParam(required = false) int id,@RequestParam(required = false) String name,@RequestParam(required = false) int categoryId,@RequestParam(required = false) int quantity,@RequestParam(required = false) Double minPrice, @RequestParam(required = false) Double maxPrice) {
		ProductFilter filter = new ProductFilter(
				id, name, categoryId, quantity, minPrice,maxPrice
		);
		
		return new ResponseEntity<>(
				productDAO.getProductsByFilter(filter),
				HttpStatus.OK
	    );
	}
}
