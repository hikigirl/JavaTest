package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex22_Switch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//m1();
		//m2();
		//m3();
		m4();
		
	}

	private static void m4() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("월: ");
		int month = Integer.parseInt(reader.readLine());
		int lastDay = 0;
		
		System.out.println("[if문]");
		if(month>0 && month<13) {
			
			if (month==2) {
				lastDay = 28;
			} else if (month==4 || month==6 || month==9 || month==11) {
				lastDay = 30;
			} else {
				lastDay = 31;
			}
			
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, lastDay);
			
		} else {
			System.out.println("유효한 숫자가 아닙니다.");
		}
		
		//switch문
		System.out.println("[switch문]");
		switch (month) {
			case 2:
				lastDay = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lastDay = 30;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDay = 31;
				break;
			default:
				System.out.println("유효한 숫자가 아닙니다.");
				break;
		}
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, lastDay);
		
		
	}

	private static void m3() throws NumberFormatException, IOException {
		//사용자로부터 월(1~12월) 입력받아 해당월의 마지막 일을 출력하시오.
		//월: 5
		//출력: 5월은 31일까지 있습니다.
		//if문, switch문
//		1/31  3/31  5/31 7/31 8/31 10/31 12/31
//		4월 6월 9월 11월 30
//		2/28
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("월: ");
		int month = Integer.parseInt(reader.readLine());
		
		//if문
		System.out.println("[if문]");
		if(month>0 && month<13) {
			
			if (month==2) {
				System.out.printf("%d월은 28일까지 있습니다.\n", month);
			} else if (month==4 || month==6 || month==9 || month==11) {
				System.out.printf("%d월은 30일까지 있습니다.\n", month);
			} else {
				System.out.printf("%d월은 31일까지 있습니다.\n", month);
			}
			
		} else {
			System.out.println("유효한 숫자가 아닙니다.");
		}
		
		//switch문
		System.out.println("[switch문]");
		switch (month) {
			case 2:
				System.out.printf("%d월은 28일까지 있습니다.\n", month);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.printf("%d월은 30일까지 있습니다.\n", month);
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.printf("%d월은 31일까지 있습니다.\n", month);
				break;
			default:
				System.out.println("유효한 숫자가 아닙니다.");
				break;
		}
		
		
	}

	private static void m2() throws IOException {
		//요구사항) 자판기
		// - 메뉴 출력 -> 음료 선택 -> 가격 출력
		// - 가격 변동 -> 앞으로 계속 콜라와 사이다는 가격을 동일하게 판매
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("=========");
		System.out.println(" 자판기");
		System.out.println("=========");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("---------");
		System.out.print("선택: ");
		String input = reader.readLine();
		
		
		//if문으로 구현
//		if(input.equals("1")|| input.equals("2") || input.equals("3")) { //숫자가 아니라서 범위로 비교 불가
//			if (input.equals("1")) {
//				System.out.println("700원입니다.");
//			} else if (input.equals("2")) {
//				System.out.println("700원입니다.");
//			} else if (input.equals("3")) {
//				System.out.println("500원입니다.");
//			}
//		} else {
//			System.out.println("선택한 음료는 없습니다.");
//		}
		
		if (input.equals("1")||input.equals("2")) {
			System.out.println("700원입니다.");
		} else if (input.equals("3")) {
			System.out.println("500원입니다.");
		}
		
		//switch case문으로 구현
//		switch (input) {
//			case "1":
//				System.out.println("700원입니다.");
//				break;
//			case "2":
//				System.out.println("700원입니다.");
//				break;
//			case "3":
//				System.out.println("500원입니다.");
//				break;
//			default:
//				System.out.println("선택한 음료는 없습니다.");
//				break;
//		}
		
		switch (input) {
		case "1":		//if문에서 조건을 or로 묶은것과 동일한 역할
		case "2":
			System.out.println("700원입니다.");
			break;
		case "3":
			System.out.println("500원입니다.");
			break;
		default:
			System.out.println("선택한 음료는 없습니다.");
			break;
		}
		
		
	}

	private static void m1() throws NumberFormatException, IOException {
		//요구사항: 숫자 1개 입력 -> 한글로 출력
		//1-> 하나, 2-> 둘...
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자를 입력하세요: ");
		int num = Integer.parseInt(reader.readLine());
		
		//if문으로 작성해보기
		if (num == 1) {
			System.out.println("하나");
		} else if (num == 2) {
			System.out.println("둘");
		} else if (num == 3) {
			System.out.println("셋");
		} else {
			System.out.println("나머지 숫자");
		}
		
		//switch문으로 작성해보기
		//Cannot switch on a value of type boolean.
		//Only convertible int values, strings or enum variables are permitted
		switch(num) {		//num값과 일치하는 case를 찾아가서 실행함
			case 1:
				System.out.println("하나");
				break;		//break의 의미: switch절을 빠져나가라
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			default:		//if문에서 else와 같은 역할
				System.out.println("나머지 숫자");
				break;
		}
		
	}

}
