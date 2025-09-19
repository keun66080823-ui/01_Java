package edu.kh.variable.practice;

public class CastingPractice1 {

	public static void main(String[] args) {
		//선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여
		//주석에 작성된 값과 같은 결과가 나타나도록 코드를 완성하세요.
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println( iNum1 / iNum2 ); // 2 (정답)
		System.out.println( (int)dNum ); // 2 (정답)
		
		System.out.println( iNum2 * dNum); // 10.0 (정답)
		System.out.println( (double)iNum1 ); // 10.0 (정답)
		
		System.out.println( (double)iNum1 / (double)iNum2 ); // 2.5 (정답, 선생님의 풀이는 하나만 해도 상관 없음을 보여주심.)
		System.out.println( dNum ); // 2.5 (정답)
		
		System.out.println( (int)fNum ); // 3 (정답)
		System.out.println( iNum1 / (int)fNum ); // 3 (정답)
		
		System.out.println( (float)iNum1 / fNum );// 3.3333333 (정답)
		// float : 소수점 아래 8번째 자리까지 연산 후 반올림.
		// 정밀도가 낮다.
		
		System.out.println( (double)iNum1 / (double)fNum ); // 3.3333333333333335 (정답)
		// double : 소수점 아래 16번째 자리까지 연산 후 반올림
		// 정밀도가 높아 마지막 값이 5
		
		System.out.println( "'"+ch+"'" ); // 'A'(정답)
		
		System.out.println( (int)ch ); // 65 (정답)
		System.out.println( (int)ch + iNum1 ); // 75 (정답, 단 int가 char보다 범위가 크므로 굳이 ch를 정수형으로 형변환할 필요는 없다.)
		System.out.println( "'"+(char)(ch + iNum1)+"'" ); // 'K'
		

	}

}
