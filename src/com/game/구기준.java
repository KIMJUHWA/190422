package com.game;

import java.util.Scanner;

public class 구기준 {
	/****
	 * 최단거리로 도착해야만 게임이 종료
	 * 최단거리로 도착하지 않으면 처음위치로 돌아감
	 * (2,3)에 도착하면 처음위치로 돌아감
	 */
	public boolean g1(int ai, int aj, int bi, int bj) { 
		boolean result = false;
		int[][] array = {
				{1,1,1,1,1,1,1},
				{1,0,0,0,0,0,1},
				{1,0,1,2,1,0,1},
				{1,0,0,1,0,0,1},
				{1,1,0,0,0,1,1},
				{1,1,1,1,0,0,1},
				{1,1,1,1,1,1,1}
		};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j <array[i].length; j++) {
				
				if(array[ai][aj] == 1) {     // 벽만나면 전의 위치로 간다
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
		int count = 0;
		System.out.println("현재 이동거리 : " + count);
		Scanner scan = new Scanner(System.in);
		int ai = 1;
		int aj = 1;
		int bi = 1;
		int bj = 1;
		g1(ai,aj,bi,bj);
		
		while(true) {    // true 무한으로 돌리겠다
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
		if(ai == 2 && aj == 3) {
			ai = 1;
			aj = 1;
		}
		
		boolean stepCheck = true;
		System.out.println(ai + ", " + aj + ", " + bi + ", " + bj);
		if(g1(ai,aj,bi,bj)) {   // g1()의 리턴값이 true면 벽을 만난것
			ai = bi;
			aj = bj;
			stepCheck = false;
		} else {      //g1()의 리턴값이 false면 움직인다.전좌표에 현좌표 넣는다.
			bi = ai;
			bj = aj;
			stepCheck = true;
		}
		if(stepCheck) {
			count+= 1;
			System.out.println("현재 이동거리 : " + count);
		}
		
		if(ai == 5 && aj == 5 && count == 8) {
			System.out.println("게임 끝");
			break;
		} else if(ai == 5 && aj == 5 && count != 8) {
			count = 0;
			System.out.println("처음으로 돌아갑니다");
			move();
		}
			
		}
	}
}

