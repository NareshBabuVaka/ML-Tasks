package com.bhavna.service;

import java.util.List;

import com.bhavna.entity.CustomerEntity;
import com.bhavna.entity.GymEntity;

public interface GymService {
	public List<GymEntity> getCustomers();

	public void saveCustomer(CustomerEntity customer);

	public void updateCustomer(int customerId, CustomerEntity customer);

	public CustomerEntity getCustomer(int theId);

}
