package com.resa.event.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resa.event.model.Availability;
import com.resa.event.service.AvailabilityService;

@Repository
public class AvailabilityServiceImpl implements AvailabilityService {

	private static final Logger logger = LoggerFactory.getLogger(AvailabilityServiceImpl.class);

	@Autowired
	private EntityManager entityManager;

	@Override
	public void add(Availability var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Availability var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Availability> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Availability getById(Long var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Availability getByName(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long var1) {
		// TODO Auto-generated method stub
		
	}

	





	

}
