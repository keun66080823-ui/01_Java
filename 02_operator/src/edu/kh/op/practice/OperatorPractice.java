package edu.kh.op.practice;

import java.util.Scanner;
// ctrl + shift + o : 자동 임포트

// 기능 제공용
public class OperatorPractice {
	
	public void practice1(){
//		모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
//		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
//		[실행화면]
//			인원 수 : 29
//			사탕 개수 : 100
//			1인당 사탕 개수 : 3
//			남는 사탕 개수 : 13
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		System.out.printf("1인당 사탕 개수 : %d\n", candy/people);
		System.out.printf("남는 사탕 개수 : %d\n", candy%people);

	}
	
	public void practice2() {
//		키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요
//		ex.
//		이름 : 홍길동
//		학년(정수만) : 3
//		반(정수만) : 4
//		번호(정수만) : 15
//		성별(남학생/여학생) : 남학생
//		성적(소수점 아래 둘째 자리까지) : 85.75
//		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(정수만) : ");
		int level = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int classRoom = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.nextLine();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double grade = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", level, classRoom, num, name, gender, grade);
		
	}

	public void practice3(){
//		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
	//
//		[실행화면]
//		국어 : 60
//		영어 : 80
//		수학 : 40
//		합계 : 180
//		평균 : 60.0
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", avg);
		
		// 각 과목이 40점 이상이고 평균 60점 이상이어야 합격, 그 외에는 불합격
		
//		String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
//		System.out.println(result);
		
		// 또다른 풀이
//		boolean result = (kor>=40) && (eng>=40) && (math>=40) && (avg>=60);
//		System.out.println( result ? "합격" : "불합격");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
