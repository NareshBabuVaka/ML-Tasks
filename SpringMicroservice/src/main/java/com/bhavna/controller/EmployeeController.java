package com.bhavna.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.entity.EmployeeEntity;
import com.bhavna.service.EmployeeServiceImplementation;

@RefreshScope
@RestController
public class EmployeeController {

	@Value("${domain}")
	private String message;

	@GetMapping("/message")
	public String getMessage() {
		return "Hello Naresh";
	}

	@Autowired
	private EmployeeServiceImplementation eservice;

	@GetMapping("/getAllEmployees")
	public List<EmployeeEntity> getAllEmployees() {
		return eservice.getAllEmployess();

	}

	@GetMapping("/getEmployee/{name}" + "${domain}")
	public Optional<EmployeeEntity> getEmployeeByName(@PathVariable("name") String name) {
	return eservice.getEmployeeByName(name);
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody EmployeeEntity employee) {
		eservice.saveEmployee(employee);
		return "The data entered by you is saved successfully...";
	}

}
