package com.test.java;

public class Ex07_Output {

	public static void main(String[] args) {
		System.out.println(100);
		System.out.println(3.14);
		System.out.println('A');
		System.out.println("문자열");

		System.out.print(100);
		System.out.print(3.14);
		System.out.print('A');
		System.out.println("문자열");
		System.out.println();

		// 예제) 성적표 출력하기
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;

		String name2 = "아무개";
		int kor2 = 95;
		int eng2 = 89;
		int math2 = 92;

		System.out.println("==============================");
		System.out.println("           🎶성적표");
		System.out.println("==============================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		System.out.print(name1 + "\t");
		System.out.print(kor1 + "\t");
		System.out.print(eng1 + "\t");
		System.out.println(math1);

		System.out.print(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);

		System.out.println();
		System.out.println();
		System.out.println();

		// printf()
		// 요구사항: "안녕하세요. 홍길동님" 문장을 출력하시오.
		String name = "홍길동"; //사용자에게 입력받은 값이라고 가정하자
		System.out.println("안녕하세요. " + name + "님.");
		System.out.printf("안녕하세요. %s님.\r\n", name);
		
		// 요구사항: "안녕하세요. 홍길동님. 안녕히가세요. 홍길동님. 반가웠습니다. 홍길동님" 문장을 출력하시오.
		System.out.printf("안녕하세요. %s님. 안녕히가세요. %s님. 반가웠습니다. %s님.\r\n", name, name2, name);
		System.out.println("안녕하세요. " + name + "님. 안녕히가세요. " + name +"님. 반가웠습니다. "+name+"님.");
		
		//형식 문자
		System.out.println();
		System.out.printf("문자열: %s\n", "홍길동");
		System.out.printf("정수: %d\n", 100);
		System.out.printf("실수: %f\n", 3.14);
		System.out.printf("문자: %c\n", 'a');
		System.out.printf("논리: %b\n", true);
		System.out.println();

		//형식 문자의 확장기능
		long num = 123;
		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n", num);
		System.out.printf("[%-10d]\n", num);
		
		num = 123456789012345L;
		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n", num);
		System.out.printf("[%-10d]\n", num);
		
		double num2 = 3.14;
		System.out.println(num2);
		System.out.printf("%f\n", num2);
		System.out.printf("%.2f\n", num2);
		System.out.printf("%.1f\n", num2);
		System.out.printf("%.0f\n", num2);
		
		num2 = 3.15;
		System.out.println(num2);
		System.out.printf("%f\n", num2);
		System.out.printf("%.2f\n", num2);
		System.out.printf("%.1f\n", num2);
		System.out.printf("%.0f\n", num2); //반올림 신경써야함...
		
		int price = 1234567;
		System.out.printf("금액: %d원\n", price);
		System.out.printf("금액: %,d원\n", price);
		
		//천단위+소수이하(2자리)+출력너비(20자리, 우측정렬)
		double num3 = 1234567.89012345;
		System.out.printf("[%f]\n", num3);
		System.out.printf("[%,20.2f]\n", num3);
		
		//메뉴판 출력 -> 열 정렬 -> 탭문자+형식문자 조합
		System.out.println("========================");
		System.out.println("  음료 가격(단위: 원)");
		System.out.println("========================");
		System.out.printf("콜라: \t\t%,6d\n", 2500);
		System.out.printf("스무디: \t%,6d\n", 3500);
		System.out.printf("사이다: \t%,6d\n", 500);
		System.out.printf("아메리카노: \t%,6d\n", 15000);
		
	}

}
