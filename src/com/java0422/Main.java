package com.java0422;

public class Main {

	public void main(String[] args) {			
		System.out.println("변수 시작!");

		//String  문자열선언;   변수 만들기
        //문자열선언	= "";      변수에 값을 대입(=)한다.
		
		String 문자열 = "Hello World";  // 변수 선언과 대입을 동시에 함        
        System.out.println(문자열);  // 변수 사용        
        문자열 = "문자열 변경";  // 값 변경        
        System.out.println(문자열);  // 변수 사용        
        문자열 = "1234";  // 연산
        System.out.println(문자열);  // 변수 사용
        
        int 정수 = 1;
        System.out.println(정수);
        
        String 결과값 = 문자열 + 정수 + 정수 + 정수;  //사칙연산때문에 문자열이 먼저오면 문자열계산됨
        System.out.println(결과값);
        
        String 결과값2 = 정수 + 정수 + 정수 + 문자열;
        System.out.println(결과값2);
        
        String 결과값3 = 문자열 + (정수 + 정수 + 정수);
        System.out.println(결과값3);
	}

}
