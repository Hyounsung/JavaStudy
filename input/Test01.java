package input;
import java.io.IOException;
import java.lang.*;
import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) throws IOException {
		
		//System.in - 표준 입력 스트림. 객체
		
		//.read() - X - 버퍼에서 1byte만큼의 데이터를 읽어오는 명령
		
		
	/*	System.out.print("정수 입력 : ");
		
		int su = 0;
		
		while(true) {
			int a = System.in.read();
			System.out.println("a = " + a);
			if(a == 13) {
				break;
			}
			su = su * 10 + (a - 48);			
		}
		
		System.out.println(su);
		*/
				
		//Buffer(버퍼)
		// :데이터의 처리 시간, 속도, 단위 등이 서로 다른 두 장치나 프로그램 사이에서
		//	데이터를 주고받기 위한 용도로 사용되는 임시기억장치
		
		// - 키보드로 입력받을 때는 입력받은 데이터의 범위를 알기 위해서 버퍼안에 저장을 하게 된다.
		// - 버퍼안에 공백문자를 기준으로 데이터를 구분하게 된다
		
		// 입력을 편하게 받기 위해서 도구를 가져다 사용한다. Scanner
		
		//java.util.Scanner;
		// - 데이터를 읽기 위한 도구 (InputStream, String, File, URL 등에서 데이터를 읽어오는 도구)
		
		//메소드 명 첫글자는 소문자 달라지는 단어의 첫글자는 대문자로 작성한다.
		
		Scanner sc = new Scanner(System.in);
		
		// .next();		- 공백 문자를 기준으로 데이터를 읽어오는 기능(한 단어)
		// .nextLine();	- \n을 기준으로 데이터를 읽어오는 기능(한 줄)
		// .next자료형();	- 내가 원하는 데이터로 읽어오는 명령(공백문자 기준)
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("나이 : " + age);
		
		System.out.println("키 입력 : ");
		double ki = sc.nextDouble();
		System.out.println("키 : " + ki);
		
		sc.nextLine();
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.println("이름 : " + name);
		
//		name = sc.next();
//		System.out.println("이름 : " + name);
		
		
	}

}











