package forloop;

import java.util.Scanner;
import java.lang.*;

public class Test04 {

	public static void main(String[] args) throws InterruptedException {		
		int m, s;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("�� �Է� : ");
			m = sc.nextInt();
			if(m<1) System.out.println("1�к��� Ÿ�̸Ӹ� �۵���ų �� �ֽ��ϴ�.");
			else {
				System.out.println(m + "�� 0�� ����");
				Thread.sleep(1000);
			}
		}while(m<1);
		
		
		for(s=59; s >= 0; s--) {
			System.out.println((m-1) + "�� " + s + "�� ����");
			Thread.sleep(1000);
			
		}
		System.out.println("Ÿ�̸� ��");
	}
}
