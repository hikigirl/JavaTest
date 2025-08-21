package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q21_AgeDateTime {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//21. 태어난 년도를 입력하면 나이를 출력하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도: ");
		int userYear = Integer.parseInt(reader.readLine());
		
		Calendar now = Calendar.getInstance();
		int age = now.get(Calendar.YEAR)+1 - userYear;
		System.out.printf("나이: %d세", age);
	}

}
