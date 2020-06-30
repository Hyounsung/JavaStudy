package whileloop;
import java.lang.*;
import java.util.*;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lv = 0, cash = 0;
		//System.out.print("아이템을 강화하려면 1 입력 : ");
		//int click = sc.nextInt();
		while(true) {
		if(lv != 10) {
			//int p = (int)(Math.random() * 100) + 1;
			double p = Math.random();
			System.out.println(p);
			cash += 1000;
			if(p <= 30) {
				System.out.println("성공 레벨 1증가");
				lv++;
				if(lv == 10) break;
			}
			else if(p > 65){
				System.out.println("실패 레벨 1 감소");
				lv--;
				if(lv<0) {
					lv = 0;
				}
			}
			else {
				System.out.println("변화 없음");
			}
		}		
		}		
		System.out.println("써야 하는 현금은 : " + cash + "\n레벨 : " + lv);
	}

}
