package forloop;
import java.lang.*;
import java.util.*;

public class Test03 {

	public static void main(String[] args) {
//		���� �����Ϸ� �մϴ�
//		���� ������ ���� ���� ������ ���� �ι�� �� �����̰�
//		ù°���� 1���� �����Ϸ��� �մϴ�
//
//		(Q1)	30�ϵ��� ���忡 ����� ���� ���Դϱ�?
//		(Q2)	40�ϵ��� ���忡 ����� ���� ���Դϱ�?
		int day;
		long save = 1, money = 1;
		for(day=1;true;day++) {
			money *= 2;
			save += money;
			if(day == 29) System.out.println("30�ϵ��� ���忡 ����� �� : " + save);
			if(day == 39) {
				System.out.println("40�ϵ��� ���忡 ����� �� : " + save);
				break;
			}
		}
		

	}

}
