package edu.kh.variable.practice;

public class CastingPractice2 {
	public static void main(String[] args) {
		//문제 1) 정수형 변수 age 에 자신의 나이를 저장하고, System.out.println() 을 
		//이용해 "나는 25살입니다." 형식으로 출력하시오.
		int my_age = 23;
		System.out.println("나는 "+ my_age +"살입니다.");
		
		
		//문제 2) int score = 90; 으로 시작하여 점수를 10점 더 올린 뒤, "최종 점수: 100" 이 출력되도록 프로그램을 작성하시오.
		int score = 90;
		int final_score = score+10; //새로운 변수를 만들기 싫다면 score+=10; 을 이용할 수 있다.
		System.out.println("최종 점수: "+final_score);
		//또 다른 풀이
		//int score = 90;
		//System.out.println("최종 점수: " + (score + 10));
		
		
		//문제 3) 자동 형변환
		//정수형 변수 a 를 선언하고 값 10 을 저장한 뒤, double 타입 변수 b 에 a 를 대입하여 출력하시오.
		int a = 10;
		double b = a;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
		//문제 4) 강제 형변환
		//실수형 변수 pi 에 3.14159 를 저장한 뒤, 이를 int 로 변환하여 출력하시오.
		//단, printf 를 이용하여 소수 둘째 자리까지 pi 와 변환된 정수를 함께 출력하시오.
		double pi = 3.14159;
		int numPi = (int)pi;
		System.out.printf("pi = %.2f , numPi = %d\n", pi, numPi);
		
		
		//문제 5) 문자와 정수 변환
		//문자형 변수 ch 에 'A' 를 저장하고, 이를 정수형 변수에 변환하여 출력하시오.
		//출력은 "문자: A, 코드값: 65" 형식으로 나타내시오.
		char ch = 'A';
		System.out.println("문자: "+ch+", 코드값: "+(int)ch);
		//또 다른 풀이
		//char ch = 'A';
		//int code = ch; // 자동 형변환 (char → int)
		//System.out.printf("문자: %c, 코드값: %d\n", ch, code);
		// 문자: A, 코드값: 65
		
		
		//문제 6) 상수(final)와 계산
		//상수 PRICE = 5000 (물건 가격)을 선언하고,
				//변수 count = 3 (구매 개수)일 때,
				//총 금액을 계산하여 "물건 가격: 5000원, 개수: 3개, 총액: 15000원" 형식으로 출력하시오.
		final int PRICE = 5000;
		int count = 3;
		System.out.println("물건 가격: "+PRICE+"원, 개수 : "+count+"개, 총액: "+(PRICE*count)+"원");
		//또 다른 풀이
		//final int PRICE = 5000;
		//int count = 3;
		//int total = PRICE * count;
		//System.out.printf("물건 가격: %d원, 개수: %d개, 총액: %d원\n", PRICE, count, total);
		// 물건 가격: 5000원, 개수: 3개, 총액: 15000원
		
		
		//문제 7) printf로 출력 서식 맞추기
		//국어 95 , 영어 87 , 수학 90 점수를 저장한 뒤,
		//총점과 평균을 구하여 아래와 같은 형식으로 출력하시오.
		//(평균은 소수 둘째 자리까지 표시)
		//국어: 95, 영어: 87, 수학: 90
		//총점: 272, 평균: 90.67
		
		int korean = 95; // 줄 낭비가 싫다면 int korean = 95, english = 87, math = 90; 로 표현 가능. 
		int english = 87;
		int math = 90;
		int sum = korean+english+math;
		double average = sum/3.0; //그냥 sum/3으로 지정 시 정수형으로 자동 형변환되어 소수점이 나오되 .00으로 나온다.
								  // sum/3.0으로 지정해야 소수점 아래가 제대로 나온다.
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n",korean,english,math);
		System.out.printf("총점: %d, 평균: %.2f\n", sum, average);
		
		
		//문제 1) 출연자 정보 변수 만들기
		//이름(name): 문자열 "영숙"
		//Hint : 문자열은 String 자료형 사용
		//나이(age): 정수 28
		//키(height): 실수 165.7
		//위 세 가지 정보를 각각 알맞은 타입의 변수에 저장하시오.
		
		String name = "영숙";
		int age = 28;
		double height = 165.7;
		
		
		//문제 2) 출력하기
		//printf 를 사용하여 아래와 같이 출력되도록 작성하시오.
		//출연자 이름: 영숙
		//나이: 28세
		//키: 165.7cm
		
		System.out.printf("출연자 이름: %s\n",name);
		System.out.printf("나이: %d세\n",age);
		System.out.printf("키: %.1fcm\n",height);
		//한 줄로 쓰고 싶다면 System.out.printf("출연자 이름: %s\n나이: %d세\n키: %.1fcm\n",name, age, height);
		
		
		//문제 3) 자동 형변환
		//나이(age)를 double 타입 변수에 저장한 뒤 출력하시오.
		//(출력 예: 자동 형변환된 나이(double): 28.0 )
		System.out.println("자동 형변환된 나이(double): "+(double)age);
		//또 다른 풀이
		//double doubleAge = age; // int → double 자동 형변환
		//System.out.println("자동 형변환된 나이(double): " + doubleAge);
		// 자동 형변환된 나이(double): 28.0
		
		
		//문제 4) 강제 형변환
		//키(height)를 int 타입으로 변환하여 출력하시오.
		//(출력 예: 강제 형변환된 키(int): 165 )
		System.out.println("자동 형변환된 키(int): "+(int)height);
		
		
		//문제 5) 매칭 점수 평균
		//점수(score1=87, score2=92)를 int 변수에 저장하시오.
		//두 점수의 평균을 double 타입으로 계산하여 출력하시오.
		//(출력 예: 영숙님의 매칭 점수 평균은 89.5점입니다! )
		
		int score1 = 87;
		int score2 = 92;
		int her_sum = score1+score2;
		System.out.printf("영숙님의 매칭 점수 평균은 %.1f점입니다!", (double)her_sum/2);
		//또 다른 풀이
		//int score1 = 87, score2 = 92;
		//double avgScore = (score1 + score2) / 2.0; // 평균 double로 계산
		//System.out.printf("%s님의 매칭 점수 평균은 %.1f점입니다!\n", name, avgScore);
		// 영숙님의 매칭 점수 평균은 89.5점입니다!
		
		
		
	}

}
