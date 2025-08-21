package com.test.question.controlStatement;

import java.io.IOException;

public class Q27_CharacterIf {

	public static void main(String[] args) throws IOException {
		//27. 문자 1개를 입력받아 아래와 같이 출력하시오.
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자:");
		int userChar = System.in.read();
		
		//System.out.println(userChar);
		
		//F: 70 / M: 77 / S: 83 / B: 66
		//소문자 문자코드는 여기에 32씩 더한거
		//(userChar == 70 || userChar == 77 || userChar == 83 || userChar == 66
		//userChar ==103 || userChar == 109 || userChar == 115 || userChar ==98)
		if (userChar == 70 || userChar == 102) {
			System.out.println("Father");
		} else if (userChar == 77 || userChar == 109) {
			System.out.println("Mother");
		} else if (userChar == 83 || userChar == 115) {
			System.out.println("Sister");
		} else if (userChar == 66 || userChar == 98) {
			System.out.println("Brother");
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		
		
	}

}
