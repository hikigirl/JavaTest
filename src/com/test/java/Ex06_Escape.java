package com.test.java;

public class Ex06_Escape {

	public static void main(String[] args) {
//		Ex06_Escape.java
//		특수문자 > Escape Sequence
		
		//1. \n : 줄바꿈(개행문자, 엔터)
		char c1 = '\n'; //char에 들어가는 것을 보면 1글자 취급한다는 사실을 확인가능..
		
//		[요구사항] "안녕하세요. 홍길동입니다."를 출력하시오.
		String msg = "안녕하세요. 홍길동입니다.";
		System.out.println(msg);
		
//		[수정사항] 안녕하세요. 와 홍길동입니다. 를 각각 다른 줄에 출력
//		문자열 리터럴 내("" 내부)에는 엔터를 칠 수 없다.
		msg = "안녕하세요.\n홍길동입니다.";
		System.out.println(msg);
		
		msg = "안녕하세요.\r홍길동";
		System.out.println(msg); //홍길동세요.
		
		msg = "하나 둘		셋";
		System.out.println(msg);
		msg = "하나 둘\t\t셋";
		System.out.println(msg);
		
		msg = "홍길동\b입니다.";
		System.out.println(msg); //홍길입니다.
		
		msg = "홍길동\"입니다.";
		System.out.println(msg); //홍길입니다.
		
		//요구사항] 홍길동: "안녕하세요."라고 인사합니다. <이 문장을 그대로 출력
		msg = "홍길동: \"안녕하세요.\"라고 인사합니다.";
		System.out.println(msg);
		
		//요구사항] 수업 폴더의 경로를 출력하시오.
//		System.out.println("C:\code\java"); //역슬래시 그 자체를 출력하고 싶은데 에러남 \c, \j로 인식해서
		System.out.println("C:\\code\\java");
		
	}

}