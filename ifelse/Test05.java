package ifelse;
import java.lang.*;
import java.util.*;

public class Test05 {
	public static void main(String[] args) {
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		int sum = dice1 + dice2;
		System.out.println("첫번째 주사위 수 : " + dice1);
		System.out.println("두번째 주사위 수 : " + dice2);
		System.out.println("두 주사위의 합 : " + sum);
		if(sum % 2 == 0) {
			if(dice1 == dice2) {
				System.out.println("더블!");
			} else {
				System.out.println("짝!");
			}
		}else {
			if(dice1 == dice2) {
				System.out.println("더블!");
			} else {
				System.out.println("홀!");
			}
		}
		/*
		if(dice1 == dice2) System.out.println("더블!");
		else if(sum % 2 == 0) System.out.println("짝!");
		else System.out.println("홀!");
		*/
		
	
		
	}
}
