package com.test.java;

import com.test.java.aaa.Red;
import com.test.java.aaa.Yellow;
//import com.test.java.bbb.Yellow;

public class Ex41_Package {

	public static void main(String[] args) {
		//41. 패키지
		
		//다른 패키지에 있는 Red 객체 생성
		Red r1 = new Red();
		r1.a = 10;
//		r1.b = 10; //private
//		r1.c = 20; //default(package)
//		r1.d = 30; //protected
		//com.test.java.aaa.Red r1 = new com.test.java.aaa.Red();
		
		//com.test.java.aaa.Yellow
		//com.test.java.bbb.Yellow
		
		//서로 다른 패키지에 있는 같은 이름의 클래스를 불러오고 싶다면..
		//하나는 import 가능하지만 나머지 하나는 직접 경로 입력하는 방식으로 ㄱㄱ
		Yellow y1 = new Yellow(); //aaa 패키지
		
		com.test.java.bbb.Yellow y2 = new com.test.java.bbb.Yellow(); //bbb 패키지

	}

}
