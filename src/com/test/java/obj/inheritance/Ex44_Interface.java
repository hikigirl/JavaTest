package com.test.java.obj.inheritance;

public class Ex44_Interface {

	public static void main(String[] args) {
		//44. 인터페이스
		
		//최종 사용자
		S25 p1 = new S25();
		p1.powerOn();
		p1.powerOff();
		p1.call();
		
		IPhone16 p2 = new IPhone16();
		p2.powerOn();
		p2.powerOff();
		p2.call();
	}

}

//인터페이스 선언
interface Phone {
	//인터페이스 멤버 선언
	// - 추상 멤버만 선언할 수 있다.
	// - 구현된 멤버는 가질 수 없다.
	
//	private int a;
//	public int b;
//	
//	public void ccc() {
//		System.out.println("ccc");
//	}
	
//	public abstract void ddd(); //추상 멤버(=추상메서드)
//	abstract void eee();
//	void fff();
	
	//전화기가 갖춰야 할 최소한의 규칙(행동 or 사용법)
	void powerOn();
	void powerOff();
	void call();
	
}

class S25 implements Phone {

	@Override
	public void powerOn() {
		System.out.println("삼성 기술 > 전원 On");
	}

	@Override
	public void powerOff() {
		System.out.println("삼성 기술 > 전원 Off");	
	}

	@Override
	public void call() {
		System.out.println("삼성 기술 > 통화");
	}
	
}

class IPhone16 implements Phone {

	@Override
	public void powerOn() {
		System.out.println("애플 기술 > 전원 On");
	}

	@Override
	public void powerOff() {
		System.out.println("애플 기술 > 전원 Off");
	}

	@Override
	public void call() {
		System.out.println("애플 기술 > 통화");
	}
	
}











