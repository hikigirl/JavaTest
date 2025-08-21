package com.test.question.obj;

public class Book {
	
	private String title;				//제목
	private int price;					//가격
	private String author;				//저자
	private String publisher;			//출판사
	private String pubYear = "2019";	//발행년도, 2019로 초기화
	private String isbn;				//ISBN
	private int page;					//페이지수


	//title - getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		//title: 최대 50자 이내(한글, 영어, 숫자, 공백)
		if (title.length() <= 50) {
			this.title = title;
		} else {
			System.out.println("제목은 최대 50자까지 입력 가능합니다.");
		}
	}

	//price - getter, setter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		//price: 0~1000000(백만원)
		if (price >=0 && price <= 1000000) {
			this.price = price;
		} else {
			System.out.println("가격은 1,000,000원을 초과할 수 없습니다.");
		}
		
	}

	//author - getter, setter
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//page - getter, setter
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		//page: 1~무제한 (양수만)
		if (page > 0) {
			this.page = page;
		} else {
			System.out.println("페이지 수는 1 이상만 입력가능합니다.");
		}
	}
	
	//publisher - 쓰기전용, setter만
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//pubYear - 읽기전용, 2019년(위에서 초기화한 값)으로 고정
	public String getPubYear() {
		return pubYear;
	}
	
	//isbn - getter, setter
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	//dump용 info() 메서드
	public String info() {
		String temp = "";
		
		temp += "제목: " + title + "\n";
		temp += "가격: " + price + "원\n";
		temp += "저자: " + author + "\n";
		temp += "출판사: " + publisher + "\n";
		temp += "발행년도: " + pubYear + "년\n";
		temp += "ISBN: " + isbn + "\n";
		temp += "페이지: " + page + "장\n";
		//누적 방식 말고 printf를 사용할 순 없는지..
		
		return temp;
	}
//	private String title;				//제목
//	private int price;					//가격
//	private String author;				//저자
//	private String publisher;			//출판사
//	private String pubYear = "2019";	//발행년도, 2019로 초기화
//	private String isbn;				//ISBN
//	private int page;					//페이지수
}
