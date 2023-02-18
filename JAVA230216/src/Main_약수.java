
import java.util.Scanner;

public class Main_약수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int min = 1000000;
		int max = 0;
		int a;
		
		for(int i=0; i<n; i++) {
			a = sc.nextInt();
			
			if(a > max) {
				max = a;
			}
			if(a < min) {
				min = a;
			}
		}
		System.out.println(min * max);
	}
}
