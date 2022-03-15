/*Create A Spring Boot Application for Naukri service, You can use the above existing database

- expose a few end points
POST saveProfile/employee
GET  getProfile/username+{@domainName}
- Read all the database properties from cloud server 

Create A Spring Boot Application for Spring Cloud server
- store all the databse properties used by naukri service
- store property files on cloud server with domainName */

package com.bhavna.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeTable")
public class EmployeeEntity {

	@Column(name = "ID")
	public Integer employeeId;

	@Id
	@Column(name = "ENAME", unique = true)
	public String employeeName;

	@Column(name = "AGE")
	public Integer employeeAge;

	@Column(name = "SALARY")
	public double employeeSalary;

	@Column(name = "JOB_TITLE")
	public String employeeJobTitle;

	@Column(name = "GENDER")
	public String employeeGender;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeJobTitle() {
		return employeeJobTitle;
	}

	public void setEmployeeJobTitle(String employeeJobTitle) {
		this.employeeJobTitle = employeeJobTitle;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

}
