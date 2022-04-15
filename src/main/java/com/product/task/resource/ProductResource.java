package com.product.task.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.task.entity.Product;
import com.product.task.repository.ProductRepository;
import com.product.task.service.ProductService;

@RestController
@RequestMapping(value = "/v1/product")
public class ProductResource {
	
	@Value("${no.record.found.error}")
	private String noRecordFound;
	
	@Autowired
	private ProductRepository prodRepository;
	
	@Autowired
	private ProductService prodService;

	@PostMapping(path = "createProduct", consumes = "application/json")
	public Product createProduct(@RequestBody Product product) {
		 return prodService.createProduct(product);
	}
	
	@GetMapping("{category}")
	public List<Product> getAllProducts(@PathVariable String category) throws Exception{
		List<Product> prodList = prodRepository.findAllByCategory(category);
		if (!prodList.isEmpty()) {
			return prodList;
		}else {
			throw new Exception(noRecordFound);
		}
		
	}
	
}
