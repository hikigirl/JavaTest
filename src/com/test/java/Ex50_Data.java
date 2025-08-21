package com.test.java;

import java.util.Random;

public class Ex50_Data {

	public static void main(String[] args) {
		
		//m1();
		m2();
	}

	private static void m2() {
		//더미 데이터 만드는 방법
		
		//학생 관리 프로그램
		// 1. 중학교
		// 2. 1학년~3학년 -> 1학년
		// 3. 학급 1~10반 -> 1학년 1반
		// 4. 1학급당 30명
		// 5. 이름, 나이, 성별, 주소, 국어, 영어, 수학
		
		Random rnd = new Random();
		
		String[] name1 = {"김", "이", "박", "최", "정", "유", "민", "차", "장", "조"};
		String[] name2 = {"길", "동", "재", "석", "명", "수", "세", "원", "호", "미", "주", "이", "경", "현", "탁"};
		String[] address1 = {"서울시", "인천시", "부산시", "강릉시", "대구시", "광주시", "제주시"};
		String[] address2 = {"강남구", "강동구", "강북구", "강서구", "중구"};
		String[] address3 = {"역삼동", "대치동", "압구정동", "신림동", "천호동", "길동"};
		
		//인원수만큼 루프
		for (int i=0; i<30; i++) {
			//이름
			String name = name1[rnd.nextInt(name1.length)]
						+ name2[rnd.nextInt(name2.length)]
						+ name2[rnd.nextInt(name2.length)];
			//나이
			int age = rnd.nextInt(2) + 13; //13살~14살(중1이니까)
			//성별
			String gender = rnd.nextInt(2) == 0 ? "남자" : "여자";
			
			//주소
			String address = address1[rnd.nextInt(address1.length)] + " "
							+ address2[rnd.nextInt(address2.length)] + " "
							+ address3[rnd.nextInt(address3.length)] + " "
							+ (rnd.nextInt(300) + 100) + "번지";
			
			System.out.printf("%s(%d세, %s) %s\n",name, age, gender, address);
		}
		
		
	}

	private static void m1() {
		//난수 만들기
		//1. Math.random()
		//2. Random 클래스
		
		//System.out.println(Math.random()); //0~1 사이의 난수
		//System.out.println((int)Math.random() * 10 + 1); // 1~10 사이의 난수
		
		Random rnd = new Random();
		
		
		for (int i=0; i<10; i++) {
			//System.out.println(rnd.nextInt());
			//System.out.println(rnd.nextDouble()); //Math.random()과 동일
			//System.out.println(rnd.nextBoolean());
			System.out.println(rnd.nextInt(10)); //1~10까지의 난수
		}
		
		
	}

}
