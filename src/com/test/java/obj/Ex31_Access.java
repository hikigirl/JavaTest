package com.test.java.obj;

public class Ex31_Access {

	public static void main(String[] args) {
		//접근지정자..
		Book b1 = new Book();
		
		b1.aaa(38000);
		//System.out.printf("가격: "+b1.bbb());
		
		//m1();
		//m2();
		
		b1.setPublisher("영진출판사");
		System.out.println(b1.getPublisher());
		
		//쓰기 전용 프로퍼티(속성)
		b1.setAuthor("홍길동");
		//System.out.println(b1.getAuthor());
		
		//읽기 전용 프로퍼티(속성)
		System.out.println(b1.getISBN());
		
		//가상 프로퍼티 or 계산된 프로퍼티
		System.out.println(b1.getLevel());
	}

	private static void m2() {
		// 
		
	}

	private static void m1() {
		//System.out.println(b1.a);
		//System.out.println(b1.b); //The field Book.b is not visible, Book.b가 private이므로
		//b1.check(); //b를 직접 호출하지는 못하지만 메서드를 통해 간접적으로 불러오는 것은 가능하다..
		
		//멤버변수 = 필드
		//메모리에 올라가서 실체화된 객체 = 인스턴스
		// b1.a에서 . -> 멤버 접근 연산자, 부모.자식, 부모가 가지고 있는 요소를 보통 멤버라고 부름~
		
		//b1.title = "이것이 자바다";
		//b1.price = 38000;
		
		//System.out.println(b1.title);
		//System.out.println(b1.price);
		
	}

}


class Note {
	//성질, 상태, 데이터를 정의(멤버변수)
	private String color;
	private int page;
	
	private String owner;
	private int price;
	private int weight;
	private int size;
	
	//행동, 기능을 구현(멤버메서드)
	public void setColor(String color) {
		if (color.equals("white") ||color.equals("black") ||color.equals("gray")) {
			this.color = color;
		} else {
			System.out.println("잘못된 색상을 입력했습니다.");
			//throw new Exception(); //강제로 에러 발생
		}
	}
	
	public String getColor() {
		return this.color;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	
}