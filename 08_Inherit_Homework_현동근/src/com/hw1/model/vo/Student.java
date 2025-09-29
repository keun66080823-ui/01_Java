package com.hw1.model.vo;

public class Student extends Person{
	int grade;
	String major;
		
	public Student() {}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name; // 직접 접근이 가능하기에 super생성자로 가져올 필요 없음.
		this.grade = grade;
		this.major = major;
	}


	@Override
	public String information() {
		return super.information()+" / 학년 : "+grade+" / 학과 : "+major;
	}

	//getter/setter
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
	
	
}
