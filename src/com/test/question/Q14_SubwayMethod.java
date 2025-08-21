package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14_SubwayMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//14.지하철 탑승 소요 시간을 구하시오.
		//지나가는 역의 개수, 환승역의 횟수, 시간대를 전달 받아
		//총 걸리는 시간을 반환하는 메소드를 선언하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("역의 개수: ");
		int station = Integer.parseInt(reader.readLine());
		System.out.print("환승역의 개수: ");
		int change = Integer.parseInt(reader.readLine());
		System.out.print("시간대(1. 평상시, 2. 출근시, 3. 퇴근시): ");
		int time = Integer.parseInt(reader.readLine());
		
		
		
		int total = getTime(station, change, time);
		System.out.printf("총 소요시간은 %d분입니다.", total);

	}

	private static int getTime(int station, int change, int time) {
//		평상시: 3분
//		출근시: 4분
//		퇴근시: 5분
//		을 change랑 곱해야함
		int changeTime = (time == 1) ? change * 3 : ((time==2)? change * 4 : change*5);
		//System.out.println(changeTime);
		int total = station * 2 + changeTime;
		
		return total;
	}

}
