package whileloop;
import java.lang.*;
import java.util.*;

public class Test04 {
	public static void main(String[] args) {
		int i = (int)(Math.random() * 100) + 1;
		int j = 0;
		Scanner sc = new Scanner(System.in);
			
		while(true) {
			j++;
			System.out.print("���� �Է� : ");
			int dap = sc.nextInt();
			if(i < dap) {
					System.out.println("[�ٿ�]");
			}
			else if(i > dap) {
					System.out.println("[��]");
			}
			else {
				System.out.println("[����]");
				break;
			}
		}
		System.out.println("�� �Է��� Ƚ�� : " + (j+1));
		sc.close();//�ݱ�
	}

}
