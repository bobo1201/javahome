
import java.util.Scanner;

public class answer3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		do {
			n = sc.nextInt();
		} while(n < 1 || n > 100000);
		
		
		do {
			m = sc.nextInt();
		} while(m < 1 || m > 100000);
		
		
		int[] s = new int[n];
		
		for(int i=0; i<n; i++) {
			s[i] = sc.nextInt();
		}
		
		int sum[] = new int[m];
		
		for(int i=0; i<m; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			for(; j<=k; j++) {
				sum[i] += s[j-1];
//				System.out.println("s[" + (j-1) +"] : " + s[j-1]);
			}
			
			System.out.println(sum[i]);
		}		
	}
}
