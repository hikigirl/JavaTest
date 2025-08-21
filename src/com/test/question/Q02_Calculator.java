package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02_Calculator {

	public static void main(String[] args) throws IOException {
//		02. 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
//		- 출력 숫자에 천단위 표기 하시오.
//		- 결과값은 소수 이하 1자리까지 표기 하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자: ");
		String val1 = reader.readLine();	//사용자로부터 첫번째 숫자를 입력받아 val1의 값으로
		
		System.out.print("두번째 숫자: "); 	
		String val2 = reader.readLine();	//사용자로부터 첫번째 숫자를 입력받아 val2의 값으로
		
		float lVal = Float.parseFloat(val1);
		float rVal = Float.parseFloat(val2); 	//float으로 변환
		
		System.out.printf("%,.1f + %,.1f = %,.1f\n", lVal, rVal, lVal+rVal);
		System.out.printf("%,.1f - %,.1f = %,.1f\n", lVal, rVal, lVal-rVal);
		System.out.printf("%,.1f * %,.1f = %,.1f\n", lVal, rVal, lVal*rVal);
		System.out.printf("%,.1f / %,.1f = %,.1f\n", lVal, rVal, lVal/rVal);
		System.out.printf("%,.1f %% %,.1f = %,.1f\n", lVal, rVal, lVal%rVal);
		
		
	}

}
