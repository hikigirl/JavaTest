package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15_AppleMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//15. 사과 나무가 있다. 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때
		//	  사과 총 몇개가 열리는지 구하는 메소드를 선언하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("맑은 날: ");
		int sunny = Integer.parseInt(reader.readLine());
		System.out.print("흐린 날: ");
		int foggy = Integer.parseInt(reader.readLine());
		
		int appleAmount = getApple(sunny, foggy);
		System.out.printf("사과가 총 %d개 열렸습니다.", appleAmount);
	}
	public static int getApple(int sunny, int foggy) {
		//나무높이가 101일때 1개.. 102일때 2개..
		int treeHeight = 0;
		int appleAmount = 0;
		
		treeHeight = (sunny*5) + (foggy*2);
		appleAmount = (treeHeight>=100) ? (treeHeight-100)/10 : 0;
		
		return appleAmount;
		
	}

}
