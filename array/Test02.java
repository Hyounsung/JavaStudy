package array;

public class Test02 {
	public static void main(String[] args) {
//		int[] arr = new int[10];
//		int sum = 0;
//		for(int i = 0; i < 10; i++) {
//			int num = (int)(Math.random() * 6) + 1;
//			sum += num;
//			arr[i] = num;
//			System.out.print(i+1 + "번째 : " + arr[i] + " ");
//		}
//		System.out.print("\n짝수 주사위 : ");
//		for(int i = 0; i < 10; i++) {
//			if(arr[i]%2==0) System.out.print(arr[i] + " ");
//		}
//		System.out.println("\n주사위 값들의 합계 : " + sum);
		
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 6) + 1;
		}
		System.out.println("[1] 전체 주사위 기록을 출력");
		for(int i = 0; i < arr.length; i++) {
			if(i % 5 == 4) {
				System.out.println(i + 1 + "번째 : " + arr[i]);
			}else {
				System.out.print(i + 1 + "번째 : " + arr[i] + ", ");
			}
		}
		System.out.println("[2] 짝수 주사위 기록을 출력");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(i + 1 + "번째 : " + arr[i]);
			}
		}
		System.out.println("\n[3] 주사위 값들의 합계 출력");
		int tot = 0;
		for(int i = 0; i<arr.length; i++) {
			tot += arr[i];
		}
		System.out.println("총점 : " + tot);
	}
}




