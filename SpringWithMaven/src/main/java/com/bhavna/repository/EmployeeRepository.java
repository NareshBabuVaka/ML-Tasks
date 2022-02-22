package com.bhavna.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.bhavna.entity.EmployeePojoClass;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeePojoClass, Integer> {

	@Query(value = "SELECT * FROM  EMPDETAILS WHERE status = 'Active'", nativeQuery = true)
	Collection<EmployeePojoClass> getAllActiveEmployees();

}