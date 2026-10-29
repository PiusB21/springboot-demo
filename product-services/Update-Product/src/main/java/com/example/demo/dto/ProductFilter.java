package com.example.demo.dto;

public record ProductFilter(int id, String name, int categoryId, int quantity, Double  minPrice, Double maxPrice) {

}
