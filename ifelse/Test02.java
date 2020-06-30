package ifelse;
import java.lang.*;
import java.time.Year;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int birth, age;
		
		
		// System.currentTimeMillis()
		// - 1970년 1월 1일 0시 0분 0초부터 지금까지의 시간을 밀리언초단위로 반환하는 메소드
		// - 1000ms == 1s
		
		long a = System.currentTimeMillis(); //ms
		long b = a / 1000; //s
		long c = b / 60; // m
		long d = c / 60; // h
		long e = d / 24; // day
		long f = e / 365; // y
		
		/*System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);*/
		
		int ny = (int)(System.currentTimeMillis()/1000/60/60/24/365 + 1970);
				
		System.out.print("사용자의 출생년도 4자리 : ");
		birth = sc.nextInt();
		age = ny-birth+1;
	System.out.println(birth + "년생 → " + age + "살");
	if(age>=20) {
		System.out.println("성인입니다!");
	}
	else {
		System.out.println("미성년자입니다");
	}
	
	
	
	
	
	/*System.out.print("사용자의 출생년도 4자리 : ");
		birth = sc.nextInt();
		int age;
		age = 2021-birth;*/
		//int i;
		/*for(i = 0; i < 10; i++) {
			System.out.print("사용자의 출생년도 4자리 : ");
			birth = sc.nextInt();
			age = 2021-birth;
		System.out.println(birth + "년생 → " + age + "살");
		if(age>=20) {
			System.out.println("성인입니다!");
		}
		else {
			System.out.println("미성년자입니다");
		}
		}*/
		/*i = 0;
		while(i<10)
		{
			i++;
			System.out.print("사용자의 출생년도 4자리 : ");
			birth = sc.nextInt();
			age = 2021-birth;
		System.out.println(birth + "년생 → " + age + "살");
		if(age>=20) {
			System.out.println("성인입니다!");
		}
		else {
			System.out.println("미성년자입니다");
		}
		}*/
}
}







