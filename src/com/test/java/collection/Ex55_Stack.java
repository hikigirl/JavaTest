package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex55_Stack {

	public static void main(String[] args) {
		//m1();
		m2();

	}

	private static void m2() {
		//Queue
		Queue<String> queue = new LinkedList<String>();
		
		//1. 요소 추가
		queue.add("빨강");	//enqueue
		queue.add("노랑");
		queue.add("파랑");
		
		//2. 요소개수
		System.out.println(queue.size());
		
		//3. 요소 읽기
		//System.out.println(queue.poll());	//dequeue
//		while(queue.size() > 0) {
//			System.out.println(queue.poll());
//		}
		
		//4. 빈 배열인지 확인
		System.out.println(queue.isEmpty());
		
		//5. 읽기
		System.out.println(queue.peek());
		
	}

	private static void m1() {
		//Stack - The Stack class represents a last-in-first-out (LIFO) stack of objects.
		Stack<String> stack = new Stack<String>();
		
		//1. 요소 추가하기
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		//2. 요소개수
		System.out.println(stack.size());
		
		//3. 요소 꺼내기(읽기) - 후입선출
		// size()값도 같이 줄어듦에 유의
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.size());
		
		//요소가 없을때 꺼내려하면 에러남
		//System.out.println(stack.pop());
		
//		int size = stack.size();
//		for (int i=0; i<size;i++) {
//			System.out.println(stack.pop());
//		}
		
		while (stack.size() > 0) {
			System.out.println(stack.pop());
		}
		
		//4. 빈배열
		System.out.println(stack.isEmpty());
		
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		//5. 요소 읽기
		//Looks at the object at the top of this stack without removing it from the stack.
		System.out.println(stack.peek());
		System.out.println(stack.size());
	}

}
