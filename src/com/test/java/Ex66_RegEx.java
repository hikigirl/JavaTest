package com.test.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex66_RegEx {

	public static void main(String[] args) {
		
		
/*
		
		정규표현식
		ex) a.c > abc, aac, acc, adc, aec, a1c, a홍c
		a..c → aㅊㅊc, aac, a1c, a홍c , 
		
		
		
		? 출현횟수: 0~1
		
		ex) abc -> bc, abc, abb, ac, bc, bbc, aaabc
		ex) 홍?길동 -> 안녕~ 길동아~ 네 이름은 홍길동이지?
		ex) 홍길?동 -> 안녕~ 홍동아~ 네 이름은 홍길동이지?
		    홍동, 홍길동을 찾음
		ex) 홍길동? -> 안녕~ 홍길아~ 네 이름은 홍길동이지?
			홍길, 홍길동을 찾음
		ex)(자바)?코드 -> 자바코드가 있습니다. 그런데 코드에 에러가 있어요.
			코드, 자바코드를 찾음
			
		+ 출현횟수: 1~무한대
		
		ex) a+bc -> bc, abc, abb, ac, bc, bbc, aaabc, aaaaaaaaaaaaaabc
		ex) 홍+길동 -> 안녕~ 길동아~ 네 이름은 홍홍길동이지? 홍홍홍길동

		ex)(자바)+코드 -> 자바코드가 있습니다. 그런데 코드에 에러가 있어요.
			코드, 자바코드를 찾음 자바코드자바코드 자바자바자바코드
			
			
		* 출현횟수: 0~무한대
		
		ex) a*bc -> bc, abc, abb, ac, bc, bbc, aaabc, aaaaaaaaaaaaaabc
		ex) 홍*길동 -> 안녕~ 길동아~ 네 이름은 홍홍길동이지? 홍홍홍길동

		ex)(자바)*코드 -> 자바코드가 있습니다. 그런데 코드에 에러가 있어요.
			코드, 자바코드를 찾음 자바코드자바코드 자바자바자바코드
		
		
		ex) abc, aabc, aaabc -> bc, abc, abb, aabc, bc, bbc, aaabc, aaaabc, aaaaabc
		a?a?abc
		
		
		ex) [012] -> 제 나이는 11살입니다. 제 동생은 10살이에요. 제 키는 160cm입니다.
		몸무게는 50kg입니다. 제 동생 키는 120cm입니다.
		ex) [나생은] -> 제 나이는 12살입니다. 제 동생은 10살이에요. 제 키는 160cm입니다.
		몸무게는 50kg입니다. 제 동생 키는 120cm입니다.
		ex) 홍길동, 최길동, 이길동, 길동-> [홍최이]?길동
			홍길동, 아무개, 김길동, 최길동, 박길동, 정길동, 이길동, 길동, 
			홍홍길동, 최최길동, 이이길동, 홍최이길동, 홍최길동, 홍이길동, 홍홍이이길동
		
		ex)연속된 숫자 [0123456789]+ -> 숫자만 찾음
		1231342524234, 3545333, 553244 , 25, 54, 4
		ex)짝수만 [0123456789]*[02468]
		ex)홀수만 [0123456789]*[13579]
		ex)연속된 숫자 [7564839210]+ 이렇게 되어있어도 상관은없다~ 단순집합이라서
		
		ex) 주민등록번호를 찾아라 950630-2345678
								  050710-1235261
			[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]
		ex) 전화번호 -> 010-1234-5678
					 -> 010-536-0928
					 -> 011-2784-0983
					 	016-2313-1232
					 	019-2379-0323
		01[0169]-[0123456789][0123456789][0123456789][0123456789]?-[0123456789][0123456789][0123456789][0123456789]
		
		ex)영어 소문자 단어[abcdefghijklmnopqrstuvwxyz]+
		ex)영어 대문자 단어[ABCDEFGHIJKLMNOPQRSTUVWXYZ]+
		JAVA ORACLE ORANGE
		ex)영문자 단어 [ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz]+
		
		ex) 숫자
		[0123456789] → [0-9]
		[01236789] → [0-36-9]
		[045679] → [04-79]
		ex) 영어 소문자 → [a-z]
		영어 대문자 → [A-Z]
		영문자 → [A-Za-z] 
		ex) 한글 → [가-힣]+
		
		ex) 주민등록번호 [0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9]
			전화번호 -> 010-[0-9]?[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]
		
		ex) 홍씨 성을 찾아라 -> 홍길동, 홍순신, 홍재석, 홍철수, 홍영희 
			홍[가-힣][가-힣]
			
		ex) 영문자+숫자 -> [A-Za-z0-9]
		ex) 영문자+숫자+한글 -> [A-Za-z0-9가-힣]
		ex) 식별자로써 적합한 문자(영어+숫자+_) -> [A-Za-z0-9_]
			
		{n}
		ex) a{1}bc -> ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		ex) a{2}bc -> ab, bc, abc, ac, abbc, abcc, aabc, aaabc	
		ex) a{3}bc -> ab, bc, abc, ac, abbc, abcc, aabc, aaabc
			
		{n, m}
		ex) a{1,2}bc -> ab, bc, abc, ac, abbc, abcc, aabc, aaabc
			a{2,3}bc -> ab, bc, abc, ac, abbc, abcc, aabc, aaabc
			a{0,2}bc -> ab, bc, abc, ac, abbc, abcc, aabc, aaabc
			
		{n,}
		ex) a{1}bc -> ab, bc, abc, ac, abbc, abcc, aabc, aaabc
			
		ex) 주민등록번호 [0-9]{6}-[0-9]{7}
		ex) 전화번호 010-[0-9]{3,4}-[0-9]{4}
		ex) 한국인 이름(홍씨 성) 성 제외 1자~5자
			홍[가-힣]{1,5}
		ex) 자바 키워드(영단어)
			[A-Za-z]{1,}
		ex) 영단어 -> 첫문자 대문자, 나머지 소문자인 영단어
			[A-Z][a-z]{1,}
		ex) 식별자(영어+숫자+ _), 숫자로 시작x
			[A-Za-z_][A-Za-z0-9_]{1,}
*/		

		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
		
	}

	private static void m6() {
		//유효성검사(회원가입)
//		1. 아이디: 필수값, 4~12자이내, 영문자+숫자+_, 숫자로 시작 x
//		2. 암호: 필수값, 4~12자이내
//		3. 이름: 필수값, 한글 2~5자 이내
//		4. 나이: 필수값, 숫자, 범위(1~120)
		
		System.out.println("[회원가입]");
		
		boolean result = register();
		if (result) {
			System.out.println("회원가입완료");
		} else {
			System.out.println("회원가입실패");
		}
	}

	private static boolean register() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = scan.nextLine();
		
		if (checkId(id)) {
			System.out.println("필수값, 4~12자이내, 영문자+숫자+_, 숫자로 시작 x");
			return false; //회원가입 실패
		}
		
		System.out.print("비밀번호: ");
		String pw = scan.nextLine();
		
		if (checkPw(pw)) {
			System.out.println("필수값, 4~12자이내");
			return false; //회원가입 실패
		}
		
		System.out.print("나이: ");
		int age = scan.nextInt();
		
		if (checkAge(age)) {
			System.out.println("필수값, 숫자, 범위(1~120)");
			return false; //회원가입 실패
		}
		scan.nextLine();
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		if (checkName(name)) {
			System.out.println("필수값, 한글 2~5자 이내");
			return false; //회원가입 실패
		}
		
		
		return true; //가입 성공
	}

	private static boolean checkName(String name) {
		if (name == null || name.equals("")) {
			return true;
		}
		
		
		String regex = "^[가-힣]{2,5}$";
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(name);
		
		return !m1.find();
	}

	private static boolean checkAge(int age) {
		
		if (age <1 || age>120) {
			return true;
		}
		return false;
	}

	private static boolean checkPw(String pw) {//잘못되면 true
		//필수값, 4~12자이내
		if (pw == null || pw.equals("")) {
			return true;
		}
		if (pw.length()<4 ||pw.length()>12) {
			return true;
		}
		
		return false;
	}

	private static boolean checkId(String id) { //잘못되면 true
		//필수값
		//4~12자이내
		//영문자+숫자+_
		//숫자로 시작 x
		
		/*
		if (id==null ||id.equals("")) {
			return true;
		}
		
		if (id.length() <4 || id.length()>12) {
			return true;
		}
		
		for (int i=0; i<id.length(); i++) {
			char c = id.charAt(i);
			//System.out.println("c: " + (int)c);
			if ((c< 'A' || c>'Z')
					&&(c< 'a' || c>'z')
					&&(c< '0' || c>'9')
					&& c != '_') {
				return true;
			}
		}
		char c2 = id.charAt(0);
		if (c2>='0' && c2<='9') {
			return true;
		}
		
		return false;
		*/
		
		//필수값
		//4~12자이내
		//영문자+숫자+_
		//숫자로 시작 x
		
		String regex = "^[A-Za-z_][A-Za-z0-9_]{3,11}$";
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(id);
		//m1.find();
		
		return !m1.find();
		
	}

	private static void m5() {
		String txt  = "출석을 부르겠습니다. 홍길동~김길동~박길동~최길동~이길동~남궁길동~ 남길동 궁길동";
		
		//String regex = "[홍김박최이남궁]길동";
		//String regex = "[홍김박최이(남궁)]길동";
		String regex = "(홍|김|박|최|이|남궁)길동";
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(txt);
		while(m1.find()) {
			System.out.println("결과: " + m1.group());
			System.out.println("결과: " + m1.group(1));
			
		}
		
	}

	private static void m4() {
		//텍스트블럭-> 문자열 안에 엔터 칠 수 있음.
		String txt = """
			루닛이 이달 보호예수가 해제되는 백승욱 이사회 의장과 서범석 대표의 보유 주식에 대해 당분간 매각 계획이 없다고 입장을 밝혔다.

루닛은 1일 회사 공식 네이버 블로그를 통해 “오는 21일 보호예수가 풀리는 백 의장과 서 대표의 보유 주식에 대해 올해 매각할 hong@gmail.com 계획이 없다”고 공지했다. 백 의장과 서 대표는 지난 2022년 7월 21일 루닛의 코스닥 기업공개(IPO) 후 의무보유 기간 1년에 자진 보호예수 2년을 추가해 총 3년간 보호예수를 유지했다.

현재 창업자인 백 의장은 루닛 주식 197만6864주(지분율 6.82%)를, 서 대표는 33만189주(지분율 1.14%)를hong-second@daum.net 보유했다. 이번에 해제되는 두 명의 주식은 총 230만7053주다.

백 의장과 서 대표는 지난해 12월 주가 하락에 적극 대응하는 차원에서 총 6억원 규모의 회사 주식 7747주를 장내 매수했javadev@naver.com다. 이번 보유 지분 관련 결정도 주주들에게 회사 내재 가치에 대한 확신과 주주가치 제고 의지를 보여주기 위함이라고 강조했다.

백 의장은 “2023년 8월 시행한 2000억원 규모 유상증자에 100% 참여하며 발생한 200억원대 주식담보대출의 상환 기간honggildong@naver.com이 도래하며 일각에서 주식 매각을 우려하는 점을 충분히 인지하고 있다”면서 “대주주로서 책임경영을 강화하는 의미에서 보유 지분을 올해 매각할 계획이 전혀 없음을 주주들께 명백하게 말씀드린다”고 말했다.

서 대표는 “루닛은 글로벌 빅파마를 포함한 다양한 사업적·전략적 파트너와 공동 프로젝트를 추진하고, 의료 인공지능(AI) 선도기업으로의 성dog.cat@gmail.com장을 본격화하고 있다”면서 “이번 보호예수 해제에 따른 주식 매각 우려를 해소하기 위해 백 의장과 뜻을 모은 만큼, 앞으로도 회사에 변함없는 믿음과 성원을 보내달라”고 말했다.
		""";
		
		String regex = "([a-zA-Z0-9._%+-]+)@([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})";
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(txt);
		while(m1.find()) {
			System.out.println(m1.group());
			System.out.println("아이디: "+m1.group(1));
			System.out.println("도메인: "+m1.group(2));
		}
		

	}

	private static void m3() {
		//정규식 클래스
		String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-1234-1234입니다. 019-1234-1234혹시 010-1234-1234연락이 안되면 016-9876-9876으로 연락주세요.010-2222-6666";
		//txt안에 전화번호가 있는가?
		String regex = "([0-9]{3})-([0-9]{3,4})-([0-9]{4})";
		
		//정규식 객체 생성
		Pattern p1 = Pattern.compile(regex);
		
		//검색
		Matcher m1 = p1.matcher(txt); //txt 내에서 정규식으로 검색해라
		
		//m1이 검색결과, 일치하는 문자열을 찾았다
//		System.out.println(m1.find());
//		System.out.println(m1.find());
//		System.out.println(m1.find());
//		System.out.println(m1.find());
		
		
//		if(m1.find()) {
//			System.out.println("전화번호 발견");
//		} else {
//			System.out.println("발견못함");
//		}
		
//		int count = 0;
//		while(m1.find()) {
//			count++;
//		}
//		System.out.printf("전화번호: %d개", count);
		
		while(m1.find()) {
			
			System.out.println("[전화번호 발견]");
			//찾은 전화번호를 출력, 일부분 추출도 가능
			System.out.println("전화번호: " + m1.group());
			System.out.println("통신사: " + m1.group(1));
			System.out.println("전화번호 앞자리: " + m1.group(2));
			System.out.println("뒷자리: " + m1.group(3));
			
			
			System.out.println();
			
		}
		
		
	}

	private static void m2() {
		String names = "홍길동,아무개,,강아지,고양이,병아리";
		String[] list = names.split(",+");
		for(String name : list) {
			System.out.println(name);
		}
		
	}

	private static void m1() {
		// 1. 여러 메서드가 인자로 정규식을 지원
		// 2. 정규식 지원 기능
		// 게시판 -> 글쓰기 -> 개인정보(전화번호) 마스킹
		String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-1234-1234입니다. 혹시 연락이 안되면 010-9876-9876으로 연락주세요.010.2222.6666";
		
		//System.out.println(txt.replace("010-1234-1234", "X-XXXX-XXXX"));
		String masking = "XXX-XXXX-XXXX";
		System.out.println(txt
				.replaceAll("010-[0-9]{3,4}-[0-9]{4}", masking)
				.replaceAll("010\\.[0-9]{3,4}\\.[0-9]{4}", masking));
		
	}

	
	
}
