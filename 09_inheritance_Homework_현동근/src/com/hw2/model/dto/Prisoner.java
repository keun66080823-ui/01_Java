package com.hw2.model.dto;

public class Prisoner extends Person{

	public String crime;

	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}

		
	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}


	@Override
	public String getInfo() {
		return null;
	}
	
	
	
	
}
