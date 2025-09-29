package com.hw2.model.service;

import com.hw2.model.dto.Person;

public interface ManagementSystem {
	
	//abstract addPerson(Person person) : void
	public abstract void addPerson(Person person);
	
	//abstract removePerson(String id) : void
	public abstract void removePerson(String id);
	
	//abstract displayAllPersons() : void
	public abstract void displayAllPersons();
	
	

}
