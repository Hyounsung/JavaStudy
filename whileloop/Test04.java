package whileloop;
import java.lang.*;
import java.util.*;

public class Test04 {
	public static void main(String[] args) {
		int i = (int)(Math.random() * 100) + 1;
		int j = 0;
		Scanner sc = new Scanner(System.in);
			
		while(true) {
			j++;
			System.out.print("정답 입력 : ");
			int dap = sc.nextInt();
			if(i < dap) {
					System.out.println("[다운]");
			}
			else if(i > dap) {
					System.out.println("[업]");
			}
			else {
				System.out.println("[정답]");
				break;
			}
		}
		System.out.println("총 입력한 횟수 : " + (j+1));
		sc.close();//닫기
	}

}
