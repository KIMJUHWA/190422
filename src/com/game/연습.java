package com.game;

public class 연습 {
 
	public void test() {
		int[][] array = new int[10][10];
		int[][] array2 = {
				{2,4},{2,7},{5,2},{6,2},{7,4},{7,7}
		};
	for(int i =0; i < array2.length; i++) {
		array[array2[i][0]][array2[i][1]] = 2;
	}
	
	System.out.println("배열 출력");
	for(int i = 0; i <array.length; i++) {
		for(int j = 0; j <array[i].length; j++) {
			System.out.print(array[i][j]);
		}
		System.out.println();
	}
	
	
	}
}
