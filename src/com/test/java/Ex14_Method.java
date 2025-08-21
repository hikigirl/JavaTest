package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14_Method {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//요구사항) "안녕하세요"를 5회 출력
		//수정사항) "반갑습니다"로 수정한다면?
		
		//Case A.
		// - 가장 단순한 방법... 아무 생각없이 복붙하기만
		// - 하드코딩 -> 재사용성 0%, 반복, 수정할 때마다 동일한 비용이 발생..
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println();
		
		//Case B. hello() 메서드 호출
		hello();
		hello();
		hello();
		hello();
		hello();
		
		//숫자출력
		printNumber();
		
		checkAge();
		
		//sum()메서드
		sum();

	} //메인메서드 끝

	
	private static void sum() {
		// 
		
	}


	//메서드 선언 위치
	// - 클래스 내부
	// - 메서드끼리의 순서는 무관
	
	
	//hello() 메서드 선언
	public static void hello() {
		
		System.out.println("hello");
		
	}
	
	public static void printNumber() {
		//숫자 출력
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
	}
	
	public static void checkAge() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("나이: ");
		int age = Integer.parseInt(reader.readLine());
		System.out.printf("당신은 %s입니다.\n", age>=19 ? "성인" : "미성년자");
	}

}
