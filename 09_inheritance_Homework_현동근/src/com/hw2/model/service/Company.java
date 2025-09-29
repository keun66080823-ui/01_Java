package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{
	
	Employee [] employee;
	
	public int employeeCount = 0; // 이게 맞나?
	
	public Company(int size) {
		super();
		this.employee = employee;
		this.employeeCount = employeeCount;
		Employee [] employee = new Employee[size]; // 이게 맞나?
	}

	
	public Employee[] getEmployee() {
		return employee;
	}
	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

//	배열에 공간이 있다면, 해당
//	객체를 employees 배열에 추가 후 추가된
//	객체의 정보를 출력.
//	만약 배열에 더 이상 공간이 없다면, 인원이
//	모두 충원되었다는 메시지 출력
	@Override
	public void addPerson(Person person) {
		// 여기서부터 계속 풀기
		
	}

	@Override
	public void removePerson(String id) {
		
	}

	@Override
	public void displayAllPersons() {
		
	}

}
