package ifelse;
import java.lang.*;
import java.time.Year;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int birth, age;
		
		
		// System.currentTimeMillis()
		// - 1970�� 1�� 1�� 0�� 0�� 0�ʺ��� ���ݱ����� �ð��� �и����ʴ����� ��ȯ�ϴ� �޼ҵ�
		// - 1000ms == 1s
		
		long a = System.currentTimeMillis(); //ms
		long b = a / 1000; //s
		long c = b / 60; // m
		long d = c / 60; // h
		long e = d / 24; // day
		long f = e / 365; // y
		
		/*System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);*/
		
		int ny = (int)(System.currentTimeMillis()/1000/60/60/24/365 + 1970);
				
		System.out.print("������� ����⵵ 4�ڸ� : ");
		birth = sc.nextInt();
		age = ny-birth+1;
	System.out.println(birth + "��� �� " + age + "��");
	if(age>=20) {
		System.out.println("�����Դϴ�!");
	}
	else {
		System.out.println("�̼������Դϴ�");
	}
	
	
	
	
	
	/*System.out.print("������� ����⵵ 4�ڸ� : ");
		birth = sc.nextInt();
		int age;
		age = 2021-birth;*/
		//int i;
		/*for(i = 0; i < 10; i++) {
			System.out.print("������� ����⵵ 4�ڸ� : ");
			birth = sc.nextInt();
			age = 2021-birth;
		System.out.println(birth + "��� �� " + age + "��");
		if(age>=20) {
			System.out.println("�����Դϴ�!");
		}
		else {
			System.out.println("�̼������Դϴ�");
		}
		}*/
		/*i = 0;
		while(i<10)
		{
			i++;
			System.out.print("������� ����⵵ 4�ڸ� : ");
			birth = sc.nextInt();
			age = 2021-birth;
		System.out.println(birth + "��� �� " + age + "��");
		if(age>=20) {
			System.out.println("�����Դϴ�!");
		}
		else {
			System.out.println("�̼������Դϴ�");
		}
		}*/
}
}







