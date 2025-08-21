package com.test.java.obj.inheritance;

public class Ex45 {

	public static void main(String[] args) {
		//45. 총정리 - 클래스, 추상클래스, 인터페이스

	}

}

//Case1. 자식 클래스 -> 부모 클래스
class AA{
	public int a; //구현된 멤버
	public void bbb() {
		System.out.println("bbb");
	}
}

class BB extends AA {
	//부모 상속 + 자기 구현
	public int c;
	public void ddd() {
		System.out.println("ddd");
	}
}

//Case2. 자식클래스 -> 부모 추상클래스
abstract class CC {
	//구현된 멤버
	public int a;
	public void bbb() {
		System.out.println("bbb");
	}
	//추상 멤버
	public abstract void ccc();
}

class DD extends CC {
	//구현된 멤버
	public int c;
	public void ddd() {
		System.out.println("ddd");
	}
	
	//public int a;
	//public void bbb() {}
	
	
	//부모의 추상메서드를 구현
	@Override
	public void ccc() {
		System.out.println("ccc");
	}
}

//Case3. 자식클래스 -> 부모 인터페이스
interface EE {
	//추상 멤버
	void aaa();
	void bbb();
}

class FF implements EE {
	//자신만의 구현된 멤버
	public int c;
	public void ddd() {
		System.out.println("ddd");
	}
	
	
	//부모 인터페이스가 물려준 추상메서드를 구현
	@Override
	public void aaa() {
		System.out.println("aaa");
	}

	@Override
	public void bbb() {
		System.out.println("bbb");
	}
}


//Case4. 자식 추상클래스 -> 부모클래스...
//이론적으로 가능하기는 하지만 실제로 사용하는 경우는 드물다
class GG {
	public int a;
	public void bbb() {}
}

abstract class HH extends GG {
//	public int a;
//	public void bbb() {}
	
	public int c;
	public void ddd() {}
	public abstract void eee();
}


//Case5. 자식 인터페이스 -> 부모클래스
//불가능, 인터페이스에는 구현된 멤버를 담을 수 없음
class II {
	public int a;
	public void bbb() {}
}

//interface JJ extends II { //불가능
//	
//}


//Case6. 자식 추상클래스 -> 부모 인터페이스
interface KK {
	void aaa();
	void bbb();
}

abstract class LL implements KK {
//	void aaa();
//	void bbb();
	@Override
	public void aaa() {}

	@Override
	public void bbb() {}
}

abstract class MM implements KK {
//	void aaa();
//	void bbb();
}


//Case7. 자식 인터페이스 -> 부모 추상클래스, 불가능. 5번과 같은이유
abstract class NN {
	
}

//interface OO extends NN {
//	
//}


//Case8. 자식 추상클래스 -> 부모 추상클래스
abstract class PP {
	public int a;
	public abstract void bbb();
}

abstract class QQ extends PP {
	
}


//Case9. 자식 인터페이스 -> 부모 인터페이스
interface RR {
	
}

interface SS extends RR {
	
}







