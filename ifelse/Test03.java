package ifelse;
import java.lang.*;
import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jja = 5000, jjam = 6000, jjas, jjams, a, b, c, d, e, f;
		System.out.println("¥��� - " + jja + "��");
		System.out.println("«�� - " + jjam + "��");
		System.out.print("¥��� ���� : ");
		jjas = sc.nextInt();
		
		System.out.print("«�� ���� : ");
		jjams = sc.nextInt();
		
		a = jja * jjas; //¥��� �� ����
		b = jjam * jjams; //«�� �� ����
		c = a + b; //�Ѱ���
		d = (int)(c * 0.9); //10�׸� �̻��� �� 10���� ����
		e = c - 3000; // 5�׸� �̻��� �� 3000�� ����
		f = jjas + jjams; // ¥��, «�� �� ����

		if(f >= 10) {
			System.out.println("�� ���� : " + d + "��");
		}
		else if(f >= 5) {
			System.out.println("�� ���� : " + e + "��");
		}
		else {
			System.out.println("�� ���� : " + c + "��");
		}
		
		


	}

}
