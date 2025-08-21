package com.test.java.obj;

import java.util.Arrays;

public class Person {
	private String name;
	private int age;
	private String address;
	private int index = 0;
	
	//별명 -> 여러개 -> 배열로 만들어보자.
	private String[] nick = new String[3]; //배열 초기화까지

	
	
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
		if (index <this.nick.length) {
			this.nick[index] = nick;
			index++;
		} else {
			System.out.println("더 이상 별명을 추가하지 못합니다.");
		}
		
	}
	
	public String getNick(int index) {
		return this.nick[index];
	}
	
	//dump 메서드
	public String info() {
		String temp = "";
		
		temp += "이름: " + name + "\n";
		temp += "나이: " + age + "\n";
		temp += "주소: " + address + "\n";
		temp += "별명: " + Arrays.toString(nick) + "\n";
		
		return temp; 
	}
}

	
	
