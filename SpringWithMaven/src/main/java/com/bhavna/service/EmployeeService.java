package com.bhavna.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bhavna.entity.EmployeePojoClass;
import com.bhavna.exception.ExceptionClass;

@Service
public interface EmployeeService {

	public List<EmployeePojoClass> getAllActiveEmployees();

	public EmployeePojoClass getEmployeeById(int empId) throws ExceptionClass;

	public List<EmployeePojoClass> getAllEmployees();

}