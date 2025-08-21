package com.test.question.controlStatement;

import java.util.Arrays;
import java.util.Scanner;

public class Q46_SumFor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNum = 0;
		
		System.out.print("숫자 입력: ");
		inputNum = scan.nextInt();
		int[] number = new int[9];
		//10의 배수로 나눠서 홀짝 확인
		
		
		for (int i=1; i<=10000000; ) {
			for (int j=8; j>=1; j--) {
			//for (int j=0; j<9; j++) {
				number[j-1] = inputNum % (i * j);
				System.out.println(i);
				i = i*10;
				System.out.println(number[j]);
				System.out.println("i*10: " + i);
				System.out.println(j);
				System.out.println();
			}
			
		}
		System.out.println(Arrays.toString(number));
		
		
		scan.close();
	}
}
