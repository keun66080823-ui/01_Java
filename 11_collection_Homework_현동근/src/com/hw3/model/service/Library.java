package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;


public class Library{
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Book> book = new ArrayList<>();
	
	private List<Book> favorlist = new ArrayList<>();
	
	public Library() {
		book.add(new Book(1111,"세이노의 가르침 ", "세이노", 6480, "데이원"));
		book.add(new Book(2222,"문과남자의 과학공부", "유시민", 15750, "돌베개"));
		book.add(new Book(3333,"역행자", "자청", 17550, "웅진지식하우스"));
		book.add(new Book(4444,"꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		book.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
	}




	public void display() {
		
		int menu = 0;
		
		do {
			System.out.println("=== 도서 목록 프로그램===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐켜찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴를 입력하세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : addBook(); break;
			case 2 : selectAll(); break;
			case 3 : updateBook(); break;
			case 4 : /*removeBook();*/ break;
			case 5 : /*addBookMark();*/ break; //즐겨찾기
			case 6 : /*removeBookMark();*/ break; //즐찾 삭제
			case 7 : /*selectBookMark();*/ break; //즐찾 조회
			case 8 : /*gotcha(); */break; //추천 도서 뽑기
			case 0 : 
				System.out.println("프로그램을 종료합니다.");
				break;
			
			}
			
		}while (menu != 0);
		
	}


	/**
	 * 1. 도서 등록
	 */
	private void addBook() {
		System.out.println("==========도서 등록===========");
		System.out.print("도서 번호 : ");
		int num = sc.nextInt();
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		book.add(new Book(num,title,author,price,publisher));
		System.out.println("등록 완료");
	}
	
	/**
	 * 2. 도서 조회
	 */
	private void selectAll() {
		System.out.println("==========도서 조회===========");
		for(Book book : book) {
			System.out.println(book);			
		}
		
	}
	
	/**
	 * 3. 도서 수정
	 */
	private void updateBook() {
		
		for(Book book : book) {
			System.out.println(book);
		}
		System.out.println("=======도서 수정========");
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean flag = false;
		
		for (Book book : book) {
	        if (book.getNum() == num) {
	            flag = false;

	            int choice;
	            do {
	                System.out.println("1. 도서명");
	                System.out.println("2. 도서 저자");
	                System.out.println("3. 도서 가격");
	                System.out.println("4. 출판사");
	                System.out.println("0. 수정 종료");
	                System.out.print("어떤 정보를 수정하시겠습니까? ");
	                choice = sc.nextInt();
	                sc.nextLine();
	                
	                try {
	                	switch (choice) {
	                	case 1:
	                		System.out.println("==도서명 수정==");
	                		System.out.print("수정할 도서명을 입력하세요 : ");
	                		book.setTitle(sc.nextLine());
	                		System.out.println("도서명 수정 완료");
	                		break;
	                	case 2:
	                		System.out.println("==도서 저자 수정==");
	                		System.out.print("수정할 저자를 입력하세요 : ");
	                		book.setAuthor(sc.nextLine());
	                		System.out.println("저자 수정 완료");
	                		break;
	                	case 3:
	                		System.out.println("==도서 가격 수정==");
	                		System.out.print("수정할 가격을 입력하세요 : ");
	                		book.setPrice(sc.nextInt());
	                		sc.nextLine();
	                		System.out.println("가격 수정 완료");
	                		break;
	                	case 4:
	                		System.out.println("==출판사 수정==");
	                		System.out.print("수정할 출판사를 입력하세요 : ");
	                		book.setPublisher(sc.nextLine());
	                		System.out.println("출판사 수정 완료");
	                		break;
	                	case 0:
	                		System.out.println("종료합니다...");
	                		System.out.println("== 모든 수정 완료 ==");
	                		break;
	                	default:
	                		System.out.println("1~4 또는 0을 선택하세요.");
	                	}
						

	                flag = true;
	                } catch (InputMismatchException e) {
	                	System.out.println("1~4 또는 0을 선택하세요.");
	                }
	            } while (choice != 0);

	            break;
	        }
	    }

	    if (flag) {
	        System.out.println("일치하는 도서 번호가 없습니다.");
	    }
	}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
