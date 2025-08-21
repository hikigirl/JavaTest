package com.test.java;

public class Ex03_Variable {

	public static void main(String[] args) {
		
//		1. 변수 생성하기
//		 - 자료형 변수명;
		System.out.println(200);
		
		byte 국어;
		byte 영어;
		byte 수학;
		
//		2. 변수 초기화
//		 - 변수명 = 값;
//		 - =(등호) -> 대입, 할당 연산자
		국어 = 100;
		
//		3. 변수 사용
//		 - 출력, 연산, 조건, 기록, 전송 등
//		 - 변수명
		System.out.println(국어);
		System.out.println(200);
		
//		4. 변수 치환
//		 - 변수명 = 값;
		국어 = 97;
		System.out.println(국어);
		
//		변수명 만들 때의 규칙
//		1. 영문자 + 숫자 + ‘ _ ‘를 사용한다. (관습)
		byte 사회;
		byte eng1;
		byte eng2; //변수명 뒤에 숫자 붙이기.. 의미를 명확히 알 수 없어서 비추
		
		byte english_score; //식별자에는 공백을 사용할 수 없다. 대신 _ 사용
		
//		2. 숫자로 시작 불가능. 숫자데이터와 혼동되어서..
		//byte 4eng;
		byte _4eng; //굳이..
		
//		3. 예약어(키워드) 사용 불가능
		//byte byte;
		
//		4. 의미 있게(****) 변수만으로 뭔지 알아볼 수 있게, 다른사람들과 소통이 가능하게..
//		요즘에는 툴이 발전했기때문에(자동완성 등등..) 풀네임으로 많이 씀
		byte a;
		byte b; // 권장x
		
		byte eng_score;
		byte korean_score;
		
		korean_score = 100;
		
//		변수 선언하는 방식
		byte n1;	//변수 선언
		n1 = 100;	//변수 초기화
		
		byte n2 = 50; //변수 선언과 초기화를 한번에
		
		byte n3;
		byte n4;
		
		byte n5, n6; //그룹 선언
		
		byte n7 = 10, n8 = 20, n9, n10;
		
		//지도 -> 좌표(x, y)
		double x1; //우리집 x좌표
		double y1; //우리집 y좌표
		
		double x2, y2; //친구집 x좌표, 친구집 y좌표
		double x3,		//마트 x좌표 
			    y3;		//마트 y좌표
		
		//편집기 작업 중 빨간 밑줄이 생기는에러 -> 컴파일 에러
		byte m1; //할당받은 직후의 변수 상태 > null값, 직접적인 사용 불가능. 초기화 해야함
		
//		System.out.println(m1); //변수 초기화 안해서. 에러메세지를 보는 습관을,,
		
//		데이터를 변수에 저장 → 사용 중 가끔 수정하면 안되는 값이 있다.
//		앞에 final을 붙여주면 해결 가능~
//		final을 붙인 변수 = 상수(값이 변하지 않아서)
//		ex) 원의 둘레를 구하시오. → 원주율(파이)
		final double PI=3.14; //3.14(리터럴, literal)
		
//		The final local variable pi cannot be assigned. 
//		It must be blank and not using a compound assignment
		//PI = 6.55;
		
	}

}
