package com.test.question.controlStatement;

import java.util.Scanner;

public class Q39_SumFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("시작 숫자: ");
		int startNum = scan.nextInt();
		System.out.print("종료 숫자: ");
		int endNum = scan.nextInt();
		
		
		for (int i=startNum; i<=endNum; i++) {
			if (i < endNum) {
				System.out.printf("%d + ", i);
				sum += i;
			} else {
				System.out.printf("%d = ", i);
				sum += i;
			}
		}
		System.out.print(sum);
		scan.close();
	}

}
