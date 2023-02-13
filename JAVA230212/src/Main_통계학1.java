
import java.util.Scanner;

public class Main_≈Î∞Ë«–1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(facto(n));

	}
	
	public static int facto(int n) {
		int mul = 1;
		
		for(int i=1; i<=n; i++) {
			mul *= i;
		}
		
		return mul;
	}
}
