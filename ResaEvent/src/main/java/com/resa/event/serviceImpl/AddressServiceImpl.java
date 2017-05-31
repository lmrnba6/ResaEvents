package com.resa.event.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resa.event.model.Address;
import com.resa.event.service.AddressService;

@Repository
public class AddressServiceImpl implements AddressService {

	private static final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);

	@Autowired
	private EntityManager entityManager;

	@Override
	public void add(Address var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Address var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Address> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getById(Long var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getByName(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long var1) {
		// TODO Auto-generated method stub
		
	}




	

}
