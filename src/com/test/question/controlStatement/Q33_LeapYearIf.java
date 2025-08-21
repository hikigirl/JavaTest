package com.test.question.controlStatement;

import java.util.Scanner;

public class Q33_LeapYearIf {

	public static void main(String[] args) {
		//33. 윤년 검사
		String leap = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력: ");
		int year = scan.nextInt();
		
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = "윤년";
				} else {
					leap = "평년";
				}
			} else {
				leap = "윤년"; 
			}
		} else {
			leap = "평년";	
		}
		System.out.printf("%d년은 '%s'입니다.", year, leap);
		scan.close();
	}
}
