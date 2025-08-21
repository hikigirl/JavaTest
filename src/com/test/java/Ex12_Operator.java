package com.test.java;

public class Ex12_Operator {
	public static void main(String[] args) {
		//a. 산술연산자
		int a = 10;
		int b = 3;
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);		//몫
		System.out.printf("%d %% %d = %d\n", a, b, a%b);	//나머지, ""안에 % 하나만 쓰면 에러남, %%라고 써야..
		
		double c = 10;
		double d = 3;
		System.out.printf("%.0f + %.0f = %f\n", c, d, c+d);
		System.out.printf("%.0f - %.0f = %f\n", c, d, c-d);
		System.out.printf("%.0f * %.0f = %f\n", c, d, c*d);
		System.out.printf("%.0f / %.0f = %f\n", c, d, c/d);		//몫
		System.out.printf("%.0f %% %.0f = %f\n", c, d, c%d);	//나머지
		
		//리터럴 값을 표현하는 방식
		System.out.println(10);		//정수
		System.out.println(10F);	//실수(float)
		System.out.println(10D);	//실수(double)
		System.out.println(10.0);	//실수
		
		//모든 산술 연산자의 결과값의 자료형 -> 두 피연산자 중 자료형의 크기가 더 큰 자료형으로 반환
		System.out.println(10/3);		//int / int = int
		System.out.println(10.0/3.0);	//double / double = double
		System.out.println(10/3.0);		//int / double = double
		System.out.println(10.0/3);		//double / int = double
		
		int e = 10;
		byte f = 10;
		System.out.println(e+f); //이 연산의 결과값은 int
		
		int g = 1000000000; //10억
		int h = 2000000000; //20억
		
		System.out.println(g+h); //30억이 나와야되는데 -1294967296, 오버플로우..
		//해결하려면.. 변수의 자료형을 바꾸거나, 결과값 중 하나 이상을 더 큰 자료형으로 형변환
		System.out.println((long)g+h); //30억
		
		//정수 사용시 > 대다수의 경우 int를 사용한다. 가끔 long을 사용
		byte j = 10;
		byte k = 20;
		
		System.out.println(j + k);
//		byte l = j + k;		//Type mismatch: cannot convert from int to byte
							//byte와 short의 산술연산 결과는 항상 int이다.
		byte l = (byte)(j+k); //이렇게 쓰면 되기는 한데 굳이?... 그래서 byte, short 잘 사용안함
		
		//%(나머지 연산자)
		System.out.println(100%3);
		System.out.println(100%4);
		System.out.println(100%5);
		System.out.println(100%6);
	}
}
