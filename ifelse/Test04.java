package ifelse;
import java.lang.*;
import java.util.*;

public class Test04 {

	public static void main(String[] args) {
		
		//Math.random()
		// - 0 ~ 1�̸��� ������ �Ǽ��� ���ϴ� �޼ҵ�
		// - 0.00000000 ~ 0.999999999
		
		//������ �� ���ϱ�
		//(int)(Math.random() * �������� ���� ����) + ���� ��
		
		// 3 ~ 7
		
		double a = Math.random();//0.00000000 ~ 0.999999999
		double b = a * 5; // 0.0000 ~ 3.9999
		int c = (int)b; // 0 ~ 4
		int d = c + 3; // 3 ~ 7
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int su = (int)(Math.random() * 5) + 3;
		System.out.println(su);
		
		

	}

}















