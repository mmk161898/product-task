package com.product.task.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.product.task.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID>{
	
	//Used custom query to get the result in ordered sequence
	@Query(value = "Select * from product where category = :category order by created_at" , nativeQuery = true)
	List<Product> findAllByCategory(String category);

}
