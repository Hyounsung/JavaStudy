package whileloop;
import java.lang.*;
import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		int i = 0, sum = 0, su, j = 0, k = 0;
		int arr[] = new int[100];
		
		while(i<10) {
			i++;
			sum += i;
		}
		System.out.println("1���� 10������ �� : " + sum);
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		su = sc.nextInt();
		while(j < su) {
			j++;
			if(su%j == 0) {
				arr[k] = j;
				k++;
			} 			
		}
	
		for(int l = 0; l < k; l++) {
			System.out.print(arr[l] + " ");
		}
	}

}
