package com.hw2.model.dto;

public abstract class Person {
	private String id;	// 고유번호
	private String name;// 이름
	
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// 객체 정보를 문자열로 반환한다
	public abstract String getInfo();
	
}
