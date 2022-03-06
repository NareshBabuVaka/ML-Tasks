package com.bhavna.service;

import java.util.List;

import com.bhavna.entity.CustomerEntity;
import com.bhavna.entity.GymEntity;

public interface GymService {
	public List<CustomerEntity> getCustomers();

	public void saveCustomer(GymEntity gym);

	public GymEntity getCustomer(int customerId);
	
//	public GymService getCustomerById(int empId);


}
