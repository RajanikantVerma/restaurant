package com.restaurants.le.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurants.le.demo.dao.RestaurantMenu;
import com.restaurants.le.demo.model.Item;
import com.restaurants.le.demo.service.api.RestaurantMenuService;

@Service
public class RestaurantMenuServiceImpl implements RestaurantMenuService{
	
	@Autowired
	RestaurantMenu menu;

	@Override
	public List<Item> getAllItems() {
		
		return menu.getAllItems();
	}

	@Override
	public Item getItem(String name) {
		return menu.getItem(name);
	}

	@Override
	public List<Item> addItem(Item item) {
		return menu.addItem(item);
	}

	@Override
	public List<Item> removeItem(String name) {
		return menu.removeItem(name);
	}
	
	

}
