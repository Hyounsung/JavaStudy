package forloop;
import java.lang.*;
import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		int i, j = 1;
		char ch;
		System.out.print("[" + j + "] 2자리 정수 : ");
		j++;
		
		for(i = 10; i < 100; i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.print("[" + j + "] 1부터 100사이의 홀수 : ");
		j++;
		
		for(i = 1; i < 100; i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.print("[" + j + "] 대문자 알파벳 : ");
		j++;
		
		for(i = 65; i < 91; i++) {
			ch = (char)i;
			System.out.print(ch+" ");
		}
		
		System.out.println();
		System.out.print("[" + j + "] 1000보다 작은 3의 배수 : ");
		j++;
		
		for(i = 3; i < 1000; i+=3) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.print("[" + j + "] 1000보다 작은 2의 제곱수 : ");
		
		for(i = 1; i < 1000; i*=2) {
			System.out.print(i+" ");
		}
		
	}

}
