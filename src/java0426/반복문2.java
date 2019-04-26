package java0426;

public class 반복문2 {

	public void t1() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Break 전");  
			break;                                       // 정지
//			System.out.println("Break 후");   //코드 작성 불가
		}
	}
	
	public void t2() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Continue 전");
			continue;                                      // 다음 행으로 이동
//			Systme.out.println("Continue 후");  // 코드 작성 불가
		}
	}
	public void t3() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "번째 출력");
			if(i % 2 == 0) {
				continue;
			} else {
				break;
			}
		}
	}
	public void t4(int stop) {
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 0) {
				continue;    // 짝수면 다음행으로 넘어감
			} else if(i == stop) {
				break;        // stop 숫자가 들어오면 정지
			}
			System.out.println(i + "번째 출력");
		}
	}
}
