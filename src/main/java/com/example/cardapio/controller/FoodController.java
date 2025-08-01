package com.example.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.Food.FoodRepository;
import com.example.cardapio.Food.Food;

@RestController
@RequestMapping("food")
public class FoodController {

	@Autowired
	private FoodRepository repository;
	@GetMapping
	public List<Food> getAll() {
		
		List<Food> foodlist = repository.findAll();
		return foodlist;
	}
	
	
}
