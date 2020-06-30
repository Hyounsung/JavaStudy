package dowhile;
import java.lang.*;
import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		do {
		i = sc.nextInt();
		System.out.println("입력받은숫자: " + i);
		}while(i != 0);
		System.out.println("계속하려면 아무 키나 누르십시오 . . .");
		sc.close();
	}

}
