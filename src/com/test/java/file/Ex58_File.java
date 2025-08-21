package com.test.java.file;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Ex58_File {
	
	private static int count = 0;
	
	public static void main(String[] args) {
		
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
		//m14();
	}

	private static void m14() {
		//폴더 정보 출력
		// 크기: 1.32GB (1,419,784,792 바이트)
		// 내용: 파일 19,717, 폴더 3,824
		
		String path = "C:\\dev\\eclipse";
		File dir = new File(path);
		
		if(dir.exists()) { //폴더가 존재하는지 유무
			//countFile(dir);
			countDir(dir);
			
			System.out.printf("총 파일 개수: %,d개\n", count);
			
		}
		
	}
	public static void countDir(File dir) {
		//1. 목록 가져오기
		File[] list = dir.listFiles();
		
		//2. 파일 -> 개수
		for (File file : list) {
			if (file.isFile()) {
				count++;
			}
		}
		
		//3. 자식 폴더 -> 1번+2번+3번
		for (File subdir: list) {
			//subdir-> 1번+2번+3번
			if(subdir.isDirectory()) {
				countFile(subdir); //재귀 호출	
			}
			
		}
	}
	
	public static void countFile(File dir) {
		//1. 목록 가져오기
		File[] list = dir.listFiles();
		
		//2. 파일 -> 개수
		for (File file : list) {
			if (file.isFile()) {
				count++;
			}
		}
		
		//3. 자식 폴더 -> 1번+2번+3번
		for (File subdir: list) {
			//subdir-> 1번+2번+3번
			if(subdir.isDirectory()) {
				countFile(subdir); //재귀 호출
			}
		}
	}

	private static void m13() {
		//폴더 정보 출력
		// 크기: 1.32GB (1,419,784,792 바이트)
		// 내용: 파일 19,717, 폴더 3,824
		String path = "C:\\dev\\eclipse";
		File dir = new File(path);
		
		//파일 개수
		int count = 0; //누적 변수
		if(dir.exists()) {
			File[] list = dir.listFiles();
			
			for (File file: list) {
				if(file.isFile()) {
					count++;
				}
			}
			
			for (File subdir : list) {
				if(subdir.isDirectory()) {
					File[] sublist = subdir.listFiles();
					for(File subfile : sublist) {
						if(subfile.isFile()) {
							count++;
						}
					}
					
					for (File subsubdir: sublist) {
						if(subsubdir.isDirectory()) {
							File[] subsublist = subsubdir.listFiles();
							
							for(File subsubfile : subsublist) {
								if (subsubfile.isFile()) {
									count++;
								}
							}
						}
					}
				}
			}
			
			System.out.printf("총 파일 개수: %,d개\n", count);
			
		} //
		
	}

	private static void m12() {
		//특정 폴더의 내용물 보기
		String path = "C:\\dev\\eclipse";
		File dir = new File(path);
		
		if(dir.exists()) {
			//폴더의 내용물
//			String[] list = dir.list();
//			for (String item: list) {
//				//System.out.println(item);
//				String subpath = path + "\\" + item;
//				System.out.println(subpath);
//				
//				File file = new File(subpath); //파일 참조 객체로 만들면 여러 행동이 가능해지니까..
//				System.out.println(file.isFile());
//			}
			
			File[] list = dir.listFiles();
//			for (File file : list) {
//				System.out.println(file.getName());
//				System.out.println(file.isFile());
//				
//			}
			
			for (File item: list) {
				if(item.isDirectory()) {
					System.out.println("📁" + item.getName());
				}
			}
			
			for (File item: list) {
				if(item.isFile()) {
					System.out.println(item.getName());
				}
			}
		}
		
	}

	private static void m11() {
		//삭제 -> 빈 폴더만 삭제 가능
		//폴더가 중첩되어있거나 안에 파일이있으면 삭제되지 않음.
		File dir = new File("C:\\code\\java\\file\\회원");
		System.out.println(dir.delete());
		
	}

	private static void m10() {
		// 폴더명 수정 or 이동
		File dir = new File("C:\\code\\java\\file\\스케줄");
		File dir2 = new File("C:\\code\\java\\file2\\스케줄");
		
		System.out.println(dir.renameTo(dir2));
		
		
		
	}

	private static void m9() {
		//요구사항) 일정 관리 -> 날짜별 폴더 생성하기 [2025-01-01] ~ [2025-12-31]
		
		Calendar calendar = Calendar.getInstance();
		//월과 요일은 왜 0부터 시작하는가... -> 숫자가 아니라.. 배열이기때문..
		calendar.set(2025, 0, 1);
		System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_YEAR)); //365 - 올해가 총 몇일인지
		for (int i=0; i<calendar.getActualMaximum(Calendar.DAY_OF_YEAR); i++) {
			String path = String.format("C:\\code\\java\\file\\일정\\[%tF]", calendar);
			
			File dir = new File(path);
			dir.mkdir();
			
			calendar.add(calendar.DATE, 1);
			
			System.out.println(path);
		}
		
	}

	private static void m8() {
		//요구사항 -> 회원명단별로 개인 폴더 생성하기
		String[] member = {"홍길동", "아무개", "강아지", "고양이", "거북이"};
		
		for (int i=0; i<member.length; i++) {
			String path = String.format("C:\\code\\java\\file\\회원\\[개인폴더]%s님", member[i]);
			System.out.println(path);
			
			File dir = new File(path);
			boolean result = dir.mkdir();
			System.out.println(result);
		}
		
		
	}

	private static void m7() {
		//폴더 조작
		//생성
//		String path = "C:\\code\\java\\file\\aaa";
//		File dir = new File(path);
//		boolean result = dir.mkdir(); //make directory
//		System.out.println(result);
		
		String path = "C:\\code\\java\\file\\aaa\\bbb\\ccc\\ddd";
		File dir = new File(path);
		boolean result = dir.mkdirs();
		System.out.println(result);
	}

	private static void m6() {
		//삭제하기 -> 휴지통에 안가고 완전 삭제임...
		String path = "C:\\code\\java\\file\\jumsu.txt";
		File file = new File(path);
		
		boolean result = file.delete();
		System.out.println(result);
	}

	private static void m5() {
		//파일 이동하기 -> 이름 수정하는것과 동일함
		String path = "C:\\code\\java\\file\\jumsu.txt";
		File file = new File(path);
		
		String path2 = "C:\\code\\java\\file2\\jumsu.txt";
		//String path2 = "C:\\code\\java\\file2\\score.txt"; //이동과 이름수정을 동시에 할수도있음
		File file2 = new File(path2);
		
		boolean result = file.renameTo(file2);
		System.out.println(result);
		
	}

	private static void m4() {
		//수정
		// score.txt -> jumsu.txt
		
		//원본(수정 전)
		String path = "C:\\code\\java\\file\\score.txt";
		File file = new File(path);
		
		//수정 후 객체
		String path2 = "C:\\code\\java\\file\\jumsu.txt";
		File file2 = new File(path2);
		
		boolean result = file.renameTo(file2);
		System.out.println(result);
		
	}

	private static void m3() {
		//파일 조작 -> 생성, 이동, 이름수정, 삭제, 복사(이건나중에)
		
		//생성
		String path = "C:\\code\\java\\file\\score.txt";
		File file = new File(path);
		try {
			file.createNewFile();
			//System.out.println(file.createNewFile());
			
		} catch (IOException e) {
			// 
			e.printStackTrace();
		}
		
		
	}

	private static void m2() {
		//디렉토리 정보 읽기
		//C:\code\java\file\
		
		String path = "C:\\code\\java\\file";
		
		//디렉토리 참조 객체 > java.io.File 클래스
		//폴더도 결국 파일의 한 종류기때문에..
		File dir = new File(path);
		
		if(dir.exists()) {
			//파일 정보 읽기
			System.out.println(dir.getName());				//파일명
			System.out.println(dir.isFile());				//파일인지 확인
			System.out.println(dir.isDirectory());			//디렉토리인지 확인
			System.out.println(dir.length());				//파일의 크기(바이트) -> 디렉토리는 0으로 나옴
			System.out.println(dir.getAbsolutePath());		//경로(절대경로, 드라이브명부터)
			System.out.println(dir.lastModified());			//마지막 수정시간, 타임스탬프
			System.out.println(dir.isHidden());				//숨김
			System.out.println(dir.canRead());				
			System.out.println(dir.canWrite());			
			System.out.println(dir.getParent());			//부모 디렉토리
			
		} else {
			System.out.println("디렉토리가 없습니다");
		}
		
	}

	private static void m1() {
		//C:\code\java\file\data.txt
		//파일의 정보 읽기
		
		String path = "C:\\code\\java\\file\\data.txt";
		
		//파일 참조 객체 > java.io.File 클래스
		File file = new File(path);
		
		//System.out.println(file.exists());
		if(file.exists()) {
			//파일 정보 읽기
			System.out.println(file.getName());				//파일명
			System.out.println(file.isFile());				//파일인지 확인
			System.out.println(file.isDirectory());			//디렉토리인지 확인
			System.out.println(file.length());				//파일의 크기(바이트)
			System.out.println(file.getAbsolutePath());		//경로(절대경로, 드라이브명부터)
			
			System.out.println(file.lastModified());		//마지막 수정시간, 타임스탬프
			
			//타임스탬프 -> Calendar
			Calendar c1 = Calendar.getInstance();
			c1.setTimeInMillis(file.lastModified());
			System.out.printf("%tF %tT\n", c1, c1);
			
			System.out.println(file.isHidden());			//숨김
			System.out.println(file.canRead());				
			System.out.println(file.canWrite());			
			System.out.println(file.getParent());			//부모 디렉토리
			
		} else {
			System.out.println("파일이 없습니다");
		}
		
	}
}
