package variable;

import java.lang.*;

public class Test04 {
	
	public static void main(String[] args) {
		
		//���迬���� - ������
		// > < >= <= == !=
		
		System.out.println(10>5);
		System.out.println(10==5);
		
		//���� - ���� ����
		// - true/false
		// - boolean	1byte	True / false
		
		boolean a = 10 > 5;
		
		System.out.println(a);
		
		a = true;
		
		System.out.println(a);
		
		a = false;
		
		System.out.println(a);
		
		//�� ������ - ���ǽ�
		// - ���� ������ �Ǻ��ϴ� ������
		
		// &&	����(AND)	���� ��� ���̸� ���� �߻�
		// ||	����(OR)	�����̶� ���̸� ���� �߻�
		// !	����(NOT)		���̸� ����, �����̸� ��
		
		//					OR		AND
		// true		true	true	true
		// false	true	true	false
		// true		false	true	false
		// false	false	false	false
		
		System.out.println("==========================");
		
		System.out.println(10 > 0 || 10 < 50);
		System.out.println(10 < 0 || 10 < 50);
		System.out.println(10 > 0 || 10 > 50);
		System.out.println(10 < 0 || 10 > 50);
		
		System.out.println("==========================");
		
		System.out.println(10 > 0 && 10 < 50);
		System.out.println(10 < 0 && 10 < 50);
		System.out.println(10 > 0 && 10 > 50);
		System.out.println(10 < 0 && 10 > 50);
		
		System.out.println("==========================");

		System.out.println(!(10 > 5));
		System.out.println(!(10 < 5));

	}

}











