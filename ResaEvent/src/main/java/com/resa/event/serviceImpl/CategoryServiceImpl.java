package com.resa.event.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resa.event.model.Category;
import com.resa.event.service.CategoryService;

@Repository
public class CategoryServiceImpl implements CategoryService {

	private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

	@Autowired
	private EntityManager entityManager;

	@Override
	public void add(Category var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Category var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getById(Long var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getByName(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long var1) {
		// TODO Auto-generated method stub
		
	}



	

}
