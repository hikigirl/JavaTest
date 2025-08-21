package com.test.question.collection;

public class MyStack {
	private String[] stack;
	private int index;
	
	public MyStack() { //생성자
		this.stack = new String[4];
		this.index = 0;
	}
	
	@Override
	public String toString() { //toString() 오버라이딩
		String temp = "";
		temp += String.format("length: %d\n", this.stack.length);
		temp += String.format("index: %d\n\n", this.index);
		temp += "[\n";
		for (int i=0 ; i<this.stack.length; i++) {
			temp += String.format("%d: %s\n", i, this.stack[i]);
		}
		temp += "]\n";
		return temp;
	}

	public boolean push(String value) {
		if(checkLength()) {
			doubleLength();
		}
		
		this.stack[this.index] = value;
		this.index++;
		return true;
	}

	private void doubleLength() {// 배열 2배로늘리고 깊은복사
		
		String[] copy = new String[(this.stack.length)*2];
		
		for (int i=0; i<this.index; i++) {
			copy[i] = this.stack[i];
		}
		this.stack = copy;
		
	}

	private boolean checkLength() { //길이 체크
		return this.stack.length == this.index;
	}

	public String pop() { //LIFO, 후입선출, 맨끝에있는걸 리턴
		String popVal = this.stack[this.index-1];
		this.index--;
		return popVal;
	
	}

	public int size() {
		return this.index;
	}

	public String peek() {
		return this.stack[this.index-1];
	}

	public void trimToSize() {
		String[] copy = new String[this.index];
		for (int i=0; i<this.index; i++) {
			copy[i] = this.stack[i];
		}
		this.stack = copy;
		
	}

	public void clear() {
		this.index = 0;
		
	}
	
	
	
	
}
