//Database : Please create the two tables , it should relation between those tables one to many relationship
//Hibernate : Please create two beans it should relation between those beans one to many relation
//
//1.Write a Rest API for getting the data using get method(session.get)
//2.Write a Rest API for getting the data using criteria based on the condition
//3.Write a Rest API for saving the data
//4.Write a Rest API for updating the data
//
//Note: make sure use annotation based configuration for hibernate bean and please add table creation script should add in your workspace

package com.bhavna.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class CustomerEntity {

	@Id
	@Column(name = "customerId")
	public Integer customerId;

	@Column(name = "customerName")
	public String customerName;

	@Column(name = "customerPlan")
	public String customerPlan;

	@Column(name = "customerPhoneNumber")
	public Long customerPhoneNumber;

	@Column(name = "customerBranch")
	public String customerBranch;

	@Column(name = "customerAddress")
	public String customerAddress;

	@Column(name = "gymId")
	public Integer gymId;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPlan() {
		return customerPlan;
	}

	public void setCustomerPlan(String customerPlan) {
		this.customerPlan = customerPlan;
	}

	public Long getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(Long customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerBranch() {
		return customerBranch;
	}

	public void setCustomerBranch(String customerBranch) {
		this.customerBranch = customerBranch;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Integer getGymId() {
		return gymId;
	}

	public void setGymId(Integer gymId) {
		this.gymId = gymId;
	}

}
