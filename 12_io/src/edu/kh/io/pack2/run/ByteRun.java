package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		
		
		/*
		// 불변성(Immutable)의 String
		
		// 1. new 연산자를 통해 만든 String
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(System.identityHashCode(str1)); // 681842940
		System.out.println(System.identityHashCode(str2)); // 1392838282
		str1 = str1 + " world"; // String형에서 연산이 이루어져 달라짐.
		System.out.println(System.identityHashCode(str1)); // 1706377736 -> 기존 메모리 주소에서 달라짐.
		
		// 2. 리터럴 표기법을 통해 만든 String
		String str3 = "Hello";
		String str4 = "Hello";
		System.out.println(System.identityHashCode(str3)); // 523429237
		System.out.println(System.identityHashCode(str4)); // 523429237
		// String 상수 풀
		str3 = str3 + " world";
		System.out.println(System.identityHashCode(str3)); // 523429237 -> 1804094807로 메모리 주소 변경.
		
		
		// 가변성(Mutable)의 StringBuilder, StringBuffer
		StringBuilder sb = new StringBuilder();
		System.out.println(System.identityHashCode(sb)); // 951007336
		sb.append("Hello World!"); // String만 변수병 = 변수명+"추가할 내용"; 과 같은 형식으로 변경이 가능하다.
		sb.append("12345");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb)); // 951007336 메모리 주소가 변경되지 않는다.
		*/
		
		ByteService service = new ByteService();
//		service.bufferedFileByteInput();
		service.fileCopy();
		
		
		
	}

}
