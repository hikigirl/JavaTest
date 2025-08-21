package com.test.java.obj;

public class Ex33_Constructor {

	public static void main(String[] args) {
		//Ex33_Constructor.java
		
		//1. new -> 객체만 만듬
		//2. Box() -> 생성자, 객체를 초기화한다
		Box b1 = new Box();
		
		System.out.println("b1.size: " + b1.getSize());		//null
		System.out.println("b1.price: " + b1.getPrice());	//0
//		b1.setSize("대형"); //setter는 수정의 개념~
//		b1.setPrice(1000);
		
		Box b2 = new Box("중형");
		System.out.println("b2.size: " + b2.getSize());		
		System.out.println("b2.price: " + b2.getPrice());	
		
		Box b3 = new Box(600);
		Box b4 = new Box("소형", 300);
		
		System.out.println("b3.size: " + b3.getSize());		
		System.out.println("b3.price: " + b3.getPrice());	
		
		System.out.println("b4.size: " + b4.getSize());		//null
		System.out.println("b4.price: " + b4.getPrice());	//0
		
		
		//Cup(String, int)
		Cup c1 = new Cup("white", 500);
		
		
	} //main()

}

class Box {
	
	private String size;
	private int price;
	
	//기본 생성자, default constructor
	// - 개발자가 코딩을 안해도 컴파일러가 자동생성해준다
	// - 내가 직접 입력할 경우 컴파일러는 개입하지 않는다
//	public Box() {
//		this.size = null;
//		this.price = 0;
//	}
	
	//생성자도 오버로딩이 가능함
	public Box() {
//		this.size = "대형";
//		this.price = 1000;
		this("대형", 1000); //생성자끼리의 호출은 this
	}
	
	public Box(String size) {
//		this.size = size;
//		this.price = 1000;
		this(size, 1000);
	}
	
	public Box(int price) {
//		this.size = "대형";
//		this.price = price;
		this("대형", price);
	}
	
	public Box(String size, int price) {
		this.size = size;
		this.price = price;
	}
	
	
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}


class Cup {
	
	//1. 멤버 변수
	private String color;
	private int size;
	
	
	//2. 생성자(기본or오버로딩)
	public Cup(String color, int size) {
		this.color = color;
		this.size = size;
	}
	
	//3. getter, setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	//4. ...
	
}