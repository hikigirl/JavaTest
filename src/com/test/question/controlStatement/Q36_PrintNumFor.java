package com.test.question.controlStatement;

import java.util.Scanner;

public class Q36_PrintNumFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		int startNum = scan.nextInt();
		System.out.print("종료 숫자: ");
		int endNum = scan.nextInt();
		System.out.print("증감치: ");
		int gap = scan.nextInt();
		
		for (int i=startNum; i <=endNum ; i+=gap) {
			System.out.println(i);
		}
		scan.close();
	}

}
