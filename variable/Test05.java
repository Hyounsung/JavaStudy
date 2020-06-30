package variable;
import java.lang.*;


public class Test05 {
	public static void main(String[] args) {
		
		//문자형 -> char(2byte)
		// - 컴퓨터는 정수밖에 처리하지 못한다.
		// - 문자를 사용하기 위해서 문자마다 고유한 정수 값을 정해놓았다.
		// - 문자 사용시 문자를 정수값으로 저장하고 사용한다. -> 문자 체계
		
		//문자 체계
		// - 컴퓨터 내부에서 문자를 처리하기 위해 만들어진 체계
		
		// - 아스키코드 -> C계열의 언어에서 처리하는 기본 문자 형식
		//	0 ~ 127까지 총 128가지의 문자를 처리한 문자 체계
		//	영문자, 숫자, 특수 기호, 제어 문자(공백 문자)
		//	키보드에 있는 키 값
		
		// - 유니코드 -> JAVA, Python에서의 기본 문자 체계
		//	아스키코드 + 이 세상의 모든 문자(65536개)
		//	한국어, 일본어, 중국어, 아랍어... *
		//	지금 현재 가장 널리 쓰이는 문자 체계
		//	2byte로 처리된다.
		
		char ch = 'A';
		System.out.println("ch = " + ch);
		System.out.println((int)ch);
		
		ch = '가';
		System.out.println(ch);
		System.out.println((int)ch);
		
		
	}

}













