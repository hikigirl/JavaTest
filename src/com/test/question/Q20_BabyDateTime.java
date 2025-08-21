package com.test.question;

import java.util.Calendar;

public class Q20_BabyDateTime {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.printf("태어난 날짜: %tF\n", now);
		now.add(Calendar.DATE, 100);
		System.out.printf("백일: %tF\n", now);
		
		now = Calendar.getInstance();
		now.add(Calendar.DATE, 365);
		System.out.printf("첫돌: %tF", now);

	}

}
