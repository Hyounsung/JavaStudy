package variable;
import java.lang.*;

public class Test02 {

	public static void main(String[] args) {
		//1bit : 0 or 1 ���� �ϳ��� ���� �� �ִ� ��ǻ���� �ּ� ������ ����
		//1bit * 8 = 1byte
		//1byte * 1024 = 1KB
		//1KB * 1024 = 1MB
		//1MB * 1024 = 1GB
		//1GB * 1024 = 1TB
		
		//������
		//byte(1byte)	-128 ~ 127 -> -2^7 ~ 2^7-1
		//short(2byte)	-32768 ~ 32767 -> -2^15 ~ 2^15-1
		//int(4byte)	-2147483648 ~ 2147483647 -> -2^31 ~ 2^31-1
		//long(8byte)	��û ���� ~ ��û ŭ -> -2^63 ~ 2^63-1
		
		int a = 10;
		System.out.println(a);
		
		//������ ������ ���� ���ǻ���
		//1. ������ �����ʹ� �����̴�.
		byte b = 127;
		b++;//b = b + 1;
		
		System.out.println(b);
		
		b--; // b = b - 1;
		
		System.out.println(b);
		
		//2. ���� ������ ���꿡���� ���� ���� ���´�.
		int c = 10;
		int d = 3;
		System.out.println(c + d); //���ϱ�
		System.out.println(c - d); //����
		System.out.println(c * d); //���ϱ�
		System.out.println(c / d); //�������� ��
		System.out.println(c % d); //�������� ������
		
	}
}

























