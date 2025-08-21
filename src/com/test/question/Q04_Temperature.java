package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04_Temperature {

	public static void main(String[] args) throws IOException {
//		05. 섭씨 온도를 입력받아서 화씨 온도로 변환하시오.

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //ctrl+shift+o 눌러서 import
		
		System.out.print("섭씨(℃): ");
		String userCelsius = reader.readLine();
		
		double celsius = Double.parseDouble(userCelsius);
		double faren = celsius * 1.8 + 32;

		System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.", celsius, faren);
		
	}

}
