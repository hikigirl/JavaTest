package com.test.examples;

public class Note {
	
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price = 500; //기본 노트값
	private String thickeness; //얇은..

	public String info() {
		String temp = "";
		if (this.owner != null) {
			temp += "■■■■■■ 노트 정보 ■■■■■■\n";
			temp += "소유자 : " + this.owner + "\n";
			temp += "특성 : " + this.color + " " + thickeness + " " + this.size + "노트\n";
			temp += "가격 : " + this.price + "원\n";
			temp += "■■■■■■■■■■■■■■■■■■■■■■\n";
		} else {
			temp += "■■■■■■ 노트 정보 ■■■■■■\n";
			temp += "주인없는 노트\n";
			temp += "■■■■■■■■■■■■■■■■■■■■■■\n";
		}
		return temp;
	}

	public void setSize(String size) {
		//A3, A4, A5, B3, B4, B5
		//A3(+400원), A4(+200원), B3(+500원), B4(+300원), B5(+100원)
		
		if (!size.equals("A3") && !size.equals("A4") && !size.equals("B3") && !size.equals("B4") && !size.equals("B5")) {
			
			return; //빈 리턴문(return을 실행 == 메서드 종료)
		}
		
		if (size.equals("A3")) {
			this.price += 400;
		} else if (size.equals("A4")) {
			this.price += 200;
		} else if (size.equals("B3")) {
			this.price += 500;
		} else if (size.equals("B4")) {
			this.price += 300;
		} else if (size.equals("B5")) {
			this.price += 100;
		}
		
		this.size = size;		
	}
	
	public void setColor(String color) {
		
		//검정색, 흰색, 노란색, 파란색
		//검정색(+100원), 노란색(+200원), 파란색(+200원)
		
		if (!color.equals("검정색") && !color.equals("노란색") && !color.equals("파란색") ) {
			return;
		}
		
		if (color.equals("검정색")) {
			this.price += 100;
		} else if (color.equals("노란색")) {
			this.price += 200;
		} else if (color.equals("파란색")) {
			this.price += 200;
		}
		
		this.color = color;
	}
	
	public void setPage(int page) {
		
		//10 ~ 200페이지 이내
		//(+) 10~50(얇다), 51 ~ 100(보통), 101 ~ 200(두껍다)
		//페이지 당 x 10원 추가
		
		if (page < 10 || page > 200) {
			return;
		}
		
		if (page >= 10 && page <= 50) {
			thickeness = "얇은";
		} else if (page >= 51 && page <= 100) {
			thickeness = "보통";
		} else {
			thickeness = "두꺼운";
		}
		
		this.price += (page - 10) * 10;
		
		this.page = page;
	}
	
	public void setOwner(String owner) {
		
		//한글 2~5자이내. 필수값
		if (owner == null || owner.equals("")) {
			return;
		}
		
		if (owner.length() < 2 || owner.length() > 5) {
			return;
		}
		
		for (int i=0; i<owner.length(); i++) {
			char c = owner.charAt(i);
			if (c < '가' || c > '힣') {
				return;
			}
		}
		
		this.owner = owner;
		
	}
	
}

















