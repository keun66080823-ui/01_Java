package chusuckPractice.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import chusuckPractice.model.dto.Toy;

public class ToyFactory {
	private Scanner sc = new Scanner(System.in);
	// 중복된 Toy 객체가 없도록 set 사용
	private Set<Toy> toys = new HashSet<Toy>();
	// 재료가 저장되었는 map
	private Map<Integer, String> materialMap = new HashMap<Integer, String>();
	
	
	public ToyFactory(){
		// 기본 등록된 재료
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
		
		// 현제 제작된 장난감
		toys.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", addMaterials(1,4)));
		toys.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", addMaterials(1,2)));
		toys.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", addMaterials(1,2)));
		toys.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", addMaterials(1,2)));
		toys.add(new Toy("파피", 12, 57000, "빨간색", "19931225", addMaterials(1,2,4)));
		
	}


	// 가변인자 : 매개변수의 수가 정확히 몇개인지 특정할 수 없을 때 사용
	// 자료형...변수명   예) int...i
	// 가변인자를 통새 들어온 매개변수의 데이터 타입은 배열!
	
	
	/** 매개변수로 전달받은 값들을 재료를 저장한 Map에
	 * 있는지 확인하고 Set형태로 변환하는 메서드
	 * @param materials
	 * @return
	 */
	private Set<String> addMaterials(int...materials) {
		
		// 1. 매개변수로 전달받은 materials 파악하기 == 배열로 정수형 데이터가 여러개
		// ex) [1,2,4]
		
		// 2. 재료를 저장하여 반환할 Set객체를 생성
		Set<String> addedMaterials = new HashSet<String>();
		
		// 3. addedMaterials 에 재료명을 추가해야함
		// -> 단, 재료는 Map에 존재하는 것만 추가 가능.
		for(int materialKey : materials) {
			
			// Map에서 재료 고유 번호(Key)에 대응하는 재료명(Value)를 가져와서
			// addMaterials 추가
			// map에 없는 key를 입력하여 value를 얻어왔을 때 == null
			String materialValue = materialMap.get(materialKey);
			
			if(materialValue != null) {
				// 재료 목록에 해당 키(재료)가 있을 때
				addedMaterials.add(materialValue);
			}
			
		}
		
		
		return addedMaterials; // [면직물, 플라스틱].. 등의 값으로 저장된 Set값으로 리턴된다. 
	}
	
	public void display() {
		do {
			System.out.println();
			System.out.println("<< 플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.print("선택 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : selectAll(); break;
			case 2 : makeToy(); break;
			case 3 : removeToy(); break;
			case 4 : selectByDate(); break;
			case 5 : selectByAge(); break;
			case 6 : addMaterial(); break;
			case 7 : removeMaterial(); break;
			
			default : System.out.println("다시 입력해주세요.");
			}
			
		}while(true);
		
		
		
		
	}

	/**
	 * 1. 전체 장난감 조회하기
	 */
	private void selectAll() {
		System.out.println("<전체 장난감 목록>");
		
		List <Toy> list = new ArrayList<>(toys);
		
		for(int i = 0; i<toys.size(); i++) {
			System.out.println((i+1)+". "+list.get(i));
		}
		
	}
	
	/**
	 * 2. 새로운 장난감 만들기
	 */
	private void makeToy() {
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("색상 : ");
		String color = sc.next();
		sc.nextLine();
		System.out.print("제조일 (YYYYMMDD 형식으로 입력): ");
		String date = sc.next();
		
		Set<String> material = new HashSet<String>();
		
		while(true){
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			String input = sc.next();			
			if(input.equals("q")) {
				break;
			}
			material.add(input);
			sc.nextLine();
		}
		
		toys.add(new Toy(name, age, price, color, date, material));
		
	}
	
	/**
	 * 3. 장난감 삭제
	 */
	private void removeToy() {
		System.out.print("\n삭제할 장난감의 이름을 입력하세요 : ");
		String name = sc.next();
		
		Toy target = null;
		
		for(Toy t : toys) {
			if(t.getName().equals(name)) {
				target = t;
				break;
			}
			else {
				System.out.println("입력하신 장난감이 존재하지 않습니다.");
			}
		}
		
		toys.remove(target);
		System.out.println("장난감이 삭제되었습니다.");
		
	}
	
	/**
	 * 4. 장난감 제조일 순으로 조회하기
	 */
	private void selectByDate() {
		
		List<Toy> list = new ArrayList<>(toys);
		
		Collections.sort(list, new Comparator<Toy>() {

			@Override
			public int compare(Toy o1, Toy o2) {
				// TODO Auto-generated method stub
				return o1.getDate().compareTo(o2.getDate());
			}
			
		});
		System.out.println("<제조일 순으로 장난감을 정렬>");
		for(Toy toys : list) {
			System.out.println(toys);
		}
		
	}
	
	/**
	 * 5. 연령별 순으로 조회(미완성)
	 */
	private void selectByAge() {
		System.out.println("<연령별로 사용 가능한 장난감>");
		
		List<Toy> list = new ArrayList<>(toys);
		Collections.sort(list);
		
		int before = 0;
		int num = 1;
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getAge() != before) {
				
				System.out.println("[연령 : "+list.get(i).getAge()+"세]");
				before = list.get(i).getAge();
			}
			System.out.println(num+". "+list.get(i));
			num++;
		}
		
		
		
		
		
		
		
	}
	
	/**
	 * 6. 재료 추가
	 */
	private void addMaterial() {
		System.out.println("<재료 추가>");
		
		System.out.println("---현재 등록된 재료---");
		
		for(int i = 0; i<materialMap.size(); i++) {
			System.out.println(i+1 +": "+materialMap.get(i+1));
			
		}
		System.out.print("재료 고유번호(key) 입력 : ");
		int key = sc.nextInt();
		sc.nextLine();
		System.out.print("재료명 입력 : ");
		String newMaterial = sc.next();
		
		Set<Integer> a = materialMap.keySet();
		
		for(Integer keyMatch : a) {
			if(keyMatch != key) {
				
				materialMap.put(key, newMaterial);	
				System.out.println("새로운 재료가 성공적으로 등록되었습니다.");
				break;
			}else {
				System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
				System.out.print("덮어쓰시겠습니까?(Y/N) : ");
				
				char choice = sc.next().charAt(0);
				
				if(choice=='y'|| choice == 'Y') {
					materialMap.put(key, newMaterial);
					System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
				}else if (choice=='n'|| choice == 'N') {
					System.out.println("재료 고유번호를 다시 입력해주세요.");
				}
			}			
		}
		
		
		
	}
	
	/**
	 * 7. 재료 삭제
	 */
	private void removeMaterial() {
		System.out.println("<재료 삭제>");
		
		System.out.println("---현재 등록된 재료---");
		
		for(int i = 0; i<materialMap.size(); i++) {
			System.out.println(i+1 +": "+materialMap.get(i+1));
			
		}
		System.out.println("---------------------------");
		
		System.out.print("삭제할 재료명 입력 : ");
		String remove = sc.next();
		
		Set<Integer> a = materialMap.keySet();
		
		boolean flag = true;
		
		for(int keyMatch : a) {
			
			//String name = materialMap.get(keyMatch);
			
			if(materialMap.get(keyMatch).equals(remove)) {	
				materialMap.remove(keyMatch);
				System.out.print("재료 '"+remove+"'가 성공적으로 제거되었습니다.");
				flag = false;
			}
	
		}
		
		if(flag) {
			
		}
		
		System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		
	}


	
	
	
	
	
	

	
	
}
