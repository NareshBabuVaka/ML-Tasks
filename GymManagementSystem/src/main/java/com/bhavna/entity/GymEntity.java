package com.bhavna.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Gym")
public class GymEntity {

	@Id
	@Column(name = "gymId")
	public Integer gymId;

	@Column(name = "gymName")
	public String gymName;

	@Column(name = "gymBranch")
	public String gymBranch;

	@Column(name = "gymAddress")
	public String gymAddress;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "gymId")
	public List<CustomerEntity> customers;

	public Integer getGymId() {
		return gymId;
	}

	public void setGymId(Integer gymId) {
		this.gymId = gymId;
	}

	public String getGymName() {
		return gymName;
	}

	public void setGymName(String gymName) {
		this.gymName = gymName;
	}

	public String getGymBranch() {
		return gymBranch;
	}

	public void setGymBranch(String gymBranch) {
		this.gymBranch = gymBranch;
	}

	public String getGymAddress() {
		return gymAddress;
	}

	public void setGymAddress(String gymAddress) {
		this.gymAddress = gymAddress;
	}

	public List<CustomerEntity> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerEntity> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "GymEntity [gymId=" + gymId + ", gymName=" + gymName + ", gymBranch=" + gymBranch + ", gymAddress="
				+ gymAddress + ", customers=" + customers + "]";
	}

	public GymEntity() {
		super();
	}

}
