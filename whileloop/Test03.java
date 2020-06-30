package whileloop;
import java.lang.*;
import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		
		//지역변수
		// - 어느 한 지역에 속해서 그 지역에서 우선적으로 사용되는 변수
		// - 지역이 실행할 때 공간이 생성이 되고 그 지역이 끝날 때 공간이 소멸된다.
		
		int i = 1;
		
		int sum = 0;
		
		while(i <= 5) {
			//int sum = 0;
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		
		

	}

}
















