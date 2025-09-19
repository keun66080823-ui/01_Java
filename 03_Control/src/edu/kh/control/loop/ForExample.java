package edu.kh.control.loop;

import java.util.Scanner;

// 기능 제공용 클래스
public class ForExample {

	Scanner sc = new Scanner(System.in);

	public void ex1() {
		// 1~10 까지 콘솔에 출력하기
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// 수행될 코드 (반복 수행될 코드)
			sum += i;
			if (i == 100) {
				System.out.printf("1부터 %d까지의 합은 %d입니다.", i, sum);
			}
		}

	}

	public void ex2() {
		// 영어 알파벳 a부터 z까지 한줄로 출력
		// ABCDEF...XYZ

		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char) i); // 강제형변환
		}

		System.out.println("\n========================================");
		// 또 다른 방법
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}

	}

	public void ex3() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		System.out.print("번호 입력 : ");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.print(i + " ");
		}

	}

	public void ex4() {
		// 정수 5개를 입력 받아서 합계 구하기

		// [실행화면]
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50
		// 합계 : 150
		int x, sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("입력 %d : ", i);
			x = sc.nextInt();
			sum += x;
		}
		System.out.println("합계 : " + sum);

	}

	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시

		// [실행화면]
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) 7 8 (9) ... 20
		System.out.print("괄호를 표시할 배수 : ");
		int x = sc.nextInt();

		for (int i = 1; i <= 20; i++) {
			if (i % x == 0) {
				System.out.printf("(%d) ", i);
			} else {
				System.out.printf("%d ", i);
			}
		}

	}

	public void ex6() {
		// 구구단 출력
		// 2 ~ 9 사이 수를 하나 입력받아
		// 해당 단을 출력
		// 단, 입력받은 수가 2~9 사이 숫자가 아니라면 "잘못 입력하셨습니다" 출력

		System.out.print("단 입력 : ");
		int dan = sc.nextInt();

		switch (dan) {
		case 2, 3, 4, 5, 6, 7, 8, 9:
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void ex7() {
		// 숫자 세기 count

		// 1부터 20까지 1씩 증가하면서
		// 입력받은 수의 배수의 총 개수 출력
		// 입력받은 수의 배수의 합계 출력

		// 배수 입력 : 3
		// 3, 6, 9, 12, 15, 18 : 6개
		// 3의 배수 합계 : 63

		String result = "";
		int count = 0, sum = 0;

		System.out.print("배수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= 20; i++) {
			if (i % num == 0) {
				result += i + " ";
				count++;
				sum += i;
			}
		}
		System.out.printf("%s: %d개\n", result, count);
		System.out.printf("%d의 배수 합계 : %d", num, sum);

	}

	public void ex8() {
		// 구구단 모두 출력하기

		for (int x = 2; x <= 9; x++) {

			for (int y = 1; y <= 9; y++) {
				System.out.printf("%d X %d = %2d  ", x, y, x * y); //2d로 쓴 이유 : 출력 시 구구단의 몫을 깔끔히 보이도록 2칸 띈 후 정렬로 바꿈

			}
			System.out.println();
		}

	}

}
