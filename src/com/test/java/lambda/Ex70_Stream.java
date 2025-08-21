package com.test.java.lambda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;

public class Ex70_Stream {

	public static void main(String[] args) {
		//Ex70_Stream
		//m1();
		//m2_1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		m9();

	}

	private static void m9() {
		System.out.println(Data.getIntList().stream().count());
		System.out.println(Data.getUserList().stream().filter(user -> user.getGender()==1).count());
		System.out.println(Data.getUserList().stream().filter(user -> user.getGender()==2).count());
		
		//max, min
		List<Integer> nums = Data.getIntList(10);
		int max = 0; //nums 안에서 최대값 저장
		int min = 87; //nums 안에서 최소값 저장
		System.out.println(nums);
		for (int n:nums) {
			if (n > max) {
				max = n;
			}
		}
		System.out.println(max);
		
		for (int n:nums) {
			if (n < min) {
				min = n;
			}
		}
		System.out.println(min);
		
		System.out.println(nums.stream().max((a,b) -> a-b));
		System.out.println(nums.stream().min((a,b) -> a-b));
		
		
		//nums.clear();
		Optional<Integer> result = nums.stream().max((a,b) -> a-b);
		if(result.isPresent()) { //if(result != null)
			System.out.println(result.get());
		} 
		if(result.isEmpty()) { //if(result == null)
			System.out.println("빈배열");
		}
		
		//키가 가장 큰 사람의 정보
		Optional<User> user= Data.getUserList().stream()
							.max((u1, u2) -> u1.getHeight() - u2.getHeight());
		
		if (user.isPresent()) {
			System.out.println(user.get());
		}
		System.out.println();
		
		// count, max, min
		// sum, avg
//		nums.stream().count()
//		nums.stream().min(null)
//		nums.stream().max(null)
//		nums.stream().sum()
//		nums.stream().average()
		
		//범용 스트림을 전용 스트림으로 껍데기만바꾸기
		System.out.println(nums.stream().mapToInt(n -> n).sum());
		System.out.println(nums.stream().mapToInt(n -> n).average().getAsDouble());
		
		//user -> 남자의 평균키?
		double height = Data.getUserList().stream()
							.filter(u -> u.getGender() == 1)
							.mapToInt(u -> u.getHeight()) //intStream이 됨
							.average().getAsDouble();
		System.out.printf("%.2f",height);
	}

	private static void m8() {
		List<Integer> nums = Arrays.asList(2,4,6,8,10);
		boolean result = false;
		for (int list : nums) {
			if (list % 2 == 0){
				result = true;
				break;
			}
		}
		System.out.println(result);
		System.out.println();
		
		//집합에 짝수만 있는지?
		result = nums.stream().allMatch(num -> num % 2 == 0);
		System.out.println(result);
		System.out.println();
		
		result = Data.getUserList().stream()
						.filter(user -> user.getHeight() <= 170)
						.allMatch(user -> user.getGender() == 1);
		System.out.println(result);
		System.out.println();
		
		
		//nums 안에 홀수가 존재하는가?
		nums = Arrays.asList(2,4,5,8,10);
		
		result = nums.stream().anyMatch(n -> n % 2 == 1);
		System.out.println(result);
		System.out.println();
		
		//조건: 너 짝수?
		//nonematch -> 하나라도 짝수이면... false
		//nums = Arrays.asList(2,4,6,8,10);
		nums = Arrays.asList(1,3,5,7,9); //true
		
		result = nums.stream().noneMatch(n -> n % 2 == 0);
		System.out.println(result);
		System.out.println();
		
		
		
		
	}

	private static void m7() {
		Data.getIntList(10).stream()
			.sorted()
			.forEach(n->System.out.println(n));
		System.out.println();
		
		Data.getIntList(10).stream()
			.sorted((a,b) -> b-a)
			.forEach(n->System.out.println(n));
		System.out.println();
		
		Data.getIntList(10).stream()
			//.sorted(Comparator.naturalOrder()) //오름차순
			.sorted(Comparator.reverseOrder()) //내림차순
			.forEach(n->System.out.println(n));
		System.out.println();
		
	}

