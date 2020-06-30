package variable;
import java.lang.*;

public class Test02 {

	public static void main(String[] args) {
		//1bit : 0 or 1 둘중 하나를 담을 수 있는 컴퓨터의 최소 데이터 단위
		//1bit * 8 = 1byte
		//1byte * 1024 = 1KB
		//1KB * 1024 = 1MB
		//1MB * 1024 = 1GB
		//1GB * 1024 = 1TB
		
		//정수형
		//byte(1byte)	-128 ~ 127 -> -2^7 ~ 2^7-1
		//short(2byte)	-32768 ~ 32767 -> -2^15 ~ 2^15-1
		//int(4byte)	-2147483648 ~ 2147483647 -> -2^31 ~ 2^31-1
		//long(8byte)	엄청 작음 ~ 엄청 큼 -> -2^63 ~ 2^63-1
		
		int a = 10;
		System.out.println(a);
		
		//정수형 데이터 사용시 주의사항
		//1. 정수형 데이터는 원형이다.
		byte b = 127;
		b++;//b = b + 1;
		
		System.out.println(b);
		
		b--; // b = b - 1;
		
		System.out.println(b);
		
		//2. 정수 끼리의 연산에서는 정수 값이 나온다.
		int c = 10;
		int d = 3;
		System.out.println(c + d); //더하기
		System.out.println(c - d); //빼기
		System.out.println(c * d); //곱하기
		System.out.println(c / d); //나누기의 몫
		System.out.println(c % d); //나누기의 나머지
		
	}
}

























