package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.model.Product;
import com.bhavna.service.ProductServiceI;

@RestController
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	ProductServiceI service;
	
	@GetMapping("/list")
	public List<Product> getAllItems() //First it will executes getAll items method...
	{
		return service.getAll(); //Then it will retrieves all the data present in product service table...
	}
}
