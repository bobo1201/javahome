
import java.util.Scanner;

public class answer6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		do {
			n = sc.nextInt();
		} while(n < 1 || n > 100000);
		
		
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		do {
			m = sc.nextInt();
		} while(m < 1 || m > 100000);
		
		int c = 0;

		for(int i=0; i<m; i++) {
			int b = sc.nextInt();
			
			for(int j=0; j<a.length; j++) {
				if(b == a[j]) {
					System.out.println("1");
					c = 1;
					break;
				} else {
					c = 0;
				}
			}
			if(c == 0) {
				System.out.println("0");
			}
		}
	}
}
