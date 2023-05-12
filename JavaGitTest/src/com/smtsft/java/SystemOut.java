package com.smtsft.java;

public class SystemOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"홍길동", "이영순", "한철수"};
		for (String name : names) {
			System.out.format("Hello, %s!\n", name);
		}
	}
}
