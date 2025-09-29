package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	Prisoner [] prisoner; // 전체 수용자 저장용 배열
	
	public int prisonerCount; // 수용자 수

	public Prison(int size) {
		super();
		this.prisoner = prisoner;
		this.prisonerCount = prisonerCount;
	}

	
	public Prisoner[] getPrisoner() {
		return prisoner;
	}
	public void setPrisoner(Prisoner[] prisoner) {
		this.prisoner = prisoner;
	}
	public int getPrisonerCount() {
		return prisonerCount;
	}
	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}

	
	@Override
	public void addPerson(Person person) {
		
	}

	@Override
	public void removePerson(String id) {
		
	}

	@Override
	public void displayAllPersons() {
		
	}
	
	
	
	
	
	
}
