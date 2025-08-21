package com.test.question.obj;

public class Q92_BookClass {

	public static void main(String[] args) {
		
		Book b1 = new Book();

		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setPage(1022);

		System.out.println(b1.info());
		
		//유효성검사용 b2
		Book b2 = new Book();

		b2.setTitle("123456789012345678901234567890123456789012345678901"); //제목 - 검사
		b2.setPrice(2000000); //가격 - 검사
		b2.setAuthor("남궁성");
		b2.setPublisher("도우출판");
		b2.setIsbn("8994492038");
		b2.setPage(-20); //페이지 - 검사

		System.out.println(b2.info());

	}

}
