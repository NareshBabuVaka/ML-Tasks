package com.bhavna.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.entity.EmployeeEntity;
import com.bhavna.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepositary;

	@Override
	public List<EmployeeEntity> getAllEmployess() {
		return employeeRepositary.findAll();
	}

	@Override
	public String saveEmployee(EmployeeEntity employee) {

		employeeRepositary.save(employee);
		return "The data entered by you is inserted successfully...";

	}

	@Override
	public Optional<EmployeeEntity> getEmployeeByName(String name) {
		return employeeRepositary.findById(name);
	}

}
