package array;

public class Test02 {
	public static void main(String[] args) {
//		int[] arr = new int[10];
//		int sum = 0;
//		for(int i = 0; i < 10; i++) {
//			int num = (int)(Math.random() * 6) + 1;
//			sum += num;
//			arr[i] = num;
//			System.out.print(i+1 + "��° : " + arr[i] + " ");
//		}
//		System.out.print("\n¦�� �ֻ��� : ");
//		for(int i = 0; i < 10; i++) {
//			if(arr[i]%2==0) System.out.print(arr[i] + " ");
//		}
//		System.out.println("\n�ֻ��� ������ �հ� : " + sum);
		
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 6) + 1;
		}
		System.out.println("[1] ��ü �ֻ��� ����� ���");
		for(int i = 0; i < arr.length; i++) {
			if(i % 5 == 4) {
				System.out.println(i + 1 + "��° : " + arr[i]);
			}else {
				System.out.print(i + 1 + "��° : " + arr[i] + ", ");
			}
		}
		System.out.println("[2] ¦�� �ֻ��� ����� ���");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(i + 1 + "��° : " + arr[i]);
			}
		}
		System.out.println("\n[3] �ֻ��� ������ �հ� ���");
		int tot = 0;
		for(int i = 0; i<arr.length; i++) {
			tot += arr[i];
		}
		System.out.println("���� : " + tot);
	}
}




