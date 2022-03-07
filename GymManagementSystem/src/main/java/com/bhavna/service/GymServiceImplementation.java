package com.bhavna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bhavna.dao.CustomerDao;
import com.bhavna.entity.CustomerEntity;
import com.bhavna.entity.GymEntity;

@Service
@Transactional
public class GymServiceImplementation implements GymService {

	@Autowired
	private CustomerDao dao;

	@Override
	public List<GymEntity> getCustomers() {
		return dao.getCustomers();
	}

	@Override
	public void saveCustomer(CustomerEntity customer) {
		dao.saveCustomer(customer);
	}

	@Override
	public void updateCustomer(int customerId, CustomerEntity customer) {
		dao.updateCustomer(customerId, customer);
	}

	@Override
	public CustomerEntity getCustomer(int theId) {

		return dao.getCustomerById(theId);
	}

}
