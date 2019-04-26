package com.java0423;

public class A {
	//기본 생성자
	public A() {   //2
		new B("안녕!"); // B 클래스 생성자 생성
	}
	
	public A(String msg) {    //4
		System.out.println("B class : " + msg);
	}

}
