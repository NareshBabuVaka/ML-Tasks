package com.bhavna.repsitary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhavna.entity.EmployeeEntity;

@Repository
public interface EmployeeRepositary extends JpaRepository<EmployeeEntity, Integer> {

}
