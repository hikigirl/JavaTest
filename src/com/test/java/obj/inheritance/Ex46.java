package com.test.java.obj.inheritance;

public class Ex46 {

	public static void main(String[] args) {
		AAAA o1 = new AAAA(); //클래스의 존재 이유? 객체 만들기..
		o1.a = 10;
		o1.bbb();
		
//		BBBB o2 = new BBBB(); //Cannot instantiate the type BBBB, 객체화가 불가능하다
//		BBBB o2;
//		o2.a = 10;
//		o2.bbb();
//		o2.ccc(); //추상메서드
		
//		CCCC o3 = new CCCC();
//		CCCC o3;
		
		
		
		
		DDDD p1  = new DDDD();
		p1.color = "자신의색상";
		
		p1.a = 10;	//상속받은 구현멤버
		p1.bbb();	//상속받은 구현멤버
		p1.ccc();	//상속된 추상 구현멤버
		
		
		EEEE p2 = new EEEE();
		p2.price = 1000; //자신의 가격
		p2.a = 20;
		p2.bbb();
		p2.ccc();
		
		
		//변수생성은 왜 되는가??
		//-> 일반 클래스 객체를 추상클래스나 인터페이스에 담을 수 있기 때문
		BBBB o2;
		CCCC o3;
		
		//부모 = 자식 -> 추상화시킨다.(구체적인 특징을 고려하지 않게 됨)
		//업캐스팅(100% 안전)
		BBBB p3 = new DDDD();
		p3.a = 10;
		p3.bbb();
		p3.ccc();
		//p3.color -> 안떠
		
		BBBB p4 = new EEEE();
		p4.a = 20;
		p4.bbb();
		p4.ccc();
		//p4.price -> 안떠
		
	}

}

class AAAA {
	public int a;
	public void bbb() {
		System.out.println("bbb");
	}
}

abstract class BBBB {
	public int a;
	public void bbb() {
		System.out.println("bbb");
	}
	public abstract void ccc();
}

interface CCCC {
	void aaa();
}

//DDDD와 EEEE는 형제 클래스
class DDDD extends BBBB {
	public String color;
	@Override
	public void ccc() {
		System.out.println("ccc");		
	}
}

class EEEE extends BBBB {
	public int price;
	
	@Override
	public void ccc() {
		System.out.println("씨씨씨");		
	}
}