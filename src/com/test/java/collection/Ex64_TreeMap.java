package com.test.java.collection;

import java.util.TreeMap;

public class Ex64_TreeMap {

	public static void main(String[] args) {
		//TreeMap
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("red", "apple");
		map.put("orange", "mandarin");
		map.put("yellow", "banana");
		map.put("green", "avocado");
		map.put("blue", "blueberry");
		
		System.out.println(map); //key값으로 정렬됨
		
		System.out.println(map.get("yellow"));
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println(map.headMap("m")); //{blue=blueberry, green=avocado}
		System.out.println(map.tailMap("m")); //{orange=mandarin, red=apple, yellow=banana}
		System.out.println(map.subMap("c", "m")); //{green=avocado}
		
	}

}
