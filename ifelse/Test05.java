package ifelse;
import java.lang.*;
import java.util.*;

public class Test05 {
	public static void main(String[] args) {
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		int sum = dice1 + dice2;
		System.out.println("ù��° �ֻ��� �� : " + dice1);
		System.out.println("�ι�° �ֻ��� �� : " + dice2);
		System.out.println("�� �ֻ����� �� : " + sum);
		if(sum % 2 == 0) {
			if(dice1 == dice2) {
				System.out.println("����!");
			} else {
				System.out.println("¦!");
			}
		}else {
			if(dice1 == dice2) {
				System.out.println("����!");
			} else {
				System.out.println("Ȧ!");
			}
		}
		/*
		if(dice1 == dice2) System.out.println("����!");
		else if(sum % 2 == 0) System.out.println("¦!");
		else System.out.println("Ȧ!");
		*/
		
	
		
	}
}
