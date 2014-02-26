package org.growthTech.dao;

import java.util.List;

import org.growthTech.entity.Parent;

public interface ParentDAO {
	public void insert(Parent parent);
	
	public Parent getParentByTokenId(String tokenId);
	
	public List<Parent> findAllParents();
}
