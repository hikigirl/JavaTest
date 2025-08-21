package com.test.question.controlStatement;

import java.util.Calendar;
import java.util.Scanner;

public class Q32_ParkingIf {

	public static void main(String[] args) {
		//32. 주차 요금을 계산하시오
		// 무료주차 30분, 초과 10분당 2000원
		
		getTime();
		
		System.out.println();
		
		
	}

	public static void getTime() {
		
		int inHour = 0;
		int inMin = 0;
		
		int outHour = 0;
		int outMin = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("[들어온 시간]\n");
		System.out.print("시: ");
		inHour = scan.nextInt();
		System.out.print("분: ");
		inMin = scan.nextInt();
		
		System.out.println();
		
		System.out.print("[나간 시간]\n");
		System.out.print("시: ");
		outHour = scan.nextInt();
		System.out.print("분: ");
		outMin = scan.nextInt();
		
		calcTime(inHour, inMin, outHour, outMin);
		
		scan.close();
	}
	
	public static void calcTime(int inHour, int inMin, int outHour, int outMin) {
		Calendar now = Calendar.getInstance();
		long inTime = 0;
		long outTime = 0;
		int diffTime = 0;
		int parkingCharge = 0;
		
		now.set(Calendar.HOUR_OF_DAY, inHour);
		now.set(Calendar.MINUTE, inMin);
		inTime= now.getTimeInMillis();
		
		now = Calendar.getInstance();
		now.set(Calendar.HOUR_OF_DAY, outHour);
		now.set(Calendar.MINUTE, outMin);
		outTime= now.getTimeInMillis();
		
		diffTime = (int)(outTime - inTime)/1000/60; //밀리초를 분단위로 계산해야함..
		
		if (diffTime > 30) {
			parkingCharge = (diffTime-30) * 200; //초과 10분당 2천원, 1분당 200원이라서 나누기10
		} else {
			parkingCharge = 0;
		}
		
		System.out.printf("주차요금은 %,d원입니다.", parkingCharge);
		
	}

}
