package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q23_DadDateTime {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//23. 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
		Calendar dadBday = Calendar.getInstance();
		Calendar girlBday = Calendar.getInstance();
		
		getBDay(dadBday, girlBday);
		
	}

	public static void getBDay(Calendar dadBday, Calendar girlBday) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아빠 생일(년): ");
		int dadYear = Integer.parseInt(reader.readLine());
		
		System.out.print("아빠 생일(월): ");
		int dadMonth = Integer.parseInt(reader.readLine())-1;
		
		System.out.print("아빠 생일(일): ");
		int dadDay = Integer.parseInt(reader.readLine());
		
		dadBday.set(dadYear, dadMonth, dadDay);
		
		
		System.out.print("딸 생일(년): ");
		int girlYear = Integer.parseInt(reader.readLine());
		
		System.out.print("딸 생일(월): ");
		int girlMonth = Integer.parseInt(reader.readLine())-1;
		
		System.out.print("딸 생일(일): ");
		int girlDay = Integer.parseInt(reader.readLine());
		
		girlBday.set(girlYear, girlMonth, girlDay);
		
		long tick = girlBday.getTimeInMillis() - dadBday.getTimeInMillis();
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.", tick/1000/60/60/24);
	}

}
