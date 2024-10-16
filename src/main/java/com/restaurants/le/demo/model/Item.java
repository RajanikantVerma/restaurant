package com.restaurants.le.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


public class Item {
	
	public Item(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
//	@Id
//	@GeneratedValue
	Integer id;
	String name;
	String description;
	Integer price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	public Item(Integer id, String name, String description, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
}
