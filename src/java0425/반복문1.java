package java0425;

public class 반복문1 {
	/*************************************
	 * for문 : for(1, 2, 3) { 실행문 }
	 * 1) 초기화식 : for문에서 사용할 변수 선언 및 초기값 정의
	 * 2) 조건식 : if문과 동일하게 거짓을 찾기 위한 조건
	 * 3) 증감식 : for문에서 사용할 변수에 변화를 주기 위한 식
	 **************************************/
/*
		public void t1() {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);   // 0 ~ 9
			}
		}
		
		public void t2(int s) {
			System.out.println("반복문 시작");
			for(int i = 0; i < s; i++) {
				System.out.println(i);
			}
			System.out.println("반복문 종료");
		}
		public void t3(int a, int b) {
			System.out.println("t3 반복문 시작");
			for(;a < b;a += 2) {  // a+=2 (2씩 증가)
				System.out.println(a);
			}
			System.out.println("t3 반복문 종료");
		}
		public void t4() {  // 0 ~ 4
			for(int i = 0; i <5; i++) {
				if(i % 2 == 0) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}
				System.out.println("");
			}
		}
	     public void t5() {
	    	 for(int i = 0; i < 5; i++) {  // 0 ~ 4
	    		 
	    		 for(int j = 0; j <=  i; j++) {  // j는 0부터 i값이 될때까지 1씩 오름
	    			 // j = 0, i = 0  결과:★
	    			 // j = 0, i = 1  >> j = 1, i = 1 결과:★☆
	    			 // j = 0, i = 2  >> j = 1, i = 2  >> j = 2, i = 2  결과:★☆★
	    			 // j = 0, i = 3  >> j = 1, i = 3  >> j = 2, i = 3  >> j = 3, i = 3  결과:★☆★☆
	    			 if(j % 2 == 0) {
	    				 System.out.print("★");
	    			 } else {
	    				 System.out.print("☆");
	    			 }
	    		 }
	    		 System.out.println("");
	    	 }
	     }
	     public void t6() {
	    	 for(int i = 0; i < 5; i++) {  // 0 ~ 4
	    		 
	    		 for(int j = 0; j <=  i; j++) {
	    			 //  i - j
	    			 // 0 - 0 = 0  결과:★
	    			 // 1 - 0 = 1  >> 1 - 1 = 0  결과:☆★
	    			 // 2 - 0 = 2  >> 2 - 1 = 1 >> 2 - 2 = 0  결과:★☆★
	    			
	    			 if((i-j) % 2 == 0) {
	    				 System.out.print("★");
	    			 } else {
	    				 System.out.print("☆");
	    			 }
	    		 }
	    		 System.out.println("");
	    	 }
	     }
	     public void t7() {
	    	 System.out.println("***t7 시작***");
	    	 int t = 0;
	    	 for(int i = 0; i < 9; i++) {    // 0, 1, 2, 3, 4, 3, 2, 1, 0
	    		 if(i > 4) {
	    			 t = t - 2;
	    		 }
	    		 
	    		 for(int j = 0; j <= t; j++) {  
	    			
	    			 if(j % 2 == 0) {
	    				 System.out.print("★");
	    			 } else {
	    				 System.out.print("☆");
	    			 }
	    		 }
	    		 t++;     // 첫번째 for문이 끝날 때마다 1씩 증가되서 -2를 해야 1씩 감소됨
	    		 System.out.println("");
	    	 }
	    	System.out.println("***t7 끝***");
	     }
	     public void t8() {
	    	 System.out.println("***t8 시작***");
	    	 int a = 0;
	    	 for(int i = 0; i < 9; i++) {  
	    		 if(i > 4) {
	    			 a -= 2;
	    		 }
	    		 for(int j = 0; j <= a; j++) {
	    			
	    			 if((i-j) % 2 == 0) {
	    				 System.out.print("★");
	    			 } else {
	    				 System.out.print("☆");
	    			 }
	    		 }
	    		 a++;
	    		 System.out.println("");
	    	 }
	    	 System.out.println("***t8 끝***");
	     } */
	     public void  goo() {	    		    	 
	    	System.out.println("문제1**************");
	    	 for(int i = 1; i <= 3; i++) {
	    		 System.out.println(i + "단");
	    		 for(int j = 1; j <10; j++) {
	    			 System.out.println(i + " * " + j + " = " +( i*j));
	    		 }
	    		 System.out.println();  // 아무것도 안쓰면 줄바꿈
	    	 }
	     }
	     public void goo11(int a) {
	    	 System.out.println("문제1***방법2*******");
	    	 for(int i =1; i <= a; i++) {
	    		 System.out.println(i + "단");
	    		 for(int j = 1; j <10; j++) {
	    			 System.out.println(i + " * " + j + " = " + ( i*j));
	    		 }
	    	 }
	     }
	     public void goo2() {
	    	 System.out.println("문제2*************");
	    	  	
	    	 for(int i = 1; i <= 9; i+=3) {
	    		 System.out.print(i + " 단\t\t");
	    		 System.out.print((i + 1) + " 단\t\t");
	    		 System.out.print((i + 2) + " 단\t\t");
	    		 System.out.println();
	    		 for(int j = 1; j <= 9; j++) {
	    			 System.out.print(i + " * " + j + " = " +(i*j) + "\t");
	    			 System.out.print((i + 1) + " * " + j + " = " + ((i + 1)*j) + "\t");
	    			 System.out.print((i + 2) + " * " + j + " = " + ((i + 2)*j) + "\t");
	    			 System.out.println();
	    		 }
	    		 System.out.println();
	    	 } 
	     } 
	     public void goo3() {
	    	 System.out.println("문제3*************");
	    	  	
	    	 for(int i = 1; i <= 3; i++) {
	    		 System.out.print(i + " 단\t\t");
	    		 System.out.print((i + 3) + " 단\t\t");
	    		 System.out.print((i + 6) + " 단\t\t");
	    		 System.out.println();
	    		 for(int j = 1; j <= 9; j++) {
	    			 System.out.print(i + " * " + j + " = " + (i*j) + "\t");
	    			 System.out.print((i + 3) + " * " + j + " = " + ((i + 3)*j) + "\t");
	    			 System.out.print((i + 6) + " * " + j + " = " + ((i + 6)*j) + "\t");
	    			 System.out.println();
	    		 }
	    		 System.out.println();
	    	 } 
	     } 
}
	 		
	 	
	    

	    	 
	     


