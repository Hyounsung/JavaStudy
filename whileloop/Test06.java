package whileloop;
import java.lang.*;
import java.util.*;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lv = 0, cash = 0;
		//System.out.print("�������� ��ȭ�Ϸ��� 1 �Է� : ");
		//int click = sc.nextInt();
		while(true) {
		if(lv != 10) {
			//int p = (int)(Math.random() * 100) + 1;
			double p = Math.random();
			System.out.println(p);
			cash += 1000;
			if(p <= 30) {
				System.out.println("���� ���� 1����");
				lv++;
				if(lv == 10) break;
			}
			else if(p > 65){
				System.out.println("���� ���� 1 ����");
				lv--;
				if(lv<0) {
					lv = 0;
				}
			}
			else {
				System.out.println("��ȭ ����");
			}
		}		
		}		
		System.out.println("��� �ϴ� ������ : " + cash + "\n���� : " + lv);
	}

}
