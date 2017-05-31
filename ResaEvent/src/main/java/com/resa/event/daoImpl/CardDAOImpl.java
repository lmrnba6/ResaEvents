package com.resa.event.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resa.event.dao.CardDAO;
import com.resa.event.model.Card;

@Repository
public class CardDAOImpl implements CardDAO {

	private static final Logger logger = LoggerFactory.getLogger(CardDAOImpl.class);

	@Autowired
	private EntityManager entityManager;

	@Override
	public void add(Card var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Card var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Card> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card getById(Long var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card getByName(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long var1) {
		// TODO Auto-generated method stub
		
	}




	

}
