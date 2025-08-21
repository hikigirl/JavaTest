package com.test.question.obj;

public class Q93_NoteClass {

	public static void main(String[] args) {
//		Note note = new Note();
//		note.setOwner("홍길동");
//		//System.out.println(note.isKorean("abc"));
//		//System.out.println(note.isKorean("홍길동"));
//		System.out.println(note.info());
//	
//		Note note2 = new Note();
//		note2.setOwner("abc");
//		System.out.println(note2.info());
		
// 원본		
		Note note = new Note();
		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");

		System.out.println(note.info());


		Note note2 = new Note();

		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);

		System.out.println(note2.info());
	}

}
