package com.test.java.collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

public class Ex65 {

	public static void main(String[] args) {
		//m1();
		m2();
		
		
	}

	private static void m2() {
		//properties
		Properties prop = new Properties();
		prop.put("color", "red");
		prop.put("font", "JetBrainsMono");
		
		System.out.println(prop.get("color")); //반환값이 object임
		try { //legacy -> XML, json ...으로 대체됨
			prop.save(new FileOutputStream(".\\setting.ini"), "환경설정저장");
		} catch (FileNotFoundException e) {
			// 
			e.printStackTrace();
		}
	}

	private static void m1() {
		Vector<String> list = new Vector<String>();
		list.add("하나");
		System.out.println(list.get(0));
		System.out.println(list.size());
		
		//HashMap vs HashTable
		Hashtable<String, Integer> map = new Hashtable<String, Integer>();
		map.put("kor", 100);
		System.out.println(map.get("kor"));
		System.out.println(map.size());
		
		
	}

}
