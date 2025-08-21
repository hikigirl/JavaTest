package com.test.java.obj;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Ex53_Exception {

	public static void main(String[] args) {
		//m1();
		//m2();
		//m3();
		//m4();
		
		
//		try {
//			m5();
//		} catch (Exception e) {
//			//e.printStackTrace();
//			System.out.println("본사에서 처리함");
//		}
		
		m6();
		
		
	}

	private static void m6() {
		//짝수: 정상
		//홀수: 에러(우리가 정의한)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자(짝수만): ");
		int n = scan.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + 10);
		} else {
			System.out.println("홀수입력불가");
		}
		
		
		//사용자가 정의한 에러를 try-catch로 해결하려면..?
		// 이럴때는 근데 if문 쓰는게 더 깔끔하긴할듯..
		try {
			if (n % 2 == 1) { //홀수일 때를 에러라고 처리하고 싶을 때
				//예외 던지기
				throw new Exception();
			}
			System.out.println(n + 10);
		} catch (Exception e) {
			System.out.println("홀수입력불가");
		}
		
	}

	private static void m5() throws Exception {
		//예외 미루기
		int n = 0;
		System.out.println(100/n);
	}

	private static void m4() {
		//요구사항) 숫자를 입력받아 산술 연산을 하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = scan.nextInt();

		try { 
			//비즈니스 코드 영역
			System.out.printf("100 / %d = %d\n", num, 100/num);
			
			//return;
		} catch (Exception e) {
			//예외 처리 코드 영역
			System.out.println("0은 입력할 수 없습니다");
		} finally {
			//클린 코드 영역(자원 해제 코드)
			System.out.println("finally");
			
		}
		
		System.out.println("프로그램 종료");

	}

	private static void m3() {
		
		try {
			Object o1 = new Random();
			System.out.println(((Calendar)o1).getTimeInMillis());
			
			int num = 0;
			//throw new ArithmeticException()
			System.out.println(100/num); //java.lang.ArithmeticException
			
			int[] nums = {10, 20, 30}; 
			System.out.println(nums[5]); //java.lang.ArrayIndexOutOfBoundsException
			
			Random rnd = null;
			System.out.println(rnd.nextInt()); //java.lang.NullPointerException
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 오류");
		} catch (NullPointerException e) {
			System.out.println("널 참조");
		} catch (Exception e) {
			System.out.println("예외처리");
		} //다중 catch문
		
		System.out.println("최종 도달");
		
	}

	private static void m2() {
		
		int num = 0;
		try {
			System.out.println(100/num);
		} catch (Exception e) {
			System.out.println("0으로 나누기");
		}
		
		
		int[] nums = {10, 20, 30};
		try {
			System.out.println(nums[5]);
		} catch (Exception e) {
			System.out.println("배열 첨자 오류");
		}
		
		
		Random rnd = null;
		try {
			System.out.println(rnd.nextInt());
		} catch (Exception e) {
			System.out.println("널 참조");
		}
		
		
		System.out.println("최종 도달");
	}

	private static void m1() {
		//요구사항) 숫자를 입력받아 산술 연산을 하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = scan.nextInt();
		// java.lang.ArithmeticException: / by zero
		
		//제어문 사용
		if (num != 0) {
			System.out.println("111");
			//Business code, 업무 코드 - 원래 하려던 일
			System.out.printf("100 / %d = %d\n", num, 100/num);
			System.out.println("222");
		} else {
			//예외 처리 코드
			System.out.println("0은 입력할 수 없습니다");
		}
		
		//예외를 if문에 적어도 상관이없긴한데... 별로임
		if (num == 0) {
			//예외 처리 코드
			System.out.println("0은 입력할 수 없습니다");
			
		} else {
			System.out.println("111");
			//Business code, 업무 코드 - 원래 하려던 일
			System.out.printf("100 / %d = %d\n", num, 100/num);
			System.out.println("222");
		}
		
		
		
		//try catch문
		try {
			System.out.println("333");
			//업무코드
			System.out.printf("100 / %d = %d\n", num, 100/num);
			System.out.println("444");
		} catch (Exception e) {
			//예외처리코드
			System.out.println("0은 입력할 수 없습니다");
			System.out.println(e.getMessage());
			e.printStackTrace(); //에러 화면을 그대로 출력, 개발할 때 씀
		}
		
		System.out.println("프로그램 종료");
		

		
		
	}

}
