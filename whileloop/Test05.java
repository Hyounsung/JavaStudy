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
			System.out.println("[���� 10�� ȹ��]");
			jumsu += 10;
			if(i > 10) {
				System.out.println("[����� ���� 5�� �߰�]");
				jumsu += 5;
			}//if ���� if ��
		}//if ��
		else {
			k++;
			System.out.println("[����]");
			if(k == 3) {
				System.out.println("[���� ����]");
				break;
				}//else ���� if ��
			}//else ��
		}//while ��
		System.out.println("���� ���� : " + p + "\n���� : " + jumsu);
		
	}

}
