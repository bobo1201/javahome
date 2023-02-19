import java.util.Scanner;

public class Main_�ּҰ����3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
			
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int max = gcd(a, b);
			a /= max;
			b /= max;
			
			max *= a*b;
			System.out.println(max);			
		}
	}
	
	static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}


		


