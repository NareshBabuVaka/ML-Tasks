package com.bhavna.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.entity.EmployeePojoClass;
import com.bhavna.exception.ExceptionClass;
import com.bhavna.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplemetation implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<EmployeePojoClass> getAllActiveEmployees() {
		List<EmployeePojoClass> list = new ArrayList<>();
		list = (List<EmployeePojoClass>) repository.getAllActiveEmployees();
		return list;
	}

	@Override
	public EmployeePojoClass getEmployeeById(int empId) throws ExceptionClass {
		if (!repository.existsById(empId)) {
			System.out.println("Data not found for your input please enter your input correctly..");
			throw new ExceptionClass("Data not found for your input please enter your input correctly..");
		} else {

			EmployeePojoClass emp = repository.findById(empId).get();
			return emp;
		}
	}

	@Override
	public List<EmployeePojoClass> getAllEmployees() {
		List<EmployeePojoClass> list1 = new ArrayList<>();
		list1 = (List<EmployeePojoClass>) repository.findAll();

		return list1;
	}

}