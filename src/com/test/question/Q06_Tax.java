package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06_Tax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		06. 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.

//		세후금액 = 한달수입-세금
//		세금 = 한달수입*0.033
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("한달 수입 금액(원): ");
		int salary = Integer.parseInt(reader.readLine()); //salary라는 변수에 사용자가 입력한 값 넣기
		
		double tax = salary * 0.33;
		//salary-tax, tax
		System.out.printf("세후 금액(원) : %,.0f원\n세금(원) : %,.0f원\n", salary-tax, tax);
		


	}

}
