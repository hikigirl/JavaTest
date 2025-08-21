package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13_ScoreMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//13. 국어, 영어, 수학 점수를 전달하면 
		//'합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어: ");
		int kor = Integer.parseInt(reader.readLine());
		
		System.out.print("영어: ");
		int eng = Integer.parseInt(reader.readLine());
		
		System.out.print("수학: ");
		int math = Integer.parseInt(reader.readLine());
		//여기까지의 부분도 메서드로 만들 수 잇겟지..??
		
		
		String testScore = test(kor, eng, math);
		System.out.printf("%s입니다.", testScore);
		
		
		
	}
	
	public static String test(int kor, int eng, int math) {
		String result = "";
		int avg = (kor+eng+math)/3;
		
		//조건
		//평균점수 60점미만 or 한과목이라도 40점미만 -> 불합격.
		result = ((kor<40)||(eng<40)||(math<40)) 
				? "불합격"									//1차로 과락을 확인..
				: (avg<60) ? "불합격" : "합격";				//평균 점수를 확인..
				// 이거처럼 나눠쓰는게 코드 유지보스 차원에서 더 낫긴함... 결과는 똑같은듯?
		
		//원래 조건문
			//result = ((kor<40)||(eng<40)||(math<40)||(avg<60)) ? "불합격" : "합격";
		
		return result; //최종적으로 string 타입, 합격불합격을 담고 메인메서드로 가야된다..
		
		
	}
	
}
