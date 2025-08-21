package com.test.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex63_TreeSet {

	public static void main(String[] args) {
		m1();

	}

	private static void m1() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(5);
		set.add(3);
		set.add(6);
		set.add(2);
		set.add(1);
		set.add(8);
		set.add(7);
		set.add(9);
		set.add(10);
		set.add(4);
		System.out.println(set); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		//왜 정렬되는가...
		//TreeSet의 내부 이진트리구조때문에 데이터를 집어넣을 때부터 정렬하게 됨
		
		//범위 관련 기능 제공(정렬때문에), 방번호가 생긴 것이 아님에 유의
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet(3)); //내가 입력한 숫자의 이전 값들을 불러옴(입력값 미포함)
		System.out.println(set.tailSet(7)); //내가 입력한 숫자의 다음 값들을 불러옴(입력값 포함)
		System.out.println(set.subSet(3, 7)); // 3<= n < 7을 불러옴
		
		Iterator<Integer> iter =set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for (int n : set) {
			System.out.println(n);
		}
	}

}
