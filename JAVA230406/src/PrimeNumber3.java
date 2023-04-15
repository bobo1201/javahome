import java.util.Scanner;

public class PrimeNumber3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int ptr = 0;
		System.out.print("마지막 수를 입력하세요 : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		arr[ptr++] = 2;
		
		for(int i=3; i <= n ;i += 2) {
			int j;
			for(j=1; j < ptr; j++) {
				cnt++;
				if(i % arr[j] == 0) {
					break;
				}
			}
			if(j == ptr) {
				arr[ptr++] = i;
			}
		}
		for(int i=0; i<ptr; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("나눗셈 횟수 : " + cnt);

	}
}
