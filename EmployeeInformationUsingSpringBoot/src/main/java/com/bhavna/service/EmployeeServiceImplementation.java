package com.bhavna.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bhavna.entity.EmployeeEntity;
import com.bhavna.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepositary;

	@Override
	public List<EmployeeEntity> getEmployess() {
		return employeeRepositary.findAll();
	}

	@Override
	public Optional<EmployeeEntity> getEmployee(int theId) {
		return employeeRepositary.findById(theId);
	}

	@Override
	public String saveEmployee(EmployeeEntity employee) {

		employeeRepositary.save(employee);
		return "The data entered by you is inserted successfully...";

	}

	@Override
	public String updateEmployee(int employeeId, EmployeeEntity employee) {
		if (employeeRepositary.existsById(employeeId)) {
			employeeRepositary.save(employee);
			return "Employee Data Was saved Successfully! ";
		} else {
			return "The Employee Data is not Available with the given Id entered by you...";
		}
	}

	@Override
	public String deleteEmployee(int employeeId) {

		if (employeeRepositary.existsById(employeeId)) {
			employeeRepositary.deleteById(employeeId);
			return "Employee Data Was Deleted Successfully! ";
		} else {
			return "The Employee Data is not Available with the given Id entered by you...";
		}
	}

	public List<EmployeeEntity> getAllEmployees(Integer pageNo, Integer pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<EmployeeEntity> pagedResult = employeeRepositary.findAll(paging);
		return pagedResult.toList();
	}
}
