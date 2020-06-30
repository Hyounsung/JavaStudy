package forloop;
import java.lang.*;
import java.util.*;

public class Test03 {

	public static void main(String[] args) {
//		돈을 저축하려 합니다
//		오늘 저축할 돈은 어제 저축한 돈의 두배로 할 예정이고
//		첫째날에 1원을 저축하려고 합니다
//
//		(Q1)	30일동안 통장에 저축될 돈은 얼마입니까?
//		(Q2)	40일동안 통장에 저축될 돈은 얼마입니까?
		int day;
		long save = 1, money = 1;
		for(day=1;true;day++) {
			money *= 2;
			save += money;
			if(day == 29) System.out.println("30일동안 통장에 저축된 돈 : " + save);
			if(day == 39) {
				System.out.println("40일동안 통장에 저축된 돈 : " + save);
				break;
			}
		}
		

	}

}
