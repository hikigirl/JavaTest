package com.test.question.collection;

public class Q105_MyQueue {

	public static void main(String[] args) {
		m1();
		//m2();
		

	}

	private static void m2() {
		MyQueue queue = new MyQueue();
		System.out.println(queue.add("검정"));
		//System.out.println(queue.poll());
		//System.out.println(queue.peek());
	}

	private static void m1() {
		//배열 생성
		MyQueue queue = new MyQueue();

		//추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");
		System.out.println(queue.add("검정"));

		//System.out.println(queue);

		//읽기 (빨강-> 노랑 -> 파랑)
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		//System.out.println(queue);
		//System.out.println();

		//개수
		System.out.println(queue.size());

		//확인
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.size());

		//크기 조절
		queue.trimToSize();
		//System.out.println(queue);

		//초기화
		queue.clear();
		System.out.println(queue.size());
		
	}

}
