package com.restaurants.le.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurants.le.demo.dao.RestaurantMenu;
import com.restaurants.le.demo.model.Item;
import com.restaurants.le.demo.repository.ItemRepository;
import com.restaurants.le.demo.service.api.RestaurantMenuService;

@Service
public class RestaurantMenuServiceImpl implements RestaurantMenuService{
	
	@Autowired
	RestaurantMenu menu;
	
	@Autowired
	ItemRepository repository;

	@Override
	public List<Item> getAllItems() {
		List<Item> items = repository.findAll();
		if(items.size() ==0)
			repository.saveAllAndFlush(menu.getAllItems());
		return items.size() ==0 ? menu.getAllItems() : items;
	}

	@Override
	public Item getItem(String name) {
		Item item = repository.getByName(name);
		return item == null ? menu.getItem(name): item;
	}

	@Override
	public List<Item> addItem(Item item) {
		repository.save(item);
		List<Item> items = repository.findAll();
		return items.size() ==0 ?  menu.addItem(item) : items;
	}

	@Override
	public List<Item> removeItem(String name) {
		Item item = repository.getByName(name);
		if(item!=null)
			repository.deleteById(item.getId());
		return item == null ? menu.removeItem(name) : repository.findAll();
	}
	
	

}
