package com.test.question;

public class Q10_DigitMethod {

	public static void main(String[] args) {
//		10. 숫자 1개를 전달하면 4자리로 출력하는 메소드를 선언하시오.
//		3항 연산자 - (조건) ? (true 결과) : (false 결과)
				
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
		
	}
	
	public static void digit(int num) { //printf문 안에 3항연산자로 조건문 작성

		
		System.out.printf("%d -> %s\n", num,
				(num<10) ? ("000"+num) : ( 								//조건1) 10보다 작은가?
					(num<100) ? ("00"+num) : ( 							//조건2) 100보다 작은가?
						(num<1000) ? ("0"+num) : (num+"")   )	));		//조건3) 1000보다 작은가?
		
//		if
//		입력받은 숫자(num) <10 / 0을 3개 붙이고
//
//		else if
//		num<100 / 0을 2개
//
//		else if
//		num<1000 / 0을 1개
//
//		else
//		그대로 출력
		
	}

}
