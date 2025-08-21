package com.test.java;

import java.util.Calendar;

public class Ex24_Calendar {

	public static void main(String[] args) {

		// 달력 만들기
		// 1. 해당 년월의 마지막 일
		// 2. 해당 년월의 1일의 요일

//		int year = 2025;
//		int month = 2;
//		
//		printCalendar(year, month);
		
		//다이어리
//		for (int i=1; i<=12; i++) {
//			printCalendar(2025, i);
//			System.out.println();
//			System.out.println();
//		}
		
		//이번달 달력을 자동으로 출력.
		Calendar now = Calendar.getInstance();
		
		printCalendar(now.get(Calendar.YEAR)
					, now.get(Calendar.MONTH)+1);
		
		
		
//		단위 테스트 -> 중요!!
//		- 테스트 코드
//		System.out.println(isLeafYear(year));
//		System.out.println(isLeafYear(2024));
//		System.out.println(getLastday(year, month));
//		System.out.println(getLastday(year, 5));
//		System.out.println(getLastday(year, 2));
		
		
	}

	private static void printCalendar(int year, int month) {
		
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);
		
		System.out.println("======================================================");
		System.out.printf("                     %d년 %02d월\n", year, month);
		System.out.println("======================================================");
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");
		
		for (int i=1; i<=dayOfWeek ; i++) {
			System.out.print("\t");
		}
		
		for (int i=1; i<=lastDay; i++) {
			System.out.printf("%3d\t", i);
			
			//토요일마다 엔터(5월)
			if ((i+dayOfWeek)%7 == 0) {
				System.out.println();
			}
			
		}
		
	}

	
	private static int getDayOfWeek(int year, int month) { //6월 1일의 요일 구하는 메서드
		//서기 1년 1월 1일 ~ 2025년 6월 17일
		int sum = 0; //누적변수
		
		//1. 1년 1월 1일~24년 12월 31일 (1년 365일)
		for (int i=1; i<year; i++) {
			sum+=365;
			
			if (isLeafYear(i)==true) {
				sum++;
			}
		}
		
		//2. 2025.01.01~2025.05.31 (1달씩)
		for (int i=1; i<month; i++) {
			sum += getLastDay(year, i);
		}
		
		//3. 2025년 6월 1일
		sum += 1;
		
		return sum % 7; //6월 1일은 일요일
	}

	private static int getLastDay(int year, int month) {

		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return isLeafYear(year) ? 29 : 28; //boolean 값을 돌려주는 메서드는 보통 is로 시작...
		}
		
		return 0;
	}

	private static boolean isLeafYear(int year) { //윤년인지 판단하는 메서드
		if (year%4 == 0) {
			if (year%100 == 0) {
				if (year%400 == 0) {
					return true;		//true이면 윤년
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
		
	}

}
