package com.test.java;

public class Ex04_Variable {
	
	public static void main(String[] args) {
//		자료형(8가지)+변수 생성하기
		
//		정수
		byte b1;
		b1 = 100; //100 -> 정수형 상수(=데이터), 정수형 리터럴
		
//		Type mismatch: cannot convert from int to byte
//		b1 = 128;
//		b1 = -129;
		
		//Byte 클래스 -> 유틸리티 클래스, Wrapper Class
		//모든 자료형에 존재함.
//		byte: Byte
//		short : Short
//		int : Integer
//		long: Long
//		float: Float
//		double: Double
//		boolean: Boolean
//		char: Character
		
		b1 = Byte.MAX_VALUE;
		System.out.println(b1);
		
		b1 = Byte.MIN_VALUE;
		System.out.println(b1);
		
		short s1 = 200;
		s1 = Short.MAX_VALUE;
		System.out.println(s1);
		
		s1 = Short.MIN_VALUE;
		System.out.println(s1);
		
		int i1 = 100;
		System.out.println(i1);
		
		long l1 = 100;
		System.out.println(l1);
		
		l1 = 1000000000;
		System.out.println(l1);
		
		l1 = 3000000000L;
		//The literal 3000000000 of type int is out of range
		//왜 long인데 int 타입으로 인식되는가?
		System.out.println(l1);
		
//		실수형
		System.out.println(3.14); //3.14의 자료형? -> double
		
		float f1;

//		=(대입연산자)
//		LValue(변수) = RValue(상수, 변수)
//		*** LVal과 RVal의 자료형은 반드시 같아야 한다.
		
//		Type mismatch: cannot convert from double to float
		f1 = 3.14F;
		
		
		
//		float과 double의 정밀도 차이 알아보기
		double d1;
		d1 = 3.14;
		
		f1 = 123.1234567890123456789012345678901234567890F;
		System.out.println(f1); //123.12346
		
		d1 = 123.1234567890123456789012345678901234567890;
		System.out.println(d1); //123.12345678901235 <- 손실이 float에 비해 더 적다.
		
		f1 = 123456789012345678901234567890123456789F;
		d1 = 123456789012345678901234567890123456789D;
		System.out.println(f1); //1.2345679E38
		System.out.println(d1); //1.2345678901234568E38
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		character();

		
//		논리형(boolean, bool)
		boolean flag;
		flag = true; //논리형 리터럴(상수)
		flag = false;
		System.out.println(flag);
		
//		추가) String 클래스, 문자열을 표현하는 자료형. (참조형)		
		String name;
		name = "홍길동"; //문자열 리터럴은 ""로 감싼다.
		System.out.println(name);
		
		name = "홍";
		name = ""; //빈 문자열, empty string
		
//		주민등록번호 입력>출력
//		숫자 계산을 위한 숫자가 아니라면, 자료형을 문자열로 해야함
//		ex) 990610
		int jumin = 990610;
		System.out.println("주민등록번호: "+jumin);
		
		jumin = 030711;
		System.out.println("주민등록번호: "+jumin); //12745가 출력...
//		왜 12745가 출력되는가?
		
//		자바의 기수법 - 10진수, 8진수, 16진수, 2진수 모두 가능
		System.out.println(10); //10진수
		System.out.println(010); //앞에 0을 붙이면 8진수로 인식하게 됨, 자바 출력은 10진수라서 8이 출력됨.
		System.out.println(0x10); //16진수
		System.out.println(0b10); //2진수
		
		String jumin2 = "030711";
		System.out.println(jumin2);
		
//		실수 리터럴
		double d2 = 1200;
		double d3 = 1.2e+3;
		System.out.println(d2);
		System.out.println(d3);
		
		d2 = 0.012;
		d3 = 1.2e-2;
		System.out.println(d2);
		System.out.println(d3);
		
		
		character();
	}
	
	

	public static void character() {
		//		문자형
				char c1;
				c1 = 'A'; //문자 리터럴은 ''로 감싼다
				System.out.println(c1); //A
				
				c1 = '가';
				System.out.println(c1);
				
				c1 = '@';
				System.out.println(c1);
				
				c1 = '1';
				System.out.println(c1); //문자로서의 1
				System.out.println(1);  //숫자1
				
		//		c1 = '홍길동'; //Invalid character constant
	}
}
