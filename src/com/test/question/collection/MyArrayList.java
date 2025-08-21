package com.test.question.collection;

public class MyArrayList {
	private String[] list;
	private int index;		//index: 가져올 요소의 위치
	
	public MyArrayList() {
		//생성자
//		this.list = new String[4];
//		this.index = 0;
		this(4);
	}
	public MyArrayList(int initCapacity) {
		//생성자 오버로딩
		this.list = new String[initCapacity];
		this.index = 0;
	}
	
	//toString 메서드 오버라이딩
	@Override
	public String toString() {
		String temp = "";
		
		temp += "\n";
		temp += String.format("length: %d\n", this.list.length);
		temp += String.format("index: %d\n", this.index);
		temp += "[\n";
		for (int i=0; i<this.list.length; i++) {
			temp += String.format("  %d: %s\n", i, this.list[i]);
		}
		temp += "]\n";
		
		return temp;
	}
	
	public boolean add(String value) { //append 방식(맨끝에 넣기)
//		this.list[this.index] = value;
//		this.index++;
		//배열의 깊은 복사 구현할 것
		//if(칸이 남는지?) { }
		
		if (checkLength()) { 
			doubleLength();
			
			this.list[this.index] = value;
			this.index++;
			//System.out.println(Arrays.toString(this.list));
			
		} else {
			this.list[this.index] = value;
			this.index++;
		}
		
		return true;
	}

	private void doubleLength() {
		// 2배길이의 배열 생성, 깊은복사, 바꿔치기 3단계
		
		String[] copy = new String[(this.list.length) * 2]; //복사를위한 copy[]
		//System.out.println(this.list.length); //배열길이체크용 -> 이건 4칸이어야해..
		for (int i=0 ; i<this.list.length ; i++) {
			copy[i] = this.list[i];
		}
		this.list = copy;
		//System.out.println(Arrays.toString(copy));
		
//		this.list = new String[(this.list.length) * 2]; //공간이 없으면 배열을 2배로 늘려라
//		//System.out.println(this.list.length); //이건 8칸 나와야함
//		
//		for (int i=0 ; i<index ; i++) {
//			this.list[i] = copy[i];
//		}
	}

	private boolean checkLength() {
		//length와 index가 같으면 더 이상 공간이 없는거
		return this.list.length == this.index;
	}

	public boolean add(int index, String value) { //add 메서드 오버로딩(insert 방식)
//		this.list[index] = value;
//		//배열 1칸 추가되면서 밀리는거..
//		return true;
		if (invalidIndex(index)) {
			//예외 발생
			throw new IndexOutOfBoundsException();
		}
		
		if (checkLength()) { 
			doubleLength();
		}
			
		//index 뒤의 요소들을 뒤로 미는 작업을 해야함
		for (int i=this.index; i>=index;i--) {
			this.list[i+1] = this.list[i]; //뒤로 한칸씩 밀기
		}
		
		this.list[index] = value;
		this.index++;
				
//		else { //여기서 뒤로 밀리는게 안되고잇음
//			for (int i=this.index; i>=index;i--) {
//				this.list[i+1] = this.list[i]; //뒤로 한칸씩 밀기
//			}
//			this.list[index] = value;
//			this.index++;
//		}
		
		return true;
		
	}

	public String get(int index) {
		if (invalidIndex(index)) {
			//예외 발생
			throw new IndexOutOfBoundsException();
		}
		return this.list[index];
	}

	private boolean invalidIndex(int index) {
		//방 번호 유효성검사 확인
		if (index >=0 && index<this.index) {
			return false;
		}
		return true;
	}

	public int size() {
		return this.index; //index와 현재 들어있는 요소의 개수는 일치한다.
	}

	public String set(int index, String value) { //덮어쓰기
		if (invalidIndex(index)) {
			//예외 발생
			throw new IndexOutOfBoundsException();
		}
		this.list[index]= value;
		return this.list[index];
	}

	public String remove(int index) {//왼쪽으로 시프트 발생
		if (invalidIndex(index)) {
			//예외 발생
			throw new IndexOutOfBoundsException();
		}
		for (int i = index ; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		this.index--;  
		return this.list[index];
	}
	
	public int indexOf(String value) {
		//for문 돌면서 value와 배열 안 내용이 일치하는지 확인
		//여러개 있으면 앞쪽에있는 값의 인덱스 반환
		//for (int i=0; i<this.list.length; i++) {
		for (int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		//System.out.println(this.index);
		
		return -1;
		
		
	}
	
	public int indexOf(String value, int beginIndex) {
		//for문 돌면서 value와 배열 안 내용이 일치하는지 확인
		//여러개 있으면 앞쪽에있는 값의 인덱스 반환
		//for (int i=0; i<this.list.length; i++) {
		for (int i=beginIndex; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		//System.out.println(this.index);
		
		return -1;
		
		
	}
	
	public int lastIndexOf(String value) {
		//for문 돌면서 value와 배열 안 내용이 일치하는지 확인
		//여러개 있으면 앞쪽에있는 값의 인덱스 반환
		
		for (int i=this.index-1; i>=0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		//System.out.println(this.index);
		
		return -1;
		
		
	}
	public int lastIndexOf(String value, int beginIndex) {
		//for문 돌면서 value와 배열 안 내용이 일치하는지 확인
		//여러개 있으면 앞쪽에있는 값의 인덱스 반환
		
		for (int i=beginIndex; i>=0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		//System.out.println(this.index);
		
		return -1;
		
		
	}
	
	
	public boolean contains(String value) {
		for (int i=this.index-1; i>0; i--) {
			if (this.list[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	public void clear() {
//		for (int i=0; i<this.index; i++) {
//			this.list[i] = null;
//		}
		this.index = 0; //인덱스도 꼭 초기화할것
		
		//인덱스만 초기화하면 굳이 null값을 넣지 않아도 덮어쓰기되면서 알아서.. 
		
	}
	
	public void trimToSize() {
		
		String[] copy = new String[this.index]; //복사를위한 copy[]
		
		for (int i=0 ; i<this.index ; i++) {
			copy[i] = this.list[i];
		}
		
		this.list = copy;
		
//		this.list = new String[this.index];
//		
//		for (int i=0 ; i<this.index ; i++) {
//			this.list[i] = copy[i];
//		}
		
	}

	
	
	
}

























