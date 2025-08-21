package com.test.question.controlStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q29_CalcIf {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//29. 숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자: ");
		int val1 = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자: ");
		int val2 = Integer.parseInt(reader.readLine());
		
		System.out.print("연산자: ");
		String operator = reader.readLine();
		
		if (operator.equals("+")) {
			//덧셈 메소드
			plus(val1, val2, operator);
		} else if (operator.equals("-")) {
			//뺄셈
			minus(val1, val2, operator);
		} else if (operator.equals("*")) {
			//곱셈
			multiply(val1, val2, operator);
		} else if (operator.equals("/")) {
			//나누기
			divide(val1, val2, operator);
		} else if (operator.equals("%")) {
			//나머지
			mod(val1, val2, operator);
		} else {
			System.out.println("연산이 불가능합니다.");
		}
		
	}

	private static void plus(int val1, int val2, String operator) {
		System.out.printf("%d %s %d = %d\n", val1, operator, val2, val1+val2);
	}

	private static void minus(int val1, int val2, String operator) {
		System.out.printf("%d %s %d = %d\n", val1, operator, val2, val1-val2);
	}

	private static void multiply(int val1, int val2, String operator) {
		System.out.printf("%d %s %d = %d\n", val1, operator, val2, val1*val2);
	}

	private static void divide(int val1, int val2, String operator) {
		System.out.printf("%d %s %d = %d\n", val1, operator, val2, val1/val2);
	}

	private static void mod(int val1, int val2, String operator) {
		System.out.printf("%d %s %d = %d\n", val1, operator, val2, val1%val2);
	}

	
	

}
