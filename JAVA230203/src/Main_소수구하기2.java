import java.util.Scanner;

public class Main_소수구하기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 1;
		
		while(n != 0) {
			n = sc.nextInt();
			int b = 0;
			
			if(n == 0) break;
			
			for(int i=n+1; i<=2*n; i++) {
				int a = 0;
				for(int j=2; j<=Math.sqrt(i); j++) {	
					if(i % j == 0) {
						a++;
					}
					if(a > 0) break;
				}
				if(i > 1) {
					if(a == 0) {
						b++;
					}				
				}
			}
			System.out.println(b);
		}
	}
}
