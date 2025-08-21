package com.test.examples;

import java.util.Scanner;

public class Ex26_Scanner {
	
	public static void main(String[] args) {
		
		//Ex26_Scanner.java
		
		//System.in.read();
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.print("입력: ");
//		String line = reader.readLine();
//		System.out.println(line);
		
		
		m1();
		//m2();	
		
	}

	private static void m2() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		
		//nextLine()
		//- 문장 단위 입력 도구
		//- 문장: 개행 문자를 만나기 전까지의 모든 문자열
		
		//next()
		//- 토큰(Token) 단위 입력 도구
		//- 토큰: 공백으로 구분되는 한 단어
		String txt = scan.next();
		System.out.println(txt);
		
		txt = scan.next();
		System.out.println(txt);
		
		txt = scan.next();
		System.out.println(txt);
		
		
		//하나 둘 셋
//		String txt = "";
//		
//		while (scan.hasNext()) {
//			System.out.println(scan.next());
//		}
//		
//		System.out.println(scan.next());
//		System.out.println(scan.hasNext());
//		
//		System.out.println(scan.next());
//		System.out.println(scan.hasNext());
//		
//		System.out.println(scan.next());
//		System.out.println(scan.hasNext());
		
		
	}

	public static void m1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열: ");
		String line = scan.nextLine();
		System.out.println(line);
		
		//자료형별로 입력받는 전용 메서드를 제공
		System.out.print("숫자: ");
		//int num = Integer.parseInt(reader.readLine());
		int num = scan.nextInt();
		System.out.println(num);
		
		System.out.print("숫자: ");
		num = scan.nextInt();
		System.out.println(num);
		
		//숫자 입력 > 이어서 > 문자열 입력
		//- 입력 버퍼에 남은 개행문자를 제거
		//scan.nextLine();
		scan.skip("\r\n");
		
		System.out.print("문자열: ");
		line = scan.nextLine();
		System.out.println("마지막: " + line);
	}

}











