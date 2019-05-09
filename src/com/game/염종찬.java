package com.game;

public class 염종찬 {

	public boolean g1(int ai, int aj, int bi, int bj) {
		boolean result = false;
		int[][] array = {
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,1,0,0},
				{0,1,1,1,0},
				{0,0,1,0,0},
				{0,0,0,0,0}
		};

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i == ai && j == aj) {
					ai = bi;
					aj = bj;
					result = true;
				}
			}
		}
	
	return result;
	}
}
