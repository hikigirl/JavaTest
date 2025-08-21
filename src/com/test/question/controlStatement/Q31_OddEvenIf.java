package com.test.question.controlStatement;

import java.util.Scanner;

public class Q31_OddEvenIf {

	public static void main(String[] args) {
		//31. 숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
		Scanner scan = new Scanner(System.in);
		
		//홀수 누적변수 odd, 짝수 누적변수 even
		int odd = 0;
		int even = 0;
		
		for (int i=0 ; i<5 ; i++) {
			System.out.print("숫자 입력: ");
			int num = scan.nextInt();
			if (num % 2 == 1) {
				odd++;
			} else {
				even++;
			}
		}
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, odd);
		if (even<odd) {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", odd-even);
		} else {
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.", even-odd);
		}
		
		scan.close();
	}

}
