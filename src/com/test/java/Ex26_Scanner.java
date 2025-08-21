package com.test.java;

import java.util.Scanner;

public class Ex26_Scanner {

	public static void main(String[] args) {
		//Scanner 클래스..
		 m1();
		 

	}
	private static void m2() {
		// 
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		
		//nextLine()
		//문장단위 입력 도구
		//문장: 개행문자를 만나기 전까지의 모든 문자열
		
		//next()
		//토큰(token)단위 입력도구
		//토큰: 공백으로 구분되는 한 단어
		
		String txt = scan.next();
		System.out.println(txt);
		
	}

	private static void m1() {
		//scanner 클래스~
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열: ");
		String line = scan.nextLine();
		System.out.println(line);
		
		//자료형별로 입력받는 전용 메서드를 제공
		System.out.print("숫자: ");
		int num = scan.nextInt();
		System.out.println(num);
		//BufferedReader였다면...
		//int num = Integer.parseInt(reader.readLine());
		
		System.out.print("숫자: ");
		num = scan.nextInt();
		System.out.println(num);
		
		//숫자 입력 후 이어서 문자열 입력 -> 엔터 자동으로 쳐져서 입력이안돼
		
		scan.skip("\r\n"); //입력 버퍼에 남은 개행문자(\r\n)를 제거
		System.out.print("문자열: ");
		line = scan.nextLine();
		System.out.println(line);
		
	}

	

}
