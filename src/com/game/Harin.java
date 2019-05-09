package com.game;

import java.util.Scanner;

public class Harin {
	/******
	 * 포탈입구(4,5) 포탈출구(2,4) 목적지(1,5)
	 * 포탈을 이용해 목적지에 가기
	 */
	
	public boolean g1(int ai, int aj, int bi, int bj) {
		boolean result = false;
		int[][] array = {
				{1,1,1,1,1,1,1},
				{1,0,0,1,1,0,1},
				{1,0,0,1,2,0,1},
				{1,0,1,1,1,1,1},
				{1,0,1,1,0,2,1},
				{1,0,0,0,0,0,1},
				{1,1,1,1,1,1,1}
		};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j <array[i].length; j++) {
				
				if(array[ai][aj] == 1) {
					ai = bi;
					aj = bj;
					result = true;
				}
				
				if(i == ai && j == aj) {
					System.out.print(" ● ");
				} else if(array[i][j] == 1) {
					System.out.print(" ■ ");
				} else if(array[i][j] == 0) {
					System.out.print(" □ ");
				} else
					System.out.print(" ♣ ");
				
			}
			System.out.println();
		}
		return result;
	}
	
	public void g2() {
		Scanner scan = new Scanner(System.in);
		int ai = 1;
		int aj = 1;
		int bi = 1;
		int bj = 1;
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
			
			if(ai == 4 && aj == 5) {    // (4,5)포탈처리
				ai = 2;
				aj = 4;
				g1(ai,aj,bi,bj);
			} else if(ai == 2 && aj == 4) {  // (2,4) 포탈처리
				ai = 4;
				aj = 5;
				g1(ai,aj,bi,bj);
			}
			
			if(g1(ai,aj,bi,bj)) {
				ai = bi;
				aj = bj;
			} else
				bi = ai;
				bj = aj;
				
			if(ai == 1 && aj == 5) {
				System.out.println("게임 끝");
				break;
			}
		}
	}
}
