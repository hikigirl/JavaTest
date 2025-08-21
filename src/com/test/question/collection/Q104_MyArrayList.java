package com.test.question.collection;

public class Q104_MyArrayList {

	public static void main(String[] args) {
		//m1();
		m2();
	}

	private static void m2() {
		//배열 생성
		MyArrayList list = new MyArrayList();
		MyArrayList list2 = new MyArrayList(100);

		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("가가");
//		list.add("나나");
//		list.add("다다");
//		list.add("하하");
//		list.add("하하하");
//		list.add("하하하하");
//		list.add("하하하하하");
//		System.out.println(list);
		System.out.println();

		//읽기
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));

		//개수
//		System.out.println(list.size());
//		System.out.println();

		//탐색 + 읽기
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}

		//수정
//		System.out.println(list);
//		list.set(0, "우하하");
//		System.out.println(list);
//		System.out.println(list.get(0));

		//삭제
//		System.out.println(list);
//		list.remove(1);
//		System.out.println(list);
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}

		//삽입
		System.out.println(list);
		list.add(1, "추가한값");
		System.out.println(list);
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}
		
		System.out.println(list.contains("홍길동"));

		//검색
//		if (list.indexOf("홍길동") > -1) {
//		      System.out.println("홍길동 있음");
//		} else {
//		      System.out.println("홍길동 없음");
//		}

		//초기화
//		list.clear();
//		System.out.println(list.size());
		
	}

	private static void m1() {
		//배열 생성
		MyArrayList list = new MyArrayList();
		
		//System.out.println(list);

		//추가
		list.add("가가가");
		//System.out.println(list);
		
		list.add("나나나");
		//System.out.println(list);
		
		list.add("홍길동");
		//System.out.println(list);
		
		list.add("홍길동");
		
		list.add("홍길순");
		//System.out.println(list);

//		list.add("가가가");
//		list.add("나나나");
//		list.add("다다다");
//		list.add("라라라");
//		list.add("마마마");
		System.out.println(list);

		//읽기
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(8));

		//개수
//		System.out.println(list.size());

		//탐색 + 읽기
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}

		//수정
//		list.set(0, "우하하");
//		//System.out.println(list.get(0));
//		System.out.println(list);

		//삭제
//		list.remove(1);
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}
//		System.out.println(list);

		//삽입(insert)
		//list.add(1, "마마마");
//		list.add(3, "마마마");
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}
		//System.out.println(list);
		

		//검색
		//System.out.println(list.indexOf("홍길동"));
		//System.out.println(list.lastIndexOf("홍길동"));
//		if (list.indexOf("홍길동") > -1) {
//		      System.out.println("홍길동 있음");
//		} else {
//		      System.out.println("홍길동 없음");
//		}

		//초기화
//		list.clear();
//		System.out.println(list.size());
		
		//trimToSize()
//		System.out.println(list);
//		list.trimToSize();
//		System.out.println(list);
		
	}

}