	private static void m6() {
		//map(Function)
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		//list 안의 단어들의 글자수?
		list.stream().forEach(word -> System.out.println(word.length()));
		System.out.println();
		
		list.stream()
			.map(word -> word.length())
			.forEach(length -> System.out.println(length));
		System.out.println();
		
		list.stream()
			.map(word -> word.length() >= 5 ? "긴단어" : "짧은단어")
			.forEach(result -> System.out.println(result));
		System.out.println();
		
		Data.getUserList().stream()
			//.map(user -> user.getName())
			.map(user -> user.getGender() == 1 ? "남자" : "여자")
			.forEach(name -> System.out.println(name));
		System.out.println();
		
		//names -> member 객체 생성, 나이는 모두 20살로
		String[] names = {"홍길동", "아무개", "강아지", "고양이", "병아리"};
		
		//for문이라면.. new Member(names[i], 20)
		Arrays.stream(names)
			.map(name -> new Member(name, 20)) //map을 통한 객체 생성
			.forEach(member -> System.out.println(member));
		System.out.println();
		
		//User 객체를 member 객체로 변환
		Data.getUserList().stream()
			.map(user -> new Member(user.getName(), user.getAge()))
			.forEach(m -> System.out.println(m));
		System.out.println();
	}

	private static void m5() {
		//distinct()
		List<Integer> nums = Data.getIntList();
		System.out.println(nums.size());	//100
		
		Set<Integer> set = new HashSet<Integer>(nums);
		System.out.println(set.size());		//61
		
		//nums.stream().distinct().forEach(n->System.out.println(n));
		System.out.println();
		System.out.println(nums.stream().count());
		System.out.println(nums.stream().distinct().count());
		System.out.println();
		
		Data.getStringList().stream()
				.distinct()
				.filter(word -> word.length()>=5)
				.forEach(word-> System.out.println(word));
		System.out.println();
		
		
		ArrayList<Member> mlist = new ArrayList<Member>();
		
		mlist.add(new Member("홍길동", 20));
		mlist.add(new Member("아무개", 22));
		mlist.add(new Member("강아지", 3));
		mlist.add(new Member("고양이", 2));
		mlist.add(new Member("홍길동", 20)); //동명이인? 동일인?
		
		System.out.println(mlist.size());
		mlist.stream()
				.distinct() //제거가 안됨...
				.forEach(m -> System.out.println(m + ":" + m.hashCode()));

	}

