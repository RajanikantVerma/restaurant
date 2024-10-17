package com.restaurants.le.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.restaurants.le.demo.model.Item;

@Component
public class RestaurantMenu {
	
	Item item1 = new Item(1,"Vegetable Pakora","Starters","5.00","Veg");
	Item item2 = new Item(2,"non veg Pakora","Starters","15.00","non-Veg");
	
	
	public RestaurantMenu() {
		list.add(item2);
		list.add(item1);
	}

	List<Item> list = new ArrayList<>();
	

	
	public List<Item> getAllItems(){
		return list;
	}
	
	public List<Item> addItem(Item item){
		int last = list.get(list.size()-1).getId();
		item.setId(last+1);
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
