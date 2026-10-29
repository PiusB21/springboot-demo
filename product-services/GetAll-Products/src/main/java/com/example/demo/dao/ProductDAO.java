package com.example.demo.dao;

import java.util.List;

import com.example.demo.dto.ProductFilter;
import com.example.demo.entities.Product;

public interface ProductDAO {
	List<Product> getAllProducts();
	List<Product> getProductsByFilter(ProductFilter productFilter);
}
