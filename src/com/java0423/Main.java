package com.java0423;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("변수 연습");
		/****************************
		 * 1. 변수
		 * 2. 메소드 (method)
		 * 3. 출력
		 * 4. 연산 (사칙연산)
		 * 5. 접근제한자
		 * 6. 정적
		 * 7. 리턴타입 (void)
		 * 8. 자료형
		 * 9. 매개변수 (메소드 호출 시 같이 보낼 값)
		 *****************************/
		
		/*****************************
		 * 변수 사용법
		 * 1. 변수 선언
		 * 2. 변수에 데이터 대입(값 담기)
		 * 3. 변수 사용
		 *****************************/
		int a; //1
		a=1;  //2
		System.out.println(a); //3
		
		int b=2; //1,2
		System.out.println(b); //3
		
		int c,d,e; //1
		c=a;
		d=b;
		e=c+d;
		System.out.println(e); //3
		
		int f;
		f=a;
		System.out.println(a);
		
		a=10;
		System.out.println(a);
		System.out.println(f);
		
	}
}
