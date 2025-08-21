package com.test.question.controlStatement;

import java.util.Random;
import java.util.Scanner;

public class Q43_RandomNumFor {

	public static void main(String[] args) {
		//43. 컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int num = rnd.nextInt(1,11); //1~10사이의 난수 생성
		int answer = 0;
		int i = 1; //i를 for문이 아니라 여기서 초기화
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		System.out.println(num);
		for (;i<=10;i++) { // i를 이미 초기화했으므로 적지 않음
			System.out.print("숫자: ");
			answer = scan.nextInt();
			if (num==answer) { 
				System.out.println("맞았습니다.\n");
				break;
			} else {	
				System.out.println("틀렸습니다.\n");
			}
		}
		
		if (num==answer) {
			System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", num);
			System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n\n", i);
			System.out.println("프로그램을 종료합니다.");
			
		} else {
			System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", num);
			System.out.println("모든 기회를 실패했습니다.\n");
			System.out.println("프로그램을 종료합니다.");
		}

		
		scan.close();

	}

}
