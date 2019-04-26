package java0426;

import java.util.Scanner;

public class 반복문 {
	
	public void lv4() {
		Scanner scan = new Scanner(System.in);
		// X축으로 출력 나올 개수를 입력받는다
		System.out.println("X축으로 출력 나올 개수를 입력 하세요.");
		int x축 = scan.nextInt();
		for(int y = 1; y <= 9; y = y + x축) {
			for(int x = 1; x <= 9; x++) {
				for(int 계산 = 0; 계산 < x축; 계산++) {
					System.out.print((y+계산) + "*" + x + "=" + ((y+계산)*x) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		scan.close();
	}
	
	public void lv5() {
		Scanner scan = new Scanner(System.in);
		System.out.println("X축으로 출력 나올 개수를 입력 하세요.");
		int x축 = scan.nextInt();
		System.out.println("Y축으로 출력 나올 개수를 입력 하세요.");
		int y축 = scan.nextInt();
		/********************************
		 * x축과 y축 값을 입력 받아 출력하기 (최대 9단까지만)
		 ********************************/
		for(int y = 1; y <= (x축 * y축); y = y + x축) {
			for(int x = 1; x <= 9; x++) {
				for(int 계산 = 0; 계산 < x축; 계산++) {
					if((y + 계산) > 9) {
						break;
					}
					System.out.print((y+계산) + "*" + x + "=" + ((y+계산)*x) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		scan.close();
	}
}
