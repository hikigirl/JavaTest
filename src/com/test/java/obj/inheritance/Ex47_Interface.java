package com.test.java.obj.inheritance;

public class Ex47_Interface {

	public static void main(String[] args) {
		//47. 인터페이스
		//자바는 다중 상속이 불가능하다.
		//다만 인터페이스 다중 상속은 가능하다.
		
		//m1();
		회사();
		집();
	}

	private static void 집() {
		아빠 hong = new 홍길동(); //업캐스팅
		
		hong.아이와논다();
		hong.돈벌기();
		
		//주말에 일해야돼.. 결재
		부장 hong2 = (부장)hong; //아빠에서 부장으로 바뀜
		hong2.결재한다();
		
	}

	private static void 회사() {
		부장 hong = new 홍길동(); //업캐스팅
		
		hong.결재한다();
		hong.팀원관리();
	}

	public static void m1() {
		홍길동 hong = new 홍길동();
		//부장
		hong.결재한다();
		hong.팀원관리();
		//아빠
		hong.아이와논다();
		hong.돈벌기();
	}

}

class AAAAA{
	public int a;
}

class BBBBB extends AAAAA {
	public int b;
}

class CCCCC extends AAAAA {
	public int c;
}

//class DDDDD extends BBBBB, CCCCC {
//	//DDDDD가 BBBBB와 CCCCC를 둘 다 부모로 상속받으면
//	//무슨 문제가 발생하는가?
//	//public int num *2개
//}





//홍길동 객체 생성

//인터페이스 -> 어떤 역할 부여
interface 부장 {
	void 결재한다();
	void 팀원관리();
}

interface 아빠 {
	void 돈벌기();
	void 아이와논다();
}

class 홍길동 implements 부장, 아빠 {
	//부장 인터페이스
	@Override
	public void 결재한다() {}
	
	@Override
	public void 팀원관리() {}
	
	//아빠 인터페이스
	@Override
	public void 돈벌기() {}

	@Override
	public void 아이와논다() {}
}











