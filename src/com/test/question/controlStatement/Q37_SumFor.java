package com.test.question.controlStatement;

import java.util.Scanner;

public class Q37_SumFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.print("숫자: ");
		int input = scan.nextInt();
		for(int i=1; i<=input; i++) {
			sum += i;
		}
		System.out.printf("1~%d = %d", input, sum);
		scan.close();
	}

}
