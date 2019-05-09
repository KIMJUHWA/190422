package com.game;

import java.util.Scanner;

public class 현석 {
	/****
	 * 보물 2개를 찾아 끝지점을 가면 끝
	 */
	public boolean g1(int ai, int aj, int bi, int bj) {
		boolean result = false;
		int[][] array = {
				{1,1,1,1,1,1,1,1,1,1,1,1},
				{1,0,1,1,1,0,0,0,1,1,0,1},
				{1,0,0,0,0,0,1,0,0,0,0,1},
				{1,1,1,0,1,0,1,1,1,0,1,1},
				{1,0,1,0,1,0,1,0,1,0,0,1},
				{1,0,1,0,1,0,1,0,1,0,1,1},
				{1,0,0,0,0,0,1,0,0,0,1,1},
				{1,1,0,1,1,0,1,1,1,0,1,1},
				{1,1,0,1,0,0,0,1,0,0,0,1},
				{1,1,0,1,0,1,0,0,0,0,1,1},
				{1,1,0,0,0,1,1,1,1,0,3,1},
				{1,1,1,1,1,1,1,1,1,1,1,1}
		};
		int[][] array2 = {
				{1,10},{4,1}
		};
		
		// 보석을 먹으면 사라져야함
	
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
				} else if(array[i][j] == 0) {
					System.out.print(" □ ");
			    } else
			    	System.out.print(" ○ ");
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
			
			if(g1(ai,aj,bi,bj)) {
				ai = bi;
				aj = bj;
			} else
				bi = ai;
				bj = aj;
				
		
		
		}

	}
}
