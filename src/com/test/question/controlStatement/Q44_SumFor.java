package com.test.question.controlStatement;

import java.util.Scanner;

public class Q44_SumFor {

	public static void main(String[] args) {
		//44. 숫자를 N개 입력받아 아래와 같이 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0; //사용자에게 입력받을 변수
		int sum = 0; //누적 변수
		String txt = "";
		
		while (true) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				sum += num;
				txt = txt + " + " + num;
			} else {
				sum -= num;
				txt = txt + " - " + num;
			}
			
			if (sum > 100) {
				System.out.printf("%s = %d", txt, sum);
				break;
			}
		}
		
		scan.close();
	}

}
