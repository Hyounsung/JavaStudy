package input;

import java.lang.*;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("Ű : ");
		double ki = sc.nextDouble();
		
		System.out.print("ü�� : ");
		double wei = sc.nextDouble();
		double pyo = (ki-100)*0.9;
		double bmi = (wei/pyo)*100;
		String s = String.format("%.2f", bmi);
		
		System.out.println(name + "���� �񸸵��� " + s + "% �Դϴ�.");
	}

}
