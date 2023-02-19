import java.util.Scanner;

public class Main_최소공배수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
			
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int max = 1;
			int c = 2;
			while(a*b/c > 0) {
				if(a % c == 0 && b % c == 0) {
					a /= c;
					b /= c;
					max *= c;
				} else {
					c++;
				}
			}
			max *= a*b;
			
			System.out.println(max);			
		}
	}
}


		


