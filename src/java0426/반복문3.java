package java0426;

import java.util.Scanner;

public class 반복문3 {

	public void t1() {
		while(true) {
			// 조건식이 true 일 경우 무한 루프가 된다.
			System.out.println("무한");
		}
	}

	public void t2() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("입력하세요 >>");
			String input = scan.next();
			if("exit".equals(input)) {
				break;
			}
			System.out.println("무한");
		}
		System.out.println("While문 종료");
		scan.close();
	}
	public void t3() {
		int count = 0;
		while(count < 100) {
			System.out.println(count);
			count++;    // 99가 들어오면 증가돼서 100이 됨
		}
		System.out.println("count : " + count);  // 따라서 변수에 담겨져 있는 값은 100
	}
}
