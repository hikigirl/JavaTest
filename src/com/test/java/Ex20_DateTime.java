package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

public class Ex20_DateTime {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//m1();
		//m2();
		//m3();
		//calendarExample();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		
		
	}


	private static void m8() {
		//현재 시간의 tick
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		System.out.println(System.currentTimeMillis());
	}


	private static void m7() {
		//시간+시간 = 시간
		//시간-시간 = 시간 (시, 분, 초 단위)
		//int를 씀(날짜가 없으니..)
		
		//2h 30m + 10m = 2h 40m
		int hour = 2;
		int min = 30;
		min += 10;
		System.out.printf("%d시간 %d분\n", hour, min);
		
		//분끼리 더했을때 60분이 넘어가면..??
		// 2h 30m + 40m = 2h 70m = 3h 10m
		hour = 2;
		min = 30;
		
		min+=140;
		System.out.printf("%d시간 %d분\n", hour, min); //2시간 70분...
		
		hour = hour+(min/60);
		min = min%60;
		System.out.printf("%d시간 %d분\n", hour, min); //3시간 10분
		
		
		
		
	}


	private static void m6() throws NumberFormatException, IOException {
		// 시각 - 시각 = 시간
		//내가 태어나서 총 몇일을 살았을까?
		//현재 - 내생일 = 내가 살아온시간
		Calendar now = Calendar.getInstance();
		
		Calendar birthday = Calendar.getInstance();
		birthday.set(2001, 6, 27);
		
		
		System.out.println(now.getTimeInMillis()); //Epoch time 기준으로 몇 밀리초가 흘렀는지 알려줌
		long gap = now.getTimeInMillis() - birthday.getTimeInMillis();
		System.out.println(gap);
		
		System.out.printf("%,dms 살았습니다.\n", gap);
		System.out.printf("%,d시간 살았습니다.\n", gap/1000/60/60);
		System.out.printf("%,d일 살았습니다.\n", gap/1000/60/60/24);
		
		//현재~특정 시각 -> 몇일이 남았는지?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력(년): ");
		int year = Integer.parseInt(reader.readLine());
		
		System.out.print("입력(월): ");
		int month = Integer.parseInt(reader.readLine());
		
		System.out.print("입력(일): ");
		int day = Integer.parseInt(reader.readLine());
		
		Calendar someday = Calendar.getInstance();
		someday.set(year, month-1, day);
		
		long nowTick = now.getTimeInMillis();
		long somedayTick = someday.getTimeInMillis();
		
		
		System.out.printf("두 날짜의 차이는 %d일입니다.", (somedayTick-nowTick)/1000/60/60/24);
	}


	private static void m5() {
		//시간의 연산
		//- 시각+시간
		//- 시각-시간
		
		//오늘 만난 커플이 언제 100일?
		//오늘(시각) + 100일(시간) = 기념일(시각)
		
		Calendar now = Calendar.getInstance();
		//now + 100
		now.add(Calendar.DATE, 99); //100일을 더하면 하루 넘어감 101일 기념일 됨...
		
		System.out.printf("100일: %tF\n", now);
		
		//일주일후
		now = Calendar.getInstance(); //초기화
		now.add(Calendar.DATE, 7); 
		
		System.out.printf("일주일 후: %tF\n", now);
		
		//3일 전?
		now = Calendar.getInstance(); //초기화
		now.add(Calendar.DATE, -3); 
		
		System.out.printf("3일전: %tF\n", now);
		
		//컵라면 3분 타이머..
		now = Calendar.getInstance(); //초기화
		now.add(Calendar.MINUTE, 3);
		System.out.printf("3분 후: %tT\n", now);
		
		
		
		Calendar birthday = Calendar.getInstance();
		birthday.set(1990, 6, 10, 14, 30, 50);  //오버로딩된 메서드 중에 골라쓰면 됨
		// 10000시간 살았을 때?
		birthday.add(Calendar.HOUR_OF_DAY, 10000);
		System.out.printf("내 생일: %tF %tT\n", birthday, birthday);
		
		
	}


	private static void m4() {
		//특정 시간을 만드는 방법
		
		//올해 크리스마스
		Calendar christmas = Calendar.getInstance(); //현재 시각
		System.out.printf("%tF %tT\n", christmas, christmas);
		
		//수정(쓰기)
		christmas.set(Calendar.MONTH, 11);
		System.out.printf("%tF %tT\n", christmas, christmas);
		
		christmas.set(Calendar.DATE, 25);
		System.out.printf("%tF %tT\n", christmas, christmas);
		
		christmas.set(Calendar.HOUR_OF_DAY, 0);
		christmas.set(Calendar.MINUTE, 0);
		christmas.set(Calendar.SECOND, 0);
		System.out.printf("%tF %tT\n", christmas, christmas);
		
		//내 생일
		Calendar birthday = Calendar.getInstance();
		birthday.set(1990, 6, 10);  //오버로딩된 메서드 중에 골라쓰면 됨 (연, 월, 일)
		
		System.out.printf("내 생일: %tF\n", birthday);
		
	}


	private static void calendarExample() {
		Calendar now = Calendar.getInstance();
		int ampm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		//요구사항) 지금은 오후 12시 46분 05초입니다.
		System.out.printf("지금은 %s %02d시 %02d분 %02d초입니다."
				, ampm == 0 ? "오전" : "오후"
				, hour, minute, second);
		
//		printf("%tF", now);  → 2025-06-03 형식으로
//	    printf("%tT", now);  → 14:06:57
//	    printf("%tA", now);  → 금요일(Locale, 사용자 PC 언어에 따라 요일 표시 언어도 달라짐)
		
	}

	private static void m3() {
		System.out.println(10 + 20 + 30);		//60
		System.out.println("10" + 20 + 30);		//102030
		System.out.println(10 + "20" + 30);		//102030
		System.out.println(10 + 20 + "30");		//3030
		
		//기본자료형을 참조형인 문자열로 바꾸는 방법
		
		String c = "10";
		int d = Integer.parseInt(c); //문자열을 숫자로 바꾸는 방법(parsing)
		
		int a = 10;
		String b = String.valueOf(a);	//방법1
		String e = a + "";				//방법2 -> 훨씬 간단해서... 자주 씀
		
		
	}


	private static void m2() {
		//Calendar 클래스 > 그레고리력(양력)
		Calendar now = Calendar.getInstance();
		System.out.println(now);
//		java.util.GregorianCalendar
//		[time=1749782285746,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
//			zone=sun.util.calendar.ZoneInfo[id="GMT+09:00",offset=32400000,dstSavings=0,useDaylight=false,
//			transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,
//			MONTH=5,WEEK_OF_YEAR=24,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=164,
//			DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=11,
//			HOUR_OF_DAY=11,MINUTE=38,SECOND=5,MILLISECOND=746,ZONE_OFFSET=32400000,DST_OFFSET=0]
		System.out.println();
		
		//now는 집합 데이터 -> 원하는 항목을 추출
		// - int get(int)
		System.out.println(now.get(1));
		System.out.println(now.get(2));
		System.out.println(now.get(3));
		System.out.println(now.get(4));
		System.out.println(now.get(5));
		System.out.println(now.get(6));
		//이 방식은 1이 무슨숫자인지 알수가없어서 불편함
		
		System.out.println(Calendar.YEAR); //1이 들어있음
		System.out.println(now.get(Calendar.YEAR));
		System.out.println();
		
		System.out.println("[Calendar.** 알아보기]");
		System.out.println(now.get(Calendar.YEAR));				//2025, 년도
		System.out.println(now.get(Calendar.MONTH));			//5, 0부터 시작
		System.out.println(now.get(Calendar.DATE));				//13, 일
		System.out.println(now.get(Calendar.HOUR));				//0 > 시(12H)
		System.out.println(now.get(Calendar.HOUR_OF_DAY));		//12 > 시(24H)
		System.out.println(now.get(Calendar.MINUTE));			//분
		System.out.println(now.get(Calendar.SECOND));			//초
		System.out.println(now.get(Calendar.MILLISECOND));		//밀리초
		System.out.println(now.get(Calendar.AM_PM));			//AM(0)/PM(1) 
		
		System.out.println(now.get(Calendar.DAY_OF_YEAR));		//올해가 된 후 몇일이 지났는지
		System.out.println(now.get(Calendar.DAY_OF_MONTH));	//이번 달이 된 후 몇일이 지났는지
		System.out.println(now.get(Calendar.DAY_OF_WEEK));		//요일, 일(1)~토(7) = 
																//이번 주가 된 후 몇일이 지났는지.
		
		System.out.println(now.get(Calendar.WEEK_OF_YEAR));	//올해가 된 후 몇 주가 지났는지
		System.out.println(now.get(Calendar.WEEK_OF_MONTH));	//이번 달이 된 후 몇 주가 지났는지
		System.out.println();
		
		//요구사항) "오늘은 2025년 6월 13일입니다."를 출력하시오. 날짜가 변하도록~
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n" 
				, now.get(Calendar.YEAR)
				, now.get(Calendar.MONTH)+1 //월은 0부터 시작하므로 1을 더해주자
				, now.get(Calendar.DATE));
		
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년 %s월 %s일입니다.\n" 
				, now.get(Calendar.YEAR)
				, month < 10 ? "0" + month : month + ""
				, date < 10 ? "0" + date : date + "");
		
		System.out.printf("오늘은 %d년 %02d월 %02d일입니다.\n" 
				, now.get(Calendar.YEAR)
				, now.get(Calendar.MONTH) + 1
				, now.get(Calendar.DATE));
		
		
		
	}

	private static void m1() {
		//현재 시각
		//Date 클래스
		Date now = new Date(); //ctrl+shift+O 눌러서 java.util import하기
		
		System.out.println(now); //now에는 (컴퓨터 본체 기준..)현재 시각이 들어있다.
		//Fri Jun 13 11:27:11 GMT+09:00 2025		
		
	}

}
