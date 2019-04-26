package com.java0423;

public class calculator {

	public  void main(String[] args) {
    /******************************
	 * 문제) 변수와 메소드를 이용하여 계산기를 만든다.
	 * 계산기 : 두개의 숫자를 이용하여 연산
	 * 덧셈 : int a , int b > a + b; > 결과 리턴
	 ******************************/
	System.out.println(add(5,3));
	System.out.println(mul(5,3));
	System.out.println(sub(5,3));
	System.out.printf("%.1f \n",div(5,3));
	System.out.printf("%.1f \n",per(5,3));  //나머지 연산자
	}
	
		static int add(int a, int b) {
			return a + b;
		}
		static int sub(int a, int b ) {
			return a - b;
		}
		static int mul(int a, int b) {
			return a * b;
		}
		static float div(float a, float b) {
			return a / b;
		}
		static float per(float a, float b ) {
			return a%b;
		}
}
