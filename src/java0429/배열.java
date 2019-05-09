package java0429;

import java.util.Scanner;
	
	public class 배열 {
		public void t1() {
				boolean[][] ft = new boolean[5][5];
				ft[0][0] = false;
				ft[0][1] = false;
				ft[0][2] = false;
				ft[0][3] = false;
				ft[0][4] = false;
				
				ft[1][0] = true;
				ft[1][1] = true;
				ft[1][2] = true;
				ft[1][3] = true;
				ft[1][4] = true;
				
				ft[3][0] = true;
				ft[3][1] = true;
				ft[3][2] = true;
				ft[3][3] = true;
				ft[3][4] = true;
				
				for(int y = 0; y < ft.length;y++) {   // 행
					for(int x = 0; x < ft[y].length;x++) {  // 열
						System.out.print(ft[y][x] + "\t");
					}
					System.out.println();
				}
			}
		public void t2() {     // 패턴이 있을 때 사용가능
				int[][] ft = new int[5][5];
			
				for(int y = 0; y < ft.length; y++) {
					for(int x = 0; x < ft[y].length; x++) {
						if(y%2 == 0) {   // 짝수
							ft[y][x] = 0;
					} else {   // 홀수
		 				ft[y][x] = 1;
					}
				}
			}
			for(int y = 0; y < ft.length;y++) {   //  출력하기 위한 for문
				for(int x = 0; x < ft[y].length;x++) { 
					System.out.print(ft[y][x] + "\t");
				}
				System.out.println();
			}
		}
		public void t3() {
			int[][] a = new int[5][5];
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[i].length; j++) {
					if(i == j || i + j == 4) {
						a[i][j] = 1;
						System.out.print(a[i][j] + "\t");
					} else {
						a[i][j] = 0;
						System.out.print(a[i][j] + "\t");
					}
				}
				System.out.println();
			}
		}
		public void t4() {
			int[][] a = new int[10][10];
			a[2][2] = 1;
			a[2][3] = 1;
			a[2][5] = 1;
			a[2][7] = 1;
			a[3][2] = 1;
			a[3][3] = 1;
			a[3][5] = 1;
			a[3][7] = 1;
			a[4][3] = 1;
			a[4][4] = 1;
			a[4][5] = 1;
			a[4][7] = 1;
			a[5][3] = 1;
			a[5][4] = 1;
			a[5][5] = 1;
			a[6][2] = 1;
			a[6][3] = 1;
			a[6][4] = 1;
			a[6][5] = 1;
			a[6][7] = 1;
			a[7][2] = 1;
			a[7][3] = 1;
			a[7][5] = 1;
			a[7][7] = 1;
			a[8][7] = 1;
			int[][] b =new int[10][10]; 
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j <a[i].length; j++) {
					if(i==0 || i==9 || j==0 || j==9) {
						b[i][j] = 1;
						System.out.print(a[i][j] + "\t");
					} else {
						b[i][j] = a[i][j];
						System.out.print(a[i][j] + "\t");
					}
				}
				System.out.println();
			}
		}
		public boolean t5(int ai, int aj, int bi, int bj ) {  // 출력, ♬ 이동, T/F
			boolean result = false;
			int[][] a = {
					{1,1,1,1,1,1,1,1,1,1},
					{1,0,0,0,0,0,0,0,0,1},
					{1,0,1,1,0,1,0,1,0,1},
					{1,0,1,1,0,1,0,1,0,1},
					{1,0,0,1,1,1,0,1,0,1},
					{1,0,0,1,1,1,0,0,0,1},
					{1,0,1,1,1,1,0,1,0,1},	
					{1,0,1,1,0,1,0,1,0,1},
					{1,0,0,0,0,0,0,1,0,1},
					{1,1,1,1,1,1,1,1,1,1}
			};
			for(int i = 0; i < a.length; i++) {
				for(int  j = 0; j < a[i].length; j++) {
					
					if(a[ai][aj] == 1) {
						ai = bi;
						aj = bj;
						result = true;
					}
					
					if(i == ai && j == aj) {
						System.out.print(" ♬ ");
					} else if(a[i][j] == 1) {
						System.out.print(" ■ ");
					}  else {
						System.out.print(" □ ");
					}
				}
				System.out.println();
				}
			return result;
			}
		public void t6() {  // t4 반복, 입력값(w,s,a,d), i j변화값
			Scanner scan = new Scanner(System.in);
			int ai = 1;
			int aj = 1;
			int bi = 1;
			int bj = 1;
			t5(ai,aj,bi,bj);   // 시작하기 위한 호출 부분
			while(true) {
				String input =  scan.next();
				System.out.println(input.toUpperCase());
				switch (input.toUpperCase()) {
					case "W":  // 위쪽
						ai--;
						break;
					case "S":  // 아래쪽
						ai++;
						break;
					case "A":  // 왼쪽
						aj--;
						break;
					case "D":  // 오른쪽
						aj++;
						break;
			
					default:
						break;
				}
				System.out.println(ai + " , " + aj + " , " + bi + " , " + bj );
				if(t5(ai,aj,bi,bj)) {  // 이동을 위한 호출 부분
					ai = bi;
					aj = bj;
				} else {
					bi = ai ;
					bj = aj;				}
				if(ai == 8 && aj == 8) {
					System.out.println("게임이 끝났습니다.");
					break;
				}
			}
		}
		public boolean t7(int ai, int aj, int bi, int bj ) {
			boolean result = false;
			int[][] arr = {
					{1,1,1,1,1,1,1,1,1,1},
					{1,0,0,0,0,0,0,0,0,1},
					{1,0,2,0,0,0,0,2,0,1},
					{1,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,0,2,0,0,0,1},
					{1,0,0,0,0,0,0,0,0,1},
					{1,0,2,0,0,0,0,0,2,1},
					{1,0,0,0,0,0,0,0,0,1},
					{1,0,0,0,2,0,0,0,0,1},
					{1,1,1,1,1,1,1,1,0,1}
			};
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
				
					if(arr[ai][aj] == 1) {   // 값이 1이면 가지 못하게 제어
						ai = bi;      // 전 자리로 되돌아감
						aj = bj;     // 전 자리로 되돌아감
						result = true;
						System.out.println(ai);
					}
					
					if(i == ai && j == aj && arr[i][j] == 2) {   //음표가 지나간 자리 값을 0으로 만들고 싶음
					 arr[i][j] = 0;	
					 
					 
					} else if(i == ai && j == aj) { 
						System.out.print("♬");
					} else if(arr[i][j] == 2) {
						System.out.print("★");
					} else if(arr[i][j] == 1) {
						System.out.print("■");
					} else {
						System.out.print("□");
					}
				}
				System.out.println();
			}
				return result;
			}
		public void t8() {
			Scanner scan = new Scanner(System.in);
			int ai = 1;
			int aj = 1;
			int bi = 1;
			int bj = 1;
			t7(ai,aj,bi,bj);
			while(true) {
				String input =  scan.next();
				System.out.println(input.toUpperCase());
				switch (input.toUpperCase()) {
					case "W":  // 위쪽
						ai--;
						break;
					case "S":  // 아래쪽
						ai++;
						break;
					case "A":  // 왼쪽
						aj--;
						break;
					case "D":  // 오른쪽
						aj++;
						break;
					default:
						break;
				}
//				System.out.println(ai + " , " + aj + " , " + bi + " , " + bj );
				if(t7(ai,aj,bi,bj)) {  // 이동을 위한 호출 부분
					ai = bi;
					aj = bj;
				} else {
					bi = ai ;
					bj = aj;				}
				if(ai == 9 && aj == 8) {
					System.out.println("게임이 끝났습니다.");
					break;
				}
			}
		}
/*		public boolean t9() {
			int[][] arr2 = new int [10][10];
			for()
		} */
	}
	

			
