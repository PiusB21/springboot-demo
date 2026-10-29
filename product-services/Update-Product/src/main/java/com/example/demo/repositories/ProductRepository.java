package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("""
	        SELECT p FROM Product p
	        WHERE (:name IS NULL OR LOWER(p.name) LIKE LOWER(CONCAT('%', :name, '%')))
	          AND (:minPrice IS NULL OR p.price >= :minPrice)
	          AND (:maxPrice IS NULL OR p.price <= :maxPrice)
	          AND (:quantity IS NULL OR p.quantity = :quantity)
	          AND (:categoryId IS NULL OR p.category.id = :categoryId)
	    """)
	    List<Product> findAllByFilter(
	        @Param("name") String name,
	        @Param("minPrice") Double minPrice,
	        @Param("maxPrice") Double maxPrice,
	        @Param("quantity") int quantity,
	        @Param("categoryId") int categoryId
	    );
}
