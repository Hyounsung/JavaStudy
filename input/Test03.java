package input;

import java.lang.*;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("키 : ");
		double ki = sc.nextDouble();
		
		System.out.print("체중 : ");
		double wei = sc.nextDouble();
		double pyo = (ki-100)*0.9;
		double bmi = (wei/pyo)*100;
		String s = String.format("%.2f", bmi);
		
		System.out.println(name + "님의 비만도는 " + s + "% 입니다.");
	}

}
