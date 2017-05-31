package com.resa.event.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resa.event.model.Business;
import com.resa.event.service.BusinessService;

@Repository
public class BusinessServiceImpl implements BusinessService {

	private static final Logger logger = LoggerFactory.getLogger(BusinessServiceImpl.class);

	@Autowired
	private EntityManager entityManager;

	@Override
	public void add(Business var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Business var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Business> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Business getById(Long var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Business getByName(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long var1) {
		// TODO Auto-generated method stub
		
	}





	

}
