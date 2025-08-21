package com.test.examples;

import java.util.Scanner;

public class Ex27_String {
	
	public static void main(String[] args) {
		
		//Ex27_String.java
		
		//문자열 > 문자열 조작 기능들..
		//m1();
		//m2();
		//m3();
		m4();
		//m5();
		//m6();
		//m7();
		
	}

	private static void m7() {
		
		//게시판 글쓰기 > 금지어!!
		
		String stop = "바보"; //금지어
		String content = "안녕하세요. ㅂㅏ보 저는 자바를 배우는 학생입니다."; //글내용
		
		System.out.println(content.indexOf(stop)); //위치 or -1
		
		if (content.indexOf(stop) > -1) {
			System.out.println("금지어 발견!!");
		} else {
			System.out.println("글쓰기 완료~");
		}
		
		
		
		content = "안녕하세요. ㅂㅏ보 저는 자바를 멍청이 배우는 학생입니다."; 
		String[] stops = { "바보", "멍청이", "메롱", "ㅂㅏ보" };
		
		for (int i=0; i<stops.length; i++) {
			
			if (content.indexOf(stops[i]) > -1) {
				System.out.println("금지어 발견!!");
				break;
			}
			
		}
		
		System.out.println("종료");
		
	}

	private static void m6() {
		
		//검색
		//- 문자열내에서 원하는 문자(열)을 검색 > 발견된 위치(index) 반환
		//- int indexOf(char c)
		//- int indexOf(String s)
		//- int indexOf(char c, int beginIndex)
		//- int indexOf(String s, int beginIndex)
		
		String txt = "안녕하세요. 홍길동입니다.";
		int index = -1;
		
		index = txt.indexOf('하');
		System.out.println(index);
		
		index = txt.indexOf('홍');
		System.out.println(index);
		
		index = txt.indexOf('강');
		System.out.println(index);
		
		index = txt.indexOf("홍길동");
		System.out.println(index);
		System.out.println();
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
		
		index = txt.indexOf("홍길동");
		System.out.println(index);
		
		index = txt.indexOf("홍길동", index + 3);
		System.out.println(index);
		
		index = txt.indexOf("홍길동", index + 3);
		System.out.println(index);
		
		
	}

	private static void m5() {
		
		//공백 제거
		//- String trim()
		//- 문자열에 존재하는 공백 문자(whitespace > 스페이스, 탭, 개행)을 제거
		//- 문자열의 시작과 끝에 존재하는 공백 문자만 제거한다.
		//- 불필요하거나 or 사용자 실수로 생긴 공백 제거하는 역할
			
		String txt = "     하나     둘     셋     ";
		
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
		
	}

	private static void m4() {
		
		//단어 입력
		//- 영어 소문자로만
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어(영문자): ");
		String word = scan.nextLine();
		
		if (isValid(word)) {
			System.out.println("통과");
		} else {
			System.out.println("실패");
		}
		
	}

	private static boolean isValid(String word) {
		
		//word = "java"
		//j, a, v, a
		
		word.charAt(0);
		word.charAt(1);
		word.charAt(2);
		word.charAt(3);
		
		for (int i=0; i<word.length(); i++) {
			
			char c = word.charAt(i);
			System.out.println(c);
			
			//tEst
			
			//*** 유효성 검사는 잘못된 부분을 검색해라!!
			if ((c < 'a' || c > 'z') 
					&& (c < 'A' || c > 'Z')
					&& (c < '0' || c > '9')) {
				return false;
			}
			
		}
		
		return true;
	}

	private static void m3() {
		
		//주민등록번호 입력 
		//ex) 970618-1234567
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민번호입력(-필수): ");
		
		String jumin = scan.nextLine();
		
		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
		} else {
			System.out.println("잘못된 주민번호");
		}
		
	}

	private static void m2() {
		
		//문자열 추출
		//- char chatAt(int index)
		//- 원하는 위치의 문자를 추출
		//- Zero-based index
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		char c = txt.charAt(4);
		System.out.println(c);
		
		c = txt.charAt(10);
		System.out.println(c);
		
		//StringIndexOutOfBoundsException
		//c = txt.charAt(15);
		//System.out.println(c);
		
		//마지막 글자
		c = txt.charAt(txt.length() - 1);
		System.out.println(c);
		
	}

	private static void m1() {
		
		//문자열 생성
		//1. 리터럴
		//2. 객체 생성
		
		//String 클래스
		String s1 = "홍길동";
		String s2 = new String("홍길동");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		//문자열 == 문자의 집합
		//String == char[]
		
		//문자열 길이
		//- int length()
		
		String txt = "홍길동";
		System.out.println(txt.length());
		System.out.println("자바".length());
		System.out.println("ABC한글1234!@#$%^&".length());
		
		//요구사항] 사용자 입력 > 문자수?
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("문장: ");
//		String line = scan.nextLine();
// 
//		System.out.printf("%s > %,d문자\n"
//		 				, line, line.length());
		
		
 
		//유효성 검사
		//- 이름 입력
		//- 성 + ~5자 = 2~6자 이내
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		if (name.length() >= 2 && name.length() <= 6) {
			System.out.println("올바른 이름 ");
		} else {
			System.out.println("올바르지 않은 이름");
		}
		
	}

}



















