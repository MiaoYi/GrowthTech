package org.growthTech.entity;

public class Parent {
	private int id;
	private String tokenId;
	private String name;
	
	public Parent() {
		super();
	}
	
	public Parent(int id, String tokenId, String name) {
		this.id = id;
		this.tokenId = tokenId;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
