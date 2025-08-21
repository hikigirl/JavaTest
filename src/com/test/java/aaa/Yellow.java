package com.test.java.aaa;

public class Yellow {
	public void test() {
		//같은 패키지(com.test.java.aaa) 내의 red 객체 생성
		Red r1 = new Red();
		r1.a = 10;	//public
		//r1.b = 20;//private
		r1.c = 30;	//default(package)
		r1.d = 40;	//protected
	}
}
