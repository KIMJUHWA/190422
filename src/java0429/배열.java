package java0429;

public class 배열 {
	public void t1() {
		boolean[][] ft = new boolean[5][5];
		ft[0][0] = false;
		ft[0][1] = false;
		ft[0][2] = false;
		ft[0][3] = false;
		ft[0][4] = false;
		
		ft[1][0] = true;
		ft[1][1] = true;
		ft[1][2] = true;
		ft[1][3] = true;
		ft[1][4] = true;
		
		ft[3][0] = true;
		ft[3][1] = true;
		ft[3][2] = true;
		ft[3][3] = true;
		ft[3][4] = true;
		
		for(int y = 0; y < ft.length;y++) {   // 행
			for(int x = 0; x < ft[y].length;x++) {  // 열
				System.out.print(ft[y][x] + "\t");
			}
			System.out.println();
		}
	}
public void t2() {     // 패턴이 있을 때 사용가능
	int[][] ft = new int[5][5];
	
	for(int y = 0; y < ft.length; y++) {
		for(int x = 0; x < ft[y].length; x++) {
			if(y%2 == 0) {   // 짝수
				ft[y][x] = 0;
			} else {   // 홀수
 				ft[y][x] = 1;
			}
		}
	}
	for(int y = 0; y < ft.length;y++) {   //  출력하기 위한 for문
		for(int x = 0; x < ft[y].length;x++) { 
			System.out.print(ft[y][x] + "\t");
		}
		System.out.println();
	}
}
public void t3() {
	int[][] a = new int[5][5];
	for(int i = 0; i < a.length; i++) {
		for(int j = 0; j < a[i].length; j++) {
			if(i == j || i + j == 4) {
				a[i][j] = 1;
				System.out.print(a[i][j] + "\t");
			} else {
				a[i][j] = 0;
				System.out.print(a[i][j] + "\t");
			}
		}
		System.out.println();
	}
	}	
}
