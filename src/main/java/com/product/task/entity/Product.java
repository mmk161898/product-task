package com.product.task.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@GeneratedValue
	private UUID id; //to get the id in the format of UUID
	private String name;
	private String description;
	private String brand;
	private String category;
	private String createdAt;

	public Product() {
		
	}
	
	public Product(String name, String description, String brand, String category) {
		super();
		this.name = name;
		this.description = description;
		this.brand = brand;
//		this.tags = tags;
		this.category = category;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
