package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q24_DeliverDateTime {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//24. 여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다.
		//고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
		
		// 전화를 걸면 짜장면은 10분 뒤에 도착합니다.
		// 전화를 걸면 치킨은 18분 뒤 도착합니다.
		// 전화를 걸면 피자는 25분 뒤 도착합니다.
		// 음식을 받기 원하는 시간은 23시 이전에만 가능합니다.(날짜 변경 금지)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시: ");
		int userHour = Integer.parseInt(reader.readLine());
		System.out.print("분: ");
		int userMinute = Integer.parseInt(reader.readLine());
		
		Calendar userTime = Calendar.getInstance();
		userTime.set(Calendar.HOUR_OF_DAY, userHour);
		userTime.set(Calendar.MINUTE, userMinute);
		
		 //짜장은 usertime - 10분, 치킨은 usertime -18분, 피자는 usertime - 25분...
		userTime.add(Calendar.MINUTE, -10);
		System.out.printf("짜장면: %d시 %d분\n", userTime.get(Calendar.HOUR_OF_DAY), userTime.get(Calendar.MINUTE));
		
		userTime.add(Calendar.MINUTE, -8);
		System.out.printf("치킨: %d시 %d분\n", userTime.get(Calendar.HOUR_OF_DAY), userTime.get(Calendar.MINUTE));
		
		userTime.add(Calendar.MINUTE, -7);
		System.out.printf("짜장면: %d시 %d분\n", userTime.get(Calendar.HOUR_OF_DAY), userTime.get(Calendar.MINUTE));
		
	}

}
