package com.test.java.obj.inheritance;

public class Ex52_Generic {
	public static void main(String[] args) {
		Item i1 = new Item();
		//Item is a raw type. References to generic type Item<T> should be parameterized
		i1.a = 10;
		i1.b = "20";
		System.out.println(i1.a);
		
		Item<String> s1 = new Item<String>();
		s1.a = 10;
		s1.c = "문자열";
		
		Item<Integer> s2 = new Item<Integer>();
		s2.a = 20;
		s2.c = 500;
		
		Pen<Boolean> p1 = new Pen<Boolean>();
		p1.a = true;
		p1.b = false;
		p1.c = true;
		
		Pen<Integer> p2 = new Pen<>(); //뒷쪽의 자료형을 생략하는것도 가능
		p2.a = 10;
		p2.b = 20;
		p2.c = 30;
		
		Desk<String> d1 = new Desk<String>();
		d1.setData("문자열");
		System.out.println(d1.getData());
		
		//Laptop<String, String> l1 = new Laptop<>();
		
		
	}
}

//제네릭 클래스

class Item<T> {
//	<T>는 무엇인가..
//	<> : 인자 리스트
//	T: 매개변수명, 대문자 한글자로 적는게 관례
//		타입변수, 자료형을 저장함. 값을 저장하는 변수가 아님
//		참조형 자료형만 입력 가능
//		T = String, Employee, Double, Integer(클래스), ...
//	 자료형은 어딨나요...
	
	//일반클래스의 멤버 구성과 동일
	public int a;
	public String b;
	public T c; //T는 내가 맘대로 정하는거임 변수니까
	
	public void ccc() {
		
	}
	
}


class Pen<T> {
	public T a;
	public T b;
	public T c;
}


class Desk<T> {
	private T data;
	
	public void setData(T data) {
		this.data = data;
		//지역 변수에 generic 사용 금지!!
		//T a;
		
	}
	
	public T getData() {
		return data;
	}
	
}

class Laptop<T,U> {
	private T a;
	private U b;
	public Laptop(T a, U b) {
		this.a = a;
		this.b = b;
	}
	public T getA() {
		return a;
	}
	public U getB() {
		return b;
	}
	
}


















