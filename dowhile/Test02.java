package dowhile;
import java.lang.*;
import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		do {
		i = sc.nextInt();
		System.out.println("�Է¹�������: " + i);
		}while(i != 0);
		System.out.println("����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .");
		sc.close();
	}

}
