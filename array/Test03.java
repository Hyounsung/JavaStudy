package array;
import java.util.*;

public class Test03 {
	public static void main(String[] args) {
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.print("�׸� : ");
			String st = sc.next();
			arr[i] = st;
		}
		int h = (int)(Math.random() * 5);
		System.out.println("��÷���Դϴ�....\n��÷�� �׸��� " + arr[h] + "�Դϴ�.");
		sc.close();
	}
}
