package forloop;
import java.lang.*;
import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		int i, j = 1;
		char ch;
		System.out.print("[" + j + "] 2�ڸ� ���� : ");
		j++;
		
		for(i = 10; i < 100; i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.print("[" + j + "] 1���� 100������ Ȧ�� : ");
		j++;
		
		for(i = 1; i < 100; i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.print("[" + j + "] �빮�� ���ĺ� : ");
		j++;
		
		for(i = 65; i < 91; i++) {
			ch = (char)i;
			System.out.print(ch+" ");
		}
		
		System.out.println();
		System.out.print("[" + j + "] 1000���� ���� 3�� ��� : ");
		j++;
		
		for(i = 3; i < 1000; i+=3) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.print("[" + j + "] 1000���� ���� 2�� ������ : ");
		
		for(i = 1; i < 1000; i*=2) {
			System.out.print(i+" ");
		}
		
	}

}
