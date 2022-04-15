package com.product.task.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.task.entity.Product;
import com.product.task.repository.ProductRepository;

@Service
public class ProductService {

		@Autowired
		private ProductRepository prodRepository;
	
	 	public Product createProduct(Product product) {
	 		/*
	 		 * Converting date to specific format
	 		 */
	 		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss\'Z\'");
	 		Date date = new Date();
	 		String srDate = sdfDate.format(date);
	 		product.setCreatedAt(srDate);
	 		Product p = prodRepository.save(product);
	 		return p;
	 	}
}
