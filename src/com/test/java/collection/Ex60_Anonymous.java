package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex60_Anonymous {

	public static void main(String[] args) {
		//m1();
		m2();
		
		

	}

	private static void m2() {
		//익명 클래스, 익명 객체 Anonymous object
		//인터페이스를 구현, 상속받아 클래스 선언하기 -> 객체를 생성 -> 사용
		
		//1. 본인 타입의 참조 변수를 만들기
		BBB b1 = new BBB();
		b1.test();
		
		//2. 부모 타입의 참조 변수를 만들기
		AAA b2 = new BBB(); //업캐스팅
		b2.test();
		//b2.bbb();
		
		//3. 익명 클래스, 익명 객체
		
		//AAA b3 = new AAA(); //인터페이스 객체를 생성할 수 없다(추상메서드때문에)
		
		//AAA b3 = class BBB implements AAA {};
		//익명 클래스 선언(인터페이스 상속) + 익명 클래스의 객체 생성
		AAA b3 = new AAA() { //익명 클래스
			
			@Override
			public void test() {
				System.out.println("익명객체의 추상메서드 구현");	
			}
		};
		
		b3.test();
		
		AAA b4 = new AAA() {
			//익명클래스의 자체 멤버는 구현해도 쓸 일이 거의 없어서 잘 구현안함
//			public int c;
//			public void ccc() {
//				System.out.println("자신만의 멤버");
//			}
			@Override
			public void test() {
				//this.c = 10;
				System.out.println("익명객체의 추상메서드 구현");	
			}
		};
		b4.test();
		//(익명)b4
		
		
	}

	private static void m1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("강아지");
		list.add("고양이");
		list.add("병아리");
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("red", "사과");
		map.put("yellow", "바나나");
		map.put("blue", "블루베리");
		
		HashSet<String> set = new HashSet<String>();
		set.add("키보드");
		set.add("마우스");
		set.add("모니터");
		
		//컬렉션(배열)의 변환
		//list->set, set->list, map->list
		
		//list->set
		//목적? 중복값을 제거
		list.add("강아지");
		list.add("고양이");
		System.out.println(list);
		//Collection <? extends String>
		//Collection <String>
		HashSet<String> set2 = new HashSet<String>(list);
		System.out.println(set2);
		
		//set->list
		//목적? 중복값을 허용, 순서가 필요 
		System.out.println(set);
		ArrayList<String> list2 = new ArrayList<String>(set);
		list2.add("마우스");
		System.out.println(list2);
		System.out.println(list2.get(0));
		
		//map(key) -> set (key는 중복값을 허용하지 않으므로)
		System.out.println(map);
		
		Set<String> keys =map.keySet();
		System.out.println(keys);
		
		//map(value) -> collection(value는 중복값이 가능해서)
		Collection<String> values = map.values();
		System.out.print(values);
		
		//list(index, value) → map(key, value) : 수동으로..
		System.out.println(list);
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		for (int i=0; i<list.size(); i++) {
			map3.put(i, list.get(i));
		}
		System.out.println(map3);
		System.out.println(map3.get(0));
		System.out.println(map3.get(2));
		
		//map계열의 특성상 key 자리에는 string이 사실상 고정
		HashMap<String, String> map4;
		
		String[] arr1 = {"빨강", "노랑", "파랑"};
		
		//일반 배열 -> list
		//길이 가변(X) -> 길이 고정(O)
		List<String> list3 = Arrays.asList(arr1); //Arrays 클래스 사용하면 배열 길이가 고정이 됨..
		System.out.println(list3);
		System.out.println(list3.get(0));
		
		//list3.add("주황색");
		//list3.remove(0);
		
		//수동으로 하면 arraylist의 특징을 살릴 수 있음(길이 가변)
		List<String> list4 = new ArrayList<String>();
		
		for (String item : arr1) {
			list4.add(item);
		}
		System.out.println(list4);
		list4.add("주황");
		System.out.println(list4);
		
		//Arraylist -> 일반 배열
		Object[] arr2 = list.toArray();
		String[] arr3 = (String[])arr2;
		System.out.println(Arrays.toString(arr2));
		
		
	}
	
}

interface AAA {
	void test();
}

class BBB implements AAA {
	public int b;
	public void bbb() {
		System.out.println("클래스 자체 멤버");
	}
	@Override
	public void test() {
		System.out.println("추상 메서드를 구현");
	}
}
