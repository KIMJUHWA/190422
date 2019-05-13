package com.game;

import java.util.Scanner;

public class 김수민 {
	/**********
	 * 캐릭터를 움직여서 블록을 밀어 사각형을 완성하라
	 */
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
	
	int[][] push = {
			{2,4},{2,7},{5,2},{6,2},{7,4},{7,7}
	};
	
	String direction = "";  // 선언과 동시에 초기화
//	String direction;  // 선언만 함. 선언과 동시에 초기화 해주는게 좋음
	public boolean map(int ai, int aj, int bi, int bj) {
		boolean result = false;
		
		if(array[ai][aj] == 2) {
			if(direction.equals("W")) {
				if(array[ai-1][aj] == 1) {
					ai = bi;
					aj = bj;
					result = true;
				} else {
					array[ai-1][aj] = 2;
					array[ai][aj] = 0;
				}
			} else if(direction.equals("S")) {
				if(array[ai+1][aj] == 1) {
					ai = bi;
					aj = bj;
					result = true;
				} else {
					array[ai+1][aj] = 2;
					array[ai][aj] = 0;
				}
			} else if(direction.equals("A")) {
				if(array[ai][aj-1] == 1) {
					ai = bi;
					aj = bj;
					result = true;
				} else {
					array[ai][aj-1] = 2;
					array[ai][aj]=0;
				}
			} else if(direction.equals("D")) {
				if(array[ai][aj+1] == 1) {
					ai = bi;
					aj = bj;
					result = true;
				} else {
					array[ai][aj+1] = 2;
					array[ai][aj] = 0;
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				
				if(array[ai][aj] == 1 ) {  // 벽처리
					ai = bi;
					aj = bj;
					result = true;
				}
				
				
				if(i == ai && j == aj) {  // 매개변수랑 같은 값이면 출력
					System.out.print(" ● ");
				} else if(array[i][j] == 1) {  // 맵의 위치값이 1이면 ■ 출력
					System.out.print(" ■ ");
				} else if(array[i][j] == 0) {
					System.out.print(" □ ");
				} else  // 위의 조건이 전부 안맞으면 ♣ 출력 . 얘는 움직여줘야 할 것
					System.out.print(" ♣ ");
			}
			System.out.println();
		}
		
	return result;
	}
	
	public void move() {
		Scanner scan = new Scanner(System.in);
		int ai = 1;  // 초기값 정의
		int aj = 1;
		int bi = 1;
		int bj = 1;
		
		for(int i = 0; i < push.length; i++) {   // 초기값 정의
			array[push[i][0]][push[i][1]] = 2;
		}
		// push
		// (0,0) = 2  (0,1) = 4
		// (1,0) = 2  (1,1) = 7
		// (2,0) = 5  (2,1) = 2
		
		map(ai, aj, bi, bj);  // 시작을 위해 필요한 호출 부분
		
		while(true) {  // true면 무한 반복
			String input = scan.next();
			switch (input.toUpperCase()) {
			case "W":
				ai--;
				direction = "W";
				break;
			case "S":
				ai++;
				direction = "S";
				break;
			case "A":
				aj--;
				direction = "A";
				break;
			case "D":
				aj++;
				direction = "D";				
				break;
			default:
				break;
			}
			System.out.println(ai+","+aj+","+bi+","+bj);
			if(map(ai,aj,bi,bj)) {  // 이동을 위한 호출 부분
				ai = bi;  // 맵을 불러와서 리턴값이 true면 현좌표값에 전좌표값을 넣음
				aj = bj;  // 안움직이게 함
			} else {
				bi = ai;  // false면 전좌표값에 현좌표값을 넣어 앞으로 움직일 수 있음
				bj = aj;
			}
			
			
			if(array[3][3] == 2 && array[3][5] == 2 &&array[4][4] == 2
					&& array[5][3] == 2 && array[5][4] == 2
					&& array[6][4] == 2) {
				System.out.println("게임 끝");
				break;
			}
			
		}
		
	}
}

