package com.example.demo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.ProductDAO;
import com.example.demo.dto.ProductFilter;
import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

public class ProductDaoImpl implements ProductDAO {

	@Autowired
	ProductRepository productRepo;

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public List<Product> getProductsByFilter(ProductFilter productFilter) {
		return productRepo.findAllByFilter(productFilter.name(),productFilter.minPrice(),productFilter.maxPrice(),productFilter.quantity(), productFilter.categoryId());
	}

}
