package com.test.java.obj.inheritance;

public class Ex48 {

	public static void main(String[] args) {
		//상황) 프린터 대리점 운영
		//1. LG100 * 5대, HP200 * 3대
		//2. 하루에 한번씩 제품 점검 -> 출력 기능을 체크
		
		//추가상황)
		//1. 프린터재고증가
		//2. 프린터종류증가, (Dell300)
		//3. 브랜드별 프린터 고유 기능도 점검(lg의 selfTest, hp의 ai)
		
//		m1();
//		m2();
//		m3();
		m4();
		
	}

	private static void m4() {
		LG100 lg1 = new LG100(5, 300000);
		Printer p1;
		
		//부모 = 자식, 업캐스팅
		p1 = lg1;
		
		Printer p2 = new LG100(5, 300000);
		Printer p3 = new HP200("touch", 400000);
		
		Printer[] ps = new Printer[2]; //객체 만드는게아니라 참조변수 2개 만든거임
		
		//배열의 특성: 같은 자료형의 집합
		//			 : 다른 자료형의 집합 -> 참조형의 형변환을 이용(형제 클래스에 한해서)
		// *** 업캐스팅을 사용하는 이유: 다른 자료형을 가지는 집합을 만들기 위해
		ps[0] = new LG100(5, 300000);
		ps[1] = new HP200("touch", 400000);
		
		
		Printer[] list = new Printer[8];
		for (int i=0 ; i<list.length; i++) {
			if (i<5) {
				list[i] = new LG100(5, 300000);
			} else {
				list[i] = new HP200("touch", 400000);
			}
		}
		
		//점검시간
		// 혜택의 원인
		// 1. 상속을 통해 집합 1개 -> 루프도 1개
		// 2. 상속 -> 추상클래스와 추상 메서드를 통해 행동을 통일시킴(print())
		for (int i=0 ; i<list.length ; i++) {
			//list[i].print("테스트");
			
			//list[i].selfTest(); //부모 껍데기라서 selfTest가 안뜸
			//다운캐스팅을 해야함(부모 껍데기를 쓰다가 자식 클래스의 고유기능이 필요할 때)
//			if (i<5) {
//				((LG100)list[i]).selfTest();
//			} else {
//				((HP200)list[i]).ai();
//			}
			
//			System.out.println(list[i] instanceof Printer);
			
			//System.out.println(list[i] instanceof LG100);
			//System.out.println(list[i] instanceof HP200);
			
			if (list[i] instanceof LG100) {
				((LG100)list[i]).selfTest();
			} else if (list[i] instanceof HP200) {
				((HP200)list[i]).ai();
			}
		}
	}

	private static void m3() {
		//case2. 배열사용
		LG100[] lg = new LG100[5]; //공간만 다섯개 만듬
		HP200[] hp = new HP200[3];
		Dell300[] dell = new Dell300[3];
		
		//lg[0].print("테스트"); //nullpointerexception
		
		for (int i=0 ; i<lg.length ; i++) {
			lg[i] = new LG100(5, 300000);
		}
		for (int i=0 ; i<hp.length ; i++) {
			hp[i] = new HP200("touch", 400000);
		}
		
		for (int i=0 ; i<dell.length ; i++) {
			dell[i] = new Dell300(250000);
		}
		
		//점검시간
		for (int i=0 ; i<lg.length ; i++) {
			lg[i].print("테스트");
			lg[i].selfTest();
		}
		for (int i=0 ; i<hp.length ; i++) {
			hp[i].print("테스트");
			hp[i].ai();
		}
//		for (int i=0 ; i<dell.length ; i++) {
//			dell[i].print("테스트");
//		}
		
	}

	private static void m2() {
		//case1. 비효율적
		// 1대당 비용 동일
		LG100 lg1 = new LG100(5, 300000);
		LG100 lg2 = new LG100(5, 300000);
		LG100 lg3 = new LG100(5, 300000);
		LG100 lg4 = new LG100(5, 300000);
		LG100 lg5 = new LG100(5, 300000);
		
		HP200 hp1 = new HP200("touch", 400000);
		HP200 hp2 = new HP200("touch", 400000);
		HP200 hp3 = new HP200("touch", 400000);
		
		//점검시간
		lg1.print("테스트");
		lg2.print("테스트");
		lg3.print("테스트");
		lg4.print("테스트");
		lg5.print("테스트");
		
		hp1.print("테스트");
		hp2.print("테스트");
		hp3.print("테스트");
	}

	private static void m1() {
		//방금 설계한 클래스들의 문제점 -> 리팩터링하기
		//클래스의 반복코드나 사용법 -> 추상클래스 or 인터페이스
		
		//LG100(weight, price) + output() + selfTest()
		//HP200(type,	price) + print()  +	ai()
		//price와 출력 기능을 부모 클래스로 빼자 -> 추상 클래스 사용
		
		//Printer p1 = new Printer(10000);
		
	}

}

abstract class Printer {
	private int price;
	
	//생성자
	public Printer(int price) {
		this.price = price;
	}
	
	//추상메서드 -> 프린터로서 가져야 할 공통 행동 -> 출력기능
	public abstract void print(String txt);
	
}

class LG100 extends Printer {
	private int weight;
	//private int price;
	
	public LG100(int weight, int price) {
		super(price); //부모 생성자 호출
		
		this.weight = weight;
		//this.price = price;
	}
	
	//출력기능
//	public void output(String txt) {
//		System.out.println("LG100 출력: " + txt);
//	}
	
	//자가진단
	public void selfTest() {
		System.out.println("자가진단을 합니다");
	}

	@Override
	public void print(String txt) {
		System.out.println("LG100 출력: " + txt);
	}
}

class HP200 extends Printer {
	private String type; //터치, 비터치
	//private int price;
	
	public HP200(String type, int price) {
		super(price); //부모 생성자는 가장 먼저 실행돼야 함 맨윗줄에 적어요
		this.type = type;
		//this.price = price;
	}
	
	//출력기능
//	public void print(String msg) {
//		System.out.println("HP200 출력결과: " + msg);
//	}
	
	//AI기능
	public void ai() {
		System.out.println("AI기능 동작중..");
	}

	@Override
	public void print(String msg) {
		System.out.println("HP200 출력결과: " + msg);
		
	}
	
}

class Dell300 extends Printer {
	//자체 멤버 구현
	public Dell300(int price) {
		super(price);
	}

	@Override
	public void print(String txt) {
		System.out.println("구현..");		
	}
	
}











