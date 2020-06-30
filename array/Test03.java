package array;
import java.util.*;

public class Test03 {
	public static void main(String[] args) {
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.print("항목 : ");
			String st = sc.next();
			arr[i] = st;
		}
		int h = (int)(Math.random() * 5);
		System.out.println("추첨중입니다....\n추첨된 항목은 " + arr[h] + "입니다.");
		sc.close();
	}
}
