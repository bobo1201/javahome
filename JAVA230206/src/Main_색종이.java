import java.util.Scanner;

public class Main_색종이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			
			sum += 100;
			
			for(int j=0; j<i; j++) {
				if(Math.abs(x[j]-x[i]) < 10 || Math.abs(x[j]-x[i]) > 0 ) {
					if(Math.abs(y[j]-y[i]) < 10 && Math.abs(y[j]-y[i]) > 0) {
						sum -= Math.abs((10-(x[j]-x[i])) * (10-(y[j]-y[i])));
					}
				}
			}
		}
		
		System.out.println(sum);
	}
}
