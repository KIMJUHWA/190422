package com.game;

import java.util.Scanner;

public class 김수민 {
	/**********
	 * 캐릭터를 움직여서 블록을 밀어 사각형을 완성하라
	 */

	public boolean g1(int ai, int aj, int bi, int bj) {
		boolean result = false;
		int[][] array = {
				{1,1,1,1,1,1,1,1,1,1},
				{1,0,0,0,0,0,1,0,0,1},
				{1,0,0,0,0,0,1,0,0,1},
				{1,0,0,0,1,0,1,0,0,1},
				{1,0,0,1,0,1,1,0,0,1},
				{1,0,0,0,0,1,1,0,0,1},
				{1,0,0,1,0,1,1,0,0,1},
				{1,0,0,0,0,0,0,0,0,1},
				{1,0,0,0,0,0,0,0,0,1},
				{1,1,1,1,1,1,1,1,1,1}
		};
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				
				if(array[ai][aj] == 1) {
					ai = bi;
					aj = bj;
					result = true;
				}

				if(i == ai && j == aj) {
					System.out.print(" ● ");
				} else if(array[i][j] == 1) {
					System.out.print(" ■ ");
				} else {
					System.out.print(" □ ");
				}
			}
			System.out.println();
		}
		
	return result;
	}
	
	public void move() {
		Scanner scan = new Scanner(System.in);
		int ai = 1;
		int aj = 1;
		int bi = 1;
		int bj = 1;
		g1(ai, aj, bi, bj);  // 시작을 위해 필요한 호출 부분
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
			if(g1(ai,aj,bi,bj)) {  // 이동을 위한 호출 부분
				ai = bi;
				aj = bj;
			} else {
				bi = ai;
				bj = aj;
			}
		}
		
	}
}

