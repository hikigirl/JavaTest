package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ex56_HashMap {

	public static void main(String[] args) {
		// 
		//m1();
		//m2();
		m3();
		
	}

	private static void m3() {
		//잘 사용하지는 않지만 map을 루프..
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("red", "장미꽃");
		map.put("yellow", "개나리");
		map.put("blue", "라일락");
		
		Set<String> set = map.keySet();
		System.out.println(set);
		
		//향상된 for문 사용가능
		for (String key : set) {
			System.out.println(key);
		}
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		for (String val : values) {
			System.out.println(val);
		}
		
		for (String item : set) {
			System.out.println(item + ":" + map.get(item));
		}
		
	}

	private static void m2() {
		HashMap<String, String> map = new HashMap<String, String>();
		
		//1. 요소 추가
		map.put("red", "장미꽃");
		map.put("yellow", "개나리");
		map.put("blue", "라일락");
		
		//2. 요소개수
		System.out.println(map.size());
		
		//3. 읽기
		System.out.println(map.get("red"));
		
		//4. 요소 수정
		map.put("blue", "창포꽃");
		System.out.println(map);
		
		//5. 요소 삭제
		map.remove("blue");
		System.out.println(map);
		map.remove("blue");
		System.out.println(map.get("blue"));
		
		//6. 검색
		System.out.println(map.containsKey("red"));
		System.out.println(map.containsValue("라일락"));
		
		//7. 초기화
		map.clear();
		System.out.println(map);
		
	}

	private static void m1() {
		//학생 1명의 국어, 영어, 수학점수 저장 -> 어떤 집합?
		//1. 배열
		//2. ArrayList
		//3. HashMap
		//4. Class
		
		//1. 배열 -> 몇번째? 어떤 과목? 알아보기 힘듬
		//집합
		int[] s1 = new int[3];
		s1[0] = 100;
		s1[1] = 90;
		s1[2] = 80;
		System.out.println(s1[0] + s1[1] + s1[2]); //장점: 루프 돌릴수 있음
		
		//2. ArrayList -> 배열 -> 몇번째? 어떤 과목? 알아보기 힘듬
		//집합
		ArrayList<Integer> s2 = new ArrayList<Integer>();
		s2.add(100);
		s2.add(90);
		s2.add(80);
		
		System.out.println(s2.get(0)+s2.get(1)+s2.get(2));
		//장점: 루프 돌릴수 있음
		
		
		//3. HashMap
		HashMap<String, Integer> s3 = new HashMap<String, Integer>();
		
		s3.put("kor", 100);
		s3.put("eng", 90);
		s3.put("math", 80);
		
		System.out.println(s3.get("kor")+s3.get("eng")+s3.get("math"));
		
		//4. 클래스
		//집합
		//방번호가 없고 방 이름만 존재, 가독성이 높지만 루프가 불가능
		Score s4 = new Score();
		s4.setKor(100);
		s4.setEng(90);
		s4.setMath(80);
		System.out.println(s4.getTotal());
		
		//지도 좌표
		HashMap<String, Integer> p1 = new HashMap<String, Integer>();
		
		p1.put("x", 100);
		p1.put("y", 200);
		System.out.println(p1); //{x=100, y=200}
		
		HashMap<String, Integer> p2 = new HashMap<String, Integer>();
		p2.put("lat", 300);
		p2.put("lng", 400);
		System.out.println(p2);
		
		HashMap<String, Integer> p3 = new HashMap<String, Integer>();
		p3.put("lat", 500);
		p3.put("lng", 600);
		System.out.println(p3);
		
	}

}

















