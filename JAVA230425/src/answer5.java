
import java.util.Scanner;

public class answer5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		do {
			m = sc.nextInt();
		} while(m < 1 || m > 1000000);
		
		
		do {
			n = sc.nextInt();
		} while(n < m || n > 1000000);
		
		int arr[] = new int[n];
		
		int cnt = 0;
		int a = 0;
				
		
		for(int i=m; i<=n; i++) {
			for(int j=2; j<=i; j++) {
				
				if(i == j) {
					cnt++;
					a = i;
				}
				
				if(i%j == 0) {
					break;
				}
			}
			
			if(a == i) {
				arr[cnt] = i;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
