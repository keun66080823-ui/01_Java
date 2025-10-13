package chusuckPractice.model.dto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Toy implements Comparable<Toy>{
	// 장난감 추상화
	private String name; 		  // 이름
	private int age; 			  //사용 연령
	private int price;			  //가격
	private String color;		  //색상
	private String date; 		  //제조년월일(문자열로 저장)
	private Set<String> material; //사용재료 (중복되지 않는 값으로 저장)

	public Toy() {}

	public Toy(String name, int age, int price, String color, String date, Set<String> material) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.date = date;
		this.material = material;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Set<String> getMaterial() {
		return material;
	}

	public void setMaterial(Set<String> material) {
		this.material = material;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, color, date, material, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) 
				&& Objects.equals(date, other.date)
				&& Objects.equals(material, other.material) 
				&& Objects.equals(name, other.name) && price == other.price;
	}

	/** 아래 toString() 에서 재료명 표기 시 사용함
	 * materials 안에 있는 모든 재료를 문자열 형태로 만들어 반환하는 메서드
	 * @return
	 */
	public String getMaterialsAsString() {
		StringBuilder sb = new StringBuilder(); // 가변 문자열 객체(비동기)
		
		if(material.size() == 0) {
			return "없음";
		}
		
		//  ex )   [고무, 면직물]
		// 재료가 있다면 materials 순회하면서 재료 하나하나 , 로 구분하여 문자열 만들기
		for(String material : material) {
			sb.append(material).append(", "); // 문자열 뒤에 이어쓰기
		}
		
		// ex)   "고무, 면직물, "
		
		// 만들어진 문자열의 마지막 쉼표와 공백 제거하기
		sb.setLength(sb.length() - 2);
		
		return sb.toString();
		
	}
	
	@Override
	public String toString() {
		return String.format("이름 : %s / 가격 : %d / 색상 : %s / 사용가능연령 : %d / "
				+ "제조년월일 : %s / 재료 : %s", name, price, color, age, date, getMaterialsAsString());
	}

	@Override
	public int compareTo(Toy o) {
		
		return this.age - o.age;
	}


	
	
	
	
	
	
	
	
	
}
