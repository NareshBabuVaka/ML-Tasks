package com.bhavna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.dao.CustomerDao;
import com.bhavna.entity.CustomerEntity;
import com.bhavna.entity.GymEntity;

@Service
public class GymServiceImplementation implements GymService {
	
 

	@Autowired
	private CustomerDao dao;

	@Override
	public List<CustomerEntity> getCustomers() {
		return dao.getCustomers();
	}

	@Override
	public void saveCustomer(GymEntity gym) {
		dao.saveCustomer(gym);
	}

	@Override
	public GymEntity getCustomer(int customerId) {
		return dao.getCustomerById(customerId);
	}

	 
}
