package variable;
import java.lang.*;

public class Test03 {
	public static void main(String[] args) {
		// �Ǽ� - �Ҽ����� �����ϴ� ��.
		
		//�Ǽ���		double	��ȿ�ڸ� ��
		//float		4byte	7�ڸ�
		//double	8byte	15�ڸ�
		
		double a = 123.456;
		
		System.out.println(a);
		
		float b = 123.456f;
		
		System.out.println(b);
		//�Ǽ��� ����� �⺻������ double�� �����ͷ� �νĵȴ�.
		//�Ǽ��� ��� �� f�� ������ float�� �����ͷ� �νĵȴ�.
		
		//�ڹٴ� �������� ���Ŀ� �ΰ��ϴ�.
		//�����Ͱ� ū �ʿ��� ���� ������ �̵��� �� ������ �߻��ȴ�.
		//�����ʿ��� ū ������ �� ���� ��� ����.
		//���� ũ����� ������ �Ǽ����� �۴�.
		
		// double > long > float > int > short == char > byte
		
		int c = 10;
		
		float d = c;
		
		//cast ������
		// - �����͸� �Ͻ������� ��ȯ��Ű�� ������
		// - (�ڷ���)���, ����, �����
		
		int e = (int) d;
		System.out.println(e);
		
		//�Ǽ��� �ϳ��� ���Ե� ���꿡���� �Ǽ� ���� ���´�.
		int w = 7;
		int h = 3;
		System.out.println((w*h)/2);
		System.out.println((w*h)/2.0);
		
		//�Ǽ��� ������ ��꿡���� ������ �ʴ´�..
		
		System.out.println((double)(10/3));
		System.out.println(10/3.0);
		
		
	}

}




