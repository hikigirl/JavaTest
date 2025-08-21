package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.*; //java.io 패키지 안에 있는 모든 것들을 가져올때는 *를 사용

public class Ex09_BufferedReader {

	public static void main(String[] args) throws IOException {
		//BufferedReader 클래스
		//요구사항) 사용자로부터 문자 1개를 입력받아 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		ctrl+shift+o -> 모든 클래스를 한번에 import하는 단축키
//		reader 변수 안에는 문자를 입력받을 수 있는 기능이 들어있다
		
		System.out.print("문자 입력: ");
		
		int code = reader.read();
		System.out.println(code);
		System.out.printf("%c\n", code);
		
		//이름 입력 -> 인삿말 출력
		System.out.print("이름을 입력하세요: ");
		
		//입력한 한 줄을 모두 반환(줄 단위로 반환)
		// - 입력 버퍼에서 \r\n을 만나기 직전까지
		// - 남은 \r\n을 자동으로 버린다.
		String name = reader.readLine();
		System.out.printf("안녕하세요 %s님\n", name);
		
		//나이 입력
		System.out.print("나이: ");
		String age = reader.readLine(); //20을 입력하면 숫자 20이 아니라 문자 20으로 인식됨
		//System.out.printf("%s님의 나이는 %d세입니다.\n", name, age); //타입 안맞아서 에러
		System.out.printf("%s님의 나이는 %s세입니다.\n", name, age);
		
		//요구사항) 숫자 2개 입력받은 후 두 수의 합을 구하시오
		System.out.print("첫번째 숫자: ");
		String input1 = reader.readLine();
		
		System.out.print("두번째 숫자: ");
		String input2 = reader.readLine();
		
		System.out.println(input1 + input2); //1020, 문자열 10과 문자열 20을 더해서 나온 결과
		
//		문자열을 숫자로 변환하려면?
//		 - Integer.parseInt() 메서드
//		 - 자료형에 따라 Byte.parseByte(), Short.parseShort(), Long.parseLong()
//		 - 실수: Float.parseFloat(), Double.parseDouble()
//		 - 논리: Boolean.parseBoolean("true")
		int n1 = Integer.parseInt(input1);
		int n2 = Integer.parseInt(input2);
		System.out.println(n1+n2);
	}

}
