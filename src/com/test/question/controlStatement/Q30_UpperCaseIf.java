package com.test.question.controlStatement;

import java.io.IOException;

public class Q30_UpperCaseIf {

	public static void main(String[] args) throws IOException {
//		요구사항
//		영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
//
//		조건
//		유효성 검사를 하시오.(영문자만 입력 가능)

		caseConverter();

	}

	private static void caseConverter() throws IOException {
		// 대문자 -> 소문자, 소문자 -> 대문자 구현해야하고..(문자코드 +- 32 이용해야할듯?)
		// 영문 문자코드 범위... 소문자(97~122), 대문자(65~90)
		
		System.out.print("문자: ");
		
		//system.in.read() 계속 까먹음....
		char value = (char) System.in.read();
		
		
		if ((value>=65 && value<=90)||(value>=97 && value<=122)) { //유효성검사 - 영문 대소문자일 경우

			if(value>=65 && value<=90) { //대문자일 경우
				System.out.printf("'%s'의 소문자는 '%s'입니다.\n", value, (char)(value+32));
			} else if (value>=97 && value<=122) { //소문자일 경우
				System.out.printf("'%s'의 대문자는 '%s'입니다.\n", value, (char)(value-32));
			}
			
		} else { //유효성검사 - 영문 대소문자가 아닐 경우
			System.out.println("영문자만 입력하시오.");
		}
		
	}

}
