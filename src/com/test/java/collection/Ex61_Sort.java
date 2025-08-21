package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex61_Sort {

	public static void main(String[] args) {
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		m7();
		
	}
	
	private static void m7() {
		Calendar c = Calendar.getInstance();
		c.set(2025,2,15);
		User u1 = new User("홍길동", 1, c, "서울");
		User u2 = new User("홍길동", 1, 2025, 2, 15, "서울");
		
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("홍길동",   1, 2020, 9, 14,   "서울"));
		list.add(new User("아무개",   2, 2021, 2, 10,   "부산"));
		list.add(new User("강아지",   3, 2025, 11, 10,  "인천"));
		list.add(new User("고양이",   4, 2023, 3, 3,    "서울"));
		list.add(new User("거북이",   5, 2022, 5, 24, 	"광주"));
		list.add(new User("햄스터",   4, 2021, 6, 5, 	"부산"));
		list.add(new User("돼지",     3, 2023, 12, 31,  "제주"));
		list.add(new User("이구아나", 2, 2020, 4, 24, 	"제주"));
		list.add(new User("여우",     1, 2024, 3, 9, 	"서울"));
		list.add(new User("늑대",     2, 2023, 1, 22, 	"인천"));
		
		//Collections.sort(list); //복합 자료형은 정렬 기준이 불명확해서 명시해줘야..
		
		list.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				//비교 기준을 내 맘대로 구현할 수 있음
				
				//return o1.getName().compareTo(o2.getName()); //이름 간 비교
				//return o2.getLevel() - o1.getLevel();
				//return o2.getRegdate().compareTo(o1.getRegdate());
				
				//다차 정렬
//				if (o2.getLevel() > o1.getLevel()) { //1차 정렬 기준 -> 레벨
//					return 1; //양수 리턴
//				} else if (o1.getLevel() > o2.getLevel()) { 
//					return -1; //음수
//				} else { //2차 정렬 기준 -> 날짜
//					return o1.getRegdate().compareTo(o2.getRegdate()); //오름차순
//				}
				
				//city(String)
				//서울, 인천, 광주, 부산, 제주 순으로 정렬하고싶음 -> 가나다순이 아님
				//서울(1), 인천(2), 광주(3), 부산(4), 제주(5) -> city 값을 해당 숫자로 치환한 후 오름차순
				
				int city1 = -1;
				int city2 = -1;
				city1 = getCityNum(o1.getCity());
				city2 = getCityNum(o2.getCity());
				
				return city1-city2;
				
				//return o1.getCity().compareTo(o2.getCity());
				
				
			}

			private int getCityNum(String city) {
				//서울(1), 인천(2), 광주(3), 부산(4), 제주(5)
				if (city.equals("서울")) return 1;
				else if (city.equals("인천")) return 2;
				else if (city.equals("광주")) return 3;
				else if (city.equals("부산")) return 4;
				else if (city.equals("제주")) return 5;
				else return -1;
			}
		});
		
		
		
		System.out.println(list);
		
		
	}

	private static void m6() { //컬렉션+사용자정의정렬(익명객체)
		//Integer
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(1);
		nums2.add(5);
		nums2.add(3);
		nums2.add(4);
		nums2.add(2);
		
//		Collections.sort(nums2, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1; //내림차순
//			}
//		});
		
		nums2.sort(new Comparator<Integer>() { //collections 클래스 사용 안해도 됨~
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1; //내림차순
			}
		});
		
		System.out.println(nums2);
		
		
		//String
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("사자");
		names2.add("호랑이");
		names2.add("코끼리");
		names2.add("하이에나");
		names2.add("치타");
		names2.add("꿩");
		names2.add("알바트로스");
		
		names2.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length(); //내림차순
			}
		});
		
		System.out.println(names2);
		
		
		//Calendar
		ArrayList<Calendar> clist2 = new ArrayList<Calendar>();
		clist2.add(Calendar.getInstance());
		clist2.get(0).add(Calendar.DATE, -5);
		clist2.add(Calendar.getInstance());
		clist2.get(1).add(Calendar.DATE, 3);
		clist2.add(Calendar.getInstance());
		clist2.get(2).add(Calendar.DATE, -2);
		clist2.add(Calendar.getInstance());
		clist2.get(3).add(Calendar.DATE, 4);
		clist2.add(Calendar.getInstance());
		
		clist2.sort(new Comparator<Calendar>() {
			@Override
			public int compare(Calendar o1, Calendar o2) {
				return o2.compareTo(o1);
			}
		});
		
		for (Calendar c: clist2) {
			System.out.printf("%tF\n", c);
		}
		
	}

	private static void m5() {//익명 객체를 사용한 정렬(일반 배열)
		Calendar[] clist = new Calendar[5];
		clist[0] = Calendar.getInstance();
		clist[0].add(Calendar.DATE, -5);
		
		clist[1] = Calendar.getInstance();
		clist[1].add(Calendar.DATE, 2);
		
		clist[2] = Calendar.getInstance();
		clist[2].add(Calendar.DATE, -3);
		
		clist[3] = Calendar.getInstance();
		clist[3].add(Calendar.DATE, 4);
		
		clist[4] = Calendar.getInstance();
		
		Arrays.sort(clist, new Comparator<Calendar>() {
			@Override
			public int compare(Calendar o1, Calendar o2) {
				//return o2.compareTo(o1); //내림차순
				return o1.compareTo(o2);
			}
		});
		
		for (Calendar c: clist) {
			System.out.printf("%tF\n", c);
		}
		
	}
	private static void m4() {//익명 객체를 사용한 정렬(일반 배열)
		Integer[] nums1 = {1, 5, 3, 4, 2};
		//일반 배열의 내림차순 정렬 -> Arrays.sort(정렬대상, 익명객체);
		Arrays.sort(nums1, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2 -o1; //내림차순
			}
		}); 
		
		System.out.println(Arrays.toString(nums1));
		
		
		
		
		
	}
	private static void m3() { //익명 객체를 사용한 정렬(일반 배열)
		String[] names = {"강아지", "고양이", "병아리", "거북이", "타조", "꿩", "하이에나", "바다코끼리"};
//		Comparator<String> comparator = new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				
//				//return o2.compareTo(o1); //내림차순
//				return o2.length()-o1.length();
//			}
//		};
		
		//내림차순
		//Arrays.sort(names, comparator);
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				//return o2.compareTo(o1); //내림차순
				return o2.length()-o1.length();
			}
		});
		System.out.println(Arrays.toString(names));
		
	}
	private static void m2() {
		String[] names = {"강아지", "고양이", "병아리", "거북이", "타조"};
		//내림차순
//		List<String> list = Arrays.asList(names);
//		
//		Collections.sort(list);
//		Collections.reverse(list);
//		
//		System.out.println(list);
		
		//오름차순? 내림차순?
		//<T> void sort(T[] a, Comparator<T> c)
		//sort(정렬대상)
		//Comparator<T> -> 인터페이스
		//	<T> : 정렬하려는 집합의 요소 타입
		
		MyComparator my = new MyComparator();
		
		Arrays.sort(names, my); //사용자 정의 정렬이 가능함
		System.out.println(Arrays.toString(names));
	}
	
	private static void m1() {
		//정렬, sort
		// - 순서가 있는 데이터 집합에 한해서 가능
		// - 배열, List계열(collection)
		
		//정렬 - 오름차순, 내림차순
		//1. 직접구현(알고리즘)
		//2. JDK 제공 기능 -> Arrays.sort()
		
		// 1.a 숫자+배열
		int[] nums1 = {1, 5, 3, 4, 2};
		System.out.println(Arrays.toString(nums1));
		
		//오름차순 정렬
		Arrays.sort(nums1);
		System.out.println("오름차순(배열): " + Arrays.toString(nums1));
		//내림차순 정렬
		
		
		//1.b 숫자+컬렉션(list)
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(1);
		nums2.add(5);
		nums2.add(3);
		nums2.add(4);
		nums2.add(2);
		
		System.out.println(nums2);
		
		//오름차순
		Collections.sort(nums2);
		System.out.println("오름차순(list): " + nums2);
		
		//내림차순
		Collections.reverse(nums2);
		System.out.println("내림차순(list): " + nums2);
		
		
		//2.a 문자열+배열
		//문자열의 우위 비교: 문자코드값 순서대로, compareTo() 메서드 사용
		String s1 = "Java";
		String s2 = "java";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		String[] names = {"강아지", "고양이", "병아리", "거북이", "타조"};
		//오름차순
		Arrays.sort(names);
		System.out.println("오름차순(배열): " + Arrays.toString(names));
		
		//내림차순
		
		
		//2.b 문자열+list(컬렉션)
		ArrayList<String> names2 = new ArrayList<String>();
		
		names2.add("사자");
		names2.add("호랑이");
		names2.add("코끼리");
		names2.add("하이에나");
		names2.add("치타");
		
		Collections.sort(names2);
		System.out.println("오름차순(list): " + names2);
		Collections.reverse(names2);
		System.out.println("내림차순(list): "+names2);
		
		
		//3.a 날짜시간+배열
		//오름차순
		Calendar[] clist = new Calendar[5];
		clist[0] = Calendar.getInstance();
		clist[0].add(Calendar.DATE, -5);
		
		clist[1] = Calendar.getInstance();
		clist[1].add(Calendar.DATE, 2);
		
		clist[2] = Calendar.getInstance();
		clist[2].add(Calendar.DATE, -3);
		
		clist[3] = Calendar.getInstance();
		clist[3].add(Calendar.DATE, 4);
		
		clist[4] = Calendar.getInstance();
		System.out.println("날짜시간 (배열)");
		for (Calendar c: clist) {
			System.out.printf("%tF\n", c);
		}
		System.out.println("오름차순(배열)");
		//오름차순
		Arrays.sort(clist);
		for (Calendar c: clist) {
			System.out.printf("%tF\n", c);
		}
		System.out.println();
		//내림차순
		
		
		//3.b 날짜시간+list(컬렉션)
		ArrayList<Calendar> clist2 = new ArrayList<Calendar>();
		
		clist2.add(Calendar.getInstance());
		clist2.get(0).add(Calendar.DATE, -5);
		
		clist2.add(Calendar.getInstance());
		clist2.get(1).add(Calendar.DATE, 3);
		
		clist2.add(Calendar.getInstance());
		clist2.get(2).add(Calendar.DATE, -2);
		
		clist2.add(Calendar.getInstance());
		clist2.get(3).add(Calendar.DATE, 4);
		
		clist2.add(Calendar.getInstance());
		System.out.println("list+날짜시간");
		for (Calendar c: clist2) {
			System.out.printf("%tF\n", c);
		}
		System.out.println("오름차순");
		Collections.sort(clist2);
		for (Calendar c: clist2) {
			System.out.printf("%tF\n", c);
		}
		System.out.println("내림차순");
		Collections.reverse(clist2);
		for (Calendar c: clist2) {
			System.out.printf("%tF\n", c);
		}
		System.out.println();
		
	}

	

}


class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		//오름차순
		//o1 > o2: 양수
		//o1 < o2: 음수
		
		//내림차순
		//o1 > o2: 음수
		//o1 < o2: 양수
		
		
		//return o1.compareTo(o2); //o1-o2 -> 오름차순
		//return o2.compareTo(o1); //o2-o1 -> 내림차순
		//return o1.length() - o2.length(); //글자수정렬 오름차순
		return o2.length() - o1.length(); //글자수정렬 내림차순
	}
	
}
