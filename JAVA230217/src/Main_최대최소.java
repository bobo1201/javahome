
import java.util.Scanner;

public class Main_최대최소 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = 1;
		int max = 1;
		int i = 2;
		
		while(a*b/i > 0) {
			if(a % i == 0 && b % i == 0) {
				a /= i;
				b /= i;
				min *= i;
				max *= i;
			} else {
				i++;
			}
		}
		max *= a*b;
		
		System.out.println(min);
		System.out.println(max);
	}
}
