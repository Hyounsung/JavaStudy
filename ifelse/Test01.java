package ifelse;
import java.lang.*;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("자바 시험 점수 입력하세요");
		int jajum = sc.nextInt();
		
		System.out.println("파이썬 시험 점수 입력하세요");
		int pyjum = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		int sum = jajum + pyjum;
		//double avg = sum / 2.0;
		
		System.out.println("====================\n"
			+ name + "님의 성적 합계 = " + sum + "점, 평균 = " + sum / 2.0 + "점");
		
		if(jajum > pyjum) {
			System.out.println("자바");
		}
		
		else if(pyjum > jajum) {
			System.out.println("파이썬");
		}
		else {
			System.out.println("같다.");
		}
		
		/*
		if(jajum > pyjum) {
			System.out.println("자바");
		}
		
		if(pyjum > jajum) {
			System.out.println("파이썬");
		}
		*/
		
		/*
		if(jajum > pyjum) {
		 
			System.out.println("자바");
		}
		else {
			System.out.println("파이썬");
		}
		*/
		
		
		
	}
}
