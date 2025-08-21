package com.test.question.controlStatement;

public class Q41_SumFor {

	public static void main(String[] args) {
		//누적값이 1000을 넘어가는 순간 루프를 종료하시오.
		int i = 1;
		int sum = 0;
		
		while (true) {
			sum += i;
			
			System.out.print(i);
			
			if (sum<=1000) {
				System.out.print(" + ");
			}
			
			i++;
			if (sum > 1000) {
				System.out.print(" = " + sum);
				break;
			}
		}

	}

}
