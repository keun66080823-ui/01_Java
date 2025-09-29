package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	

	public static void main(String[] args) {
//		1. 3명의 학생 정보를 기록할 수 있게
//		객체 배열을 할당하고 아래의
//		사용데이터를 참고하여 3명의 학생 객체
//		생성 후 반복문을 통해 출력
		
		Student [] std = new Student[3];
		
		std[0] = new Student("홍길동",20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥",21, 187.3, 80.0, 2, "경영학과");
		std[2] = new Student("강개순",23, 167.0, 45.0, 4, "정보통신공학과");
		
		
		/*
		 향상된 for문
		 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로
		간단하게 반복할 수 있는 구조를 제공
		 일반적인 for문보다 코드가 더 간결하고 가독성이 좋아서
		반복 작업을 더 쉽게 작성할 수 있다.
		for(자료형 변수명 : 배열 또는 컬렉션) {
			반복해서 실행할 코드
		}
		예)
		for (Student stdx : std) {
			System.out.println(stdx.information());
		}
		*/
		
		
		//내가 쓴 반복문
		for(int i = 0; i<std.length; i++) {
			System.out.println(std[i].information());
		}
		
		System.out.println("============================================");
		
//		2. 최대 10명의 사원 정보를 기록할 수
//		있게 객체 배열을 할당하고 반복문을
//		사용하여 키보드로 사원 정보를 입력
//		받도록 구현
//		2명 정도의 사원 정보를 입력 받아 각
//		객체에 저장하고 현재까지 기록된
//		사원들의 정보 출력
		Scanner sc = new Scanner(System.in);
		
		Employee emp [] = new Employee [10];
		
		boolean flag = true;
		int count = 0;
		String comment;
		
		while(flag) {
			for(int i = 0; i<emp.length; i++) { //헷갈린 것 1. 배열 초기화하기
				emp[i] = new Employee();
			}
			for(int i = 0; i<emp.length; i++) {
				System.out.print("이름 : ");
				emp[i].setName(sc.next());
				
				System.out.print("나이 : ");
				emp[i].setAge(sc.nextInt());
				
				System.out.print("키 : ");
				emp[i].setHeight(sc.nextDouble());
				
				System.out.print("몸무게 : ");
				emp[i].setWeight(sc.nextDouble());
				
				System.out.print("급여 : ");
				emp[i].setSalary(sc.nextInt());
				
				System.out.print("부서 : ");
				emp[i].setDept(sc.next());
				
				count++;
				System.out.print("\n계속 추가할 건가요? (y/n) : ");
				comment = sc.next();
				
				if(comment.equals("Y")||comment.equals("y")) {
					flag = true;
				}else {
					flag = false;
					break;
				}
			}
		}
		
		for(int i = 0; i<emp.length; i++) {
			if(count>=i+1) {
				System.out.println(emp[i].information());
			}else {
				break;
			}
		}
		
		
		
		
		
		
	}

}
