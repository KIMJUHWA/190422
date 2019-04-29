package java0426;

public class 배열 {
	
	public void t1() {
		int a;         // 변수 선언
		int[] aa;     // 배열 선언
		
		a = 1;
	
		// 배열 초기값 정의
		aa = new int[5];  // 배열 생성 및 크기 설정 
		aa[0] = 1;            // 배열 특정 위치에 값 담기
		
		int[] bb = new int[2];
		bb[0] = 0;
		bb[1] = 1;
		
		System.out.println(a);   // int a = 1;
//		System.out.println(aa);
//		System.out.println(bb);
		
		System.out.println(aa[0]);   // 배열 특정 위치 값 사용
		System.out.println(bb[0]);
		System.out.println(bb[1]);
	}
/*	public void t2() {
		int[] one단 = new int[9];
		one단[0] = (1 * 1);
		one단[1] = (1 * 2);
		one단[2] = (1 * 3);
		one단[3] = (1 * 4);
		one단[4] = (1 * 5);
		one단[5] = (1 * 6);
		one단[6] = (1 * 7);
		one단[7] = (1 * 8);
		one단[8] = (1 * 9);
		// [1, 2, 3, 4, 5, 6, 7, 8, 9]
		//  0   1  2  3  4  5  6  7  8 
		
		System.out.println("1 * 5 = " + one단[4]);
	} */
	public void t3() {
		int[] 단 = new int[9];
		for(int i =1; i <=9; i++) {  // 정수 배열에 데이터 값 담기 반복문 실행
			int 값 = (1 * i);
			int index = (i - 1);   // 0, 1, 2, 3, 4, 5, 6, 7, 8
			단[index] = 값;
		}
		for(int i = 0; i < 단.length; i++) {
			int 수 = (i + 1);
			System.out.println("1 * " + 수 + " = " + 단[i]);
		}
	}
	public void t4() {
		String[] 요일 = new String[7];
		요일[0] = "일";
		요일[1] = "월";
		요일[2] = "화";
		요일[3] = "수";
		요일[4] = "목";
		요일[5] = "금";
		요일[6] = "토";
		
		// 일 > 화 > 목 > 토
	    // 인덱스 0 > 2 > 4 > 6  짝수

		for(int i = 0; i < 요일.length; i+=2) {   // 방법1   4번 돈다
			System.out.println(요일[i]);
		}
		for(int i = 0; i < 요일.length; i++) {   // 방법2   7번 돈다
			if(i % 2 == 0) {
				System.out.println(요일[i]);
			}
		}
	}
	public void t5() {
		int[][] 빙고 = new int[5][5];
		빙고[0][0] = 5;
		빙고[0][1] = 3;
		빙고[1][2] = 1;
		
		for(int i = 0; i < 빙고.length; i++) {
			for(int j = 0; j < 빙고[i].length; j++) {
				System.out.print(빙고[i][j]);
			}
			System.out.println();
		}
	}
	public void t6() {
		int[][] 요일 = new int[5][7];
		int count = 1;
		for(int i = 0; i < 요일.length; i++) { 
			
			for(int j = 0; j < 요일[i].length; j++) {
				
				if(count < 31) {
					요일[i][j] = count;
					count++;
					System.out.print(요일[i][j]);
				} else {
					break;
				}
			}
			System.out.println();
		}
	}
	public void t7() {
		// 1. 현재 달의 달력 데이터를 요일 배열에 데이터를 담아 보세요.
		// 2. 출력 오늘 요일을 표현 할 것.
		String[] a = new String[7];
		a[0] = "월";
		a[1] = "화";
		a[2] = "수";
		a[3] = "목";
		a[4] = "금";
		a[5] = "토";
		a[6] = "일";
		String[][] b = new String[7][5];
		int count = 1;
		for(int i = 0; i < b.length; i++) {    //행의 개수
			
			for(int j = 0; j <b[i].length; j++) {
			if(count>31) {
				b[i][j] = a[i];
				System.out.print(b[i][j]);
			} else {
				break;
			}
			System.out.println();
			}
		}
		}
	public void test() {
	/****
	 * String[] a = new String[7];
	String[] b = new String[7];
	a[0] = "월";
	a[6] = "일";
	반복문을써서
	b <- a
	 ********/
		String[] a = new String[7];    // 문자배열은 값을 일일이 적고 옮겨줘야함
		a[0] = "월";
		a[1] = "화";
		a[2] = "수";
		a[3] = "목";
		a[4] = "금";
		a[5] = "토";
		a[6] = "일";
		String[] b = new String[7];
		
		for(int i = 0; i < a.length; i++) {
		b[i]=a[i];
			
		System.out.println(b[i]);
		}
 	}
	public void test2() {
		String[] a = new String[7];
		a[0] = "월";
		a[1] = "화";
		a[2] = "수";
		a[3] = "목";
		a[4] = "금";
		a[5] = "토";
		a[6] = "일";
		String[][] b = new String[5][7];
	/************************	
		String[][] a = new String[3][9];      length의 뜻!
		System.out.println(a.length);     결과값 : 3 행의 개수
		System.out.println(a[1].length); 결과값 : 9 열의 개수
		*************************/
		
		for(int i = 0; i <b.length; i++) {   //b.length = 행의 개수
			for(int j = 0; j < b[i].length; j++) {  //b[].length = 열의 개수
			b[i][j] = a[j];
				
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	}
}
