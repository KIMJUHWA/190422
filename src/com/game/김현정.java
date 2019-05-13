package com.game;

public class 김현정 {
	/****
	 * (1,0)시작  (5,6)끝 (3,3)도착하면 시작으로
	 * 장애물(5,2)는 (2,5)를 경유해야만 지나갈 수 있다
	 */
	public boolean map(int ai, int aj, int bi, int bj) {
		boolean result = false;
		int[][] array = {
				{1,1,1,1,1,1,1},
				{0,0,0,0,0,0,1},
				{1,0,1,1,1,2,1},
				{1,0,1,0,0,1,1},
				{1,0,1,1,0,1,1},
				{1,0,0,0,0,0,0},
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
}
