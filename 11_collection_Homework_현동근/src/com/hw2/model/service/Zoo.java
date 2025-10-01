package com.hw2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {
	
	Scanner sc = new Scanner(System.in);
	
	public List<Animal> animals = new ArrayList<>();

	public Zoo() {
		super();
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void showAnimals() {
		System.out.println("동물들의 울음소리를 들어보세요");
		for ( int i = 0; i<animals.size(); i++) {
			animals.get(i).sound();
		}
	}
	
	public void displayMenu() {
		
		
		int menu = 0;
		
		do {	
		System.out.println("******* KH 동물원 *******");
		System.out.println("원하는 작업을 선택하세요 : ");
		System.out.println("1. 동물들의 울음소리 듣기");
		System.out.println("2. 종료");
		System.out.print("선택 : ");
		menu = sc.nextInt();
		
		switch(menu) {
			case 1 : 
				showAnimals();
				break;
			case 2 : 
				System.out.println("프로그램을 종료합니다."); 
				menu = 0;
				break;
			default : System.out.println("1과 2 중 하나만 입력해주세요.");
		}
			
			
		}while(menu != 0);
		
		
		
		
		
	}
	
	
	
	
}
