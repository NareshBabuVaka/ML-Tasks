package com.bhavna.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.model.Orders;
import com.bhavna.service.OrderServiceI;
@RestController //This annotation is used to create RESTful web services i.e web-based applications and apis...
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	OrderServiceI service;
	
	@GetMapping("/list")
	public List<Orders> getAllOrders(){
		return service.geAllOrders();
	}
	
	@PostMapping("/add")
	public String addOrder(@RequestBody Orders order) {
		 service.addOrder(order);
		return "Your order is added successfully...";
	}
	
	
	@GetMapping("/get/{id}")
	public Optional<Orders> getOrderById(@PathVariable("id") Integer id) {
		return service.getOrderById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteOrderById(@PathVariable("id") Integer id) {
		service.deleteOrder(id);
		return "Your order is deleted successfully...";
	}
	
	@PutMapping("/update/{order_id}")
	public Orders updateByCategory(@PathVariable("order_id") Integer order_id,@RequestBody Orders order) {
		return	service.updateOrder(order_id, order);

	}
	
	@PatchMapping("/patch/{id}")
	public Orders patchOrder(@PathVariable("id") Integer id, @RequestParam(name = "item", required=false) Integer item_id, 
			                                                 @RequestParam(name = "quantity", required=false) Integer quantity) {
		return service.patchOrder(id, item_id, quantity);
	}
}