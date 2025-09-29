package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();
	
	// 데이터를 setter를 이용해 저장 + 저장완료되었다는 결과 반환
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장 완료되었습니다.";
	}
	
	// 저장된 데이터를 반환
	public String confirmData() {
		return s.information();
	}
	
	
	
	
	
	
}
