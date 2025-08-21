package com.test.question.collection;

public class MyQueue {
	private String[] queue;
	private int index;
	
	public MyQueue() {//생성자
		this.queue = new String[4];
		this.index = 0;
	}
	
	@Override
	public String toString() { //toString 오버라이딩
		String temp = "";
		temp += String.format("length: %d\n", this.queue.length);
		temp += String.format("index: %d\n\n", this.index);
		temp += "[\n";
		for (int i=0 ; i<this.queue.length; i++) {
			temp += String.format("%d: %s\n", i, this.queue[i]);
		}
		temp += "]\n";
		return temp;
	}
	
	public boolean add(String value) { //요소 추가
		if(checkLength()) {
			doubleLength();
		}
		this.queue[this.index] = value;
		this.index++;
		
		return true;
	}

	private void doubleLength() { //배열 2배로 늘린 후 깊은복사
		
		String[] copy = new String[(this.queue.length) * 2];
		for (int i=0;i<this.queue.length; i++) {
			copy[i] = this.queue[i];
		}
		this.queue = copy;
		
	}

	private boolean checkLength() { //배열 길이 체크
		return this.queue.length == this.index;
	}

	
	
	public String poll() { //꺼내기(선입선출)
		// 빼면 index도 1개 줄이고 남아있는애들을 한칸씩 왼쪽으로 당겨야함(앞에있는거부터)
//		if (this.index == 0) {
//			return null;
//		}
		String pollVal = this.queue[0];
		
		for (int i=1; i<this.index; i++) {
			this.queue[i-1] = this.queue[i];
		}
		
		this.index--;
		return pollVal;
	}

	
	public int size() {
		return this.index;
	}

	public String peek() { //내용만 확인
		return this.queue[0];
	}

	public void trimToSize() { //크기조절
		String[] copy = new String[this.index];
		for (int i=0 ; i<this.index ; i++) {
			copy[i] = this.queue[i];
		}
		this.queue = copy;
		
	}

	public void clear() { //초기화
		this.index = 0;
		
	}
	
}
