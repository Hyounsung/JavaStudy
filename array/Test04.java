package array;
import java.util.*;
import java.lang.*;

public class Test04 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		for(int i = 0; i < 1000; i++) {
			int a = (int)(Math.random() * 6) + 1;
			arr[a-1]++;
		}
		for(int i = 0; i < 6; i++) {
			System.out.println(i+1 + " ³ª¿Â È½¼ö : " + arr[i] + "¹ø");
		}
	}
}
