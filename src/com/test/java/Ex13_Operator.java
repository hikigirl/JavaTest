package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_Operator {
	
	public static void main(String[] args) throws IOException {
		//비교 연산자
		int a = 10;
		int b = 3;
		System.out.println(a>b); //true
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//요구사항] 사용자 나이 입력, 19세 이상 통과, 거절
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //ctrl+shift+O 눌러서 필요한거 임포트
//		System.out.print("나이: ");
//		String input = reader.readLine(); //사용자에게 값을 입력받아 input에 저장
//		int age = Integer.parseInt(input); //"20" -> 20
//		
//		System.out.println(age>=19);	//좋은 코드(가독성)
//		System.out.println(19<=age);	//가독성 별로.. 주체(age)가 앞에 오는 게 좋음
		
		
		// ==, !=
		System.out.println(10 > 3);
		System.out.println(10 == 3);
		System.out.println(10 != 3);
		
		//System.out.println("홍길동" > "아무개"); //실행 안됨
//		The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
		System.out.println("홍길동" == "아무개");
		System.out.println("홍길동" == "홍길동");
		System.out.println("홍길동" != "아무개");
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3); //s1, s2, s3 모두 "홍길동"
		
		System.out.println(s1 == s2); //true
		System.out.println(s1 == s3); //false임에 주의
		
		//문자열(String)끼리의 비교는 ==, != 연산자를 무조건 사용하면 안된다.
		//문자열끼리의 비교는 equals() 메서드를 사용한다(연산자 사용x) -> 더 안전함
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
		
		//논리 연산자(&&, ||, !)
		boolean f1 = true;
		boolean f2 = false;
		System.out.println(f1 && f2);
		System.out.println(f1 || f2);
		System.out.println(!f1);
		System.out.println(f1 ^ f2);
		
		//나이 입력 > 19세 이상 + 60세 미만
		int age = 25;
//		System.out.println(19<=age<60);
		System.out.println((age>=19) && (age<60));
		
		
		//대입 연산자
		int a1 = 100;
		int a2;
		int a3;
		
		a2 = a1;
		a3 = a1;
		
		a3 = a2 = a1;
		
		
		//복합 대입 연산자
		int n = 10;
		
		//n에 1을 추가하시오. -> n의 값에 1을 더해서 n에 다시 넣어라 -> 누적
		n = n + 1;
		System.out.println(n); //n = 11
		
		n += 1; //n = n + 1
		System.out.println(n); //n = 12
		
		n +=5;
		System.out.println(n); //n = 17
		
		n -= 2;
		System.out.println(n); //n = 15
		
		n *= 2;
		System.out.println(n); //n = 30
		
		n /= 2;
		System.out.println(n); //n = 15
		
		n %= 4;
		System.out.println(n); //n = 3
		
		//증감 연산자
		n = 10;
		System.out.println(n + 1);	//n = 11
		System.out.println(n);		//n = 10(원본)
		
//		n = n + 1;
//		n += 1;
//		++n;
		n++;
		System.out.println(n);		//n = 11
		
		
		n = 10;
		int result = 0;
//		result = 10 + ++n;	//계산순서: ++n (1순위) > 10 + 11(2순위) > 21(3순위)
		
		++n;
		result = 10 + n;	//이렇게 두 줄로 나눠 적는 것이 가독성이 좋음
		
		System.out.println("result: "+result);
		
		n = 10;
		result = 0;
//		result = 10 + n++;	//계산순서: 10 + 10 (1순위) > result에 20을 넣음(2순위) > n++(3순위)
		
		result = 10 + n;
		n++;				//이것도 동일하게 가독성 면에서... 추천
		
		System.out.println("result: "+result);
		System.out.println(n);
		
		//조건 연산자
		n = 10;
		System.out.println(n>0 ? "양수" : "양수 아님");
		
		n = -10;
		System.out.println(n>0 ? "양수" : "양수 아님");
		
		n = 3;
		System.out.println((n % 2 == 0) ? "짝수" : "홀수");
		
		String msg = (n > 0) ? "양수" : "양수 아님"; //B와 C, 변수에 넣을 경우, 출력할 결과값은 자료형이 같아야 함...
		System.out.println(msg);
		
	}
}
