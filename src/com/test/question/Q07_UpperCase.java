package com.test.question;

import java.io.IOException;

public class Q07_UpperCase {

	public static void main(String[] args) throws IOException
	{

//		07. 영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.

//		대문자와 소문자의 문자 코드값의 관계
//		**문자코드: 소문자-대문자 = 32
		
		System.out.print("문자 입력: ");
		//system.in.read는 int(문자코드)를 반환하므로, char로 형변환하여 변수에 저장.
		char lowerCase = (char)System.in.read();	
		
		//소문자 문자코드값을 통해 대문자 문자코드값 계산 후 char로 형변환하여 변수에 저장
		char upperCase = (char)(lowerCase-32);		
		
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.", lowerCase, upperCase);
		
	
		
	}

}
