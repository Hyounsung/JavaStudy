package forloop;
import java.lang.*;
import java.util.*;

public class Test05 {
	public static void main(String[] args) {
		
		//��� ����� ��ø�� �����ϴ�.
		
		//���� for��
		// - �ܺ� for���� ���� ����ȿ� ���� for���� �� �ִ� ����
		// - for���� ��ø���� ������ ������ for��
		// - �ܺ� for���� �ѹ� ������ ������ ������ for���� �ѹ����� ����.
		// - �ѹݺ�Ƚ�� = �ܺ� for���� �ݺ�Ƚ�� * ���� for���� �ݺ�Ƚ��
		
		// - ����
		// for( �ʱ��; ���ǽ�; ������ ) {
		// 		���� ����;
		//		for( �ʱ��; ���ǽ�; ������) {
		//			���� ����;
		//		}
		// 		���� ����;
		// }
		/*for(int i = 1; i<=5; i++) {
			System.out.println(i + "��° �ܺ� for�� ����");
			for(int j = 0; j<5; j++) {
				System.out.println("���� for�� ����");
			}
			System.out.println(i + "��° �ܺ� for�� ����");
		}*/for(int h = 0; h < 24; h++){for(int m = 0; m < 60; m++){for(int s = 0; s < 60; s++){System.out.println(h + "�� " + m + "�� " + s + "�� ");}}if(h == 23){h = -1;}}}}








