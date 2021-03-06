package com.game;

import java.util.Scanner;

public class 김현정 {
	/****
	 * (1,0)시작  (5,6)끝 (3,3)도착하면 시작으로
	 * 장애물(5,2)는 (2,5)를 경유해야만 지나갈 수 있다
	 */
	
	int[][] array = {
			{1,1,1,1,1,1,1},
			{0,0,0,0,0,0,1},
			{1,0,1,1,1,2,1},
			{1,0,1,0,0,1,1},
			{1,0,1,1,0,1,1},
			{1,0,3,0,0,0,0},
			{1,1,1,1,1,1,1}
	};
	
	public boolean map(int ai, int aj, int bi, int bj) {
		boolean result = false;
	
		if(ai == 2 && aj == 5) {
			array[5][2] = 0;
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j <array[i].length; j++) {
			
				if(array[ai][aj] == 1 || array[ai][aj] == 3) {   // array의 값이 1 또는 3 일 때 ai값에 bi값 넣기
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
				} else if(array[i][j] == 2) {
					System.out.print(" ♣ ");
				} else
					System.out.print(" X ");
			}
			System.out.println();
		}

		return result;
		}
	
	public void move() {
		Scanner scan = new Scanner(System.in);
		int ai = 1;
		int aj = 0;
		int bi = 1;
		int bj = 0;
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
			
			if(ai == 3 && aj == 3) {
			ai = 1;
			aj = 0;
			bi = 1;
			bj = 0;
			map(ai,aj,bi,bj);
			}
			
			if(ai == 5 && aj == 6) {
				System.out.println("게임 끝");
				break;
			}
		}
	}
}
