package com.test.question.controlStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q28_WorkYearIf {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//28. 근무 년수를 입력받아 아래와 같이 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("근무 년수: ");
		int years = Integer.parseInt(reader.readLine());
		
		if (years>0) {
			if (years<=4) {
				System.out.printf("%d년차 초급 개발자입니다.\n", years);
				System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\n", 5-years);
			} else if (years<=9) {
				System.out.printf("%d년차 중급 개발자입니다.\n", years);
				System.out.printf("당신은 %d년 전까지 초급 개발자였습니다.\n", years-4);
				System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n", 10-years);
			} else {
				System.out.printf("%d년차 고급 개발자입니다.\n", years);
				System.out.printf("당신은 %d년 전까지 중급 개발자였습니다.\n", years-9);
			}
		} else {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
		}

	}

}
