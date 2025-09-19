package edu.kh.variable;

import java.util.Scanner;

public class VariableExample3 {

	public static void main(String[] args) {
		
		// 형변환 (Casting) : 값의 자료형을 변환하는 것 (단, boolean 제외. 이 자료형은 형태 변환할 수 있는 게 없음.)
		/* 형변환은 왜 필요한가?
		 * - 컴퓨터는 기본적으로 같은 자료형끼리만 연산 가능함.
		 * 다른 자료형과 연산 오류 발생/ 
		 * --> 이런 상황을 해결하기 위해서 필요한 기술이 형변환
		 * 
		 * 자동 형변환 / 강제 형변환 존재
		 * 
		 * */
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : " + (num1+num2));
		// 13.5가 정상 출력됨. (같은 자료형끼리의 연산이 아니기에 원래 에러가 발생해야 하지만 자동 형변환 덕분에 발생 X)
		
		// int -> long 형변환
		int i2 = 2_100_000_000; // 21억. 세 자릿수 구분을 위해 _사용 가능.
		long l2 = 10_000_000_000L; // 100억.
		
		long result = i2 + l2;
		//			 int -> long
		// long = long + long
		
		System.out.println(result);
		
		// char -> int 형변환
		
		char ch3 = 'V';
		System.out.println(ch3);
		int i3 = ch3;
		System.out.println(i3); //V에 해당하는 유니코드 숫자인 86이 출력된다.
		
		// 퀴즈 : '각'이라는 글자는 유니코드 숫자 몇일까?
		char quest = '각';
		int answer = quest;
		
		System.out.println(answer); //출력 시 44033이 나옴. 즉 유니코드 44033번.
		
		
		
		
		
		
	}

}
