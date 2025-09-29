package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
//		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		
//		[실행 화면]
//		1 2 3 4 5 6 7 8 9
//		짝수 번째 인덱스 합 : 25
		
		int [] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
			if(i%2==0||i==0) {
				sum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 인덱스 합 : "+sum);
	}
	
	public void practice2(){
//		 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//		 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		 홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//		 [실행 화면]
//		 9 8 7 6 5 4 3 2 1
//		 홀수 번째 인덱스 합 : 20
		 
		 int [] arr = new int [9];
		 int sum = 0;
		 
		 for (int i = 0; i<arr.length; i++) {
			 arr[i]= arr.length-i;
			 System.out.print(arr[i]+" ");
			 if(i%2==1) {
				 sum += arr[i];
			 }
			 
		 }
		 System.out.println("\n홀수 번째 인덱스 합 : "+sum);
	 }

	public void practice3(){
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//		[실행 화면]
//		양의 정수 : 5
//		1 2 3 4 5 
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int [] arr = new int[input];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void practice4(){
//		정수 5개를 입력 받아 배열을 초기화 하고
//		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
//		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
//		
//		[실행 화면 1]
//		입력 0 : 5
//		입력 1 : 8
//		입력 2 : 9
//		입력 3 : 10
//		입력 4 : 4
//		검색할 값 : 8
//		인덱스 : 1
//		
//		[실행 화면 2]
//		입력 0 : 5
//		입력 1 : 8
//		입력 2 : 9
//		입력 3 : 10
//		입력 4 : 4
//		검색할 값 : 1
//		일치하는 값이 존재하지 않습니다.
		
		int input, input2;
		boolean flag = true;
		int [] arr = new int [5];
		
		for (int i = 0; i<arr.length; i++) { // 배열 값 채우기 용
			System.out.print("입력 "+i+" : ");
			input = sc.nextInt();
			arr[i] = input;
		}
		System.out.print("검색할 값 : ");
		input2 = sc.nextInt();
		
		for (int i = 0; i<arr.length; i++) { 
			if(arr[i]==input2) {
				System.out.println("인덱스 : "+i);
				flag = false;
			}
			
		}
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");			
		}
		
		
	}
	
	public void practice5(){ //다시 풀기
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
//		[실행 화면]
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8
//		i 개수 : 2
		
		String input = "", sum = "";
		int count=0;
		
		System.out.print("문자열 : ");
		input = sc.nextLine();
		
		char arr [] = new char[input.length()];
		
		for (int i = 0; i<arr.length; i++) { 
			arr[i] = input.charAt(i);
			
		}
		
		System.out.print("문자 : ");
		char input2 = sc.next().charAt(0);
		
		for (int i = 0; i<input.length(); i++) {
			if(input2==arr[i]) {
				sum += i+" ";
				count++;
			}
		}
		System.out.println(input+"에 "+input2+"가 존재하는 위치(인덱스) : "+sum);
		System.out.println(input2+" 개수 : "+count);
		
		
		
	}
	
	public void practice6(){
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//		[실행 화면]
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2
//		총 합 : 2
		
		int sum = 0;
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int [] arr = new int[input];
		
		for(int i = 0; i<input; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		for(int i = 0; i<input; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n총 합 : "+sum);
		
		
	}
	
	 public void practice7(){
//		 주민등록번호 번호를 입력 받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.
//		 [실행 화면]
//		 주민등록번호(-포함) : 123456-1234567
//		 123456-1******
		 
		 System.out.print("주민등록번로(-포함) : ");
		 String input = sc.nextLine();
		 
		 char [] arr = new char[input.length()];
		 
		 for(int i = 0; i<input.length(); i++) {
			 arr[i] = input.charAt(i);
			 if(i>7) {
				 arr[i]='*';
			 }
			 System.out.print(arr[i]);
		 }
		 
		 
	 }
	 
	 public void practice8(){
//		 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		 다시 정수를 받도록 하세요.
//		 [실행 화면]
//		 정수 : 4
//		 다시 입력하세요.
//		 정수 : -6
//		 다시 입력하세요.
//		 정수 : 5
//		 1, 2, 3, 2, 1
		 
		 int count = 1;
		 int [] arr = null;
		 
		 while(true) {	 
			 System.out.print("정수 : ");
			 int input = sc.nextInt();
			 if(input<3||input%2==0) {
				 System.out.println("다시 입력하세요.");
			 }else {
				 arr = new int[input];
				 
				 int num = 0;
				 
				 for(int i = 0; i<arr.length; i++) {
					 if(i <= arr.length/2) {
						 arr[i] = ++num;
					 }else {
						 arr[i] = --num; 
					 }
					 
					 if(i==arr.length-1) {
						 System.out.print(arr[i]);
					 }else {						 
						 System.out.print(arr[i]+", ");
					 }
					 
				 } 
				 break;
			 }
			 
		 }
		 

		 
		 
		 
		 
		 
		 
	 }
	 
	 public void practice9() {
//		 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//		 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
//		 [실행 화면]
//		 발생한 난수 : 9 7 6 2 5 10 7 2 9 6
		 
		 int [] arr = new int[10];
		 
		 for (int i = 0; i<arr.length; i++) {
			 arr[i]=(int)(Math.random()*10+1);
			 System.out.print("발생한 난수 : "+arr[i]+" ");
		 }
		 
	 
	 }
	 
	 
	 public void practice10() {
//		 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//		 1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//		 [실행 화면]
//		 발생한 난수 : 5 3 2 7 4 8 6 10 9 10
//		 최대값 : 10
//		 최소값 : 2
		 
		 int [] arr = new int[10];
		 int max = 0, min=10;
		 System.out.print("발생한 변수 : ");
		 for (int i = 0; i<arr.length; i++) {
			 arr[i]=(int)(Math.random()*10+1);
			 
			 if(arr[i]>max) {
				 max=arr[i];
			 }
			 if(arr[i]<min) {
				 min=arr[i];
			 }
			 
			 System.out.print(arr[i]+" ");			 
		 }
		 System.out.println("\n최댓값 : "+max);
		 System.out.println("최솟값 : "+min);
		 
		 
	 }
	 
	 public void practice11() { //다시 풀기. 미완성
//		 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//		 [실행 화면]
//		 4 1 3 6 9 5 8 10 7 2
		 
		 int [] arr = new int[10];
		 
		 for(int i = 0;i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			for (int j = 0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
			System.out.print(arr[i]+ " ");
			 
		 }
		 
		 
		 
	 }
	 
	 public void practice12() { //다시 풀기. 미완성
		 
		 int [] lotto = new int [6];
		 
		 for(int i = 0;i<lotto.length; i++) {
			 lotto[i] = (int)(Math.random()*45+1);
			 for (int j = 0; j<lotto.length; j++) {
				 if (lotto[i]==lotto[j]) {
					 i--;
					 break;
				 }
			 }
			 
		 }
		 Arrays.sort(lotto);
		 
		 for (int i = 0; i < lotto.length; i++) {
			 System.out.print(lotto[i]+" ");
		 }
		 
		 
		 
		 
	 }
	 
	 
	 public void practice14(){
//		 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//		 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//		 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//		 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//		 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		 
//		[실행 화면]
//		배열의 크기를 입력하세요 : 3
//		1번째 문자열 : 자바의 정석
//		2번째 문자열 : 알고리즘
//		3번째 문자열 : C프로그래밍
//		더 값을 입력하시겠습니까?(Y/N) : y
//		더 입력하고 싶은 개수 : 2
//		4번째 문자열 : 인간관계
//		5번째 문자열 : 자기계발
//		더 값을 입력하시겠습니까?(Y/N) : y
//		더 입력하고 싶은 개수 : 1
//		6번째 문자열 : 영단어600
//		더 값을 입력하시겠습니까?(Y/N) : n
//		[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
		 
		 // 1. 첫 배열의 크기 지정
		 System.out.print("배열의 크기를 입력하세요 : ");
		 int size = sc.nextInt();
		 
		 sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거
		 
		 String [] arr =new String [size];
		 
		 // 2. 첫 배열에 저장할 문자열 입력받기
		 for (int i = 0; i<arr.length; i++) {
			 System.out.print((i+1)+"번째 문자열 : ");
			 arr[i] = sc.nextLine();
		 }
		 
		 // 3. 반복이 시작되는 구간부터 while 작성하여
		 //    내부에 종료조건 만들어 break 이용하여 멈춤
		 
		 while(true) {
			 
			 System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			 char ch = sc.next().charAt(0);
			 
			 // 4. 값을 더 입력할 경우
			 if(ch == 'y'||ch =='Y') {
				 
				 // 5. 더 입력받을 개수 입력받기
				 
				 System.out.print("더 입력하고 싶은 개수 : ");
				 int addSize = sc.nextInt();
				 sc.nextLine(); //개행문자 제거
				 
				 // 6. 새로 값을 입력받은 배열 생성
				 // --> 기존 배열 크기 + 추가 입력 개수
				 String [] newArr = new String[arr.length+addSize];
				 
				 // 7. 배열 복사 + 새로운 문자열 입력받기
				 for ( int i = 0; i< newArr.length; i++) {
					 if (i <arr.length) { //인덱스의 값이 기존 배열보다 작을 경우 (깊은 복사)
						 newArr[i] = arr[i];
					 }else { //인덱스의 값이 기존 배열보다 클 경우(새로운 값 입력받기)
						 System.out.print((i+1)+"번째 문자열 : ");
						 newArr[i] = sc.nextLine();
						 
					 }
				 }
				 
				 // 8. 기존 배열 공간을 참조하던 변수 arr에
				 // 새로운 배열 공간의 주소를 가진 newArr 대입(얕은 복사)
				 arr = newArr;
				 
			 }else if(ch == 'n' || ch =='N') { //값을 더 입력하지 않을 경우
				 break; // while 반복문 종료
			 }else { // 잘못 입력한 경우
				 System.out.println("잘못 입력하셨습니다. 다시 입력하세요!!!");
			 }
			 
			 
		 }//while문의 끝
		 
		 // 9. 배열값 모두 출력
		 System.out.println(Arrays.toString(arr));
		 
		 
		 
		 
	 }
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
