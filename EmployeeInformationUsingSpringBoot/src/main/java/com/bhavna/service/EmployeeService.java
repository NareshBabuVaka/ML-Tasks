package com.bhavna.service;

import java.util.List;
import java.util.Optional;

import com.bhavna.entity.EmployeeEntity;

public interface EmployeeService {

	public List<EmployeeEntity> getEmployess();

	public Optional<EmployeeEntity> getEmployee(int theId);

	public String saveEmployee(EmployeeEntity employee);

	public String updateEmployee(int employeeId, EmployeeEntity employee);

	public String deleteEmployee(int employeeId);

	public List<EmployeeEntity> getAllEmployees(Integer pageNo, Integer pageSize);

}
