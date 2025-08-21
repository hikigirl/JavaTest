package com.test.examples;

public class Ex33_Constructor {
	
	public static void main(String[] args) {
		
		//Ex33_Constructor.java
		/*
			
			생성자, Constructor
			- (특수한 목적을 가지는) 메서드
			- 객체의 멤버(변수)를 초기화하는 역할(*****)
			- 객체 초기화 전용 메서드(***)
			
			- 접근 지정자 public
			- 반환값 없음 > void 생략
			- 생성자명 == 클래스명
			
			Point p1 = new Point();
		
		*/
		
		//1. new 
		//2. Box()
		Box b1 = new Box();
		
		b1.setSize("소형");
		b1.setPrice(500);
		
		//Box();
		
		System.out.println("b1.size: " + b1.getSize());
		System.out.println("b1.price: " + b1.getPrice());
		
		
		Box b2 = new Box("중형");
		Box b3 = new Box(500);
		Box b4 = new Box("소형", 300);
		
		
		
		//Cup(String,int)
		Cup c1 = new Cup("white", 500);
		
		
		
	}//main

}

class Box {
	
	private String size;
	private int price;
	
	//기본 생성자, Default Constructor
	//- 개발자가 코딩을 안해도 컴파일러가 자동으로 만들어준다.	
//	public Box() {
//		this.size = null;
//		this.price = 0;
//	}
	
	//생성자 오버로딩
	public Box() {
		//this.size = "대형";
		//this.price = 1000;
		this("대형", 1000);
	}
	
	public Box(String size) {
		//this.size = size;
		//this.price = 1000;
		this(size, 1000);
	}
	
	public Box(int price) {
		//this.size = "대형";
		//this.price = price;
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
	
	//2. 생성자(기본 or 오버로딩)
	public Cup(String color, int size) {
		this.color = color;
		this.size = size;
	}

	//3. Getter, Setter
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
	
	//4.
	
	
}















