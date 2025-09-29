package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {
	public static void main(String[] args) {
		
		// 스마트폰 객체 생성
		SmartPhone sp = new SmartPhone("Samsung","Galaxy S20", 2020, 1200000, "Android", 128);
		
		// 베이직폰 객체 생성
		BasicPhone bp = new BasicPhone("Nokia", "3310", 2000, 100000, true);
		
		sp.printInfo();
		
		System.out.println("============================================");
		
		bp.printInfo();
		bp.checkKeyboard();
		
		
	}

}
