package com.test.examples;

public class Note2 {
	//멤버변수
	private String size;	//크기
	private String color;	//표지색상
	private int page;		//페이지수
	private String owner;	//소유자이름
	private int price = 500;	//가격

	// setter, getter 구현
	
	public void setSize(String size) { //크기: A3, A4, A5, B3, B4, B5
		switch (size) {
			case "A3":
			case "A4":
			case "A5":
			case "B3":
			case "B4":
			case "B5":
				this.size = size;
				break;
			default:
				System.out.println("유효한 크기가 아닙니다.");
				break;
		}
		
		
		
	}

	public void setColor(String color) {
		
		switch (color) {
			case "검정색":
			case "흰색":
			case "노란색":
			case "파란색":
				this.color = color;
				break;
			default:
				System.out.println("유효한 색상이 아닙니다.");
				break;
		}
	}

	public void setPage(int page) { //페이지수 범위에 따라 한글로 바꾸는 과정이 필요..
		if (page >= 10 && page <=200) {
			this.page = page;
		} else {
			System.out.println("유효한 페이지수가 아닙니다.");
		}
	}
	

	public void setOwner(String owner) { //
		//1) 한글만 입력되었는지 확인 -> isKorean 메서드에서.. 2) 길이가 맞는지 확인
		if (owner.length() >= 2 && owner.length() <= 5) { //조건2 - 길이체크
			if (isKorean(owner)==true) { //조건1 - 메서드를 통해 한글인지체크
				this.owner = owner;
			} else {
				this.owner = null;
			}
		} else {
			this.owner = null;
		}
		
	}
	
	private boolean isKorean(String owner) { //owner가 한글인지 판별하기 위한 메서드
		//입력값이 "홍길동" 이라면..
		// 홍, 길, 동 떼어서 생각
		String temp = owner;
		for (int i=0; i<temp.length(); i++) {
			char c = temp.charAt(i);
			//System.out.println(c);
			
			//한 글자씩 한글인지 판별.. 유효성 검사는 인정 안되는 범위를 조건식으로 적자..
			if (c < '가' || c >'힣') {
				return false;
			} 
		}
		return true;
	}
	
	//가격 구하기...
	public int price(int price) {
		//기본 노트: A5, 흰색, 10페이지 = 500원
		
		switch (this.size) {
			case "A3":
				price += 400;
				break;
			case "A4":
				price += 200;
				break;
			case "B3":
				price += 500;
				break;
			case "B4":
				price += 300;
				break;
			case "B5":
				price += 100;
				break;
		}
		
		switch (this.color) {
			case "검정색":
				price += 100;
				break;
			case "노란색":
				price += 200;
				break;
			case "파란색":
				price += 200;
				break;
		}
		
		if (this.page - 10 > 0) {
			price += (this.page - 10) * 10;
		}
		return price;
	}
	
	//dump용 info() 메서드
	public String info() {
		String temp = "";
		String thick = "";
		
		if (page >=10 && page <=50) {
			thick = "얇은";
		} else if (page >=51 && page <=100) {
			thick = "보통";
		} else if (page >=101 && page <=200) {
			thick = "두꺼운";
		}
		
		if (owner == null) { 
			temp += "■■■■■■ 노트 정보 ■■■■■■\n";
			temp += "주인 없는 노트\n";
			temp += "■■■■■■■■■■■■■■■■■■■■■■■\n\n";
			
		} else {
			temp += "■■■■■■ 노트 정보 ■■■■■■\n";
			temp += "소유자: " + this.owner +"\n";
			temp += "특성: " + this.color + "\s" + thick + "\s" + this.size + "노트\n";
			temp += "가격: " + price(this.price) + "원\n";
			temp += "■■■■■■■■■■■■■■■■■■■■■■■\n\n";
			
		}
		
		return temp;
		
//		if (this.owner.equals("주인 없는 노트")) { 
//			System.out.println("■■■■■■ 노트 정보 ■■■■■■");
//			System.out.printf("%s\n", owner);
//			System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
//			
//		} else {
//			System.out.println("■■■■■■ 노트 정보 ■■■■■■");
//			System.out.printf("소유자: %s\n", owner);
//			System.out.printf("특성: %s %s %s노트\n", color, page, size);
//			System.out.printf("가격: %,d원\n", price);
//			System.out.printf("■■■■■■■■■■■■■■■■■■■■■■\n\n");
//		}
		
	}
}
