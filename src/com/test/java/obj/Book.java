package com.test.java.obj;

public class Book {
	//접근지정자의 종류 4가지 중 -> 아무것도안적으면 default
	
//	public int a = 10;
//	private int b = 20;
//	
//	public void check() {
//		System.out.printf("a: %d\nb: %d", a, b);
//	}
	
	//접근지정자를 어떻게?
	//1. 멤버 변수는 무조건 private을 사용한다.
	// - 변수 제어가 불가능해서... 자료형에 맞기만 하면 걍 상관없이 다 집어넣어버리니까
	private String title;
	private int price;
	
	private String publisher;
	private String author;
	private String ISBN = "ABC12345";
	private int pages;
	
	//메서드의 매개변수를 통해 private으로 만든 멤버변수에 접근한다.
	// - 메서드는 개발자가 통제 가능한 영역이므로 유효성검사등등 가능~~
	// - 데이터를 잘 통제하고 관리하기 위해 사용한다.
	
	//쓰기 작업
	// - 외부에서 객체 내에 무언가를 기록하는 작업
	// - Setter, Set Method 
	public void aaa(int a) { //쓰기
		if (a >= 0 && a<=1000000) {
			price = a;
		}
	}
	
	//읽기 작업
	// - 내부의 객체 값을 외부로 출력
	// - Getter, Get Method
	public int bbb() { //읽기
		return price;
	}
	
	//price 변수에 대한 setter -> 접두어로 set + 멤버변수 이름
	public void setPrice(int price) {
		//1. 매개변수 price -> 갈색
		//2. 멤버변수 price -> 파란색
		
		//this : 객체 자신을 가리키는 참조 변수(키워드), 내가 나 자신을 가리키는 표현...
		// - b1. 과 this.는 결국에는 같은 의미지만, 남이 나를 부르는 이름이 b1, 내가 나를 부르는 이름이 this인거임...
		// this는 울타리 안에 잇다는...
		
		//b1.price = price; 는 불가능햐... b1이 더 늦게태어나서
		this.price = price;
	}
	
	//price 변수에 대한 getter -> 접두어로 get + 멤버변수 이름
	public int getPrice() {
		return this.price; //this 안붙여도 상관은없지만 가독성때문에 붙이는걸 추천...
	}

	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}
	
	public String getLevel() {
		//노트의 등급(품질)
		if (this.pages >=100 && this.price >=1000) {
			return "A";
		} else if (this.pages >=50 && this.price >=500) {
			return "B";
		} else {
			return "C";
		}
	}
	
}
