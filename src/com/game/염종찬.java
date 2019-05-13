package com.game;

import java.util.Scanner;

public class 염종찬 {
	/*******
	 * 십자가 중앙에 도달하면 특정값 입력시 "명중" 출력 후 종료
	 */
	public boolean g1(int ai, int aj, int bi, int bj) {
		boolean result = false;
		int[][] array = {          
				{2,2,2,2,2,2,2},
				{2,0,0,0,0,0,2},
				{2,0,0,0,0,0,2},
				{2,0,0,1,0,0,2},
				{2,0,1,1,1,0,2},
				{2,0,0,1,0,0,2},
				{2,0,0,0,0,0,2},
				{2,2,2,2,2,2,2}
		};

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {

				if(array[ai][aj] == 2) {   // 벽처리
					ai = bi;
					aj = bj;
					result = true;
				}
				
				if(i == ai && j == aj) {       // 값에 따라 모양지정
					System.out.print(" ● ");
				} else if(array[i][j] == 1) {
					System.out.print(" ■ ");
				} else if(array[i][j] == 0) {
					System.out.print(" □ ");
				} else {
					System.out.print("");
				}
			}
			System.out.println();
		}
		return result;
	}
	public void g2() {
		Scanner scan = new Scanner(System.in);
		int ai = 2;
		int aj = 4;
		int bi = 2;
		int bj = 4;
		g1(ai,aj,bi,bj);
		while(true) {
			String input = scan.next();
			switch (input.toUpperCase()) {
			case "W":
				ai--;
				break;
			case "S":
				ai++;
				break;
			case "A":
				aj--;
				break;
			case "D":
				aj++;
				break;

			default:
				break;
			}
			
			if(g1(ai,aj,bi,bj)) {  // 벽처리
				ai = bi;
				aj = bj;
			} else
				bi = ai;
				bj = aj;
			
			String str = "종찬오빠_메롱";   // 띄어쓰기 인식 안됨
			if(ai == 4 && aj == 3) {
				System.out.println("종찬오빠_메롱을 치시오");
				String str2 = scan.next();
				if(str2.equals(str)) {
					System.out.println("명중");
					break;
				} else {
					System.out.println("흥");
				}
			}	
		}
	} 
}

	
