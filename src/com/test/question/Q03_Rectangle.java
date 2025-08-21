package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03_Rectangle {

	public static void main(String[] args) throws IOException {
//		3. 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
//		- 사각형 넓이 = 너비 * 높이
//		- 사각형 둘레 = 너비 * 2 + 높이 * 2
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//너비와 높이를 사용자에게 입력받아 각각의 변수에 문자열로 저장
		System.out.print("너비(cm): ");
		String userWidth = reader.readLine();
		
		System.out.print("높이(cm): ");
		String userHeight = reader.readLine();
		
		//입력받은 문자열을 정수로 변환
		int width = Integer.parseInt(userWidth);
		int height = Integer.parseInt(userHeight);
		
		//결과값을 출력
		System.out.printf("사각형의 넓이는 %d㎠입니다.\n",width*height);
		System.out.printf("사각형의 둘레는 %dcm입니다.",(width+height)*2);
		
		
	}

}
