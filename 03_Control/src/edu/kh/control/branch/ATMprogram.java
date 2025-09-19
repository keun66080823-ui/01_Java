package edu.kh.control.branch;

import java.util.Scanner;

public class ATMprogram {
	
	Scanner sc = new Scanner(System.in);
	
	public void ATM() {
		int money = 10000; //초기자금
		int num = 0; // 메뉴선택용
		int sum = 0; // 입금용
		int min = 0; // 출금용
		
		System.out.println("=== ATM 프로그램 시작 ===");
		System.out.printf("현재 잔액 : %d", money);
		
		do {
			System.out.println();
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			
			System.out.print(">>");
			
			num = sc.nextInt();
			
			switch (num) {
				case 1 :
					System.out.print("입금할 금액을 입력하세요");
					sum = sc.nextInt();
					
					if(sum>0) {
						System.out.println("입금완료! 현재 잔액: " + (money+sum) + "원\n");
						money+=sum;
						
					}else {
						System.out.println("0보다 큰 수를 입력해주세요.");
					}
					
					break;
				case 2 :
					System.out.print("출금할 금액을 입력하세요");
					min = sc.nextInt();
					if(min>money) {
						System.out.printf("잔액 부족 ! 현재 잔액은 %d 원 입니다. \n", money);
					}else {
						System.out.println("출금 완료! 현재 잔액: " + (money-min) + "원\n");
					money-=min;
					}
					break;
				case 3 : 
					System.out.printf("현재 잔액은 %d 원입니다\n", money);	
					break;
				case 4 :
					System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다!");
					break;
				default :
					System.out.println("잘못된 입력입니다. 1~4번중에서 선택하세요.\n");
					break;
				}
		}while(num != 4);
	}
	
}
