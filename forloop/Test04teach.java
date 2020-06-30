package forloop;
import java.lang.*;
import java.util.*;

public class Test04teach {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("분 입력 : ");
		int min = sc.nextInt();
		
		for(int s = min * 60; s >= 0; s--) {
			//System.out.println(s/60 + "분 " + s%60 + "초 남음");
			System.out.printf("%d분 %d초 남음\n", s/60, s%60);
			Thread.sleep(1000);
		}
		System.out.println("타이머 끝");
		
	}

}
