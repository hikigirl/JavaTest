package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23_For {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//run 모드: breakpoint x, ctrl+f11
		//debug모드: breakpoint o, f11
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		//m14();
		//m15();
		//m16();
		//m17();
		//m18();
		//m19();
		//m20();
		//m21();
		
	}
	
	private static void m21() {
		// do while문... 자주 사용하지는 않음
		int num=11;
		do {
			System.out.println(num);
			num++;
		} while (num<=10);
		
	}

	
	private static void m20() throws IOException {
		//자판기
		// - 메뉴출력 > 선택 > 결과 *N(loop)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean loop = true;
		
		while (loop) {
			System.out.println("=========");
			System.out.println(" 자판기");
			System.out.println("=========");
			System.out.println("1. 콜라");
			System.out.println("2. 사이다");
			System.out.println("3. 박카스");
			System.out.println("4. 종료");
			System.out.println("---------");
			
			System.out.print("선택: ");
			String input = reader.readLine();
			
			if (input.equals("1")) {
				System.out.println("700원입니다.");
				pause(reader); //일시정지 메서드
				
			} else if (input.equals("2")) {
				System.out.println("600원입니다.");
				pause(reader);
			} else if (input.equals("3")) {
				System.out.println("500원입니다.");
				pause(reader);
			} else if (input.equals("4")) {
				//프로그램 종료 == while문 탈출
				//System.out.println("프로그램을 종료합니다.");
				//break;
				
				System.out.println("정말 종료할까요?(y, n)");
				String isClosed = reader.readLine();
				if (isClosed.equals("y")) {
					System.out.println("프로그램을 종료합니다.");
					//break;
					loop = false; //break와 동일한 의미
					//중첩 반복문일 때 유용함(맨 바깥쪽 루프로 바로 빠져나갈수있기도 함)
				}
			}
		}
		
	}

	
	public static void pause(BufferedReader reader) throws IOException {
		//일시 정지
		System.out.println();
		System.out.println("계속하시려면 엔터를 입력하세요.");
		reader.readLine(); //변수에 넣지 않고 그냥 입력하기를 기다림
	}

	
	private static void m19() {
		//1~100까지 누적하기
		int sum = 0;
		
		//for문으로
		for (int i = 1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//while문으로
		sum = 0;
		int num = 1;
		while (num<=100) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		
	}

	
	private static void m18() {
		//while, do while문
		
		//1~10까지 출력
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		
		int n = 1; //초기식(역할)
		
		while (n <= 10) { //조건식
			System.out.println(n);
			n++; //증감식(역할)
		}
		
		//무한루프 만드는 법 -> 무한루프는 주로 while문을 사용하는 편
//		for (;;) {
//			System.out.println("무한루프");
//		}
		
//		while (true) {
//			System.out.println("무한루프");
//		}
		
	}

	
	private static void m17() {
		//이중루프 연습문제 관련..
		//별찍기(5*5)
		
		int n=1;
		
		for (int i=0 ; i<5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
//				System.out.printf("%3d", n);
//				n++;
			}
			System.out.println();
		}
		
	}

	
	private static void m16() {
		//break와 continue
		
		for (int i=0; i<10; i++) {
			
			if (i==5) { //i가 0~4까지만 루프(여기서 j 조건은 변화시킬 수 없음)
				break; 
			}
			
			for (int j=0; j<10; j++) {
				
				//if (i==5) { //j for문만을 빠져나간다.
				//if (j==5) { //j가 0~4까지만 루프
				//if (i==5 && j==5) {
				//if (i==5 || j==5) { //i==5일때 건너뛰고 j가 0~4
				//	break; 
				//}
				
				//if (i==5) { 
				//if (j==5) { 
				//if (i==5 && j==5) {
				//if (i==5 || j==5) { 
				//	continue; 
				//}
			
				
				//실행 횟수?
				System.out.printf("i: %d, j: %d\n", i, j);
				
			}
			
		}
		
	}

	
	private static void m15() {
		//이중for문을 활용해 구구단 2단~9단 모두 출력해보기
		
		for (int j=2; j<=9; j++) {
			System.out.printf("[%d단]\n", j);
			for (int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %2d\n", j, i, j*i);
			}
			System.out.println();
		}
	}
	
	
	private static void m14() {

//		for (int i=0; i<10; i++) {
//			System.out.println("i: "+i);
//		}
//		System.out.println();
		
		//이중 for문
//		for (int i=0; i<10; i++) {
//			for (int j=0; j<10; j++) {
//				System.out.printf("i: %d, j: %d\n", i, j);
//				//10*10 =100번 찍힘
//				//j for문이 10번 루프 한 다음 i가 바뀜
//			}
//		}
		
		//3중 for문
//		for (int i=0; i<24; i++) { //대회전 >시침
//			for (int j=0; j<60; j++) { //중회전 >분침
//				for (int k=0; k<60; k++) { //소회전 >초침
//					System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
//					//10*10*10 = 1000번 찍힘
//					//k for문이 10번 루프->j가 바뀌어 j for문이 10번 루프-> 그 다음 i가 바뀜
//				}
//			}
//		}
		
		/*	
		 	for문의 활용...
		 	[학교]
		 	for (학년){
			 	for (반) {
			 		for(번호) {
			 		
			 		}
			 	}
		 	}
		 	
		 	for (번호) {
		 		for(반) {
		 		
		 		}
		 	}
		 	
		 	[아파트]
		 	for (단지) {
		 		for (동) {
		 			for (층) {
		 				for (호수) {
		 				
		 				}
		 			}
		 		}
		 	}
		 
		*/
		
	}


	private static void m13() {
		// 1+2+3=6 (누적)
		int sum = 0;
		for (int i = 1; i<=3; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		System.out.println("\b\b= " + sum); //백스페이스라고생각하고 걍 이렇게 ㄱㄱ
	}


	private static void m12() {
		//난수(임의의 수) 만들기
		//1. Math 클래스
		//2. Random 클래스(math를 감싼 클래스, wrapper class)
		
		//System.out.println(Math.PI); //원주율을 double 형태로 보여줌~
		//System.out.println(Math.random()); //0 <= Math.random() < 1, 0이상 1미만
		
		for (int i = 0; i<10; i++) {
			//System.out.println(Math.random());
			
			//가공
			System.out.println((int)(Math.random()*10));
			//곱하기 10을 하면 정수부가 생겨서 정수부는 0~9 사이의 값을 가짐.
			//정수부를 만든 다음에 int로 형변환하면 소수점 아래는 다 버림
			//즉 정수 난수 10개..
			
			//System.out.println((int)(Math.random()*n));
			//: 0부터 n-1까지의 정수 난수를 생성한다.
			
			//1~6까지를 만드려면? 
			//0에서 5까지 만들고 1을 더하자
			System.out.println((int)(Math.random()*6)+1);
		}
		
		
		
	}


	private static void m11() {
		//선생님+학생 상담(30명)
		for (int i = 1;i<=30;i++) {
			
//			if (i > 16) {
//				break;
//			}
			
			if (i==10 || i == 15 || i ==22) {
				continue; //i가 10일 때, 스킵
			}
			
			System.out.println(i + "번 학생 상담 중");
		}
		
	}


	private static void m10() {
		//분기문 - break과 continue
		
//		for(int i=1; i<=10; i++) {
//			if(i == 5) {
//				break;		//if문은 인식하지 않는다. 그래서 i==5일때 for문을 빠져나옴
//			}
//			System.out.println(i);
//		}
//		
//		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i == 5) {
				continue;		//continue를 만나면 만나는 즉시 다시 for문으로 돌아간다.
			}					//skip에 가까움(결과물에 5가 안찍힘...)
			System.out.println(i);
		}
		
		System.out.println();
		
	}


	public static void m9() throws IOException {
//		무한루프, infinite loop
//		 - 1. 사용자 실수
//		 - 2. 사용자가 의도적으로.. 
//				a. 반복횟수 미정
//				b. 진짜로 무한루프가 필요할때
		
		//int의 값 범위 때문에 21억번 회전...
//		for (int i=0; i<10;i--) {
//			System.out.println("실행문");
//		}
		
		//무한 루프 생성하기
		//for ( ; ; ) -> 이렇게 전부 비워둬도 됨
//		for (int i=0;true;i++) {
//			System.out.println("text");
//		}
		
		//사용자 입력 숫자(?개) > 총합
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for(;;) {
			System.out.print("숫자: ");
			String input = reader.readLine();
			
			//if문으로 빠져나올 시점을 만듬
			if (input.equals("")) {		//String을 비교할땐 .equals()... 안외워진다
				break;
			}
			
			int num = Integer.parseInt(input);
			
			sum += num;
		}
		
		System.out.println(sum);
		
		
		
	}


	private static void m8() throws NumberFormatException, IOException {
		//요구사항: 구구단출력
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("몇단? : ");
		int num = Integer.parseInt(reader.readLine());
		
		for (int i = 1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\n", num, i, num*i);
		}
		
	}


	private static void m7() throws NumberFormatException, IOException {
		//사용자에게 숫자 10개를 입력받아 그 수들의 합계를 구하시오
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for (int i = 1 ; i<=10; i++) {
			
			System.out.printf("숫자: ");
			int value = Integer.parseInt(reader.readLine());
			
			sum = sum + value;
		}
		System.out.printf("합계: %,d",sum);
		
		
	}
	
	
	private static void m6() throws NumberFormatException, IOException {
		//1부터 사용자가 입력한 숫자까지의 합
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("숫자: ");
		int value = Integer.parseInt(reader.readLine());
		
		int sum = 0;
		
		for (int i = 1 ; i<= value; i++) {
			sum = sum + i;
			//System.out.println(i);
		}
		System.out.printf("1부터 %,d까지의 합계: %,d",value,sum);
		
		
	}

	
	private static void m5() {
		//1~10까지의 합
		//1~10의 숫자가 필요함->루프
		
		int sum=0; //누적 변수
		//sum = 1+2+3+4+5+6+7+8+9+10 = 55
		
		for (int i = 1; i<=10; i++) {
			sum = sum + i;
			//i(1) -> 1 = 0 + 1
			//i(2) -> 3 = 0 + 1 + 2
			//i(1) -> 6 = 0 + 1 + 2 + 3
			//i(1) -> 10 = 0 + 1 + 2 + 3 + 4
			//..
			//i(10) -> 55 = 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		}
		System.out.println(sum);
		
		for (int i = 3; i<=100; i+=3) {
			sum = sum + i;		//100 이하의 모든 3의 배수의 합
		}
		System.out.println(sum);
	}

	
	private static void m4() {
		//2. 루프 변수(*****)
		// -> 루프 변수의 변화
		
		//요구사항) 숫자 1~10까지 출력
//		int num=1;
//		for (int i=0; i<10;i++) {
//			System.out.println(num);
//			num++;
//		}
		
		for (int i = 0; i<10; i++) {
			System.out.println(i+1); //루프변수를 직접 사용해서 출력하기, 제일 깔끔
		}
		
		for (int i = 1; i<=10; i+=2) {
			System.out.println(i); //홀수 배열
		}
		for (int i = 2; i<=10; i+=2) {
			System.out.println(i); //짝수 배열
		}
		for (int i = 5; i<=100; i+=5) {
			System.out.println(i); //5의 배수
		}
		
	}

	
	private static void m3() {
		//1. 반복 횟수
		for (int i=0; i<5; i++) {
			//i = 0, 1, 2, 3, 4
			System.out.println("실행문");
		}
		System.out.println();
		for (int i = 1; i<=5; i++) {
			//i = 1, 2, 3, 4, 5
			System.out.println("실행문2");
		}
		System.out.println();
		for (int i = 1; i<6; i++) {
			//i = 1, 2, 3, 4, 5
			System.out.println("실행문3");
		}
		System.out.println();
		for (int i = 5; i<10; i++) {
			//i = 5, 6, 7, 8, 9
			System.out.println("실행문4");
		}
		System.out.println();
		for (int i = 10; i>5; i--) {
			//i = 10, 9, 8, 7, 6
			System.out.println("실행문5");
		}
		System.out.println();
		for (int i = 0; i<25; i+=5) {
			//i = 0, 5, 10, 15, 20
			System.out.println("실행문6");
		}
		
	}

	
	private static void m2() {
		//지역 변수
		// - 메서드, 제어문 블럭 내에서 선언한 변수
		// - 메서드, 제어문 블럭 내에서만 인식이 가능(영역이 블럭이다.)
		
		int a = 10; //지역변수(m2 메서드)
		System.out.println("a: "+a);
		if (a>0) {
			int b=20;	//지역변수(if)
			System.out.println("b: "+b);
			System.out.println("a: "+a);
		}
		//System.out.println("b: "+b);
		
	}

	
	private static void m1() {
		// 안녕하세요를 5회 출력
		
		//i: 루프 변수
		
		for (int i=0; i<5; i++) {
			System.out.println("안녕하세요");
		}
		
	}

}
