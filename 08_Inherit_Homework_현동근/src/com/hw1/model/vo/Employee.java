package com.hw1.model.vo;

public class Employee extends Person{
	int salary; //급여
	String dept; //부서
	
	public Employee() {}	
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name; // 직접 접근이 가능하기에 super생성자로 가져올 필요 없음.
		this.salary = salary;
		this.dept = dept;
	}

	public String information() {
		return super.information()+" / 급여 : "+salary+" / 부서 : "+dept;
	}
	
	//getter/setter
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
