package com.java0423;

public class Main {
	
	public void main(String[] args) {
		System.out.println("변수 연습");
		/**************************** 라인 지우기 단축키 Ctrl + D
		 * 0. 객체 (object > class)
		 * 1. 변수
		 * 2. 메소드 (method)
		 * 3. 출력
		 * 4. 연산 (사칙연산) : + - / * %       -- ++
		 * 5. 접근제한자 (4가지 : private, default, protected, public)
		 * 6. 정적 (static)
		 * 7. 리턴타입 (void)
		 * 8. 자료형
		 * 9. 매개변수 (메소드 호출 시 같이 보낼 값)
		 *****************************/
	// 객체(class)  객체변수  대입  생성키워드  객체 생성자
	//      Var	         v        =      new         Var();
		
		Var v = new Var();  // 객체 생성
		v.var();  // 메소드 호출  보통 많이 씀 
		
		//Var.var();  정적할당(할당된 만큼 메모리 소비) 꼭 필요 할 때만 만든다
		
	//	new Var();
	}
}
