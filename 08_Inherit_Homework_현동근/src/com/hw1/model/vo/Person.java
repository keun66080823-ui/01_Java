package com.hw1.model.vo;

public class Person {
	protected String name;
	// 상속받은 후손클래스에서 직접 접근 가능.
	int age;
	double height;
	double weight;
	
	public Person() {}
	
	// pdf에선 name 빼던데
	//그렇게 하니까 Employee 매개변수 생성자에서 오류남.
	public Person(int age, double height, double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// format은 또 뭐여
	public String information() {
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f", 
				name, age, height, weight);
	}
	
	
	
}
