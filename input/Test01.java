package input;
import java.io.IOException;
import java.lang.*;
import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) throws IOException {
		
		//System.in - ǥ�� �Է� ��Ʈ��. ��ü
		
		//.read() - X - ���ۿ��� 1byte��ŭ�� �����͸� �о���� ���
		
		
	/*	System.out.print("���� �Է� : ");
		
		int su = 0;
		
		while(true) {
			int a = System.in.read();
			System.out.println("a = " + a);
			if(a == 13) {
				break;
			}
			su = su * 10 + (a - 48);			
		}
		
		System.out.println(su);
		*/
				
		//Buffer(����)
		// :�������� ó�� �ð�, �ӵ�, ���� ���� ���� �ٸ� �� ��ġ�� ���α׷� ���̿���
		//	�����͸� �ְ�ޱ� ���� �뵵�� ���Ǵ� �ӽñ����ġ
		
		// - Ű����� �Է¹��� ���� �Է¹��� �������� ������ �˱� ���ؼ� ���۾ȿ� ������ �ϰ� �ȴ�.
		// - ���۾ȿ� ���鹮�ڸ� �������� �����͸� �����ϰ� �ȴ�
		
		// �Է��� ���ϰ� �ޱ� ���ؼ� ������ ������ ����Ѵ�. Scanner
		
		//java.util.Scanner;
		// - �����͸� �б� ���� ���� (InputStream, String, File, URL ��� �����͸� �о���� ����)
		
		//�޼ҵ� �� ù���ڴ� �ҹ��� �޶����� �ܾ��� ù���ڴ� �빮�ڷ� �ۼ��Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		// .next();		- ���� ���ڸ� �������� �����͸� �о���� ���(�� �ܾ�)
		// .nextLine();	- \n�� �������� �����͸� �о���� ���(�� ��)
		// .next�ڷ���();	- ���� ���ϴ� �����ͷ� �о���� ���(���鹮�� ����)
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.println("���� : " + age);
		
		System.out.println("Ű �Է� : ");
		double ki = sc.nextDouble();
		System.out.println("Ű : " + ki);
		
		sc.nextLine();
		
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		
		System.out.println("�̸� : " + name);
		
//		name = sc.next();
//		System.out.println("�̸� : " + name);
		
		
	}

}











