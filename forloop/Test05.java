package forloop;
import java.lang.*;
import java.util.*;

public class Test05 {
	public static void main(String[] args) {
		
		//모든 제어문은 중첩이 가능하다.
		
		//다중 for문
		// - 외부 for문의 종속 문장안에 내부 for문이 들어가 있는 형태
		// - for문이 중첩적인 구조를 가지는 for문
		// - 외부 for문이 한번 실행할 때마다 내부의 for문이 한바퀴씩 돈다.
		// - 총반복횟수 = 외부 for문의 반복횟수 * 내부 for문의 반복횟수
		
		// - 형식
		// for( 초기식; 조건식; 증감식 ) {
		// 		종속 문장;
		//		for( 초기식; 조건식; 증감식) {
		//			종속 문장;
		//		}
		// 		종속 문장;
		// }
		/*for(int i = 1; i<=5; i++) {
			System.out.println(i + "번째 외부 for문 실행");
			for(int j = 0; j<5; j++) {
				System.out.println("내부 for문 실행");
			}
			System.out.println(i + "번째 외부 for문 종료");
		}*/for(int h = 0; h < 24; h++){for(int m = 0; m < 60; m++){for(int s = 0; s < 60; s++){System.out.println(h + "시 " + m + "분 " + s + "초 ");}}if(h == 23){h = -1;}}}}








