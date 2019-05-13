package com.game;

import java.util.Scanner;

public class 김은채 {
	/***
	 * (2,0)시작, (3,7)끝
	 * (1,2)에 머리조심 입력해야 움직임 가능
	 * (3,3)에 강사님 성함 입력. 틀리면 시작으로
	 */
	public boolean map(int ai, int aj, int bi, int bj) {
		boolean result = false;
		int[][] array = {
				{1,1,1,1,1,1,1,1},
				{1,0,2,0,0,0,1,1},
				{0,0,0,0,0,0,0,1},
				{1,0,1,2,0,1,0,0},
				{1,1,1,1,1,1,1,1}
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
			} else if(array[i][j] == 0) {
				System.out.print(" □ ");
			} else
				System.out.print(" ♣ ");
		}
		System.out.println();
	}
	return result;
	}
	
	public void move() {
		Scanner scan = new Scanner(System.in);
		int ai = 2;
		int aj = 0;
		int bi = 2;
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
				
			if(ai == 2 && aj == 2) {
				while(true) {
					System.out.println("머리조심을 입력하시오");
					String inputHead = scan.next();
					if("머리조심".equals(inputHead)) {
						ai = 2;
						aj = 2;
						map(ai,aj,bi,bj);	
						break;
					}
				}
			}
		
			if(ai == 2 && aj == 3) {
				System.out.println("강사님 이름을 입력하세요");
				String inputName = scan.next();
				if("김경빈".equals(inputName)) {
					ai = 2;
					aj = 4;
					map(ai,aj,bi,bj);
				} else {
					move();
				}
			}
			if(ai == 3 && aj ==7) {
				System.out.println("게임끝");
				break;
			}
			
		}

	}
}
