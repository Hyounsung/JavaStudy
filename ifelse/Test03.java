package ifelse;
import java.lang.*;
import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jja = 5000, jjam = 6000, jjas, jjams, a, b, c, d, e, f;
		System.out.println("Â¥Àå¸é - " + jja + "¿ø");
		System.out.println("Â«»Í - " + jjam + "¿ø");
		System.out.print("Â¥Àå¸é ¼ö·® : ");
		jjas = sc.nextInt();
		
		System.out.print("Â«»Í ¼ö·® : ");
		jjams = sc.nextInt();
		
		a = jja * jjas; //Â¥Àå¸é ÃÑ °¡°Ý
		b = jjam * jjams; //Â«»Í ÃÑ °¡°Ý
		c = a + b; //ÃÑ°¡°Ý
		d = (int)(c * 0.9); //10±×¸© ÀÌ»óÀÏ ½Ã 10ÇÁ·Î ÇÒÀÎ
		e = c - 3000; // 5±×¸© ÀÌ»óÀÏ ½Ã 3000¿ø ÇÒÀÎ
		f = jjas + jjams; // Â¥Àå, Â«»Í ÃÑ °³¼ö

		if(f >= 10) {
			System.out.println("ÃÑ °¡°Ý : " + d + "¿ø");
		}
		else if(f >= 5) {
			System.out.println("ÃÑ °¡°Ý : " + e + "¿ø");
		}
		else {
			System.out.println("ÃÑ °¡°Ý : " + c + "¿ø");
		}
		
		


	}

}
