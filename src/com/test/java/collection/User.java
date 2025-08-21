package com.test.java.collection;

import java.util.Calendar;

public class User {
	//회원정보
	private String name;
	private int level;
	private Calendar regdate;
	private String city;
	
	public User(String name, int level, Calendar regdate, String city) {
		this.name = name;
		this.level = level;
		this.regdate = regdate;
		this.city = city;
	}
	
	//생성자 오버로딩(사용자 편의를 위해,,)
	public User(String name, int level, int year, int month, int date, String city) {
		
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		
		this.name = name;
		this.level = level;
		this.regdate = c;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public Calendar getRegdate() {
		return regdate;
	}

	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%d) %s %tF"
							,this.name, this.level, this.city, this.regdate);
	}
	
}
