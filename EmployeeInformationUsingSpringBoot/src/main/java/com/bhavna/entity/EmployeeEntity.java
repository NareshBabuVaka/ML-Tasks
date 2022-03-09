//Create A Spring Boot Application Use DB any of your choice
//DB will Have Employe Table with columns: id, Name, Age, Salary, Job Title, Gender
// 
//Expose the below end points 
// 
//* POST /api/Employee : To Save an Employee Details
//* GET /api/Employee/{id} : To retrie the Specific Employee Details with the id
//* PUT /api/Employee : To Update the Employee Details
//* DELETE /api/Employee/{id} : Will Delete the specific Employee with the id
//* GET /api/Employees?page=1&size=10 : Use Spring JPA Pagination concept here 
//The Specified URl will fetch First 10 records, and if page=2&size=10 it will fectch Records 11-20 in the DB

package com.bhavna.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeTable")
public class EmployeeEntity {

	@Id
	@Column(name = "ID")
	public Integer employeeId;

	@Column(name = "ENAME")
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
