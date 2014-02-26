package org.growthTech.dao;

import java.util.List;

import org.growthTech.entity.Card;

public interface CardDAO {
	public void insert(Card card);
	
	//public Contact findByContactId(int contId);
	
	public List<Card> findAllCards();

}
