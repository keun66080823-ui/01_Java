package chusuckPractice.model.service;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import chusuckPractice.model.dto.Toy;

public class ToyFactory {
	private Scanner sc = new Scanner(System.in);
	
	Map<Integer, String> matrial = new HashMap<Integer, String>();
	
	Set<Toy> toys = new HashSet<Toy>();
	
	public ToyFactory(){
		matrial.put(1, "면직물");
		matrial.put(2, "플라스틱");
		matrial.put(3, "유리");
		matrial.put(4, "고무");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
