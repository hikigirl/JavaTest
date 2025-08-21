package com.test.java.obj.inheritance;

import java.util.Date;

public class Ex39_toString {

	public static void main(String[] args) {
		//toString
		Monitor m1 = new Monitor();
		m1.setModel("LG100");
		m1.setPrice(300000);
		
		//개발자 입장: 방금 만든 객체의 상태 -> 출력을 통해 확인
		//getter를 사용..? -> getter가 수백개면 어떡할건데..
		//info()같은 dump용 메서드를 만듬.
		
		System.out.println(m1.getModel());
		System.out.println(m1.getPrice());
		
		//info()같은 dump용 메서드를 만듬.
		//객체의 상태를 일괄확인가능. -> info 메서드는 내가 만든거라 다른 개발자가 잘 몰라
		System.out.println(m1.info());
		
		//toString
		
		//com.test.java.obj.inheritance.Monitor@7ef20235 ->어디쓰는데..
		System.out.println(m1.toString());
		System.out.println(m1); //오버라이딩하면 LG100, 300000원으로... 
		//print계열에 객체를 입력하면 알아서 toString을 불러.. 내가 직접안써도
		
		Date now = new Date();
		System.out.println(now.toString());
		
		Time t1 = new Time(2, 30);
		System.out.println(t1);
	}

}



class Monitor {
	private String model;
	private int price;
	
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String info() {
		return String.format("%s, %d원", this.model, this.price);
	}

	@Override
	public String toString() {
		return "Monitor [model=" + model + ", price=" + price + "]";
	}
	
	//annotation, @단어, 기능성 주석...
//	@Override //오버라이딩 한 애들만 붙일수있음
//	public String toString() {
//		return String.format("%s, %d원", this.model, this.price);
//	}	
}


class Time {
	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	
	@Override
	public String toString() {
		return this.hour + ":" + this.minute;
	}
	
	
}