package forloop;

import java.util.Scanner;
import java.lang.*;

public class Test04 {

	public static void main(String[] args) throws InterruptedException {		
		int m, s;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("분 입력 : ");
			m = sc.nextInt();
			if(m<1) System.out.println("1분부터 타이머를 작동시킬 수 있습니다.");
			else {
				System.out.println(m + "분 0초 남음");
				Thread.sleep(1000);
			}
		}while(m<1);
		
		
		for(s=59; s >= 0; s--) {
			System.out.println((m-1) + "분 " + s + "초 남음");
			Thread.sleep(1000);
			
		}
		System.out.println("타이머 끝");
	}
}
