package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex40_Final {

	public static void main(String[] args) {
		//1. final을 변수에 적용
		final int A = 10; //선언과 동시에 초기화할것을 권장
		//A=20; 
		//The final local variable A cannot be assigned.
		final int B; //끊어가는거 비추
		B=20; //초기화
		//B=30; //불가능
		
		//캘린더 상수
		
		//public static final int YEAR = 1;
		//System.out.println(Calendar.YEAR);
		
		
		
		//학생정보 -> 성별 구분
		//이걸 매번 쓸수는 없으니 클래스 안으로 집어넣자
		//final int MALE = 1; 
		//final int FEMALE = 2;
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		s1.gender = Gender.MALE;
		//s1.gender = Student.MALE;
		//s1.gender = MALE;
		
		Student s2 = new Student();
		s2.name = "호호호";
		s2.age = 22;
		s2.gender = Gender.FEMALE;
		//s2.gender = Student.FEMALE;
		//s2.gender = FEMALE;		
		
		
		//2. final을 메서드에 적용
//		FinalChild c1 = new FinalChild();
//		System.out.println(c1.getNumber());
		
	}

}
class Gender {
	public final static int MALE = 1; 
	public final static int FEMALE = 2;
}

class Student {
	public String name;
	public int age;
	
	public int gender; //성별 -> 남,여 (열거형 데이터) -> 숫자 사용하는게 좋음..
	//남자를 1, 여자를 2로 하자..
	
//	public final static int MALE = 1; 
//	public final static int FEMALE = 2; //성별은 공용 데이터니까 static을 붙인다
}

//최종 클래스
final class FinalParent{ 
	//멤버 구현
	public final String getNumber() {
		return "하나";
	}
}

//class FinalChild extends FinalParent{ //The type FinalChild cannot subclass the final class FinalParent
//	public String getNumber() { //Cannot override the final method from FinalParent
//		return "안녕하세요";
//	}
//}

















