package com.test.java.obj.inheritance;

public class Ex51_Generic {
	public static void main(String[] args) {
		/*
		 	요구사항) 클래스 설계
			1. 멤버변수 1개 -> int
			2. 멤버변수를 중심으로 여러 행동을 하는 메서드를 구현
			추가사항) String을 중심으로 하는 클래스를 설계
			추가사항) boolean을 중심으로 하는 클래스를 설계
			추가사항) double을 중심으로 하는 클래스를 설계
			추가사항) byte를 중심으로 하는 클래스를 설계
			추가사항) Student를 중심으로 하는 클래스를 설계
			 -> 클래스 재사용이 불가능해서 계속 새로만들어.. 근데 내용은 자료형말고는 다 똑같음
			 
			 case 1. Object 변수를 사용한다
		 */
		
		//전용클래스
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1);
		System.out.println(n1.getData() * 2);
		System.out.println();
		
		//범용클래스 -> 언박싱
		WrapperObject n2 = new WrapperObject(200); //박싱
		System.out.println(n2);
		//System.out.println(n2.getData() * 2); //getData의 반환값은 Object타입이라서 안되는거임
		System.out.println((int)n2.getData() * 2);
		System.out.println();
		
		//제네릭 클래스
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3);
		System.out.println(n3.getData() * 2); //계산도 바로 된다... 오
		System.out.println();
		
		
		//전용클래스
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1);
		System.out.println(s1.getData().length());
		System.out.println();
		
		//범용클래스 -> 다운캐스팅
		WrapperObject s2 = new WrapperObject("남궁길동");
		System.out.println(s2);
		System.out.println(((String)s2.getData()).length());
		System.out.println();
		
		//제네릭
		Wrapper<String> s3 = new Wrapper<String>("홍길동길동");
		System.out.println(s3);
		System.out.println(s3.getData().length());
		System.out.println();
		
		
		//전용클래스
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1);
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
		
		//범용클래스 -> 언박싱
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2);
		System.out.println((boolean)b2.getData() ? "참" : "거짓");
		System.out.println();
		
		//제네릭
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3);
		System.out.println(b3.getData() ? "참" : "거짓");
		System.out.println();
	}
}

class Wrapper<T> {
	
	private T data;
	

	public Wrapper(T data) { //생성자
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	//객체 상태 확인 -> toString() 재정의(오버라이딩)
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}



class WrapperObject {
	
	private Object data;
	

	public WrapperObject(Object data) { //생성자
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	//객체 상태 확인 -> toString() 재정의(오버라이딩)
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}



class WrapperBoolean {
	
	private boolean data;
	

	public WrapperBoolean(boolean data) { //생성자
		this.data = data;
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}
	
	//객체 상태 확인 -> toString() 재정의(오버라이딩)
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}



class WrapperString {
	
	private String data;
	

	public WrapperString(String data) { //생성자
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	//객체 상태 확인 -> toString() 재정의(오버라이딩)
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}


class WrapperInt {
	//1. 클래스의 중심
	private int data;
	
	//2. data 중심 -> 조작하는 메서드
	public WrapperInt(int data) { //생성자
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	//객체 상태 확인 -> toString() 재정의(오버라이딩)
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}