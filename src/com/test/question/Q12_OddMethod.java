package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12_OddMethod {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//12. 숫자를 전달하면 '짝수' 혹은 '홀수' 라는 단어를 반환하는 메소드를 선언하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자: ");
		int n = Integer.parseInt(reader.readLine());	//사용자에게 입력받은 값을 int n에 저장...
		String result = getNumber(n);	//1) getNumber()로 넘어간다.(대입연산자의 연산방향: R->L이므로..)
										//2) getNumber에서 "홀수"라는 값이 리턴되어, result에 저장.
		
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result); //결과출력

	}

	private static String getNumber(int n) {
		String text = "";
		text = (n%2 == 1) ? "홀수" : "짝수"; 	//n%2 값으로 홀짝 구별. 나머지가 1이면 홀수
		
		return text; //n=5라면.. "홀수"라는 값을 가지고 메인메서드로 돌아감.
		
	}

}
