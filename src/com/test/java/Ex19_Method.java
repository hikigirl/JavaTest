package com.test.java;

public class Ex19_Method {

	public static void main(String[] args) {
		//재귀 메서드, Recursive Method
		//m1();
		
		//요구사항) 팩토리얼 메서드를 구현하세요.
		int n = 4;
		int result = factorial(6);
		System.out.printf("%d! = %d\n", n, result); //결과에 n값 안바뀌는건 어케 해결함?..
		
	}
	
	public static int factorial(int n) {
		
		return (n==1)? 1 : n * factorial(n-1);
	}
	
	
	public static void m1() { //재귀 메서드
		System.out.println("m1");
		//m2();
		//m1(); //재귀 호출, 이대로만 두면... 무한루프(stack overflow 에러나서 멈춤)
	}
	
	public static void m2() {
		System.out.println("m2");
	}
	
}