	private static void m4() {
		//파이프
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		
		//짝수만 출력하시오
		//1. for문
		for (int i=0; i<list.size();i++) {
			if(list.get(i)%2==0) {
				System.out.printf("%-4d", list.get(i));
			}
		}
		System.out.println();
		
		//2. 향상된for문
		for (int n : list) {
			if(n % 2 == 0) {
				System.out.printf("%-4d", n);
			}
		}
		System.out.println();
		
		//3. Stream
		list.stream().forEach(num -> {
			if(num % 2 == 0) {
				System.out.printf("%-4d", num);
			}
		});
		System.out.println();
		
//		list.stream().filter(n -> true).forEach(n -> System.out.printf("%-4d",n));
//		list.stream().filter(n -> false).forEach(n -> System.out.printf("%-4d",n));
		list.stream().filter(n -> {
			if(n % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}).forEach(n -> System.out.printf("%-4d",n));
		System.out.println();
		
		list.stream()
			.filter(n -> n % 2 == 0)
			.forEach(n -> System.out.printf("%-4d",n));
		System.out.println();
		
		list.stream()
			.filter(n -> n%2==0 && n>=50)
			.forEach(n -> System.out.printf("%-4d",n));
		System.out.println();
		
		list.stream()
			.filter(n -> n%2==0)	//조건1(선)
			.filter(n -> n>=50)		//조건2(후)
			.forEach(n -> System.out.printf("%-4d",n));
		System.out.println();
		
		
		Data.getStringList().stream()
			.filter(word -> word.length()>=5)
			.filter(word -> word.startsWith("애"))
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		Data.getUserList().stream()
		    .filter(user -> user.getGender()==1)
		    .filter(user -> user.getHeight()>=180)
		    .filter(user -> user.getWeight() >= 80)
		    .forEach(user -> System.out.println(user));
		System.out.println();
		
	}

	private static void m3() {
		//스트림을 얻어오는 방법
		// - stream() 메서드를 호출해서..
		//1. 배열으로부터
		int[] nums1 = {10, 20, 30};
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();
		
		//2. 컬렉션으로부터
		List<Integer> nums2 = Arrays.asList(10, 20, 30);
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		LinkedList<Integer> nums3 = new LinkedList<Integer>();
		nums3.add(10);nums3.add(20);nums3.add(30);
		nums3.stream().forEach(num->System.out.println(num));
		System.out.println();
		
		HashSet<Integer> nums4 = new HashSet<Integer>();
		nums4.add(100);nums4.add(200);nums4.add(300);
		nums4.stream().forEach(num->System.out.println(num));
		System.out.println();
		
		HashMap<String, Integer> map;
		//map.stream
		//map.keySet().stream().forEach(null); //key값, value값만 탐색하는건 가능..
		
		//3. 숫자 범위로부터 -> 전용 스트림만 할 수 있는일
		//- Stream<T> : 범용
		//- IntStream : 전용
		IntStream.range(5, 10).forEach(num -> System.out.println(num));
		
		//4. 파일로부터
		//파일 읽기 -> FileReader, Stream, Scanner
		Path path = Paths.get("dat\\score.txt"); //file 객체랑 비슷한 역할
		try {
			Files.lines(path).forEach(line -> System.out.println(line));
		} catch (IOException e) {
			// 
			e.printStackTrace();
		}
		
		System.out.println("\n스캐너를 이용한 파일읽기");
		try {
			Scanner scan = new Scanner(new File("dat\\score.txt"));
//			System.out.println(scan.nextLine());
//			System.out.println(scan.nextLine());
//			System.out.println(scan.nextLine());
//			System.out.println(scan.nextLine());
//			System.out.println(scan.nextLine());
			
			while (scan.hasNextLine()) { //스캐너를 이용한 파일읽기
				System.out.println(scan.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// 
			e.printStackTrace();
		}
		
		//5. 디렉토리로부터(dir.listFiles())
		Path dir = Paths.get("C:\\dev\\eclipse");
		try {
			Files.list(dir).forEach(p -> {
				System.out.println(p.getFileName());
				File f = p.toFile(); //path 객체를 file 객체로 변환
				System.out.println(f.getName());
			});
			
		} catch (Exception e) {
			// 
			System.out.println("Ex70_Stream.m3");
			e.printStackTrace();
		}
		//6. 기타 등등
		
	}

	private static void m2() {
		int[] nums1 = Data.getIntArray(10);
		List<String> txt1 = Data.getStringList(10);
		
		//4. stream
		// 1) 데이터 소스로부터 스트림을 얻기
		//일반 배열
		IntStream stream1 = Arrays.stream(nums1); //stream() 메서드는 stream 객체를 반환한다.
		//컬렉션
		Stream<String> stream2 = txt1.stream();
		
		// 2) stream을 통해 요소 접근+요소 조작
		IntConsumer ic = n -> {
			//System.out.println("추상메서드 호출");
			System.out.println(n);
		};
		//ic.accept(10);
		
		stream1.forEach(ic);
		
		stream2.forEach(str -> System.out.println(str));
		
		//숫자 10개 출력
		Data.getIntList(10).stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		//user의 정보 출력
		Data.getUserList().stream().forEach(user -> {
			System.out.println(user.getName());
			System.out.println(user.getAge());
			System.out.println();
		});
		
	}
	
	private static void m2_1() {
		// 
		//배열(컬렉션) 탐색
		int[] nums1 = Data.getIntArray(10);
		List<String> txt1 = Data.getStringList(10);
		
		//1. for문 or while문
		for(int i=0;i<nums1.length;i++) {
			System.out.printf("%4d", nums1[i]);
		}
		System.out.println();
		
		//2. 향상된 for문 == forEach
		for (String s:txt1) {
			System.out.printf(" %s ", s);
		}
		System.out.println();
		
		//3. iterator
		Iterator<String> iter = txt1.iterator();
		while (iter.hasNext()) {
			System.out.printf(" %s ", iter.next());
		}
		System.out.println();
		
	}

	private static void m1() {
		int[] nums1 = Data.getIntArray();
		//System.out.println(Arrays.toString(nums1));
		
		int[] nums2 = Data.getIntArray(10);
		//System.out.println(Arrays.toString(nums2));
		
		List<Integer> nums3 = Data.getIntList();
		//System.out.println(nums3);
		
		List<Integer> nums4 = Data.getIntList(5);
		//System.out.println(nums4);
		
		String[] txt1 = Data.getStringArray(10);
		List<String> txt2 = Data.getStringList(10);
		
		User[] ulist = Data.getUserArray();
		//System.out.println(Arrays.toString(ulist));
		
		Item[] ilist = Data.getItemArray();
		System.out.println(Arrays.toString(ilist));
		
		//숫자, 문자열, User, Item
	}

}


class Member {
	private String name;
	private int age;

	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%d)", this.name, this.age);		
	}
	
	@Override
	public int hashCode() {
		//객체의 상태값 비교
		return (this.name+this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}

}