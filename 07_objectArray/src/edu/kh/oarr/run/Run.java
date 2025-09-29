package edu.kh.oarr.run;

import edu.kh.oarr.model.service.MemberService;

public class Run {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		service.displayMenu();

	}

}
