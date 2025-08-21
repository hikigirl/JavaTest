package com.test.java;

public class Ex15_Method {
	
	//main 메서드
	// - 이름이 예약어(main)
	// - 개발자가 호출하는 용도 x
	// - 프로그램이 시작되면 JVM이 자동으로 호출
	public static void main(String[] args) {
		
		hello();
		hello2();
		hello3();
		
//		public static void helloEveryone(String name)
//		 - 매개변수, 파라미터, 인자리스트
//		helloEveryone("홍길동");
//		 - 인수, Arguments, 
		
		helloEveryone("홍길동");
		helloEveryone("아무개");
		sum(10, 20);
		sum(200, 300);
		System.out.println();
		System.out.println();
		System.out.println();
		checkScore(100,90,80);
		checkScore(95,78,69);
		checkScore(90, 88, 59);
		
		
	}
	
	public static void hello() {
		String name = "홍길동";
		System.out.println(name + "님 안녕하세요");
		
	}
	
	public static void hello2() {
		String name = "아무개";
		System.out.println(name + "님 안녕하세요");
		
	}
	
	public static void hello3() {
		String name = "강아지";
		System.out.println(name + "님 안녕하세요");
		
	}
	
	//모든 사람에게 인사할 수 있는 메서드
	public static void helloEveryone(String name) {
		
		//String name = "홍길동";
		System.out.println(name + "님 안녕하세요");
		
	}
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	//성적 평가
	// - 인수: 국, 영, 수
	// - 결과: 평균, 합격/불합격
	// - 기준: 평균 60점이상
	
	/**
	 * 학생의 성적을 계산 후 출력합니다.
	 * @param kor	국어점수
	 * @param eng	영어점수
	 * @param math	수학점수
	 */
	public static void checkScore(int kor, int eng, int math) {
		
		int total = kor+eng+math;
		double avg = total/3.0;
		String result = (avg>=60) ? "합격":"불합격";
		System.out.printf("평균 점수 %.1f점은 %s입니다.\n", avg, result);
		
		
	}

}
