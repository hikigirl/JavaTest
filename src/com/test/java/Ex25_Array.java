package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Calendar;

public class Ex25_Array {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 배열, Array
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
		m14();
		//m15();
		//m16();
		//m17();
		//m18();
		//m19();
		

	}//main

	private static void m19() {
		//
		int[][] nums = new int[5][5];
		int n = 1;
		
		//입력 -> 문제에 따라 수정
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
					{10, 20, 30},
					{10, 20, 30}
			} ;
		
		int[][][] nums3 =
			{
				{
					{10, 20, 30},
					{10, 20, 30}
				},
				{
					{10, 20, 30},
					{10, 20, 30}
				},
				{
					{10, 20, 30},
					{10, 20, 30}
				}
			};
	}

	private static void m17() {
		// 
		//배열의 차원 - 1, 2, 3차원
		
		//1차원 배열
		int[] nums1 = new int[3];
		nums1[0] = 10;
		nums1[1] = 20;
		nums1[2] = 30;
		
		System.out.println(Arrays.toString(nums1));
		
		//2차원 배열 -> 이중 for문으로 탐색
		// 자료형[][] 배열명 = new 자료형[행길이][열길이]
		int[][] nums2 = new int[2][3]; //2*3칸 배열, 2행 3열, 
		System.out.println(nums2.length); 		//2 -> 2차원 배열에서는 행의 개수를 반환함.
		System.out.println(nums2[0].length);	//3 -> 첫번째 행의 열 개수.
		
		nums2[0][0] = 10;
		nums2[0][1] = 20;
		nums2[0][2] = 30;
		
		nums2[1][0] = 40;
		nums2[1][1] = 50;
		nums2[1][2] = 60;
		
		 
		//1차원 배열용 dump, 2차원배열에 사용하면 [[I@28a418fc, [I@5305068a]
		System.out.println(Arrays.toString(nums2));
		
		//다차원 배열의 dump -> deepToString()
		System.out.println(Arrays.deepToString(nums2)); //[[10, 20, 30], [40, 50, 60]]
		
		
		//2차원 배열의 탐색 -> 이중for문
		for (int i=0; i<nums2.length; i++) { //행
			for (int j=0; j<nums2[0].length; j++) { //열
				 System.out.print(nums2[i][j]+"   ");
			}
			System.out.println(); //행 구분용
		}
		
		//num3 자료형? -> int[][]
		//num3[0] 자료형? -> int[]
		//num3[0][0] 자료형 -> int
		int[][] num3 = new int[2][3];
		
		System.out.println(num3);		//[[I@13221655
		System.out.println(num3[0]);	//[I@2f2c9b19
		System.out.println(num3[0][0]);	//0
		System.out.println();
		
		//3차원 배열
		System.out.println("3차원배열");
		int[][][] nums4 = new int[2][2][3]; //2*2*3 = 12칸짜리 배열
		
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
		//[[[I@31befd9f, [[I@1c20c684]
		System.out.println(Arrays.deepToString(nums4));
		//[[[10, 20, 30], [40, 50, 60]], [[70, 80, 90], [100, 110, 120]]]
		
		System.out.println();
		System.out.println(nums4.length);		//2 -> int[a][b][c]라면 a값
		System.out.println(nums4[0].length);	//2 -> b값
		System.out.println(nums4[0][0].length);	//3 -> c값, 깊이, [2][2] 배열이 3장...
		
		
		//3차원 배열의 탐색 -> 삼중 for문
		//int[][][] nums4 = new int[2][2][3];
		System.out.println("[3차원배열의 탐색]");
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
		//**배열의 길이는 불변이다 (=메모리에 할당된 공간은 불변이다)
		
		//배열의 초기화는 동적으로 가능하다.
		// - 배열의 길이를 실행 중에 정할 수 있다.
		// - 배열의 길이를 사용자에게 입력받아 변수에 넣어 사용할 수 있다.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생 수: ");
		int students = Integer.parseInt(reader.readLine());
		
		int[] kors = new int[students];
		System.out.println(kors.length);
		
		
	}

	private static void m15() {
		//2. 요소 삭제
		int[] nums = {1, 2, 3, 4, 5};
		
		int index = 2; //삭제할 위치
		for (int i=index ;i<nums.length-1; i++) {
			//System.out.println(i);
			nums[i] = nums[i+1];
		}
		System.out.println(Arrays.toString(nums)); //[1, 2, 4, 5, 5]
		nums[nums.length-1] = 0; //맨끝에 0을 넣거나, 그냥 둘때도있음
		System.out.println(Arrays.toString(nums)); //[1, 2, 4, 5, 0]
		
	}

	private static void m14() {
		// 배열 조작
		// 요소 삽입 -> 삽입하고 뒤로 밀기
		// 요소 삭제 -> 삭제하고 남은걸 앞으로 당기기
		int[] nums = {1, 2, 3, 4, 5};
		
		//1. 요소 삽입
		int index =2; //끼어들 위치
		int value = 10; //끼어들 값
		System.out.println(Arrays.toString(nums)); //[1, 2, 3, 4, 5]
		//System.out.println("두번째방: " + nums[1]);
		
		for (int i=nums.length-2; i>=index; i--) {
			//System.out.println(i);
			nums[i+1] = nums[i]; //뒤로 한칸씩 밀기
		}
		nums[index] = value;
		
		System.out.println(Arrays.toString(nums)); //[1, 2, 3, 3, 4]
		
		nums[index] = value;
		System.out.println(Arrays.toString(nums)); //[1, 2, 10, 3, 4]
		//System.out.println("삽입후 두번째방: " + nums[1]);
		
	}

	private static void m13() {
		//2. JDK 기능 사용
		int[] nums = {5, 3, 1, 4, 2};
		String[] names = {"홍길동", "아무개", "이순신", "강감찬", "을지문덕"};
		
		//Quick Sort 알고리즘 사용
		Arrays.sort(nums); //아직은 이 메서드로는 오름차순만 가능..
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
	}

	private static void m12() {
		//배열의 정렬
		//크기 비교 후 재배치
		
		//** 자리를 바꾸는 방법 -> 빈 공간이 하나 더 필요해...
		// - 빈 공간은 기존 자료형과 똑같아야함.
		int a = 10;
		int b = 5;
		int c; //빈공간
		
		//swap -> 두 공간의 값을 서로 바꾸는 작업
		c = a;
		a = b;
		b = c;
		
		System.out.println("a: "+ a); //5
		System.out.println("b: "+ b); //10
		
		
		//1. 정렬 알고리즘
		//버블정렬 - 오름차순
		int[] nums = {5, 3, 1, 4, 2};
		
		System.out.println(Arrays.toString(nums));
		
		int temp = 0; //swap을 위한 변수 temp
		for (int i=0; i<nums.length-1; i++) { //사이클
			for (int j=0; j<nums.length-1-i; j++) { //요소를 2개씩 비교
				if (nums[j] > nums[j+1]) { //비교 후 swap
					//내림차순을 하고싶으면 if문 조건식에서 부등호만 바꾸면 됨
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
		// - 두 값의 우위 비교
		
		//숫자형(정수, 실수)
		int a = 10;
		int b = 5;
		
		System.out.println(a > b); //비교 연산자
		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
		
		//문자형(문자코드값으로 비교 -> 숫자 비교)
		char c1 = 'A';
		char c2 = 'B';
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c1 > (int)c2);
		System.out.println(Math.max((int)c1, (int)c2));
		System.out.println(c1>c2); //형변환 입력 안해도 자바가 알아서 해줌
		
		//논리형(비교 불가능)
		//System.out.println(true>false);
		
		//참조형
		//문자열
		String s1 = "A";
		String s2 = "B";
		//The operator > is undefined for the argument type(s) java.lang.String, java.lang.String
		//모든 참조형은 산술, 비교, 논리연산 등의 피연산자가 될 수 없다.
		//System.out.println(s1 > s2);
		
		char c3 = s1.charAt(0); //"A" >'A'
		char c4 = s2.charAt(0); //"B" >'B'
		System.out.println(c3 > c4);
		
		s1 = "홍길동";
		s2 = "아무개";
		
		System.out.println(s1.length()); //문자열의 길이(문자개수) = 글자수
		System.out.println(compare(s1, s2));
		
		
		s1 = "홍길동";
		s2 = "홍태준";
		System.out.println(compare(s1, s2));
		
		s1 = "홍길동";
		s2 = "홍길동";
		System.out.println(compare(s1, s2));
		
		s1 = "홍길";
		s2 = "홍길동";
		System.out.println(compare(s1, s2));
		
		s1 = "홍길동";
		s2 = "아무개";
		System.out.println(s1.compareTo(s2)); //4361
		
		s1 = "홍길동";
		s2 = "홍태준";
		System.out.println(s1.compareTo(s2)); //-8868
		
		s1 = "홍길동";
		s2 = "홍길동";
		System.out.println(s1.compareTo(s2)); //0
		
		
		//compareTo() 메서드는 음수(뒤에것이큼), 양수(앞에것이 큼), 0으로 돌려준다.
		//compareToIgnoreCase() 메서드: 영문 대소문자를 무시하고 비교
		
		//날짜 비교
		Calendar t1 = Calendar.getInstance();
		Calendar t2 = Calendar.getInstance();
		t2.add(Calendar.HOUR, 2);
		
		System.out.printf("%tF %tT\n", t1, t1);
		System.out.printf("%tF %tT\n", t2, t2);
		
		//System.out.println(t1>t2);
		System.out.println(t1.getTimeInMillis()<t2.getTimeInMillis()); //timestamp, tick
		//getTimeInMillis() 사용해서 비교하면 숫자비교와 동일
		
		System.out.println(t1.compareTo(t2)); //날짜,시간도 compareTo() 사용하면 간편...
				
		
	}

	public static int compare(String s1, String s2) {
		
		char c3;
		char c4;
		
		//s1 = "홍길";
		//s2 = "홍길동";
		
		//방법1
//		int length =0;
//		if (s1.length() < s2.length()) {
//			length = s1.length();
//		} else {
//			length = s2.length();
//		}
		
		//방법2
//		length = s1.length() < s2.length() ? s1.length() : s2.length();
		
		//방법3
		int length = Math.min(s1.length(), s2.length());
		
		for (int i=0; i<length; i++) {
			c3 = s1.charAt(i);
			c4 = s2.charAt(i);
			
			if(c3 > c4) {
				return 1;
			} else if (c3 < c4) {
				return -1;
			} 
		} 
		//return 0;
		
		if (s1.length() > s2.length()) {
			return 1;
		} else if (s1.length() < s2.length()) {
			return -1;
		} else {
			return 0;
		}
		
	}

	private static void m10() {
		// 배열 초기화 리스트
		int[] nums1 = new int[5];
		
		//초기화하는 이 과정을 줄여보자.
		nums1[0] = 95;
		nums1[1] = 88;
		nums1[2] = 92;
		nums1[3] = 79;
		nums1[4] = 86;
		
		System.out.println(Arrays.toString(nums1)); //dump
		
		int[] nums2;
		nums2 = new int[] {95, 88, 92, 79, 86}; //{95, 88, 92, 79, 86} == 배열 초기화 리스트
		System.out.println(Arrays.toString(nums2));
		
		//가독성 좋고 깔끔해서 얘를 제일 자주씀~
		//배열과 동시에 초기화 할 때에만 사용 가능함...
		int[] nums3 = {95, 88, 92, 79, 86};
//		int [] nums3;
//		nums3 = {95, 88, 92, 79, 86};
		System.out.println(Arrays.toString(nums2));
		
		//연습
		String[] names1 = new String[3];
		names1[0] = "홍길동";
		names1[1] = "아무개";
		names1[2] = "이순신";
		
		String[] names2 = {"홍길동", "이순신", "아무개"};
		System.out.println(Arrays.toString(names1));
		System.out.println(Arrays.toString(names2));
		
	}

	private static void m9() {
		//Arrays 클래스: 배열을 사용하는데 여러가지 기능을 제공하는 클래스
		// - 유틸리티 클래스
		int[] nums = new int[3];
		nums[0] = 111;
		nums[1] = 222;
		nums[2] = 333;
		
		//배열의 상태를 확인?
		//[I@28a418fc -> ??
		// - [I == int[]
		// - @ == 구분자
		// - 28a418fc == 해시코드(HashCode), 고유 주소값이라고 생각하면 됨(식별자)
		System.out.println(nums);
		
		//printArray(nums);
		
		System.out.println(Arrays.toString(nums)); //[111, 222, 333]
		//배열을 하나의 문자열로 반환해줌, 개발자용
		
		//깊은 복사를 하는 메서드
		// Arrays.copyOfRange(original, from, to)
	//		original:  the array from which a range is to be copied
	//		from: the initial index of the range to be copied, inclusive
	//		to: the final index of the range to be copied, exclusive. (This index may lie outside the array.)
		
		//int[] copy = Arrays.copyOfRange(nums, 0, 2); //[111, 222]
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
		//깊은 복사
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy = new int[3];
		//배열을 아예 새로 만들어서 거기에 실제 배열에 들어있는 값을 일대일대응 시켜서 복사
		for(int i=0; i<nums.length; i++) {
			copy[i] = nums[i]; //깊은 복사
		}
		System.out.println(copy[0]);
		
		nums[0] = 1000;
		
		System.out.println(copy[0]);
		System.out.println(nums[0]);
		
	}

	private static void m7() {
		//배열 복사(메서드의 매개변수나 return값을 통한 복사)
		
		int a = 10;
		changeValue(a);
		System.out.println(a);
		
		
		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		changeValue(nums); //메서드 오버로딩
		System.out.println(nums[0]);
	}

	private static void changeValue(int[] aaa) {
		aaa[0] = 500; //얘가 복사본
		
	}

	private static void changeValue(int a) {
		a = 20;
		
	}

	private static void m6() {
		//배열 복사(=참조형 복사)
		
		//값형 복사
		int a =10;
		int b;
		
		b = a;
		
		//값형 복사 -> 원본을 수정해도 복사본에 영향을 주지 않는다.
		//side effect 발생하지 않음
		a = 20; //원본 수정
		
		System.out.printf("a: %d, b: %d\n", a, b);
		
		//참조형 복사
		int[] nums = new int[3];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		
		int[] copy; //copy라는 이름의 참조변수만 만들었다
		
		//int[] = int[]
		copy = nums; 
		//nums는 100이라는 주소값을 가지고 있다.
		//그걸 copy에 넣는다(stack에서만 동작이 일어남)
		//배열이 두개 생긴 게 아님!! 참조가 2번...
		
		System.out.println(copy[0]);
		System.out.println(copy[1]);
		System.out.println(copy[2]);
		System.out.println();
		
		nums[0] = 100;
		copy[1] = 200; //copy를 수정해도 원본도 바뀜
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println();
		
		System.out.println(copy[0]); //copy[0]에는 100을 넣은 적이 없는데 100이 출력..왜일까
		System.out.println(copy[1]);
		System.out.println(copy[2]);
		System.out.println();
		
	}

	private static void m5() {
		//값형 vs 참조형
		int n1 = 10;
		String s1 = "홍길동";
		s1 = "홍길동님";
		
		int[] nums = new int[3];
		
		System.out.println(n1); //n1의 크기? 4byte(int)
		System.out.println(s1); //s1의 크기? 알수없음
		System.out.println(nums);//nums의 크기? 알수없음(배열의 길이를 몰라서)
		
		
	}

	private static void m4() {
		// 각 자료형별로 배열 선언하기
		
		//원시형(값형)배열
		//정수 배열(byte, short, int, long)
		byte[] list1 = new byte[5];
		list1[0]=10;
		System.out.println(list1[0]);
		
		//실수 배열(float, double)
		double[] list2 = new double[5];
		list2[0]=3.14;
		System.out.println(list2[0]);
		
		//논리 배열(boolean)
		boolean[] list3 = new boolean[5];
		list3[0] = true;
		System.out.println(list3[0]);
		
		//문자 배열(char) == String(문자열)
		char[] list4 = new char[5];
		list4[0] = 'A';
		System.out.println(list4[0]);
		
		//참조형 배열
		//문자열
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		//Calendar
		//Calendar c1 = Calendar.getInstance();
		
		Calendar[] list6 = new Calendar[5]; //변수 5개만 생성함.. 안에 아무것도 안들어있음
		list6[0] = Calendar.getInstance();
		
		System.out.println(list6[0].get(Calendar.YEAR));
		
		//NullPointerException: Cannot invoke "java.util.Calendar.get(int)" because "list6[0]" is null
		
		
		
	}

	private static void m3() {
		int[] nums = new int[10];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		//nums[3]=40; 
		//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);

		
		//배열의 길이(3), 인덱스 개수(0~2)
		//배열 탐색 -> for문 사용
		for (int i=0; i<nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
	}

	private static void m2() {
		//요구사항) 학생3명 -> 국어점수 -> 총점, 평균
		//추가사항) 학생 300명...
		
		//배열 선언하기
		// - 자료형[] 변수명 = new 자료형[길이];
		int[] kors = new int[300];
		System.out.println(kors.length);
		
		//배열 내부 요소(element)에 접근
		//배열의 방 번호, 첨자(index)는 0부터 시작한다..
		//인덱서(Indexer) 표기법
		kors[0] = 100; 
		kors[1] = 90;
		kors[2] = 80;
		
		//총점
		//int total = kors[0]+kors[1]+kors[2]; //kor1+kor2+kor3
		int total = 0; //누적 변수
		for (int i=0; i<kors.length; i++) {
			total += kors[i];
		}
		
		
		double avg = (double)total / kors.length;
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
	}

	private static void m1() {
		//요구사항) 학생3명 -> 국어점수 -> 총점, 평균
		//추가사항) 학생 300명... 
		int kor1;
		int kor2;
		int kor3;
		//+297개의 변수 추가??
		
		kor1 =100;
		kor2 =90;
		kor3 =80;
		//+297개
		
		int total = kor1+kor2+kor3;
		
		double avg = total/3.0;
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
	}

}
