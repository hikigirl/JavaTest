package com.test.question;

public class Q18_OddOverload {
	public static void main(String[] args) {
		int count = 0;
		count = positive(10);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30, 40);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수: %d개\n", count);
	}

	private static int positive(int i, int j, int k, int l, int m) {
		int count = 0; 
		count = (i>0)? count + 1 : count + 0;
		count = (j>0)? count + 1 : count + 0; 
		count = (k>0)? count + 1 : count + 0; 
		count = (l>0)? count + 1 : count + 0; 
		count = (m>0)? count + 1 : count + 0; 
		return count;
	}

	private static int positive(int i, int j, int k, int l) {
		int count = 0; 
		count = (i>0)? count + 1 : count + 0;
		count = (j>0)? count + 1 : count + 0; 
		count = (k>0)? count + 1 : count + 0; 
		count = (l>0)? count + 1 : count + 0; 
		return count;
	}

	private static int positive(int i, int j, int k) {
		int count = 0; 
		count = (i>0)? count + 1 : count + 0;
		count = (j>0)? count + 1 : count + 0; 
		count = (k>0)? count + 1 : count + 0; 
		return count;
	}

	private static int positive(int i, int j) {
		int count = 0; 
		count = (i>0)? count + 1 : count + 0;
		count = (j>0)? count + 1 : count + 0; 
		return count;
	}

	private static int positive(int i) {
		int count = 0; 
		count = (i>0)? count + 1 : count + 0;
		return count;
	}
}
