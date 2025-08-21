package com.test.java.lambda;

import java.util.Calendar;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.test.java.collection.User;

public class Ex69_Lambda {

	public static void main(String[] args) {
		//m1(); //Consumer
		//m2();	//Supplier
		//m3();	//Function
		//m4();	//Operator
		m5();	//Predicate
	}

	private static void m5() {
		//Predicate
		Function<Integer, Boolean> f1 = num -> num>0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Predicate<Integer> p1 = num -> num>0;
		System.out.println(p1.test(20));
		System.out.println(p1.test(-20));
		
		BiPredicate<Integer, Integer> p2 = (a, b) -> a>b;
		System.out.println(p2.test(10, 5));
		System.out.println(p2.test(10, 50));
		
	}

	private static void m4() {
		//Operator
		BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a+b;
		System.out.println(bf1.apply(10, 20));
		
		BinaryOperator<Integer> bo1 = (a, b) -> a+b;
		System.out.println(bo1.apply(30, 40));
		
		UnaryOperator<Integer> uo1 = a -> a*a;
		System.out.println(uo1.apply(5));
		
	}

	private static void m3() {
		//Function
		Function<Integer, Boolean> f1 = num -> num>0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Function<String, Integer> f2 = str -> str.length();
		System.out.println(f2.apply("가나다라마"));
		
		BiFunction<Integer, Integer, String> bf1 = (a, b) -> {
			if (a>b) {
				return "크다";
				
			} else if(a<b) {
				return "작다";
			} else {
				return "같다";
			}
		};
		System.out.println(bf1.apply(10, 5));
		System.out.println(bf1.apply(5, 10));
		System.out.println(bf1.apply(10, 10));
		
	}

	private static void m2() {
		//Supplier -> 매개변수x, 반환값o
		Supplier<String> s1 = () -> "홍길동";
		System.out.println(s1.get());
		
		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get());
		
		Supplier<Integer> s3 = () -> 3;
		System.out.println(s3.get());
		
		Supplier<Integer> s4 = () -> {
			Calendar now = Calendar.getInstance();
			return now.get(Calendar.DATE);
		};
		System.out.println(s4.get());
		
		
		
	}

	private static void m1() {
		//Consumer -> 매개변수o, 반환값x
		MyConsumer m1 = new MyConsumer() {
			@Override
			public void test(int num) {
				System.out.println(num*2);	
			}
		};
		m1.test(20);
		
		MyConsumer m2 = num -> System.out.println(num*2);
		m2.test(30);
		
		
		Consumer<Integer> c1 = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t * 3);
			}
		};
		c1.accept(100);
		
		Consumer<Integer> c2 = num -> System.out.println(num * 3);
		c2.accept(300);
		
		Consumer<String> c3 = str -> System.out.println(str.length());
		c3.accept("가나다라");
		
		Consumer<Integer> c4 = count -> {
			for (int i=1;i<=count;i++) {
				System.out.println(i);
			}
		};
		c4.accept(5);
		
		Consumer<User> c5 = user -> {
			System.out.println("이름: " + user.getName());
			System.out.println("등급: " + user.getLevel());
			System.out.println("지역: " + user.getCity());
		};
		c5.accept(new User("홍길동", 5, null, "서울"));
		
		
		BiConsumer<String, Integer> bc1 = (name, age) -> System.out.printf("이름: %s, 나이: %d세\n", name, age);
		bc1.accept("홍길동", 20);
		
		BiConsumer<Integer, Integer> bc2 = (a, b) -> System.out.println(a+b);
		bc2.accept(20, 56);
		
		DoubleConsumer dc1;
		LongConsumer lc1;
		ObjDoubleConsumer<String> odc1;
		
		
	}

}

//목적: 인자가 있고 반환값이 없는 메서드를 가진 객체가 필요
//		람다식을 사용하고 싶음 -> 인터페이스가 필요
interface MyConsumer {
	void test(int num);
}
