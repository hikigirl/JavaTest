package com.test.examples;

import java.util.Arrays;

public class Ex32_Class {
	
	public static void main(String[] args) {
		
		//Ex32_Class.java
		
		//m1();
		//m2();
		m3();
		
	}

	private static void m3() {
		
		Person p1 = new Person();
		
		p1.setName("홍길동");
		p1.setAge(20);
		p1.setAddress("서울시 강남구 역삼동");
		
//		String[] nick = new String[3];
//		nick[0] = "멸치";
//		nick[1] = "무말랭이";
//		p1.setNick(nick);
		
		
		//p1.getNick()[0] = "멸치";
		//p1.getNick()[1] = "무말랭이";
		
		//누적(add)
		p1.addNick("멸치");
		p1.addNick("무말랭이");
		p1.addNick("이쑤시개");
		p1.addNick("바보");
		
		
				
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
//		System.out.println(p1.getAddress());
//		System.out.println(Arrays.toString(p1.getNick()));
		
		System.out.println(p1.info()); //dump
				
		
	}



}



//사람 클래스
class Person {
	
	private String name;
	private int age;
	private String address;
	private int index = 0;
	
	//별명 > 배열
//	private String nick1;
//	private String nick2;
//	private String nick3;
	private String[] nick = new String[3];

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String[] getNick() {
		return nick;
	}

	public void setNick(String[] nick) {
		this.nick = nick;
	}
	
	public void addNick(String nick) {
		this.nick[index] = nick;
		index++;
	}
	
	//dump 메서드
	public String info() {
		
		String temp = "";
		
		temp += "이름: " + name + "\r\n";
		temp += "나이: " + age + "\r\n";
		temp += "주소: " + address + "\r\n";
		temp += "별명: " + Arrays.toString(nick) + "\r\n";
		
		return temp; 
	}
	
}






















