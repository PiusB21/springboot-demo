package com.example.demo.dao;

import java.util.List;

import com.example.demo.entities.Category;

public interface CategoryDAO {
   public int createCategory(String name, String description);
   public int updateCategory(int category_id, String name, String description);
   public List<Category> getAllCategories();
   public int deleteCategories(int category_id);
}
