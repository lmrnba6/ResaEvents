package com.resa.event.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resa.event.model.Payment;
import com.resa.event.service.PaymentService;

@Repository
public class PaymentServiceImpl implements PaymentService {

	private static final Logger logger = LoggerFactory.getLogger(PaymentServiceImpl.class);

	@Autowired
	private EntityManager entityManager;

	@Override
	public void add(Payment var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Payment var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Payment> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getById(Long var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getByName(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long var1) {
		// TODO Auto-generated method stub
		
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public boolean checkLogin(String userName, String userPassword) {
//
//		boolean userFound = false;
//		userPassword = SecurePassword.getSecurePassword(userPassword);
//		// Query using Hibernate Query Language
//		String SQL_QUERY = " from User as o where o.userName= '" + userName + "' and o.userPassword= '" + userPassword
//				+ "'";
//		List<User> list = entityManager.createQuery(SQL_QUERY).getResultList();
//
//		if ((list != null) && (list.size() > 0)) {
//			userFound = true;
//		}
//
//		return userFound;
//	}

	

}
