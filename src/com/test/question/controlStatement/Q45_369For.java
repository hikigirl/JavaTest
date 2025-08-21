package com.test.question.controlStatement;

import java.util.Scanner;

public class Q45_369For {

	public static void main(String[] args) {
		//45. 사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
		//최대 3자리까지만 입력하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("최대 숫자: ");
		int maxnum = scan.nextInt();
		
		if (maxnum < 1000) {
			for (int i=1; i<=maxnum; i++) {
				System.out.print(threeSixNine(i) + " ");
			}
			System.out.println();
			
		} else {
			System.out.println("최대 3자리까지만 입력하시오.");
		}
		
		scan.close();

	}

	private static String threeSixNine(int i) {
		int j = i;
		String txt = "";
		
		for (; j>0; ) {
			//System.out.print(i + " ");
			if (i % 10 % 3 ==0 && i % 10 != 0) {
				txt += "짝";
				//System.out.println(txt);
			}
			j = j/10;
		}
		if (txt.equals("")) {
			return i + "";
		} else {
			return txt;
		}
	}
	

}
