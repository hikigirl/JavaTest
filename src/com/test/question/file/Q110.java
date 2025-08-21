package com.test.question.file;

import java.io.File;
import java.util.Scanner;

public class Q110 {

	public static void main(String[] args) {
		//110. 파일의 경로를 입력받아 파일 정보를 출력하시오.
		// 입력해볼 값
		// C:\code\java\file\data.txt
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일 경로: ");
		String path = scan.nextLine();
		File file = new File(path); //File 타입 객체 생성
		
		//path의 맨 끝 3글자, .의 위치를 찾아서..
		String extension = path.substring(path.lastIndexOf(".") + 1);
		
		
		System.out.printf("파일명: %s\n", file.getName());
		System.out.printf("종류: %s 파일\n", extension);
		System.out.printf("파일 크기: %s", getSize(file.length()));
		
		
		scan.close();
	}

	public static String getSize(long length) {
		if (length<1000) {
			return length + "B";
		} else if (length<1000*1000) {
			return String.format("%.1f", length/1000.0 ) + "KB"; //length/1000.0 -> 1000.0으로 나눠야됨 조심하기
		} else if (length<1000*1000*1000) {
			return String.format("%.1f", length/1000.0/1000.0 ) + "MB";
		} else if (length<1000*1000*1000*1000) {
			return String.format("%.1f", length/1000.0/1000.0/1000.0 ) + "GB";
		} else {
			return String.format("%.1f", length/1000.0/1000.0/1000.0/1000.0 ) + "TB";
		}
		
		
	}

	

}
