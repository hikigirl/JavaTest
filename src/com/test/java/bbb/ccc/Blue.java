package com.test.java.bbb.ccc;

import com.test.java.aaa.Red;

//다른 패키지 + 자식 클래스
public class Blue extends Red {
	//상속과 무관하게 Red는 따로 import 해야함
	public void test() {
		this.a = 10;	//public
//		this.b = 20;	//private
//		this.c = 30;	//default(package)
		this.d = 40;	//protected
	}

}
