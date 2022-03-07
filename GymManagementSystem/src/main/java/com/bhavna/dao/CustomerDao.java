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

	public List<GymEntity> getCustomers() {
		Session session = sessionFactory.openSession();
		CriteriaBuilder criteriabuilder = session.getCriteriaBuilder();
		CriteriaQuery<GymEntity> criteriaquery = criteriabuilder.createQuery(GymEntity.class);
		Root<GymEntity> root = criteriaquery.from(GymEntity.class);
		criteriaquery.select(root);
		Query query = session.createQuery(criteriaquery);
		return query.getResultList();
	}

	public void saveCustomer(CustomerEntity customer) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(customer);
		session.getTransaction().commit();
		session.close();
	}

	public void updateCustomer(int customerId, CustomerEntity customer) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(customer);
		session.getTransaction().commit();
		session.close();

	}

	public CustomerEntity getCustomerById(int customerId) {
		Session currentSession = sessionFactory.openSession();
		CustomerEntity theCustomer = currentSession.get(CustomerEntity.class, customerId);
		currentSession.close();
		return theCustomer;
	}

}
