package com.test.question.controlStatement;

import java.util.Scanner;

public class Q49_StarFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("행 :");
		int lines = scan.nextInt();
		
		for (int i=0;i<lines;i++) {
			for (int j=i;j>0;j--) {
				System.out.print(" ");
				
			}
			for (int j=lines-i;j>0;j--) {
				System.out.print("*");
				
			}
			System.out.print("\n");
			
		}
		
		
		scan.close();
	}

}
