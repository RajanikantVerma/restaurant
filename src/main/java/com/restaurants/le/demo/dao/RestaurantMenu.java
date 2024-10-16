package com.restaurants.le.demo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.restaurants.le.demo.model.Item;

@Component
public class RestaurantMenu {
	
	Item item1 = new Item("fist", "first Item", 100);
	Item item2 = new Item("second", "second Item", 1000);
	List<Item> list = List.of(item1,item2);

	
	public List<Item> getAllItems(){
		return list;
	}
	
	public List<Item> addItem(Item item){
		list.add(item);
		return list;
	}
	
	public List<Item> removeItem(String name){
		int index = Integer.MIN_VALUE;
		for(Item item : list) {
			if(item.getName().equalsIgnoreCase(name))
				index = item.getId();
		}
		list.remove(index);
		return list;
	}
	
	public Item getItem(String name){
		int index = Integer.MIN_VALUE;
		for(Item item : list) {
			if(item.getName().equalsIgnoreCase(name))
				return item;
		}
		return null;
	}
	
	

}
