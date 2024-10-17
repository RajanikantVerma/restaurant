package com.restaurants.le.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.restaurants.le.demo.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

	@Query(value="select p from Item p where p.name = ?1")
	Item getByName(String name);

}
