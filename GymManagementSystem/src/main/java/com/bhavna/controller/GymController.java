package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.entity.CustomerEntity;
import com.bhavna.entity.GymEntity;
import com.bhavna.service.GymService;

@RestController
public class GymController {
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public String sample() {
		return "Hello world";
	}

	@Autowired
	private GymService service;

	@RequestMapping(value = "/getAllCustomers", method = RequestMethod.GET)
	public List<GymEntity> getAllCustomers() {
		return service.getCustomers();
	}

	@GetMapping("/getCustomerById/{customerId}")
	@ResponseBody
	public CustomerEntity getCustomerById(@PathVariable int customerId) {
		return service.getCustomer(customerId);
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@RequestBody CustomerEntity customer) {
		service.saveCustomer(customer);
		return "Customer data is saved successfully...";
	}

	@PutMapping("/updateCustomer/{customerId}")
	public String updateCustomer(@PathVariable int customerId, @RequestBody CustomerEntity customer) {
		service.updateCustomer(customerId, customer);
		return "Customer data is updated successfully...";

	}

}
