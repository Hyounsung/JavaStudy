package forloop;
import java.lang.*;
import java.util.*;

public class Test04teach {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int min = sc.nextInt();
		
		for(int s = min * 60; s >= 0; s--) {
			//System.out.println(s/60 + "�� " + s%60 + "�� ����");
			System.out.printf("%d�� %d�� ����\n", s/60, s%60);
			Thread.sleep(1000);
		}
		System.out.println("Ÿ�̸� ��");
		
	}

}
