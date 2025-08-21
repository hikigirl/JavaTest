package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01_YourAge {

	public static void main(String[] args) throws IOException {
		//01. 태어난 년도를 입력받아 나이를 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("태어난 년도: ");
		String userYear = reader.readLine(); //사용자로부터 입력받은 값 저장할 userYear 변수 생성 및 초기화
		
		//사용자로부터 string 값을 입력받았으므로.. 숫자로 변환해야함
		int yearOut = Integer.parseInt(userYear);
		
		System.out.printf("나이: %d세\n", 2025-yearOut);
		
	}

}
