package com.test.java;

public class Ex18_Method {

	public static void main(String[] args) {
		//요구사항) 선을 그리는 메서드를 구현하시오.
		//요구사항) ***로 선을 그려주세요
			
		drawLine();
		drawLine("^");
		drawLine("*");
		
		System.out.println(100);
		System.out.println("홍길동");
		System.out.println(true);		
		//얘네도 println이라는 이름은 동일하지만 인자값이 달라서 다른 메서드임
		//오버로딩의 예시...
		
		test(10);			//정수형 리터럴은 int이므로 test(int a) 메서드가 호출됨.	
		test((byte)10); //굳이??
	}
	
	public static void test(int a) {
		System.out.println("int");
	}
	
	public static void test(byte b) {
		System.out.println("byte");
	}
	
	public static void drawLine() {
		System.out.println("===========");
	}
	
	public static void drawLine(String c) {
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.println(c);
	}
	
	public static void hello() {
		System.out.println("안녕하세요. 홍길동님.");
	}
	
	public static void hello(String name) {
		System.out.println("안녕하세요. 아무개님.");
	}
	
}
