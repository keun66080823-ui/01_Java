package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//		[실행화면]
//		1이상의 숫자를 입력하세요 : 4
//		1 2 3 4
//		—----------------------------------------
//		1이상의 숫자를 입력하세요 : 0
//		1 이상의 숫자를 입력해주세요.

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}

	}

	public void practice2() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		[실행화면]
//		1이상의 숫자를 입력하세요 : 4
//		4 3 2 1
//		—-------------------------------------
//		1이상의 숫자를 입력하세요 : 0
//		1 이상의 숫자를 입력해주세요.

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 0; i < num; i++) {
				System.out.print(num - i + " ");
			}
		}

	}

	public void practice3() {
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
//		[실행화면]
//		정수를 하나 입력하세요 : 8
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			if (i != num) {
				System.out.print("+ ");
			} else {
				System.out.print("= ");
			}
			sum += i;
		}
		System.out.print(sum);

	}

	public void practice4() { 
//		 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
//		 [실행화면]
//		 첫 번째 숫자 : 8	 첫 번째 숫자 : 4 		첫 번째 숫자 : 9
//		 두 번째 숫자 : 4 	 두 번째 숫자 : 8 		두 번째 숫자 : 0
//		 4 5 6 7 8			 4 5 6 7 8 				1 이상의 숫자를 입력해주세요.

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
//			if (num1 > num2) { // 첫 번째 숫자가 두 번째보다 클 경우
//				int x = num2;
//				for (int i = 1; i <= num1 - num2 + 1; i++) { //i <= num1 - num2 + 1;이라고 쓴 이유는 num1과 num2 둘 다 포함되어 출력되어야 하기 때문.
//					System.out.print(x + " ");				 // 만약 +1 을 빼면 num1과 num2 중 더 큰 수가 빠진 채로 출력이 끝난다.
//					x += 1;
//				}
//			} else {
//				int x = num1;
//				for (int i = 1; i <= num2 - num1 + 1; i++) {
//					System.out.print(x + " ");
//					x += 1;
//				}
//			}
			// 더 간단한 코드
			int start = num1;
			int end = num2;
			
			if(num1 > num2) {
				start = num2;
				end = num1;
			}
			for(int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}
			
			
		}

	}
	
	public void practice5(){
//		사용자로부터 입력 받은 숫자의 단을 출력하세요.
//		ex.
//		숫자 : 4
//		===== 4단 =====
//		4 * 1 = 4
//		4 * 2 = 8
//		4 * 3 = 12
//		4 * 4 = 16
//		4 * 5 = 20
//		4 * 6 = 24
//		4 * 7 = 28
//		4 * 8 = 32
//		4 * 9 = 36
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.printf("===== %d단 =====\n", num);
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
		
		
		
		
	}
	
	public void practice6(){
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
//		숫자 : 4 				숫자 : 10
//		===== 4단 ===== 		2~9 사이 숫자만 입력해주세요.
//		===== 5단 =====
//		===== 6단 =====
//		===== 7단 =====
//		===== 8단 =====
//		===== 9단 =====
//		(해당 단의 내용들은 길이 상 생략)
		
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
//		int z = num;
		
//		if(num>=2 && num<=9) {
//			for (int i = 1; i <= 10-num; i++) { 
//				System.out.printf("===== %d단 =====\n", z);
//				for(int j = 1; j <=9; j++) {
//					System.out.printf("%d X %d = %d\n", z, j, z*j);
//				}
//				z++;
//				
//			}
//		}else {
//			System.out.println("2~9 사이 숫자만 입력해주세요.");
//		}
		//또 다른 예시
		if(num>=2 && num<=9) {
			for (int dan = num; dan <= 9; dan++) { 
				System.out.printf("===== %d단 =====\n", dan);
				for(int j = 1; j <=9; j++) {
					System.out.printf("%d X %d = %d\n", dan, j, dan*j);
				}
			}
		}else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
		
		
		
	}
	
	public void practice7(){
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
//		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//		 모두 나머지가 0이 나오는 수
//		ex.
//		자연수 하나를 입력하세요 : 15
//		2 3 4 6 8 9 10 12 14 15
//		count : 2
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
			}
			if(i%2==0 && i%3==0) {
				count++;
			}
		}
		System.out.println("\ncount : "+count);
		
		
	}
	
		
	
	
	
	

}
