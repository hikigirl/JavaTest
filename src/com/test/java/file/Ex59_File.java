package com.test.java.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import com.github.lalyos.jfiglet.FigletFont;

public class Ex59_File {

	public static void main(String[] args) {
		//m1();
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
		//콘솔에 그림 그리기
		//1. 아스키 아트
		//2. figlet
		try {
			String asciiArt1 = FigletFont.convertOneLine("hello world");
		    System.out.println(asciiArt1);
		    
		    String asciiArt3 = FigletFont.convertOneLine(new File("./flf/doh.flf"), "hello...");     
		    System.out.println(asciiArt3);
		    
		    
		    
		} catch (Exception e) {
			// 
			System.out.println("Ex59_File.m9");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m8() {
		//성적표 출력
		//성적 -> 파일(Score.txt)
		// - 이름, 국어, 영어, 수학점수
		//데이터 구조 설계(schema)
		//1. 어떤 데이터를 저장? (이름, 국영수점수)
		//2. 어떤 구조로 저장? 
		
		
		//성적표 출력
		System.out.println("==================================================");
		System.out.println("                    성적표");
		System.out.println("==================================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		//System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", );
		
		try {
			File file = new File(".");
			//System.out.println(file.getAbsolutePath()); //C:\code\java\JavaTest\.
			
			BufferedReader reader = new BufferedReader(new FileReader(".\\dat\\score.txt"));
			
			String line = null;
			while((line = reader.readLine()) != null) {
				//홍길동,100,90,80 -> 학생 1명의 data
				String[] temp = line.split(",");
				String name = temp[0];
				int kor = Integer.parseInt(temp[1]);
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]);
				int total = kor+eng+math;
				double avg = total/3.0;
				
				System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.2f\n", 
									name, kor, eng, math, total, avg);
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			// 
			System.out.println("Ex59_File.m8");
			e.printStackTrace();
		}
		
		
	}

	private static void m7() {
		//메모장 읽기(자바 소스)
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("소스 파일명: "); //Ex01.java
			String filename = scan.nextLine();
			
			//C:\code\java\JavaTest\src\com\test\java
			String path = "C:\\code\\java\\JavaTest\\src\\com\\test\\java\\" + filename;
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			int number = 1;
			while((line = reader.readLine()) != null) {
				System.out.printf("%3d| %s\n",number, line);
				number++;
			}
			
			scan.close();
			reader.close();
			
		} catch (Exception e) {
			// 
			System.out.println("Ex59_File.m7");
			e.printStackTrace();
		}
		
	}

	private static void m6() {
		//FileInputStream 	-> FileReader -> BufferedReader
		//FileOutputStream 	-> FileWriter -> BufferedWriter
		
		try {
			String path = "C:\\code\\java\\file\\test.txt";
//			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
//			
//			writer.write("문자열");
//			writer.write("\r\n");
//			writer.write("강아지");
//			writer.newLine(); //writer.write("\r\n");과 동일함
//			writer.write("고양이");
//			
//			writer.close();
			
			
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
//			String line = reader.readLine();
//			System.out.println(line);
//			line = reader.readLine();
//			System.out.println(line);
//			line = reader.readLine();
//			System.out.println(line);
//			
//			line = reader.readLine();
//			System.out.println(line); //읽어올 값이 없으면 null을 반환
			
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			
			reader.close();
			
		} catch (Exception e) {
			// 
			System.out.println("Ex59_File.m6");
			e.printStackTrace();
		}
		
	}

	private static void m5() {
		//읽기
		try {
			FileReader reader = new FileReader("C:\\code\\java\\file\\할일.txt");
			
			//code = reader.read();
			//System.out.println((char)code);
			
			int code = -1;
			while((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
			reader.close();
			
		} catch (Exception e) {
			// 
			System.out.println("Ex59_File.m5");
			e.printStackTrace();
		}
	}

	private static void m4() {
		//메모장 만들기 (쓰기 기능)
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("파일명: ");
			String filename = scan.nextLine();
			
			FileWriter writer = new FileWriter("C:\\code\\java\\file\\" + filename);
			
			boolean loop = true;
			while (loop) {
				System.out.print("입력: ");
				String line = scan.nextLine();
				
				if (line.equals("wq")) { //write&quit
					System.out.println("메모장을 종료합니다");
					break;
				}
				
				writer.write(line); //입력한 한 줄을 파일에 쓰기
				writer.write("\r\n");
			}
			
			writer.close();
			scan.close();

		} catch (Exception e) {
			// 
			System.out.println("Ex59_File.m4");
			e.printStackTrace();
		}
		
	}

	private static void m3() {
		//파일쓰기
		// FileWriter: fileoutputstream의 래핑 클래스
		try {
			
			FileWriter writer = new FileWriter("C:\\code\\java\\file\\member.txt", false);
			//writer.write(65); //가능은 함...
			writer.write("홍길동");
			
			writer.close();
			
		} catch (Exception e) {
			// 
			System.out.println("Ex59_File.m3");
			e.printStackTrace();
		}
		
	}

	private static void m2() {
		//파일 읽기
		//읽기 스트림
		try {
			
			FileInputStream stream = new FileInputStream("C:\\code\\java\\file\\number.txt");
			
			int code = -1;
			while((code = stream.read()) != -1) {
				System.out.print((char)code);
			}
			
			stream.close();
			
			//system.in.read()와 똑같음 1글자씩 읽어옴
			
//			//one
//			int code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			
//			//엔터
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			
//			//two
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			
//			//엔터
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			
//			//three
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			code = stream.read();
//			System.out.print((char)code);
//			
//			//읽을 게 없는데 읽으면? -> -1 출력, -1이 나오기 전까지 루프 돌릴 수 있음
//			code = stream.read();
//			System.out.print(code);
			
			
			
			
			
			
		} catch (Exception e) {
			// 
			System.out.println("Ex59_File.m2");
			e.printStackTrace();
		}
		
		
	}

	private static void m1() {
		//파일 쓰기(output, 저장)
		
		//쓰기 스트림 객체
		
		
		try {
			File file = new File("C:\\code\\java\\file\\number.txt");
			
			//stream 생성(열기)
			// - 바이트 단위 쓰기
			FileOutputStream stream = new FileOutputStream(file, true);
			
			//자바 -> (데이터) -> 파일
//			stream.write(97);  //문자 코드를 사용해서 파일에 저장 
//			stream.write(98);
//			stream.write(67);
			
			String txt = "\r\nJava text stream";
			for (int i=0; i<txt.length(); i++) {
				char c = txt.charAt(i);
				stream.write(c);
			}
			
			//stream 닫기
			stream.close();
			
			System.out.println("종료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
