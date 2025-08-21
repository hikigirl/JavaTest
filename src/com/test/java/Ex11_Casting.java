package com.test.java;

public class Ex11_Casting {

	public static void main(String[] args) {
		
		byte b1;
		short s1;
		
		b1 = 10; //원본
		
		s1 = b1; //복사(오른쪽에있는걸 왼쪽에 넣어라)
		s1 = (short)b1; //(short)를 생략하는 것도 가능.
		
		System.out.println(s1); //확인
		
		byte b2;
		short s2;
		
		s2 = 127; //원본
		b2 = (byte)s2; //복사
		
		System.out.println(b2); //
		
		
		//기업은행>계좌
		int m1; //역삼점
		long m2 = 3000000000L; //홍대점(30억)
		
		//계좌이체, 4=8
		m1 = (int)m2;
		System.out.printf("이체결과: %,d원\n", m1); //이체결과: -1,294,967,296원 (오버플로우, 논리에러!!)
		
		
		
		int n1 = 100;	//원본(4)
		float n2;		//복사본(4)
		
		//float = int
		n2 = n1;
		System.out.println(n2); //100.0
		
		
		int n3;
		float n4=200;
		
		//int = float
		n3 = (int)n4; //Type mismatch: cannot convert from float to int
		System.out.println(n3);
		
		
		long n5;
		float n6 = 10;
		
		n5 = (long)n6; //모든 정수형은 실수형보다 무조건 범위가 작음
		
		
		//문자와 정수
		char c1 = 'A'; //문자형은 내부적으로 숫자이며, 정수(문자코드)
		System.out.println(c1);
		System.out.println((int)c1); //65
		
		char c2;	//2byte
		short t2;	//2byte
		
		//short(2byte) = char(2byte)
		c2 = '가';
		t2 = (short)c2;		//Type mismatch: cannot convert from char to short
		System.out.println(t2);
		
		
		char c3;
		short t3 = 90;
		
		c3 = (char)t3;		//Type mismatch: cannot convert from char to short
		System.out.println(c3);
		
		
		
	}

}
