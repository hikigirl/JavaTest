package com.test.java.obj;

public class Ex30_Class {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.name = "홍길동";
		m1.age = 20;
		m1.hello();
		
		Member m2 = new Member();
		m2.name = "아무개";
		m2.age = 25;
		m2.hello();
		
		Member m3 = new Member();
		m3.name = "테스트";
		m3.age = 23;
		m3.hello();
		
		
	}//main()

} //public class Ex30_Class



class Member {
	//멤버 변수
	// -> 객체의 상태를 정의
	public String name;
	public int age;
	
	//멤버 메서드
	// -> 객체의 특성이 나타나는 행동을 하도록 구현해야한다..?
	public void hello() {
		//System.out.println("안녕하세요.");
		// -> 이렇게 적으면 객체에 상관없이 행동이 다 똑같아서 객체를 만든 의미가 없어..
		System.out.printf("안녕하세요. 저는 %s입니다. 나이는 %d살~\n", name, age);
	}
	
}
