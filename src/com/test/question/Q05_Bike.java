package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05_Bike {

	public static void main(String[] args) throws IOException {
//		
//		05. 자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다. 
//			사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
//
//		조건..
//		기어비 1:1 → 페달 1회전 == 자전거 바퀴 1회전
//		모든 출력 숫자는 천단위 표기하시오.
//		입력: 사용자가 페달을 밟은 횟수: 1000 
//
//		출력: 사용자가 총 1,000회 페달을 밟아 자전거가 총 2,074.708m를 달렸습니다.
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("사용자가 페달을 밟은 횟수: ");
		String userPedal = reader.readLine(); 		//페달밟은횟수 입력받아 userPedal에 String으로 저장.
		int pedal = Integer.parseInt(userPedal); 	//String을 int로 변환..??! 이거 원래 안되는디;ㅋㅋ
		double circle = 26*3.14*0.0254;			//바퀴 둘레를 계산해서 circle에 저장
		//double circle2 = (26/39.37)*3.14;
		
		//26인치를 미터로 변환해서 원 둘레(m) 구한 뒤에 *페달 밟은 횟수...
		//26인치 = 0.6604미터(26/39.37)
		
		double result = pedal * circle;				//최종 결과(result): 페달횟수*바퀴둘레
		
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.", pedal, result);
		//최종 값이 2,073.660m 나왔는데... 바퀴 둘레 구할 때 반올림 때문인지?? 
		

	}

}
