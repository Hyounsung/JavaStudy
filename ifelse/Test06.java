package ifelse;
import java.lang.*;
import java.util.*;

public class Test06 {

	public static void main(String[] args) {
		int first = (int)(Math.random() * 14) + 2;
		int second = (int)(Math.random() * 9) + 1;
		Scanner sc = new Scanner(System.in);
		int multi = first * second;
		System.out.print(first + " X " + second + " = ");
		int ans = sc.nextInt();
		if(ans == multi) {
			System.out.println("����! 10�� ȹ��");
			if(first > 10) System.out.println("����� ����! 10�� �߰� ȹ��");
		}
		else System.out.println("����! 5�� ����");
		
		
		/*for(int i = 1; i < 10; i++) {
			int first = (int)(Math.random() * 14) + 2;
			int second = (int)(Math.random() * 9) + 1;
			int b = first * second;
		System.out.print(first + " X " + second + " = ");
		int a = sc.nextInt();
		if(first > 10 && a == b) {
			System.out.println("����! 20�� ȹ��(11�� �̻�)");
			sum += 20;
		}
		else if(a == b) {
			System.out.println("����! 10�� ȹ��");
			sum += 10;
		}
		else {
			System.out.println("����! 5�� ����");
			sum -= 5;
		}
		}
		System.out.println("�� ������ : " + sum + "�Դϴ�.");*/
		
		
		

	}

}
