package com.test.question.controlStatement;

import java.util.Scanner;

public class Q40_SumFor {

	public static void main(String[] args) {
		//시작 숫자: 1 
		//종료 숫자: 10 
		//1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
		
		//m1();
		m2();

	}

	private static void m2() {
		Scanner scan = new Scanner(System.in);

        int sum = 0;
        String txt = "";
        int startNum = 0;
        int endNum = 0;
        
        System.out.print("시작 숫자: ");
		startNum = scan.nextInt();
		System.out.print("종료 숫자: ");
		endNum = scan.nextInt();
		
		for (int i=startNum ; i<=endNum ; i++) {
			if (i % 2 == 1) {
				sum += i;
				if (i!=endNum) {
					txt = txt + i + " - ";
				} else {
					txt = txt+ i;
				}
				
				
			} else if (i % 2 == 0) {
				sum -= i;
				if (i!=endNum) {
					txt = txt + i + " + ";
				} else {
					txt = txt+ i;
				}
			} 
		}
		System.out.printf("%s = %d", txt, sum);
        
		scan.close();
	}

	private static void m1() {
		//연산자를 위한 for문 1개
		//더할 숫자를 위한 for문
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("시작 숫자: ");
		int startNum = scan.nextInt();
		System.out.print("종료 숫자: ");
		int endNum = scan.nextInt();
		
		for (int i=startNum; i<=endNum; i++) {
			System.out.print(i);
			if (i%2==1 && i<endNum) { //홀수 루프일땐 -
				System.out.print(" - ");
				sum -= i;
			} else if (i%2==0 && i<endNum) {
				System.out.print(" + ");
				sum += i;
			} 
			
		}
		System.out.printf(" = %d", sum);
		
		scan.close();
		
	}

}
