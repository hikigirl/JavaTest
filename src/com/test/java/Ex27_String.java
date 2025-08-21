package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Ex27_String {

	public static void main(String[] args) {
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		//m14();
		
		

	}

	private static void m14() {
		//문자열 분리
		// String[] split(String delimiter)
		
		String txt = "홍길동, 아무개, 강아지, 고양이, 병아리";
		
		String[] list = txt.split(", ");
		//String[] list = txt.split("강아지");
		
		System.out.println(Arrays.toString(list));
		
		for (int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		
		
	}

	private static void m13() {
		// 문자열 치환(바꾸기)
		// - String replace(char old, char new)
		// - String replace(String old, String new)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.replace("홍길동", "아무개")); //"홍길동"을 "아무개"로
		System.out.println(txt.replace("홍길동", "00")); //old와 new의 글자수는 차이나도 상관없음
		System.out.println(txt.replace("홍길동", ""));	//빈문자열을 넣어서 삭제기능처럼 사용하기도 함.
		
		String content = "게시판 글을 작성합니다. 바보야!!";
		String stop = "바보";
		
		//masking
		System.out.println(content.replace(stop, "@@"));
		
		//공백 제거
		txt = "      하나    둘    셋       ";
		System.out.println(txt.trim());		//양끝의 공백을 제거
		System.out.println(txt.replace(" ", ""));//모든 공백을 제거
		
		
		//공백 여부에 상관없이 검색하기~~
		content = "오늘은 메서드수업을 했어요. 어려워요.";
		String word = "메서드 수업";
		
		if (content.replace(" ", "").contains(word.replace(" ", ""))) {
			System.out.println("결과o");
		} else {
			System.out.println("결과x");
		}
		
	}

	private static void m12() {
		//문자열 검색
		// - indexOf(), lastIndexOf()
		// - startsWith(), endsWith()
		// - boolean contains(String s)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		if (txt.indexOf("홍길동") > -1) {
			System.out.println("o");
		} else {
			System.out.println("x");
		}
		
		//contains()가 훨씬 직관적
		if (txt.contains("홍길동")) {
			System.out.println("o");
		} else {
			System.out.println("x");
		}
		
		
		
	}

	private static void m11() {
		//문자 추출
		//- char charAt(int index)
		
		//문자열 추출
		//- String substring(int beginIndex, int endIndex)
		//- String substring(int beginIndex)
		// - beginIndex: 포함(inclusive)
		// - endIndex: 미포함(exclusive)
		
		String txt = "가나다라마바사아자차카타파하";
		System.out.println(txt.substring(3, 7)); //인덱스 3~6번 글자를 반환, 라마바사
		System.out.println(txt.substring(3));	 //시작위치부터 끝까지 반환, 라마바사아자차카타파하
		
		System.out.println(txt.substring(4, 5)); //인덱스 4번 = "마" (String)
		System.out.println(txt.charAt(4));		 //'마'(char)
		System.out.println();
		
		String jumin = "970619-1234567";
		
		//성별?
		System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
		System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자");
		
		//몇년생? (맨앞 2자리)
		//System.out.println(jumin.charAt(0) + jumin.charAt(1)); //112 -> 문자코드+문자코드..
		System.out.println(jumin.substring(0,2)); //97
		
		//몇월생?
		System.out.println(jumin.substring(2,4)); //06
		//몇일생?
		System.out.println(jumin.substring(4,6)); //19
		System.out.println();
		
		//파일 경로
		String path = "C:\\code\\java\\JavaTest\\Ex27_String.java";
		
		// indexOf(), lastIndexOf()
		// substring()
		
		//1. 파일명 추출 -> Ex27_String.java
		//zㅋㅋ 이렇게 말고 역슬래시로 .. 찾기
		//System.out.println(path.substring(path.indexOf("Ex27_String.java")));
		int index = path.lastIndexOf("\\");
		String filename = path.substring(index+1);
		System.out.println("파일명: " + filename);
		
		//2. 확장자 없는 파일명 추출 -> Ex27_String
		//System.out.println(path.substring(path.indexOf("Ex27_String.java"), path.indexOf(".java")));
		index = filename.lastIndexOf(".");
		String filenameWithoutExtension = filename.substring(0,index);
		System.out.println("파일명(확장자x): " + filenameWithoutExtension);
		
		//3. 확장자를 추출 -> .java
		//System.out.println(path.substring(path.lastIndexOf(".java")));
		String extension = filename.substring(index);
		System.out.println("확장자: " + extension);
		
	}

	private static void m10() {
		//검색
		//- 문자열내에서 원하는 문자(열)을 검색 > 발견된 위치(index) 반환
		//- int indexOf(char c)
		//- int indexOf(String s)
		//- int indexOf(char c, int beginIndex)
		//- int indexOf(String s, int beginIndex)
		//
		//- int lastIndexOf(char c)
		//- int lastIndexOf(String s)
		//- int lastIndexOf(char c, int beginIndex)
		//- int lastIndexOf(String s, int beginIndex)
		
		
		//indexof		왼쪽->오른쪽
		//lastindexof	오른쪽->왼쪽
		String txt = "홍길동 자바 아무개 자바 테스트";
		System.out.println(txt.indexOf("자바"));		//4
		System.out.println(txt.indexOf("자바", 6));		//11
		
		System.out.println(txt.lastIndexOf("자바"));	//11
		System.out.println(txt.lastIndexOf("자바", 10));
		
	}

	private static void m9() {
		//패턴 검색
		//- boolean startsWith(String word)
		//- boolean endsWith(String word)
		
		String name = "홍길동";
		
		//이 사람이 '홍'씨? -> Y/N
		System.out.println(name.charAt(0) =='홍');		//셋 다 같은 기능...
		System.out.println(name.indexOf('홍') == 0);
		System.out.println(name.startsWith("홍"));
		System.out.println();
		
		//'동'으로 끝나는지?
		System.out.println(name.charAt(name.length()-1) == '동'); //name.length()-1 = 배열의 맨 끝 인덱스
		System.out.println(name.indexOf('동') == name.length()-1);
		System.out.println(name.endsWith(name));
		System.out.println();
		
		//현재 예제 파일 위치
		String path = "C:\\code\\java\\JavaTest\\Ex27_String.java";
		
		//위의 파일이 자바 소스 파일인가? -> 확장자를 확인..
		if (path.toLowerCase().endsWith(".java")) {
			System.out.println("0");
		} else {
			System.out.println("X");
		}
		
	}

	private static void m8() {
		// 대소문자 변환
		//- String toUpperCase()
		//- String to LowerCase() -> 원본이 훼손되지 않음, 덮어쓰기 없이 단순 출력만..
		
		String word = "Java";
		System.out.println(word);
		System.out.println(word.toUpperCase()); //JAVA
		System.out.println(word.toLowerCase()); //java
		
		String content = "오늘 수업 과목은 Java입니다.";
		System.out.println(word.toUpperCase());
		System.out.println(content.toUpperCase());
		
		//대소문자 구분(Case sensitive)
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) { 
			//.indexOf() Returns the index within this string of the first occurrence of the specified substring.
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		//메서드 체이닝
		//content.toUpperCase().indexOf(word.toUpperCase())
		//String temp1 = content.toUpperCase();
		int result = content.toUpperCase().indexOf(word);
		System.out.println(result);
		
	}
	
	private static void m7() {
		
	}
	
	private static void m6() {
		
	}
	
	private static void m5() {
		//공백 제거 
		// String trim()
		//문자열에 존재하는 공백 문자(whitespace -> 스페이스, 탭, 개행(엔터)을 제거
		//문자열의 시작과 끝에 존재하는 공백 문자만 제거
		//불필요하거나 사용자 실수로 생긴 공백을 제거하는 역할.
		String txt = "     하나    둘   셋      ";
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
	}
	
	private static void m4() {
		//유효성 검사 -> 단어 입력, 영어 소문자로만
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어(영문자): ");
		String word = scan.nextLine();
		
		if (isValid(word)) {
			System.out.println("통과");
		} else {
			System.out.println("실패");
		}
	}
	
	private static boolean isValid(String word) {
		//word.charAt(0)~word.charAt(word.length()-1)까지 for문으로.
		for (int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			
			//유효성 검사.. 잘못된 부분을 검색할 것(가독성 때문인듯..?)
			if((c < 'a'|| c> 'z')
					&&(c < 'A'|| c> 'Z')
					&&(c < '0'|| c> '9')) {
				return false; //유효성 검사가 실패하는 조건이므로 false를 반환
			}
		}
		return true;
		//for문 밖에 true 반환하도록 적는 이유..
		//for문을 통과했다는 뜻 = 검사 통과했다는 뜻이므로
		
	}

	private static void m3() {
		//주민등록번호 입력
		// ex) 970618-1234567
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민번호 입력(- 필수): ");
		String jumin = scan.nextLine();
		
		if (jumin.charAt(6) == '-') {
			System.out.println("올바른");
		} else {
			System.out.println("틀린");
		}
	}
	
	private static void m2() {
		//문자열 추출
		//char charAt(int index)
		//원하는 위치의 문자를 추출
		// zero-based index
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		char c = txt.charAt(4);
		System.out.println(c);
		
		c = txt.charAt(10);
		System.out.println(c);
		
		//StringIndexOutOfBoundsException: index 15, length 14
		//c = txt.charAt(15);
		//System.out.println(c);
		
		//마지막 글자
		c = txt.charAt(txt.length() - 1);
		System.out.println(c);
		
	}
	
	private static void m1() {
		//문자열 생성
		//1. 리터럴
		//2. 객체 생성
		
		//String 클래스
		String s1 = "홍길동";
		String s2 = new String("홍길동");
		
		//문자열 == 문자의 집합
		//String == char[]
		
		//문자열 길이 -> int length()
		
		String txt ="홍길동";
		System.out.println(txt.length());					//3
		System.out.println("자바".length());				//2
		System.out.println("ABC한글1234!@#$%^&".length());	//16
		
		//요구사항) 사용자가 입력한 문자열의 글자수?
		Scanner scan = new Scanner(System.in);
		System.out.print("문장: ");
		String line = scan.nextLine();
		
		System.out.printf("%s는 %d문자\n", line, line.length());
		
		//유효성검사
		//이름 입력받기
		// 성+ ~5자 = 2~6자 이내
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		if (name.length() >= 2 && name.length() <= 6) {
			System.out.println("올바른 이름");
		} else {
			System.out.println("올바르지 않은 이름");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
