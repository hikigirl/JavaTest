package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11_CalcMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//11. 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String result = "";
		
		System.out.print("첫번째 숫자: ");
		int n1 = Integer.parseInt(reader.readLine());
		System.out.print("두번째 숫자: ");
		int n2 = Integer.parseInt(reader.readLine());//사용자에게 값 2개 입력받아 int타입으로 n1, n2에 저장.
		
		
		result = add(n1, n2);
		System.out.println(result);
		
		result = subtract(n1, n2);
		System.out.println(result);
		
		result = multiply(n1, n2);
		System.out.println(result);
		
		result = divide(n1, n2);
		System.out.println(result);
		
		result = mod(n1, n2);
		System.out.println(result);
		
		
	}

	private static String add(int n1, int n2) {
		
		String text = n1 + " + " + n2 + " = " + (n1+n2);
		//System.out.printf("%d + %d = %d\n", n1, n2, result); //이렇게 말고..
		return text;
	
	}
	
	private static String subtract(int n1, int n2) {
		String text = n1 + " - " + n2 + " = " + (n1-n2);
		return text;
		
	}
	
	private static String multiply(int n1, int n2) {
		String text = n1 + " * " + n2 + " = " + (n1*n2);
		return text;
		
	}
	
	private static String divide(int n1, int n2) {
		double div = (double)n1/n2;
		String text = n1 + " / " + n2 + " = " + div;
		return text;
		
		//소수점 첫째자리까지 하는건...몰겟음
		//정답지에는 String.format() 사용하라고 되어있음~
		
	}
	
	private static String mod(int n1, int n2) {
		double mod = (double)n1 % n2;
		String text = n1 + " % " + n2 + " = " + mod;
		return text;
		
	}



}
