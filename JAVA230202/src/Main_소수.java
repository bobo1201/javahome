import java.util.Scanner;

public class Main_¼Ò¼ö {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int min = n;
		int sum = 0;
		
		for(int i=m; i <= n; i++) {
			int b = 0;
			for(int j=2; j <= i; j++) {
				if(i % j == 0) {
					b++;
				}
				if(b > 1) {
					break;
				}
			}
			if(b == 1) {
				sum += i;
				if(min >= i) {
					min = i;
				}
			}
		}
		if(sum > 0) {
			System.out.println(sum);
			System.out.println(min);			
		} else {
			System.out.println(-1);
		}
	}
}