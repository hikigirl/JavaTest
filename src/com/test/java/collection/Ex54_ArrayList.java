package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex54_ArrayList {

	public static void main(String[] args) {
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		
	}

	private static void m6() {
		//컬렉션의 구조
		ArrayList<Integer> list = new ArrayList<Integer>(100000); 
		
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		System.out.println(list.size());
//		
//		list.add(50);
//		list.add(60);
//		list.add(70);
//		list.add(80);
//		System.out.println(list.size()); //size란... 배열에 들어가있는 데이터의 개수
//		
//		list.add(90);
//		System.out.println(list.size());
		
		for (int i=0; i<100000; i++) {
			list.add(i);
		}
		
		//list.trimToSize();
		System.out.println(list.size());
		
	}

	private static void m5() {
		/*
			성적표 만들기 - 학생 3명의 국영수 점수
			학생 3명의 데이터를 뭐로 저장하고 어떻게 관리할것인가?
			1. 일단 학생 1명의 데이터는 어디에 담을까
				국영수를 하나의 배열로 만든다
				국영수를 각각 클래스로 만든다 -> 이게 나음..
			2. 학생 여러명은 어디에 담을것인가
				배열에 학생 여러명을 담는다
		 */
		
		//학생들의 성적을 담은 Score 클래스를 만들고
		//그 클래스를 배열로 만듬
		ArrayList<Score> list = new ArrayList<Score>();
		
		Random rnd = new Random();
		String[] names = {"홍길동", "아무개", "테스트", "강아지", "고양이"};
		
		for (int i=0; i<5; i++) {
			Score s = new Score(); //학생 1명씩 만듬
			s.setNo(i+1);
			s.setName(names[i]);
			
			//s.setKor(rnd.nextInt(101)); //0점~100점
			s.setKor(rnd.nextInt(41)+60); //60~100점
			s.setEng(rnd.nextInt(41)+60);
			s.setMath(rnd.nextInt(41)+60);
			
			list.add(s);
		}
		
		//성적표 출력
		System.out.println("========================================================");
		System.out.println("                        성적표");
		System.out.println("========================================================");
		System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for (Score s: list) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n"
					, s.getNo(), s.getName(), s.getKor(), s.getEng(), s.getMath()
					,s.getTotal(), s.getAverage());
		}
		
	}

	private static void m4() {
		//객체 배열 -> cup을 여러 개 넣을 수 있는 배열
		
		//기본 배열
		Cup[] list1 = new Cup[3]; //배열 초기화(객체 아직 미생성)
		list1[0] = new Cup("white", 5000); //객체 생성
		list1[1] = new Cup("yellow", 7000);
		list1[2] = new Cup("pink", 6500);
		
		
		ArrayList<Cup> list2 = new ArrayList<Cup>();
		list2.add(new Cup("white", 5000));
		list2.add(new Cup("yellow", 7000));
		list2.add(new Cup("pink", 6500));
		
		System.out.println(Arrays.toString(list1));
		System.out.println(list2);
		
		
	}

	private static void m3() {
		int[] ns1 = new int[3];
		int[][]	ns2 = new int[2][3];
		int[][][] ns3 = new int[2][3][4];
		
		//int[] ns1
		ArrayList<Integer> ms1 = new ArrayList<Integer>();
		ms1.add(100);
		
		
		//int[][] ns2
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>();
		
		//ns2[0][0] = 10;
		ms2.add(new ArrayList<Integer>());
		ms2.get(0).add(10);
		
		
		//int[][][] ns3
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 
			= new ArrayList<ArrayList<ArrayList<Integer>>>();
		
	}

	private static void m2() {
		//문자열 배열
		ArrayList<String> list = new ArrayList<String>();
		
		//1. 요소 추가하기 - 배열의 마지막에 추가(Append mode)
		list.add("바나나");
		list.add("딸기");
		list.add("귤");
		list.add("포도");
		list.add("파인애플");
		
		//2. 요소 개수
		//배열에 넣은 요소의 총 개수 = 배열의 길이
		System.out.println(list.size());
		
		//3. 요소 읽기
		System.out.println(list.get(2));
		//System.out.println(list.get(7)); //IndexOutOfBoundsException
		
		//4. 요소 수정하기
		//list.set(2, "망고");
		String temp = list.set(2, "망고");
		System.out.println(temp);
		
		//5. 요소 삭제 - 배열의 길이를 줄임(방을 없앰)
		// *** 시프트 발생(방 번호 변함)
		
		//list.remove(2); //방번호로 삭제
		//list.remove("망고"); //값으로 삭제
		
		System.out.println(list.get(3));
		list.remove(2);
		System.out.println(list.get(3));
		
		//6. 요소 추가(삽입) -> 원하는 위치에 요소를 추가, insert mode
		//void add(int index, T value)
		//***시프트 발생(방번호 변함)
		
		System.out.println(list);
		list.add(2, "망고");
		System.out.println(list);
		
		//7. 요소 검색
		System.out.println(list.indexOf("딸기"));
		System.out.println(list.lastIndexOf("딸기"));
		System.out.println(list.contains("딸기"));
		System.out.println(list.contains("애플망고"));
		
		
		//8. 탐색
		//for문
		System.out.println();
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//향상된 for문
		System.out.println();
		for (String item : list) {
			System.out.println(item);
		}
		System.out.println();
		
		//9. 초기화
		list.clear(); //재사용하기 편해서 사용자주함
		System.out.println(list.size());
		System.out.println(list);
		
		//10. 빈 배열 확인
		System.out.println(list.isEmpty());
		list.add("체리");
		System.out.println(list.isEmpty());
		
	}

	private static void m1() {
		//일반 배열 vs ArrayList
		
		//일반 배열: 타입 명시(int), 길이 명시(3)
		int[] nums1 = new int[3];
		
		//요소 접근 -> 첨자(index) 사용
		nums1[0] = 10; //쓰기
		nums1[1] = 20;
		nums1[2] = 30;
		System.out.println(nums1[0]); //읽기
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);
		System.out.println(nums1.length);
		
		//컬렉션(ArrayList)
		// 타입 명시(제네릭, int), 길이 명시 x(가변)
		//ArrayList nums2 = new ArrayList();
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		//요소 접근
		nums2.add(100); //nums2[0] = 10;
		nums2.add(200); //nums2[1] = 20;
		nums2.add(300); //nums2[2] = 30;
		nums2.add(400);
		nums2.add(500);
		
		System.out.println(nums2.get(0)); //nums2[0]
		
		System.out.println(nums2.size()); //3
		
		for (int i=0; i<nums2.size(); i++) {
			System.out.println(nums2.get(i));
		}
		
		//dump
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums2.toString());
		
	}

}

class Cup {
	private String color;
	private int price;
	
	public Cup(String color, int price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cup [color=" + color + ", price=" + price + "]";
	}	
}

class Score{
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//합계와 평균을 여기서 계산
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	public double getAverage() {
		return this.getTotal() / 3.0;
	}
	
	//getter, setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}