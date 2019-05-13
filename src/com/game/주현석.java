package com.game;

import java.util.Scanner;

public class 주현석 {
	/****
	 * 보물 2개를 찾아 끝지점을 가면 끝
	 */
	int[][] array = {
			{1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,1,1,1,0,0,0,1,1,2,1},
			{1,0,0,0,0,0,1,0,0,0,0,1},
			{1,1,1,0,1,0,1,1,1,0,1,1},
			{1,2,1,0,1,0,1,0,1,0,0,1},
			{1,0,1,0,1,0,1,0,1,0,1,1},
			{1,0,0,0,0,0,1,0,0,0,1,1},
			{1,1,0,1,1,0,1,1,1,0,1,1},
			{1,1,0,1,0,0,0,1,0,0,0,1},
			{1,1,0,1,0,1,0,0,0,0,1,1},
			{1,1,0,0,0,1,1,1,1,0,3,1},
			{1,1,1,1,1,1,1,1,1,1,1,1}
	};
	boolean check1 = false;
	boolean check2 = false;
	public boolean map(int ai, int aj, int bi, int bj) {
		boolean result = false;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				
				if(array[ai][aj] == 1) {    // 1일 때 전 좌표값을 현 좌표값에 넣어줌
					ai = bi;
					aj = bj;
					result = true;
				}
				
				if(ai == 1 && aj == 10) {     // 보석을 먹으면 보석이 사라짐
					array[1][10] = 0;
					check1 = true;
				}
				if(ai == 4 && aj == 1) {
					array[4][1] = 0;
					check2 = true;
				}
				
				if(i == ai && j == aj) {
					System.out.print(" ● ");
				} else if(array[i][j] == 1) {
					System.out.print(" ■ ");
				} else if(array[i][j] == 0) {
					System.out.print(" □ ");
			    } else if(array[i][j] == 2) {
			    	System.out.print(" ♣ ");
    			} else
    				System.out.print(" ○ ");
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
		map(ai,aj,bi,bj);
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
			
			if(map(ai,aj,bi,bj)) {
				ai = bi;
				aj = bj;
			} else
				bi = ai;
				bj = aj;
			
			 if(ai == 10 && aj == 10) {
				if(check1 && check2) {
					System.out.println("게임 끝");
					break;
				} else
					ai = 1;
					aj = 1;
					bi = 1;
					bj = 1;
					map(ai,aj,bi,bj);
					System.out.println("보석을 다 먹고 오시오");
			 } 
		}

	}
}
