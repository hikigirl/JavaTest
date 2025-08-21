package com.test.java.obj.inheritance;

public class Ex38_Overriding {

	public static void main(String[] args) {
		// 오버라이딩
		
		//메서드 오버로딩, method overloading
		//이름이 동일한 메서드를 N개 생성
		
		//메서드 오버라이딩, method overriding
		//클래스 상속할 때 발생
		//메서드 재정의 -> 상속받은 메서드를 수정하는 기술
		
		OverridingParent hong = new OverridingParent();
		hong.name = "홍길동";
		hong.hello();
		
		OverridingChild jhong = new OverridingChild();
		jhong.name = "홍철수";
		//jhong.hello();
		jhong.hello();
		jhong.test();
		
		//a, b
		//
		MChild c2 = new MChild();
		c2.a = 10;
		c2.c = 30;
		c2.check();
	}

}

class OverridingParent {
	public String name;
	public void hello() {
		System.out.printf("안녕하세요. 좋은아침입니다. 저는 %s입니다.\n", this.name);
	}
}


class OverridingChild extends OverridingParent {
//	public void hi() { //상속받은 부모의 메서드를 그대로 사용하기 싫어서 따로 직접 선언
//		System.out.printf("안녕. 나는 %s.\n", this.name);
//	}
	
	public void hello() { //메서드 오버라이딩, 재정의
		System.out.printf("안녕. 나는 %s.\n", this.name);
	}
	
	public void test() {
		this.hello(); //자식이 만든 hello
		super.hello();//잘 사용 안함... 부모 객체의 hello 호출
	}
	
}


//상속시 멤버의 접근 지정자는 그대로 유지된다.

class MParent {
	public int a;
	private int b;
}

class MChild extends MParent {
	public int c;
	private int d;
	
	public void check() {
		System.out.println("a: " + this.a);
		//System.out.println("b: " + this.b); //b(부모의 private)은 자식도 절대 접근할수없어서 getter를 통해 간접접근해야함~
		System.out.println("c: " + this.c);
		System.out.println("d: " + this.d);
		
	}
}




















