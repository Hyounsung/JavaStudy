package whileloop;
import java.lang.*;
import java.util.*;

public class Test05 {
	public static void main(String[] args) {
		int jumsu = 0, k = 0, p = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		int i = (int)(Math.random() * 18) + 2;
		int j = (int)(Math.random() * 9) + 1;
		int dap = i * j;
		System.out.print(i + " X " + j + " = ");
		int user = sc.nextInt();
		if(user == dap) {
			p++;
			System.out.println("[정답 10점 획득]");
			jumsu += 10;
			if(i > 10) {
				System.out.println("[어려운 문제 5점 추가]");
				jumsu += 5;
			}//if 안의 if 끝
		}//if 끝
		else {
			k++;
			System.out.println("[오답]");
			if(k == 3) {
				System.out.println("[게임 오버]");
				break;
				}//else 안의 if 끝
			}//else 끝
		}//while 끝
		System.out.println("정답 개수 : " + p + "\n점수 : " + jumsu);
		
	}

}
