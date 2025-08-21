package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21_If {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//m1();
		//m2();
		//m3();
		m4();
		
	}

	private static void m4() throws IOException {
		//성적(0~100)입력 -> 합격/불합격
		// - 유효성검사(validation)
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("성적: ");
		
		int score = Integer.parseInt(reader.readLine());
		
//		if (score >= 60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		} //이대로.. 사용자가 0~100 범위를 넘어가는 숫자를 입력하면?
		
		
		if (score >= 60 && score <=100) {
			System.out.println("합격");
		} else if(score >= 0 && score < 60) {
			System.out.println("불합격");
		} else {
			System.out.println("점수는 0~100 이내로 입력하세요.");
		}
		
		if (score >= 60 && score <=100) {
			//올바른 입력 -> 성적 처리
			//중첩 if문을 잘 활용하자..
			if (score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}				
		else {
			System.out.println("점수는 0~100 이내로 입력하세요.");
		}
		
	}

	private static void m3() throws IOException {
		//조건문 + 누적연산
		
		int sum = 0; //누적 변수
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1. 어떤 개발툴을 선호합니까?");
		System.out.println("a. 메모장");		//+1
		System.out.println("b. 이클립스");		//+3
		System.out.println("c. 인텔리제이");	//+5
		
		System.out.print("선택: ");
		String seq = reader.readLine();
		
		if (seq.equals("a")) {
			sum += 1;
		} else if (seq.equals("b")) {
			sum += 3;
		} else if (seq.equals("c")) {
			sum += 5;
		}
		
		System.out.println("2. 어떤 프로그래밍 언어를 선호합니까?");
		System.out.println("a. C++");			//+1
		System.out.println("b. Java");			//+3
		System.out.println("c. JavaScript");	//+5
		
		System.out.print("선택: ");
		seq = reader.readLine();
		
		if (seq.equals("a")) {
			sum += 1;
		} else if (seq.equals("b")) {
			sum += 3;
		} else if (seq.equals("c")) {
			sum += 5;
		}
		
		System.out.println("3. 하루에 얼마나 코딩을 합니까?");
		System.out.println("a. 1시간");		//+1
		System.out.println("b. 5시간");		//+3
		System.out.println("c. 10시간");	//+5
		
		System.out.print("선택: ");
		seq = reader.readLine();
		
		if (seq.equals("a")) {
			sum += 1;
		} else if (seq.equals("b")) {
			sum += 3;
		} else if (seq.equals("c")) {
			sum += 5;
		}
		
		System.out.println("설문이 완료되었습니다.");
		System.out.println();
		System.out.println("[결과]");
		if (sum >= 10) {
			System.out.println("당신은 타고난 개발자입니다.");
		} else if (sum >= 5) {
			System.out.println("개발자가 되려면 조금 더 노력하세요.");
		} else {
			System.out.println("다른거 하세요~~");
		}
		
	}

	private static void m1() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		int num = Integer.parseInt(reader.readLine());
		//reader 불러오고 사용자 값 입력받아 int로 변환하는 여기까지의 과정은... 반복되는게 많아서 빨리익히자는
		//걍 고민없이 나올 정도의 코드라는,, ㅠㅠ
		
		/*	조건문의 기본 형태
		 	
		 	if (조건식) {
				문장;
			} else if(조건식) {
				문장;
			} else {
				문장;
			}
		 */
			
		
		
		if (num > 0) {
			//조건을 판단 후 참이라면 해당 블록의 내용을 실행하고 바깥으로 빠져나간다.
			//아니라면~ 그냥 건너뛴다
			System.out.println("num은 양수입니다.");
		} else {
			System.out.println("num은 양수가 아닙니다.");
		}
		
		
		if (num > 0) {
			System.out.println("num은 양수입니다.");
		} else if (num < 0){
			System.out.println("num은 음수입니다.");
		} else {
			System.out.println("num은 0입니다.");
		}
		
		System.out.println("종료");
		
	}

	private static void m2() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("기상 시간(시): ");
		
		int hour = Integer.parseInt(reader.readLine());
		
		//제어문 > 제어의 흐름 > 순서도 그리기
		if (hour < 6) {
			System.out.println("지하철을 타고 출근한다.");
		} else if (hour >= 6 && hour <  7) { //굳이 && 사용 안해도 됨 걍 hour<7 조건만 쓰면됨
			System.out.println("버스를 타고 출근한다.");
		} else if (hour >= 7 && hour < 8) {
			System.out.println("택시를 타고 출근한다.");
		} else {
			System.out.println("병가를 낸다");
		}
		
		if (hour < 6) {
			System.out.println("지하철을 타고 출근한다.");
		} else if (hour <  7) {
			System.out.println("버스를 타고 출근한다.");
		} else if (hour < 8) {
			System.out.println("택시를 타고 출근한다.");
		} else {
			System.out.println("병가를 낸다");
		}
		
		
	}
	
	

}
