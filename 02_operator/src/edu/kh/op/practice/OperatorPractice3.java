package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	public void practice1() {
//		마트에서 고객에게 할인 혜택을 제공하려고 한다
//		물건의 총 가격과 회원 여부를 입력받아, 
//		회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라
		
//		[실행화면]
//				가격을 입력 하세요 : 10000
//				멤버십 있으세요? (있으면 true / 없으면 false 입력) : true
//				할인을 포함한 최종금액 : 9000.0원
//
//
//				가격을 입력 하세요 : 10000
//				멤버십 있으세요? (있으면 true / 없으면 false 입력) : false
//				할인을 포함한 최종금액 : 9500.0원
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가격을 입력 하세요 : ");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.print("멤버십 있으세요? (있으면 true / 없으면 false 입력) : ");
		boolean membership = sc.nextBoolean();
		int discount = (membership == true) ? 10 : 5;
		System.out.printf("할인을 포함한 최종금액 : %.1f원\n", price-(price*(discount*0.01)));
		//또다른 풀이
//		double discount2 = membership ? price * 0.10 : price * 0.05;
//		double totalPrice = price-discount2;
//		System.out.println("할인 가격 : "+discount2);
//		System.out.println("할인을 포함한 최종금액 : "+totalPrice);
		
	}
	
	public void practice2() {
//		문제2)
//		ATM에서 사용자가 원하는 금액을 입력하면, 5만원, 1만원, 5천원, 1천원 단위로 최소 개수의 지폐로 돈을 인출하라
//		ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 1만원 지폐 2장, 5천원 지폐 0장, 1천원 지폐 3장이 필요함
	//
//		메서드 : public void practice2() {}
	//
//		[실행화면]
//		출금할 금액 입력 : 123000
//		50000원: 2
//		10000원: 2
//		5000원: 0
//		1000원: 3
	//
	//
//		출금할 금액 입력 : 253000
//		50000원: 5
//		10000원: 0
//		5000원: 0
//		1000원: 3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출금할 금액 입력 : ");
		int money = sc.nextInt();
	
		System.out.printf("50000원: %d\n", money/50000);
		money %= 50000;
		System.out.printf("10000원: %d\n", money/10000);
		money %= 10000;
		System.out.printf("5000원: %d\n", money/5000);
		money %= 5000;
		System.out.printf("1000원: %d\n", money/1000);
		money %= 1000;

		
	}
	
	public void practice3() {
//		문제3)
//	사용자로부터 두 개의 정수를 입력받아, 
//	첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
//	만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력
//
//
//	[실행화면]
//	첫 번째 수 : 100
//	두 번째 수 : 5
//	배수입니다
//
//	첫 번째 수 : 200
//	두 번째 수 : 7
//	배수가 아닙니다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		
		String result = num1%num2==0 ? "배수입니다" : "배수가 아닙니다";
		System.out.println(result);
		
		
		
		
		
	}


}
