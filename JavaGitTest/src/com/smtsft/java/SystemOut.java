package com.smtsft.java;

public class SystemOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"홍길동", "이영순", "이영환"};
		for (int i=0; i < names.length; i++) {
			System.out.format("Hello, %s!\n", names[i]);			
		}
	}
}
