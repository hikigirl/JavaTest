package com.test.java;

import java.io.IOException;

public class Ex08_Input {

	public static void main(String[] args) throws IOException {
		
		//요구사항] 사용자에게 문자 1개를 입력받아 화면에 출력하시오.
		
		//제어의 흐름
		//1. 입력 안내 메세지 출력
		//2. 문자를 입력받음
		//3. 입력받은 문자를 화면에 출력
		
		
		System.out.print("문자 입력: "); //Label(안내메세지)
//		
//		int code = System.in.read(); //
//		System.out.printf("입력한 문자는 '%d'입니다.\n", code);
//		System.out.printf("입력한 문자는 '%c'입니다.\n", code); // printf는 문자 코드 값을 받으면 문자라고 생각해줌
		

		int code = System.in.read();
		System.out.println(code);
		
		code = System.in.read();
		System.out.println(code);
		
		code = System.in.read();
		System.out.println(code);
		
		code = System.in.read();
		System.out.println(code);
		
		code = System.in.read();
		System.out.println(code);
	}

}
