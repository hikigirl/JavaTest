package com.test.java;

public class Ex16_Method {
	public static void main(String[] args) {
		
		m1();
		int n = m2();			//이 라인이 실행되면, m2() 자리에 10(return값)이 남게 된다.
		System.out.println(n);	//따라서 n에 들어있는 값은 10.
		
		String result = getNumber(0);
		System.out.println(result);
		
	}
	
	public static void m1() {
		System.out.println("m1");
	}
	
	//int를 쓰면, 메서드가 종료될 때 int타입을 반환해야함
	public static int m2() {
		System.out.println("m2");	//m2라는 문자열을 출력하고, 
		return 10; 					//10이라는 값을 반환한다.
	}
	
	public static String getNumber(int num) {
		
		return num>0 ? "양수" : "양수아님";
	}
	
}
