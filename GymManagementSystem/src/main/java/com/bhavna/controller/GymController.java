package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.entity.CustomerEntity;
import com.bhavna.service.GymService;

@RestController
public class GymController {
	@RequestMapping(value = "/demo", method = RequestMethod.GET)  
	public String sample(){
		return "Hello world";
	}
	
	@Autowired
	private GymService service;
	@RequestMapping(value = "/getAllCustomers", method = RequestMethod.GET)
	public List<CustomerEntity> getAllCustomers() {
		return service.getCustomers();
	}

}
