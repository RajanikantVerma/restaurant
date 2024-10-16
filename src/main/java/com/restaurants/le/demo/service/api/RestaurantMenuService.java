package com.restaurants.le.demo.service.api;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurants.le.demo.model.Item;

@Service
public interface RestaurantMenuService {
	
	List<Item> getAllItems();
	
	Item getItem(String name);
	
	List<Item> addItem(Item item);
	
	List<Item> removeItem(String name);

}
