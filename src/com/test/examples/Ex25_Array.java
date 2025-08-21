package com.test.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Calendar;

public class Ex25_Array {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//자바 과목
		//- 메서드(*) > 제어문(***) > 배열(*****) > .. > 클래스(************) > .... 
		
		//Ex25_Array.java
		
		/*
			
			배열, Array
			- 자료 구조 > 데이터를 저장하는 물리적인 구조
			- 데이터 집합 > 변수들을 모아놓은 집합
			- 같은 자료형을 가지는 변수(데이터)의 집합(***)
		
		*/
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		//m14();
		//m15();
		//m16();
		//m17();
		//m18();
		m19();
		
		
	}//main

	private static void m19() {
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		
		//입력 > 문제에 따라 이 부분을 수정
		for (int i=0; i<5; i++) {
			for (int j=4; j>=0; j--) {
				nums[i][j] = n;
				n++;
			}
		}
		
		//출력 > 그대로 사용
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void m18() {
		
		//초기화 리스트
		
		int[] nums1 = { 10, 20, 30 };
		
		int[][] nums2 = 
			{ 
				{ 10, 20, 30 }, 
				{ 10, 20, 30 } 
			};
		
		int[][][] nums3 = 
			{
				{ 
					{ 10, 20, 30 }, 
					{ 10, 20, 30 } 
				},
				{ 
					{ 10, 20, 30 }, 
					{ 10, 20, 30 } 
				},
				{ 
					{ 10, 20, 30 }, 
					{ 10, 20, 30 } 
				}
			};
	}

	private static void m17() {
		
		//배열의 차원
		//- 1차원 배열, 2차원 배열, 3차원 배열..
		
		//1차원 배열
		int[] nums1 = new int[3];
		
		nums1[0] = 10;
		nums1[1] = 20;
		nums1[2] = 30;
		
		System.out.println(Arrays.toString(nums1));
		
		
		//2차원 배열 > 2중 for문 탐색
		int[][] nums2 = new int[2][3];
		
		System.out.println(nums2.length); //2
		System.out.println(nums2[0].length); //3
		
		nums2[0][0] = 10;
		nums2[0][1] = 20;
		nums2[0][2] = 30;
		
		nums2[1][0] = 40;
		nums2[1][1] = 50;
		nums2[1][2] = 60;
		
		System.out.println(Arrays.toString(nums2)); //1차원 배열용
		System.out.println(Arrays.deepToString(nums2)); //다차원 배열용
		
		
		for (int i=0; i<nums2.length; i++) {
			for (int j=0; j<nums2[0].length; j++) {
				System.out.print(nums2[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		//num3 자료형? > int[][]
		//num3[0] 자료형 > int[]
		//num3[0][0] 자료형 > int
		int[][] num3 = new int[2][3];
		
		System.out.println(num3);
		System.out.println(num3[0]);
		System.out.println(num3[0][0]);
		
		
		//3차원 배열
		int[][][] nums4 = new int[2][2][3];
		
		nums4[0][0][0] = 10;
		nums4[0][0][1] = 20;
		nums4[0][0][2] = 30;
		
		nums4[0][1][0] = 40;
		nums4[0][1][1] = 50;
		nums4[0][1][2] = 60;
		
		nums4[1][0][0] = 70;
		nums4[1][0][1] = 80;
		nums4[1][0][2] = 90;
		
		nums4[1][1][0] = 100;
		nums4[1][1][1] = 110;
		nums4[1][1][2] = 120;
		
		System.out.println(Arrays.toString(nums4));
		System.out.println(Arrays.deepToString(nums4));
		System.out.println();
		System.out.println();
		
		//3차원 배열 탐색 > 3중 for문
		//int[][][] nums4 = new int[2][2][3];
		for (int i=0; i<nums4.length; i++) {			
			for (int j=0; j<nums4[0].length; j++) {
				for (int k=0; k<nums4[0][0].length; k++) {
					System.out.printf("%4d", nums4[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

	private static void m16() throws NumberFormatException, IOException {
		
		//*** 배열의 길이는 불변이다.(=메모리 할당된 공간은 불변이다.)
		
		//배열의 초기화는 동적으로 가능하다.
		//- 배열의 길이를 실행 중에 정할 수 있다.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생수: ");
		int count = Integer.parseInt(reader.readLine());
		
		int[] kors = new int[count];
		
		
		
	}

	private static void m15() {
		
		//배열 조작
		//- 요소 삽입
		//- 요소 삭제
		int[] nums = { 1, 2, 3, 4, 5 };
		
		int index = 2;
		
		System.out.println(Arrays.toString(nums));
		
		//요소 삭제
		//- Left shift 발생
		//- *** 삭제한 이후의 모든 요소의 인덱스가 변경!!
		for (int i=index; i<nums.length-1; i++) {
			//System.out.println(i);
			nums[i] = nums[i+1];
		}
		
		nums[nums.length-1] = 0;
		
		System.out.println(Arrays.toString(nums));
		
	}

	private static void m14() {

		//배열 조작
		//- 요소 삽입
		//- 요소 삭제
		int[] nums = { 1, 2, 3, 4, 5 };
		
		int index = 0;
		int value = 10;
		
		System.out.println(Arrays.toString(nums));
		System.out.println("두번째방: " + nums[1]);
		
		//요소 삽입
		//- Right shift > 오른쪽으로 한칸씩 이동했다.
		//- *** 주의!!! > 
		
		for (int i=nums.length-2; i>=index; i--) {
			//System.out.println(i);
			nums[i+1] = nums[i]; //뒤로 한칸 물러나기
		}
		
		nums[index] = value;
		
		System.out.println(Arrays.toString(nums));
		System.out.println("두번째방: " + nums[1]);
		
	}

	private static void m13() {
		
		//정렬
		int[] nums = { 5, 3, 1, 4, 2 };
		String[] names = { "홍길동", "아무개", "이순신", "강감찬", "을지문덕" };
		
		//Quick Sort 알고리즘 사용
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		//Arrays.reverse();
		//Arrays.sort(names, 추가구현);
		
		//오름차순
		//- 직접 구현 or Arrays.sort()
		//내림차순
		//- 직접 구현
		
	}

	private static void m12() {
		
		//정렬
		//- 크기 비교 후 > 재배치
		
		//1. 오름차순
		//	a. 숫자: 작은수 > 큰수
		//	b. 문자(열): 문자코드값 순서대로
		//	c. 날짜/시간: 과거 > 미래
		
		//2. 내림차순
		//	a. 숫자: 큰수 > 작은수 
		//	b. 문자(열): 문자코드값 역순서대로
		//	c. 날짜/시간: 미래 > 과거
		
		//정렬 구현
		//1. 직접 구현 > 정렬 알고리즘
		//2. JDK 구현된 기능
		
		
		int a = 10;
		int b = 5;
		int c;
	
		//swap > 두 공간의 값을 서로 바꾸는 작업
		c = a;
		a = b;
		b = c;
				
		System.out.println("a: " + a); //5
		System.out.println("b: " + b); //10
		
		
		
		int[] nums = { 5, 3, 1, 4, 2 };
		
		System.out.println(Arrays.toString(nums));
		
		int temp = 0;
		
		for (int i=0; i<nums.length-1; i++) { //사이클		
			
			for (int j=0; j<nums.length-1-i; j++) { //요소 두개씩 비교 단계
				
				if (nums[j] < nums[j+1]) { //비교 후 스왑
					
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}				
			}			
		}
		
		System.out.println(Arrays.toString(nums));
		
	}

	private static void m11() {
		
		//크기 비교
		//- 두 값의 우위 비교
		
		//숫자형(정수, 실수)
		int a = 10;
		int b = 5;
		
		System.out.println(a > b);
		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
		
		//문자형(문자 코드값으로 비교 > 숫자 비교)
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c1 > (int)c2);
		System.out.println(c1 > c2);
		
		
		//논리형(우위 비교 불가능)
		//System.out.println(true > false);
		
		
		//참조형
		//문자열
		String s1 = "A";
		String s2 = "B";
		
		//System.out.println((int)'A');
		//System.out.println((int)"A");
		
		
		//The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
		//** 모든 참조형은 산술,비교,논리 연산 등의 피연산자가 될 수 없다.
		//System.out.println(s1 > s2);
		
		char c3 = s1.charAt(0); //"A" > 'A'
		char c4 = s2.charAt(0); //"B" > 'B'
		
		System.out.println(c3 > c4);
		
		
		
		s1 = "ABC";
		s2 = "abc";		
		
		//System.out.println(s1.length()); //문자열의 길이(문자 개수)
		
		System.out.println(compare(s1, s2)); //-1
		
		System.out.println(s1.compareTo(s2)); //음수
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
		
		//날짜 비교
		Calendar t1 = Calendar.getInstance();
		Calendar t2 = Calendar.getInstance();
		t2.add(Calendar.HOUR, 2);
		
		System.out.printf("%tF %tT\n", t1, t1);
		System.out.printf("%tF %tT\n", t2, t2);
		
		//System.out.println(t1 > t2);
		System.out.println(t1.getTimeInMillis()); //타임스탬프, tick
		System.out.println(t2.getTimeInMillis());
		
		System.out.println(t1.getTimeInMillis() > t2.getTimeInMillis());
		
		System.out.println(t1.compareTo(t2));
		
	}

	public static int compare(String s1, String s2) {
		
		char c3;
		char c4;
		
		//s1 = "홍길"
		//s2 = "홍길동"
		
		int length = 0;
		
//		if (s1.length() < s2.length()) {
//			length = s1.length();
//		} else {
//			length = s2.length();
//		}
		
		//length = s1.length() < s2.length() ? s1.length() : s2.length();
		
		length = Math.min(s1.length(), s2.length());
		
		for (int i=0; i<length; i++) {
			
			c3 = s1.charAt(i);
			c4 = s2.charAt(i);
			
			if (c3 > c4) {
				return 1;
			} else if (c3 < c4) {
				return -1;
			} 
			
		}//for
		
		//return 0;
		
		//s1 = "홍길"
		//s2 = "홍길"
		if (s1.length() > s2.length()) {
			return 1;
		} else if (s1.length() < s2.length()) {
			return -1;
		} else {
			return 0;
		}
		
	}

	private static void m10() {
		
		//배열 초기화 리스트
		int[] nums1 = new int[5];
		
		nums1[0] = 95;
		nums1[1] = 88;
		nums1[2] = 92;
		nums1[3] = 79;
		nums1[4] = 86;
		System.out.println(Arrays.toString(nums1));
		
		int[] nums2;
		nums2 = new int[] { 95, 88, 92, 79, 86 };
		System.out.println(Arrays.toString(nums2));
		
		int[] nums3 = { 95, 88, 92, 79, 86 };
		System.out.println(Arrays.toString(nums3));
		
		int n1 = 10;
		int n2;
		n2 = 20;
		
		
		String[] names1 = new String[3];
		
		names1[0] = "홍길동";
		names1[1] = "아무개";
		names1[2] = "이순신";
		
		String[] names2 = { "홍길동", "아무개", "이순신" };
		
		System.out.println(Arrays.toString(names1));
		System.out.println(Arrays.toString(names2));
				
	}

	private static void m9() {
		
		//Arrays 클래스
		//- 배열을 사용하는데 여러가지 기능을 제공하는 클래스
		//- 유틸리티 클래스
		
		int[] nums = new int[3];
		
		nums[0] = 111;
		nums[1] = 222;
		nums[2] = 333;
		
		//배열의 상태를 확인?
		//- [I@28a418fc
		//- [I == int[]
		//- @ 구분자
		//- 28a418fc > 해시코드(HashCode)
		
		System.out.println(nums);
		
		printArray(nums);
		
		//[111, 222, 333]
		System.out.println(Arrays.toString(nums)); //개발자용
		
		
		//C 계열의 언어들은 범위를 나타낼 때
		//- 시작위치(포함) ~ 끝위치(미포함)
		//     (inclusive)      (exclusive)
		
		//깊은 복사
		//original: the array from which a range is to be copied
		//from: the initial index of the range to be copied, inclusive
		//to: the final index of the range to be copied, exclusive. (This index may lie outside the array.)
		int[] copy = Arrays.copyOfRange(nums, 0, nums.length);
		
		System.out.println(Arrays.toString(copy));
		
		nums[0] = 1000;
		
		System.out.println(Arrays.toString(nums)); //dump
		System.out.println(Arrays.toString(copy));
		
	}

	public static void printArray(int[] nums) {
		
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

	private static void m8() {
		
		//배열 복사
		//1. 얕은 복사, Shallow copy
		//- 주소값 복사
		//- Side Effect 발생
		//- 사용 빈번
		
		//2. 깊은 복사, Deep copy
		//- 실제 배열 복사(값 복사같은 느낌)
		//- Side Effect 없음
		//- 사용 드뭄
		
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy = new int[3];
		
		for (int i=0; i<nums.length; i++) {
			copy[i] = nums[i]; //깊은 복사
		}
		
		System.out.println(copy[0]);
		
		nums[0] = 1000;
		
		System.out.println(copy[0]);
		System.out.println(nums[0]);
		
	}

	private static void m7() {
		
		//배열 복사
		int a = 10;
		changeValue(a);
		System.out.println(a);
		
		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		changeValue(nums);
		System.out.println(nums[0]);
		
	}

	private static void changeValue(int[] aaa) {
		aaa[0] = 10000;
	}

	private static void changeValue(int a) {
		a = 20;		
	}

	private static void m6() {
		
		//배열 복사(=참조형 복사)
		
		//값형 복사
		int a = 10;
		int b;
		
		b = a;
		
		//값형 복사 > 원본을 수정해도 복사본에 영향을 주지 않는다.
		//Side Effect 발생하지 않음
		a = 20; //원본 수정
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();
		
		//참조형 복사
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy;
		
		//int[] = int[]
		copy = nums;
		
		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);
		System.out.println();
		
		nums[0] = 100;
		copy[1] = 200;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println();
		
		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);
		System.out.println();
		
	}

	private static void m5() {
		
		//값형 vs 참조형
		//- 기준: 메모리에 생성되는 모양(규칙)
		//- 값형 > 변수에 데이터를 직접 저장
		//		 > 값이 변해도 공간의 크기가 안변하는 자료형
		//		 > 변수만 보고도 데이터의 길이를 추측 가능
		
		//- 참조형 > 데이터는 따로 생성 + 변수에 메모리 주소값 저장
		//		   > 값이 변하면 공간의 크기가 변하는 자료형
		
		
		int n1 = 10;
		String s1 = "홍길동";
		s1 = "홍길동님";
		
		System.out.println(s1);

		int[] nums = new int[3];
		
		nums = new int[5];
				
		System.out.println(n1); //n1의 크기? 4byte
		System.out.println(s1); //s1의 크기? 알수없음
		System.out.println(nums); //nums 크기? 알수없음
		
	}

	private static void m4() {
		
		//각 자료형별 > 배열 선언하기
		
		//원시형(값형) 배열
		
		//정수 배열(byte, short, int, long)
		byte[] list1 = new byte[5];
		list1[0] = 10;
		System.out.println(list1[0]);
		
		//실수 배열(float, double)
		double[] list2 = new double[5];
		list2[0] = 3.14;
		System.out.println(list2[0]);
		
		//논리 배열(boolean)
		boolean[] list3 = new boolean[5];
		list3[0] = true;
		System.out.println(list3[0]);
		
		//문자 배열(char) == String
		char[] list4 = new char[5];
		list4[0] = 'A';
		System.out.println(list4[0]);
		
		//String s1;
		
		//참조형 배열
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		
		
		
		Calendar c1 = Calendar.getInstance();
		
		Calendar[] list6 = new Calendar[5];
		list6[0] = Calendar.getInstance();
		
		System.out.println(list6[0].get(Calendar.YEAR));
		
		
		
		
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		
		int[] nums = new int[5];
		
		
	}

	private static void m3() {
		
		//배열(참조형)의 특징
		//- 배열(참조형)들을 메모리 공간을 할당 받은 뒤 > 직접 초기화를 하지 않아도 자동으로 초기화가 된다.

		//초기화 값
		//- 정수: 0
		//- 실수: 0.0
		//- 문자: \0(문자코드값 0인 문자, null 문자)
		//- 논리: false
		//- 참조: null(초기화 안함)
		
		int[] nums = new int[10];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		//nums[3] = 40; //??
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		
		//길이(3)
		//첨자(0~2)
		
		//배열 탐색 > for문 사용
		for (int i=0; i<nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
	}

	private static void m2() {
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		//추가사항] 학생 300명
		
		//배열 선언하기
		//- 자료형[] 변수명 = new 자료형[길이];
		int[] kors = new int[300];
		
		System.out.println(kors.length);
		
		//배열의 방에 접근 > 인덱서(Indexer)
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		
		//총점
		//int total = kors[0] + kors[1] + kors[2]; //kor1 + kor2 + kor3
		
		int total = 0; //누적 변수
		
		for (int i=0; i<kors.length; i++) {
			total += kors[i];
		}
		
		double avg = (double)total / kors.length;
		
		System.out.printf("총점: %d점, 평균: %.1f점\n"
				, total, avg);				
				
	}

	private static void m1() {
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		//추가사항] 학생 300명
		
		int kor1;
		int kor2;
		int kor3;
		//+297 추가
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		//+297 추가
		
		int total = kor1 + kor2 + kor3; // + kor4 + kor5 + .. + kor300;
		
		double avg = total / 3.0; //3.0 > 300.0
		
		System.out.printf("총점: %d점, 평균: %.1f점\n"
							, total, avg);
		
	}

}













