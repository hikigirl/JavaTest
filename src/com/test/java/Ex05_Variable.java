package com.test.java;

public class Ex05_Variable {
	
	public static void main(String[] args) {
//		각 자료형(9가지) * 10번씩
//		1. 변수 생성
//		2. 값 대입
//		3. 출력
		
//		sample
//		1. 데이터 선정 - 몸무게
//		2. 1의 데이터를 저장할 자료형 선택(형태, 길이)
//		 - 형태: 정수 , 길이: 1kg~120kg -> byte
//		3. 변수 생성(의미있는 변수명) + 값 대입(리터럴) + 출력(문장)
		
		byte weight;
		weight = 70;
		System.out.println("제 몸무게는 " + weight + "kg입니다.");
		
		//byte - 출석번호
		byte studentNum = 12;
		System.out.println("출석번호: "+studentNum);
		
		byte num2 = 126;
		System.out.println(num2);
		
		//short - 키
		short height = 170;
		System.out.println("제 키는 " + height+"cm입니다.");
		
		//int - 한달 수입
		int salary = 1000000;
		System.out.println("월급: "+salary);
		
		//long
		long long1=2300000000000L; //정수형 리터럴이 int이므로 뒤에 L을 붙임
		System.out.println(long1);
		
		//float - 학점
		float gpa = 4.25F; //실수형 literal이 double이므로 뒤에 F를 붙임
		System.out.println("학점: "+gpa);
		
		//double - 평균 몸무게
		double avgWeight = 70.5793;
		System.out.println("평균 몸무게: "+avgWeight);
		
		//char - 등급
		char rank = 'A';
		System.out.println("성적: "+rank);
		
		//String - 전화번호
		String phoneNum = "010-1234-1234";
		System.out.println("전화번호는 "+phoneNum+"입니다.");
		
		//boolean
		boolean bool = true;
		System.out.println(bool);
		
	}

}
