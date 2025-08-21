package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex57_HashSet {

	public static void main(String[] args) {
		//m1();
		//m2();
		//m3();
		//m4();
		m5();

	}

	private static void m5() {
		//사람들 중 동명이인 없음
		HashSet<Member> group = new HashSet<Member>();
		
		group.add(new Member("홍길동", 20));
		group.add(new Member("아무개", 25));
		group.add(new Member("하하하", 21));
		group.add(new Member("홍길동", 20)); //set의 특징: 동일한 값을 넣을 수 없다
		//그러나 hashCode와 equals 메서드 오버라이딩 하면 가능..
		System.out.println(group);
		
	}

	private static void m4() {
		//주의!!
		Member m1 = new Member("홍길동", 20);
		Member m2 = new Member("아무개", 25);
		Member m3 = new Member("홍길동", 20);
		Member m4 = m1;
		
		//m1과 m3는 같은 사람?
		System.out.println(m1.equals(m3)); //false, 서로 다른 것을 참조하고있어서(주소값다름)
		System.out.println(m1.equals(m4)); //true
		
		System.out.println(m1.hashCode()); //498603628
		System.out.println(m2.hashCode()); //863217391
		System.out.println(m3.hashCode()); //498603628 ->객체가 달라도 해시코드가 같아졌음
//		System.out.println(m4.hashCode());
		
		//m1과 m3를 같은 사람으로 취급하기
		
		
	}

	private static void m3() {
		//마트 경품추첨
		// - 중복당첨 허용o
		// - 중복당첨 허용x
		
		String[] list = {"홍길동", "아무개", "강아지", "고양이", "병아리", "사자", "호랑이", "팬더", "까치", "참새"};
		Random rnd = new Random();
		
		//중복당첨 허용 -> 당첨자명단
		ArrayList<String> result1 = new ArrayList<String>();
		
		//추첨
		for (int i=0; i<5; i++) {
			result1.add(list[rnd.nextInt(list.length)]);
		}
		System.out.println(result1); //[병아리, 병아리, 까치, 아무개, 홍길동]
		
		//중복당첨 허용x -> 당첨자명단
		
		HashSet<String> result2 = new HashSet<String>();
		while (result2.size() < 5) {
			result2.add(list[rnd.nextInt(list.length)]);
		}
		System.out.println(result2);
		
		
		
	}

	private static void m2() {
		//로또 번호 -> 난수 + 유일한 번호들
		Random rnd = new Random();

		//Case1.
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
//		for (int i=0; i<6; i++) {
//			int n = rnd.nextInt(45) + 1; //1~45의 난수 생성
//			//중복 검사
//			if (!lotto.contains(n)) {
//				lotto.add(n);
//			} else {
//				i--; //i가 1바퀴 더 돌 수 있도록...
//			}
//		}

		while(lotto.size()<6) {
			int n = rnd.nextInt(45) + 1; //1~45의 난수 생성
			//중복 검사
			if (!lotto.contains(n)) {
				lotto.add(n);
			}
		}
		System.out.println(lotto);
		
		//Case2. hashset 이용 -> 중복 검사가 필요없어진다
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		while(lotto2.size() < 6) {
			int n = rnd.nextInt(45) + 1;
			lotto2.add(n);
		}
		System.out.println(lotto2);
		
	}

	private static void m1() {
		HashSet<String> set = new HashSet<String>();
		
		//요소 추가
		set.add("사과");
		System.out.println(set.add("바나나")); //true
		set.add("딸기");
		System.out.println(set.add("바나나")); //false
		
		//요소 개수
		System.out.println(set.size());
		System.out.println(set);
		
		//요소 읽기 -> 방 구분 불가능 -> 원하는 요소 추출 불가능(??)
		Iterator<String> iter = set.iterator();
		System.out.println(iter.hasNext()); //true, 다음에 next()를 호출하면 읽어올 요소가 있는지?
		System.out.println(iter.next()); //요소 1개를 가져와라
		
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
		//System.out.println(iter.hasNext());
		//System.out.println(iter.next()); //java.util.NoSuchElementException
		
		//다시 처음부터 읽고싶으면?
		System.out.println(set);
		iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		for (String item : set) {
			System.out.println(item);
		}
		System.out.println();
		for (String item : set) {
			System.out.println(item);
		}
		
		
	}

}

class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return String.format("%s(%d)", this.name, this.age);
	}
	
	@Override
	public int hashCode() { //hashCode() 메서드 오버라이딩
		
		// 이름 + 나이가 동일하면 같은 사람으로 취급
//		System.out.println("홍길동20".hashCode()); //498603628
//		System.out.println("홍길동20".hashCode()); //498603628
//		System.out.println("홍길동20".hashCode()); //498603628
//		System.out.println("홍길동21".hashCode()); //498603629
//		System.out.println("김길동21".hashCode()); //-380322592
		
		
		return (this.name + this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		//기존 equals: 본인 & obj를 비교하는 메서드
		return this.hashCode() == obj.hashCode(); 
	}
	
	
}











