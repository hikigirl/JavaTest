package com.test.java.obj.inheritance;

public class Ex43_Abstract {

	public static void main(String[] args) {
		//43. Abstract
		
		G305 m1 = new G305();
		m1.click();
		m1.click();
		m1.click();
		
		//5년뒤,,,
		M410 m2 = new M410();
		//m2.click(); //없어..
		//m2.mouseDown();
		m2.click(); //추상화 사용하면 이제 쓸수잇다네..
		
		
	}

}

//추상 클래스
abstract class Mouse {
	public int price;
	
//	public void click() {
//		System.out.println("구현...?");
//	}
	
	// 추상 메서드 = 구현부가 없는 메서드
	public abstract void click();
}



//구체적인 클래스 2개
//로지텍마우스
class G305 extends Mouse {
	public String model;
	//public int price;
	
	public void click() {
		System.out.println("골드스위치를 사용해서 클릭합니다");
	}
}

//MS 마우스
class M410 extends Mouse { //The type M410 must implement(구현) the inherited abstract method Mouse.click()
	//public int price;
	public String buttonType;

	@Override
	public void click() {
		System.out.println("실버스위치를 사용해서 클릭합니다");
		
	}
	
//	public void mouseDown() {
//		System.out.println("실버스위치를 사용해서 클릭합니다");
//	}
	
	
}