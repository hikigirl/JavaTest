package com.test.question;

public class Q09_NameMethod {

	public static void main(String[] args) {
//		09. 이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하시오.
		String result = "";
		
		result = getName("홍길동");
		System.out.printf("고객: %s\n", result);
		
		result = getName("아무개");
		System.out.printf("고객: %s\n", result);
		
		result = getName("김밥");
		System.out.printf("고객: %s\n", result);
		

	}
	
	public static String getName(String name) {
		String result = name + "님";
		return result;
	}

}
