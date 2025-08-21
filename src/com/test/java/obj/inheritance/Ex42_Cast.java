package com.test.java.obj.inheritance;

public class Ex42_Cast {

	public static void main(String[] args) {
		//42. 형변환
//		char c1 = 'A';
//		String s1 = "A";
//		String s2 = "100";
//		
//		int n = Integer.parseInt(s2); //parsing
//		
//		System.out.println((int)c1);	//형변환(O)
//		//System.out.println((int)s1);	//형변환(X)
		
		CParent p1;
		CChild c1;
		
		//parent = child, 업캐스팅, 100% 안전
		//p1 = (CParent)c1;
		c1 = new CChild(); //자식 객체 -> 원본 역할
		p1 = c1;
		
		
		//검증?
		//값형: 원본과 사본이 동일한지?
		
		//참조형: 복사본을 사용했을 때 문제가 발생하는가?
		p1.a = 10;
		p1.b = 20;
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		
		CParent p2;
		CChild c2;
		
		
		p2 = new CParent(); //부모클래스가 원본
		
		//복사
		//child = parent
		//명시적 형변환
		//자식클래스 = 부모클래스
		//다운캐스팅
		// 불안정 -> 100% 불가능
//		c2 = (CChild)p2; //명시적 형변환
//		
//		//검증
//		c2.a = 10;
//		c2.b = 20;
//		c2.c = 30;
//		c2.d = 40;
		
		CParent p3;
		CChild c3;
		c3 = new CChild();
		
		p3 = c3; //업캐스팅, 문제없음
		
		CChild c4;
		
		//다운캐스팅인척하는데 사실아님.. 걍 껍데기만
		c4 = (CChild)p3;
		c4.a = 10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;
		
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);
		
		CDescendant d5 = new CDescendant(); //손자
		CChild c5;	//아버지
		CParent p5; //할아버지
		
		//업캐스팅
		//c5(abcd) = d5(abcdef)
		c5 = d5;
		//p5(ab) = d5(abcdef)
		p5 = d5;
		
		
	}

}


class CParent {
	public int a;
	public int b;
}

class CChild extends CParent {
	public int c;
	public int d;
}

class CDescendant extends CChild {
	public int e;
	public int f;
}

