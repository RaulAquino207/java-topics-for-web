package br.com.lesson.three.product;

import java.util.UUID;

public class Product {
	
	private String id;
	
	public Product() {
		this.id = UUID.randomUUID().toString();
	}
	private String name;
	private String price;
	private String description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getProductInfos() {
		return this.getId() + "\n" + this.getName() + "\n" + this.getPrice() + "\n" + this.getDescription();
	}
}
