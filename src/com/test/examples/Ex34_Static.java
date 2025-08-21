package com.test.examples;

public class Ex34_Static {
	
	public static void main(String[] args) {
				//Ex34_Static.java
		/*
			
			static 정적 키워드
			- 지시자(제어자) 중 하나
			- 클래스 or 클래스 멤버에 붙이는 키워드
			- 메모리 절약 & 데이터 일관성(유지 보수)
			
		*/
		
		//요구사항] 학생 3명 > 관리 프로그램
		//- "역삼 중학교"
		
		//Math.random();
		
//		Math m1 = new Math();
//		m1.random();
//		
//		Math m2 = new Math();
//		m2.random();
//		
//		Math m3 = new Math();
//		m3.random();
		
		
		
		
		Student.setSchool("역삼중학교");
				
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15);
		//s1.setSchool("역삼중학교");
		
		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(14);
		//s2.setSchool("역삼중학교");
		
		Student s3 = new Student();
		s3.setName("테스트");
		s3.setAge(15);
		//s3.setSchool("역삼중학교");
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
			
	}//main

}

class Student {
	
	private String name;
	private int age;
	
	//private String school;
	private static String school;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		//The static field Student.school should be accessed in a static way
//		//this.school = school;
//		
//		Student.school = school;
//	}
	
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	public String info() {
		
		//void System.out.printf("문자열", 값")
		//String String.format("문자열", 값)
		
		return String.format("%s[%d세,%s]"
								, this.name
								, this.age
								, this.school);
	}
	
}


















