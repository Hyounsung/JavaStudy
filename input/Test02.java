package input;
import java.lang.*;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ڹ� ���� ���� �Է��ϼ���");
		int jajum = sc.nextInt();
		
		System.out.println("���̽� ���� ���� �Է��ϼ���");
		int pyjum = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
		
		int sum = jajum + pyjum;
		//double avg = sum / 2.0;
		
		System.out.println("====================\n"
			+ name + "���� ���� �հ� = " + sum + "��, ��� = " + sum / 2.0 + "��");
		
	}
	
}
