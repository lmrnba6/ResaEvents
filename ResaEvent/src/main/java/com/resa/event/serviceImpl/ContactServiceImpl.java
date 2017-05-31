package com.resa.event.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resa.event.model.Contact;
import com.resa.event.service.ContactService;

@Repository
public class ContactServiceImpl implements ContactService {

	private static final Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class);

	@Autowired
	private EntityManager entityManager;

	@Override
	public void add(Contact var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Contact var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Contact> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getById(Long var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getByName(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long var1) {
		// TODO Auto-generated method stub
		
	}


	

}
