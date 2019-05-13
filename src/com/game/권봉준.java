package com.game;

import java.util.Scanner;

public class 권봉준 {
	/********
	 * (1,1)출발  (3,3)을 들려야만 (8,8)에 도착해 종료가능
	 * (3,3)에 가면 처음으로 점프
	 ********/
	int[][] array = {
			{1,1,1,1,1,1,1,1,1,1},
			{1,0,1,0,0,0,0,0,0,1},
			{1,0,1,0,1,1,0,1,0,1},
			{1,0,1,2,1,0,0,1,0,1},
			{1,0,1,1,1,0,0,1,0,1},
			{1,0,1,0,1,1,1,1,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,1,0,1,1,0,1},
			{1,0,0,1,1,0,0,0,3,1},
			{1,1,1,1,1,1,1,1,1,1}
	};
	boolean check = false;
	public boolean map(int ai, int aj, int bi, int bj) {
		boolean result = false;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				
				if(array[ai][aj] == 1) {
					ai = bi;
					aj = bj;
					result = true;
				}
				if(ai == 3 && aj == 3) {
					array[3][3] = 0;
					check = true;
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
		int ai = 1;
		int aj = 1;
		int bi = 1;
		int bj = 1;
		map(ai,aj,bi,bj);
		while(true) {
			Scanner scan = new Scanner(System.in);
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
			
			if(ai == 3 && aj == 3) {
				ai = 1;
				aj = 1;
				bi = 1;
				bj = 1;
				map(ai,aj,bi,bj);
			}
				
			if(ai == 8 && aj == 8) {
				if(check) {
					System.out.println("게임 끝");
					break;
				} else
					System.out.println("♣에 다녀오시오");
			}
		}
	}
}
