package com.bhavna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.entity.EmployeePojoClass;
import com.bhavna.exception.ExceptionClass;
import com.bhavna.service.EmployeeService;

@RestController
public class EmpControllerClass {

	@Autowired
	EmployeeService empService;

	@RequestMapping(value = "/getActiveEmployees", method = RequestMethod.GET)
	public List<EmployeePojoClass> getActiveEmployees() {
		return empService.getAllActiveEmployees();
	}

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public List<EmployeePojoClass> getAllEmployees() {
		return empService.getAllEmployees();
	}

	@RequestMapping(value = "/getEmployeeById/{EmpId}", method = RequestMethod.GET)
	public EmployeePojoClass getEmployeeById(@PathVariable int EmpId) throws ExceptionClass {
		EmployeePojoClass emp = empService.getEmployeeById(EmpId);
		return emp;
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getTest() {
		return "Hello Naresh Welcome...";
	}
}