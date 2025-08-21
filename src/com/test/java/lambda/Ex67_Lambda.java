package com.test.java.lambda;

public class Ex67_Lambda {

	public static void main(String[] args) {
		//람다식
		
		//요구사항) MyInterface를 구현한 객체를 생성하시오.
		//1. MyInterface 설계 
		//2. MyClass 설계
		//3. 객체 생성
		
		//Case1. 인터페이스 선언+클래스선언+객체선언
		//MyClass m1 = new MyClass();
		MyInterface m1 = new MyClass();
		m1.test();
		
		//Case2. 인터페이스 선언+익명객체
		MyInterface m2 = new MyInterface() {
			@Override
			public void test() {
				System.out.println("익명객체로 구현한 메서드");
			}
		};
		m2.test();
		
		//Case3. 인터페이스 + 람다식
		MyInterface m3 = () -> {
			System.out.println("람다로 구현한 메서드");
		};
		m3.test();
		
		
		TestInterface t1 = new TestInterface() {	
//			@Override
//			public void bbb() {
//				
//			}
			
			@Override
			public void aaa() {
				
			}
		};
		
		TestInterface t2 = () -> { //aaa인지 bbb인지 구별할 수 없어~
			
		};
		
		
	}

}

@FunctionalInterface
interface MyInterface {
	void test();
}

class MyClass implements MyInterface{
	@Override
	public void test() {
		System.out.println("MyClass에서 구현한 메서드");
		
	}
}

@FunctionalInterface //람다식을 저장 가능한지 확인하기위한 annotation
interface TestInterface {
	void aaa();
//	void bbb();
}