package com.test.java.lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex68_Lambda {

	public static void main(String[] args) {
		//Ex68_Lambda
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			@Override
			public void call() {
				System.out.println("pr1");	
			}
		};
		pr1.call();
		
		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();
		
		//람다식 구현부가 문장 1개라면 {} 생략 가능
		NoParameterNoReturn pr3 = () ->	System.out.println("pr3");
		pr3.call();
		
		
		ParameterNoReturn pr4 = (int n) -> {
			System.out.println(n);
		};
		pr4.call(10);
		pr4.call(20);
		pr4.call(30);
		
		//람다식의 매개변수 자료형은 생략할 수 있다.
		ParameterNoReturn pr5 = (n) -> System.out.println(n);
		pr5.call(400);
		
		//람다식의 매개변수 개수가 하나일 때에는 () 생략 가능
		// + 자료형을 안썼을때만, 매개변수 0개일때도 생략못함
		ParameterNoReturn pr6 = n -> System.out.println(n);
		pr6.call(7000);
		
		MultiParameterNoReturn pr7 = (name, age) -> System.out.println(name + ", "+age);
		pr7.call("홍길동", 20);
		
		NoParameterReturn pr8 = () -> {
			return 10;
		};
		System.out.println(pr8.call());
		
		//구현부에 리턴문 말고 아무것도 없다면 {}와 return 키워드를 생략 가능함
		NoParameterReturn pr9 = () -> 20;
		System.out.println(pr9.call());
		
		ParameterReturn pr10 = (int a, int b) -> {
			return a+b;
		};
		System.out.println(pr10.call(10, 20));
		
		ParameterReturn pr11 = (a, b) -> a+b;
		System.out.println(pr11.call(30, 40));
		
		m1(); //정렬할 때 람다식 사용해보기.
		
	}

	private static void m1() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(8);
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(3);
		nums.add(7);
		nums.add(9);
		nums.add(5);
		nums.add(10);
		System.out.println(nums);
		
//		nums.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1; //내림차순
//			}
//		});
		
		nums.sort((o1, o2) -> o2-o1); //내림차순을 위에 주석이 아니라 람다식으로 간단히~~
		
		System.out.println(nums);
		
	}
}

@FunctionalInterface
interface NoParameterNoReturn {
	void call();
}

@FunctionalInterface
interface ParameterNoReturn {
	void call(int n);
}

@FunctionalInterface
interface MultiParameterNoReturn {
	void call(String name, int age);
}

@FunctionalInterface
interface NoParameterReturn {
	int call();
}

@FunctionalInterface
interface ParameterReturn {
	int call(int a, int b);
}