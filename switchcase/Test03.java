package switchcase;
import java.lang.*;
import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;
		System.out.print("���� ���� : ");
		kor = sc.nextInt();
		System.out.print("���� ���� : ");
		eng = sc.nextInt();
		System.out.print("���� ���� : ");
		mat = sc.nextInt();
		sum = kor + eng + mat;
		avg = sum/3;
		String hak;
		switch((int)avg/10) {
		case 10 :
		case 9 :
			hak = "A";
			break;
		case 8 :
			hak = "B";
			break;
		case 7 :
			hak = "C";
			break;
		case 6 :
			hak = "D";
			break;
		case 5 :
		case 4 :
		case 3 :
		case 2 :
		case 1 :
		case 0 :
			hak = "F";
			break;
		default :
			hak = null;
		}
		if(hak == null) System.out.println("�ùٸ� ���� �Է� �ϼ���.");
		else System.out.println("���� : " + hak);
	}

}
