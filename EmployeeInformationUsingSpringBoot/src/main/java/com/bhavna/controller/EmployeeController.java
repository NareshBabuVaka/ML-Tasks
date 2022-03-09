package com.bhavna.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.entity.EmployeeEntity;
import com.bhavna.service.EmployeeServiceImplementation;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImplementation eservice;

	@GetMapping("/getEmployees")
	public List<EmployeeEntity> getAllEmployees() {
		return eservice.getEmployess();

	}

	@GetMapping("/getAllEmployees")
	public List<EmployeeEntity> getAllEmployees(
			@RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
			@RequestParam(name = "size", required = false, defaultValue = "10") Integer size) {

		return eservice.getAllEmployees(page, size);

	}

	@GetMapping("/getEmployeeById/{employeeId}")
	public Optional<EmployeeEntity> getEmployeeById(@PathVariable int employeeId) {
		return eservice.getEmployee(employeeId);

	}

	@GetMapping("/deleteEmployeeById/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		return eservice.deleteEmployee(employeeId);

	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody EmployeeEntity employee) {
		eservice.saveEmployee(employee);
		return "The data entered by you is saved successfully...";
	}

	@PutMapping("/updateEmployeeById/{employeeId}")
	public String UpdateEmployee(@PathVariable int employeeId, @RequestBody EmployeeEntity employee) {
		return eservice.updateEmployee(employeeId, employee);

	}

}
