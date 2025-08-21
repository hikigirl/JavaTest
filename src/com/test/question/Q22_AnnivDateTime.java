package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q22_AnnivDateTime {

	public static void main(String[] args) throws IOException {
		//22. 남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름: ");
		String manName = reader.readLine();
		
		System.out.print("이름: ");
		String womanName = reader.readLine();
		
		System.out.print("만난날(년): ");
		int year = Integer.parseInt(reader.readLine());
		
		System.out.print("만난날(월): ");
		int month = Integer.parseInt(reader.readLine()) - 1; //month-1 주의!
		
		System.out.print("만난날(일): ");
		int day = Integer.parseInt(reader.readLine());
		
		Calendar now = Calendar.getInstance();
		now.set(year, month, day); 
		
		
		System.out.printf("❤️'%s'과(와) '%s'의 기념일❤️\n", manName, womanName);
		
		now.add(Calendar.DATE, 100-1);
		System.out.printf("100일: %tF\n", now);
		
		now.add(Calendar.DATE, 100-1);
		System.out.printf("200일: %tF\n", now);
		
		now.add(Calendar.DATE, 100-1);
		System.out.printf("300일: %tF\n", now);
		
		now.add(Calendar.DATE, 200-1);
		System.out.printf("500일: %tF\n", now);
		
		now.add(Calendar.DATE, 500-1);
		System.out.printf("1000일: %tF\n", now);
		
		
		
	}

}
