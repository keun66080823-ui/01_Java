package edu.kh.control.branch;

import java.util.Scanner;

public class Dice {
	Scanner sc = new Scanner(System.in);
	
	public void ex2() {
		int answer;
		int count = 0, win = 0;
		
		System.out.println("=== 주사위 맞히기 게임 시작 ===");
		System.out.println("1~6 사이 숫자를 맞혀보세요. (종료를 원하면 \"종료\" 입력)"); // \" \"로 써야 구분자와 구별 가능.
		
		while(true) {
			answer = (int)(Math.random()*6+1);
			
			while(true) {
				System.out.print("숫자 입력 >> ");
				String num = sc.next();
				
				
				
				if(num.equals("종료")) { //종료인 경우
					
					System.out.println("게임을 종료합니다.");
					System.out.println("총 시도 횟수 : "+count);
					System.out.println("정답 횟수 : "+win);
					System.out.println("정답률 : "+(win * 100) / count+"%");
					
					return; // 모든 반복문 종료
					
				}else {
					if(Integer.parseInt(num)>6 || Integer.parseInt(num)<=0) {
						System.out.println("잘못된 입력입니다. 1~6 사이 숫자를 입력하세요.");
					}else {
						try { //예외 처리 : try 안의 구문을 실행하다가 에러 발생 시 catch로 빠진다.
							if (Integer.parseInt(num)==answer) { // Integer.parseInt(num) : 문자 형태인 정수 num을 정수형으로 바꿈. == 사용 가능.
								win++;
								count++;
								System.out.println("정답입니다!");
								System.out.println("새로운 주사위 숫자가 생성되었습니다.");
								break;
							}else if (Integer.parseInt(num)!=answer) {
								count++;
								if(Integer.parseInt(num) < answer) {
									System.out.println("틀렸습니다. 더 큰 수를 입력하세요.");
								}else {
									System.out.println("틀렸습니다. 더 작은 수를 입력하세요.");
									
								}
							}
						}catch(NumberFormatException e) {
							System.out.println("잘못된 입력입니다.");
							continue;
							
						}
						
						
						
					}
					
					
				
				
				}
					
				
				
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	

}
