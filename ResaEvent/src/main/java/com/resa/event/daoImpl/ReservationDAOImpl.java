package com.resa.event.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resa.event.dao.ReservationDAO;
import com.resa.event.model.Reservation;

@Repository
public class ReservationDAOImpl implements ReservationDAO {

	private static final Logger logger = LoggerFactory.getLogger(ReservationDAOImpl.class);

	@Autowired
	private EntityManager entityManager;

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

	


	@Override
	public void add(Reservation var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Reservation var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Reservation getById(Long var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation getByName(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long var1) {
		// TODO Auto-generated method stub
		
	}

}
