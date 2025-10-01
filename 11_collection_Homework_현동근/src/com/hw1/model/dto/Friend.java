package com.hw1.model.dto;

public class Friend {
	
	private String name;

	public Friend() {}

	public Friend(String name) {
		super();
		this.name = name;
	}
	
	public void pickLeader() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "가 떡잎방범대 대장이다!";
	}
	
	

}
