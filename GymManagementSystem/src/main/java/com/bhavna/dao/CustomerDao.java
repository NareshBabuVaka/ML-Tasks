package com.bhavna.dao;

import java.util.List;

import javax.persistence.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bhavna.entity.CustomerEntity;
import com.bhavna.entity.GymEntity;

@Repository
public class CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<CustomerEntity> getCustomers() {
		Session session = sessionFactory.openSession();
		CriteriaBuilder criteriabuilder = session.getCriteriaBuilder();
		CriteriaQuery<CustomerEntity> criteriaquery = criteriabuilder.createQuery(CustomerEntity.class);
		Root<CustomerEntity> root = criteriaquery.from(CustomerEntity.class);
		criteriaquery.select(root);
		Query query = session.createQuery(criteriaquery);
		return query.getResultList();
	}

	public void saveCustomer(GymEntity customer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(customer);
	}

	public GymEntity getCustomerById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		GymEntity customer1 = currentSession.get(GymEntity.class, id);
		return customer1;
	}

}
