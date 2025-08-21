package com.test.java;

public class Ex17_LocalVariable {
	
//	int a;	//클래스 내부(메서드 밖)에 만든 변수 -> 멤버변수
	
	public static void main(String[] args) {
//		int b; //로컬 변수(메서드 내부)
		int a = 10;
		//int a = 20;
		System.out.println(a);
		int b = 20;
		
		m1();
	}

	private static void m1() {
		//System.out.println(b);
		
		int a = 20;
		System.out.println(a);
	
	}

}
