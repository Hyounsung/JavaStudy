package switchcase;
import java.lang.*;
import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		
//		double a = 3;
//		
//		switch((int)a) {
//		case '\n' - 9 :
//		case (int)2.234 :
//		case a + 20 :
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[계절별 사은품]\n봄 - 황사마스크\n여름 - 모기퇴치약\n가을 - 선글라스\n겨울 - 머플러");
		System.out.print("여행가고 싶은 달 입력 : ");
		int month = sc.nextInt();
		String sea;
		String sa;

		switch(month) {
		case 3 :
		case 4 :
		case 5 :
			sea = "봄"; 
			sa = "황사마스크";
			break;
		case 6 :
		case 7 :
		case 8 :
			sea = "여름";
			sa = "모기퇴치약";
			break;
		case 9 :
		case 10 :
		case 11 :
			sea = "가을";
			sa = "선글라스";
			break;
		case 12 :
		case 1 :
		case 2 :
			sea = "겨울";
			sa = "머플러";
			break;
		default :
			sea = null;
			sa = null;
		}
		if(sea == null && sa == null) System.out.println("1 ~ 12까지의 숫자만 입력하세요.");
		else System.out.println(sea + "에 여행가시면 " + sa + "을/를 사은품으로 증정합니다!\n받으시려면 여기를 누르세요...");
	}

}
