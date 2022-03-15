package com.bhavna.service;

import java.util.List;
import java.util.Optional;

import com.bhavna.entity.EmployeeEntity;

public interface EmployeeService {

	public List<EmployeeEntity> getAllEmployess();

	public String saveEmployee(EmployeeEntity employee);

	public Optional<EmployeeEntity> getEmployeeByName(String name);

}
