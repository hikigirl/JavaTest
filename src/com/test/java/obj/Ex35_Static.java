package com.test.java.obj;

public class Ex35_Static {
	public static void main(String[] args) {
		//요구사항
		// 1. 펜을 생산하시오
		// 2. 생산된 펜의 개수를 세시오.
		
		//Case1. 
		// - 간편함
		// - pen과 count간의 관계.. 모호
		// - count++가 누락될 위험
		
		
//		int count = 0; //누적변수
//		Pen p1 = new Pen("Monami 153", "black");
//		count++;
//		
//		Pen p2 = new Pen("Monami 153", "black");
//		count++;
//		
//		Pen p3 = new Pen("Monami 153", "black");
//		count++;
//		
//		System.out.println("볼펜 개수: " + count);
		
		
		//Case2.
		// - pen 클래스와 count 변수의 관계 강화
		// - count(객체변수) -> 객체마다 생성 -> count는 개인 데이터x, 공용데이터이므로.. -> 관리 힘들다

//		Pen p1 = new Pen("Monami 153", "black");
//		p1.count++;
//		
//		Pen p2 = new Pen("Monami 153", "black");
//		p2.count++;
//		
//		Pen p3 = new Pen("Monami 153", "black");
//		p3.count++;
//		
//		System.out.println("볼펜 개수: " + p1.count);
		
		
		//Case 3. 
		//Pen 클래스와 count 변수의 관계 강화
		//개인 데이터와 공용 데이터를 구분지어 관리
		//count++ 누락 위험은 아직도 o
//		Pen p1 = new Pen("Monami 153", "black");
//		Pen.count++; //개인 행동(X), 공통 행동(Pen 클래스로서의 행동..??)
//		//count는 p1 등등 각자의 객체에 귀속되지 않음~
//		
//		Pen p2 = new Pen("Monami 153", "black");
//		Pen.count++;
//		
//		Pen p3 = new Pen("Monami 153", "black");
//		Pen.count++;
//		
//		System.out.println("볼펜 개수: " + Pen.count);
		
		
		//Case 4.
		Pen p1 = new Pen("Monami 153", "black");
		
		Pen p2 = new Pen("Monami 153", "black");
		
		Pen p3 = new Pen("Monami 153", "black");
		
		System.out.println("볼펜 개수: " + Pen.count);
	}
}

//Case 4.
class Pen {
	private String model;
	private String color;
	public static int count; 
	
	//정적 생성자 -> Static 변수 전용 생성자(초기화 용도)
	static {
		Pen.count = 0;
		//System.out.println("정적생성자");
	}
	
	//객체 생성자
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		//System.out.println("객체생성자");
		Pen.count++; //객체 생성되는 개수 = 펜 생산개수이므로...
	}
	
	public String info() {
		return String.format("[model: %s, color: %s]", this.model, this.color);	
	}
}



//Case 3.
//class Pen {
//	private String model;
//	private String color;
//	public static int count; //공용 데이터 저장용 -> static
//	
//	//정적 생성자 -> Static 변수 전용 생성자(초기화 용도)
//	static {
//		Pen.count = 0;
//	}
//	
//	//객체 생성자
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//		//Pen.count = 0;	
//	}
//	
//	public String info() {
//		return String.format("[model: %s, color: %s]", this.model, this.color);	
//	}
//}




//Case2
//class Pen {
//	private String model;
//	private String color;
//	public int count; //누적 변수(펜 개수), 객체 변수(static이 없는 변수)
//	//count의 용도를 생각해보면 객체 하나가 단독으로 쓰려고 만든 변수가 아님...
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//		this.count = 0;	//생성자를 통해 초기화 하는것을 적극 권장함
//	}
//	
//	public String info() {
//		return String.format("[model: %s, color: %s]", this.model, this.color);	
//	}
//}




//Case1
//class Pen {
//	private String model;
//	private String color;
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//		
//	}
//	
//	public String info() {
//		return String.format("[model: %s, color: %s]", this.model, this.color);
//		
//	}
//	
//	
//	
//}