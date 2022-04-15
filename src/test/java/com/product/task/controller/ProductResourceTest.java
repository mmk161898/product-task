package com.product.task.controller;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.product.task.entity.Product;
import com.product.task.resource.ProductResource;
import com.product.task.service.ProductService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ProductResource.class)
public class ProductResourceTest {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ProductService productService;

	String exampleProductJson = "{\"name\":\"Jeans\",\"description\":\"Slim Fit Jeans\",\"brand\":\"Highlander\",\"category\":\"apparel\"}";
	
	@Test
	public void createProductTest() throws Exception {
		
		Product mockProduct = new Product("Jeans", "Slim Fit Jeans", "Highlander", "apparel");
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss\'Z\'");
 		Date date = new Date();
 		String srDate = sdfDate.format(date);
 		mockProduct.setCreatedAt(srDate);
		
		Mockito.when(
				productService.createProduct(Mockito.any(Product.class))).thenReturn(mockProduct);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/v1/product/createProduct")
				.accept(MediaType.APPLICATION_JSON).content(exampleProductJson)
				.contentType(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();

		assertEquals(HttpStatus.OK.value(), response.getStatus());

		assertEquals("http://localhost/v1/product/createProduct",
				response.getContentType().equals(MediaType.APPLICATION_JSON));

	}
}
