package com.test.question.controlStatement;

import java.util.Scanner;

public class Q38_OddEvenSumFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int evenSum = 0;
		int oddSum = 0;
		int evenCount = 0;
		int oddCount = 0;
		
		System.out.print("입력 횟수: ");
		int inputTimes = scan.nextInt();
		
		
		for (int i=0; i<inputTimes; i++) {
			System.out.print("숫자: ");
			int inputNum = scan.nextInt();
			//System.out.println(inputNum);
			if (inputNum % 2 == 0) {
				evenSum += inputNum;
				evenCount++;
			} else if(inputNum % 2 == 1) {
				oddSum += inputNum;
				oddCount++;
			}
		}
		System.out.printf("짝수 %d개의 합: %d\n", evenCount, evenSum);
		System.out.printf("홀수 %d개의 합: %d\n", oddCount, oddSum);
		scan.close();
	}

}
