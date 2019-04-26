package com.java0423;

public class Var {
	
	public Var() {}  // 기본 생성자 - Var v = new Var(); - v.var();

	// 리턴유형정의  함수명(매개변수)  로직 구현
	//  void	                var             {}	
	
	//전역변수
	//접근 제한자 4가지
	public int state1;
	int state2;
	protected int state3;
	private int state4;
	
	//지역변수
	public  void  var() {  //public static void 사용 - Var.var(); 정적할당
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
