package com.test.java.obj.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex49_Object {

	public static void main(String[] args) {
		//Object 클래스 - 모든 클래스의 부모 클래스이다. (root 클래스)
		//m1();
		m2();

	}

	private static void m2() {
		int a = 10;
		Integer b = new Integer(10); //Wrapper 클래스, 참조형
		//Wrapper 클래스는 클래스지만 예외적으로 연산자 사용도 가능함
		System.out.println(b*20);
		
		//업캐스팅 발생
		Object o1 = new AAAAAA();
		
		//업캐스팅 + 박싱 발생
		Object o2 = 100; //100 -> new Integer(100) 이 과정을 자바가 대신 해줌, boxing
		System.out.println(o2);
		
		//언박싱, 언박싱해야 산술연산이 가능해짐
		System.out.println((Integer)o2 * 100); //(Integer) 클래스로 다운캐스팅
		System.out.println((int)o2 * 100);		//그냥 (int)로 바꿔쓰는것도 자바가 허용해줌..
		
	}

	private static void m1() {
		//인스턴스 생성
		AAAAAA a1 = new AAAAAA();
		AAAAAA a2 = new BBBBBB(); //업캐스팅
		AAAAAA a3 = new CCCCCC(); //업캐스팅
		
		//Object 변수 -> 만능 주머니
		//Object[] 배열 -> 모든 종류를 담을 수 있다...
		Object o1 = new AAAAAA(); //업캐스팅
		Object o2 = new BBBBBB();
		Object o3 = new CCCCCC();
		
		Object o4 = new Scanner(System.in);
		Object o5 = new BufferedReader(new InputStreamReader(System.in));
		Object o6 = new Student();
		
		Object o7 = "홍길동"; //new String("홍길동")
		Object o8 = new int[3];
		
		
		//값형?? -> 참조형 변수에 값형을 넣고있음..
		Object o9 = 100;
		Object o10 = true;
		
		System.out.println(o9);
		System.out.println(o10);
		
		//결론) 모든 자료형을 Object 타입 변수에 넣을 수 있다.(값형, 참조형 상관없음)
		
		//주의사항) 단, 처음 담은 자료형을 나머지 방에도 적용시키기
		// (배열 하나의 세부 자료형을 통일시키라는 얘기)
		Object[] list = new Object[5];
		list[0] = "홍길동";
		list[1] = 20;
		list[2] = true;
		list[3] = new Student();
		list[4] = new Scanner(System.in);
	}

}

class AAAAAA { //extends Object
	
}


class BBBBBB extends AAAAAA {
	
}


class CCCCCC extends BBBBBB {
	
}