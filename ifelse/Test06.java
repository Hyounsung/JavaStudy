package ifelse;
import java.lang.*;
import java.util.*;

public class Test06 {

	public static void main(String[] args) {
		int first = (int)(Math.random() * 14) + 2;
		int second = (int)(Math.random() * 9) + 1;
		Scanner sc = new Scanner(System.in);
		int multi = first * second;
		System.out.print(first + " X " + second + " = ");
		int ans = sc.nextInt();
		if(ans == multi) {
			System.out.println("Á¤´ä! 10Á¡ È¹µæ");
			if(first > 10) System.out.println("¾î·Á¿î ¹®Á¦! 10Á¡ Ãß°¡ È¹µæ");
		}
		else System.out.println("¿À´ä! 5Á¡ °¨Á¡");
		
		
		/*for(int i = 1; i < 10; i++) {
			int first = (int)(Math.random() * 14) + 2;
			int second = (int)(Math.random() * 9) + 1;
			int b = first * second;
		System.out.print(first + " X " + second + " = ");
		int a = sc.nextInt();
		if(first > 10 && a == b) {
			System.out.println("Á¤´ä! 20Á¡ È¹µæ(11´Ü ÀÌ»ó)");
			sum += 20;
		}
		else if(a == b) {
			System.out.println("Á¤´ä! 10Á¡ È¹µæ");
			sum += 10;
		}
		else {
			System.out.println("¿À´ä! 5Á¡ °¨Á¡");
			sum -= 5;
		}
		}
		System.out.println("ÃÑ Á¡¼ö´Â : " + sum + "ÀÔ´Ï´Ù.");*/
		
		
		

	}

}
