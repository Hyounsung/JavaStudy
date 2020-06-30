package variable;
import java.lang.*;

public class Test03 {
	public static void main(String[] args) {
		// 실수 - 소수점을 포함하는 수.
		
		//실수형		double	유효자리 수
		//float		4byte	7자리
		//double	8byte	15자리
		
		double a = 123.456;
		
		System.out.println(a);
		
		float b = 123.456f;
		
		System.out.println(b);
		//실수형 상수는 기본적으로 double형 데이터로 인식된다.
		//실수형 상수 뒤 f를 붙으면 float형 데이터로 인식된다.
		
		//자바는 데이터의 형식에 민감하다.
		//데이터가 큰 쪽에서 작은 쪽으로 이동할 때 에러가 발생된다.
		//작은쪽에서 큰 쪽으로 갈 때는 상관 없다.
		//같은 크기더라도 정수가 실수보다 작다.
		
		// double > long > float > int > short == char > byte
		
		int c = 10;
		
		float d = c;
		
		//cast 연산자
		// - 데이터를 일시적으로 변환시키는 연산자
		// - (자료형)상수, 공간, 연산식
		
		int e = (int) d;
		System.out.println(e);
		
		//실수가 하나라도 포함된 연산에서는 실수 값이 나온다.
		int w = 7;
		int h = 3;
		System.out.println((w*h)/2);
		System.out.println((w*h)/2.0);
		
		//실수는 정밀한 계산에서는 사용되지 않는다..
		
		System.out.println((double)(10/3));
		System.out.println(10/3.0);
		
		
	}

}




