package com.test.question;

public class Q17_PositionOverload {

	public static void main(String[] args) {
		//17. 인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오.
		position("홍길동");
		System.out.println("----------------");
		position("홍길동", "유재석");
		System.out.println("----------------");
		position("홍길동", "유재석", "박명수");
		System.out.println("----------------");
		position("홍길동", "유재석", "박명수", "정형돈");
		System.out.println("----------------");
		
	}

	private static void position(String name1, String name2, String name3, String name4) {
		System.out.printf("사원: %s\n대리: %s\n과장: %s\n부장: %s\n",name1, name2, name3, name4);
		
	}

	private static void position(String name1, String name2, String name3) {
		System.out.printf("사원: %s\n대리: %s\n과장: %s\n",name1, name2, name3);
		
	}

	private static void position(String name1, String name2) {
		System.out.printf("사원: %s\n대리: %s\n",name1, name2);
		
	}

	private static void position(String name1) {
		System.out.printf("사원: %s\n",name1);
		
	}

}
