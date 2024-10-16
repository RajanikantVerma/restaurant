/**
 * 
 */
package com.restaurants.le.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restaurants.le.demo.model.Item;
import com.restaurants.le.demo.service.api.RestaurantMenuService;

@RestController
@RequestMapping("/items")
public class RestaurantMenuController {
	
	@Autowired
	RestaurantMenuService service;
	
	
	@GetMapping("/all")
	public List<Item> getAllItems(){
		return service.getAllItems();
	}
	
	@GetMapping("/{name}")
	public Item getAllItems(@RequestParam String name){
		return service.getItem(name);
	}
	
	@PostMapping("/add")
	public List<Item> addItem(@RequestBody Item item){
		return service.addItem(item);
	}
	
	@DeleteMapping("/{name}")
	public List<Item> removeItem(@RequestParam String name){
		return service.removeItem(name);
	} 
}