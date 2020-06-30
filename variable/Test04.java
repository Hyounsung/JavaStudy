package variable;

import java.lang.*;

public class Test04 {
	
	public static void main(String[] args) {
		
		//관계연산자 - 데이터
		// > < >= <= == !=
		
		System.out.println(10>5);
		System.out.println(10==5);
		
		//논리형 - 참과 거짓
		// - true/false
		// - boolean	1byte	True / false
		
		boolean a = 10 > 5;
		
		System.out.println(a);
		
		a = true;
		
		System.out.println(a);
		
		a = false;
		
		System.out.println(a);
		
		//논리 연산자 - 조건식
		// - 참과 거짓을 판별하는 연산자
		
		// &&	논리곱(AND)	양쪽 모두 참이면 참을 발생
		// ||	논리합(OR)	한쪽이라도 참이면 참을 발생
		// !	부정(NOT)		참이면 거짓, 거짓이면 참
		
		//					OR		AND
		// true		true	true	true
		// false	true	true	false
		// true		false	true	false
		// false	false	false	false
		
		System.out.println("==========================");
		
		System.out.println(10 > 0 || 10 < 50);
		System.out.println(10 < 0 || 10 < 50);
		System.out.println(10 > 0 || 10 > 50);
		System.out.println(10 < 0 || 10 > 50);
		
		System.out.println("==========================");
		
		System.out.println(10 > 0 && 10 < 50);
		System.out.println(10 < 0 && 10 < 50);
		System.out.println(10 > 0 && 10 > 50);
		System.out.println(10 < 0 && 10 > 50);
		
		System.out.println("==========================");

		System.out.println(!(10 > 5));
		System.out.println(!(10 < 5));

	}

}











