package com.test.java.obj.inheritance;

public class Ex36_Inheritance {

	public static void main(String[] args) {
		//상속, Inheritance
		Parent p1 = new Parent();
		p1.a = 10;
		p1.b = 20;
		p1.ccc();
		
		Child c1 = new Child();
		c1.a = 10;
		c1.b = 20;
		c1.ccc();
		c1.d = 30;
		c1.e = 40;
		c1.fff();
		
		BBB b1 = new BBB();
		b1.a = 10;
		b1.b = 20;
		b1.d = 30;
		b1.e = 40;
		b1.g = 50;
		b1.h = 60;

	}

}

class Parent {
	public int a;
	public int b;
	
	public void ccc() {
		System.out.println("ccc");
	}
}


//클래스의 상속
// class 자식클래스명 extends 부모클래스명
class Child extends Parent { //나중에 태어난 자식이 부모를 지정해야됨
	
	public int d;
	public int e;
	public void fff() {
		System.out.println("fff");
	}
	
}

class AAA extends Child {
	public int g;
}

class BBB extends AAA {
	public int h;
}

//형제 관계도 가능.. 부모클래스 하나에 자식클래스 여러개
//부모클래스 여러개를 자식 하나에 상속하는건 불가능~~(다중 상속)
class CCC {
	
}

class DDD extends CCC {
	
}

class EEE extends CCC{
	
}


