package switchcase;
import java.lang.*;
import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		
//		double a = 3;
//		
//		switch((int)a) {
//		case '\n' - 9 :
//		case (int)2.234 :
//		case a + 20 :
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[������ ����ǰ]\n�� - Ȳ�縶��ũ\n���� - �����ġ��\n���� - ���۶�\n�ܿ� - ���÷�");
		System.out.print("���డ�� ���� �� �Է� : ");
		int month = sc.nextInt();
		String sea;
		String sa;

		switch(month) {
		case 3 :
		case 4 :
		case 5 :
			sea = "��"; 
			sa = "Ȳ�縶��ũ";
			break;
		case 6 :
		case 7 :
		case 8 :
			sea = "����";
			sa = "�����ġ��";
			break;
		case 9 :
		case 10 :
		case 11 :
			sea = "����";
			sa = "���۶�";
			break;
		case 12 :
		case 1 :
		case 2 :
			sea = "�ܿ�";
			sa = "���÷�";
			break;
		default :
			sea = null;
			sa = null;
		}
		if(sea == null && sa == null) System.out.println("1 ~ 12������ ���ڸ� �Է��ϼ���.");
		else System.out.println(sea + "�� ���డ�ø� " + sa + "��/�� ����ǰ���� �����մϴ�!\n�����÷��� ���⸦ ��������...");
	}

}
