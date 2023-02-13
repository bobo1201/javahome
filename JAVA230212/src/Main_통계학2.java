
import java.util.Scanner;

public class Main_≈Î∞Ë«–2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(facto(n));

	}
	
	public static int facto(int n) {
		int mul = n;
		
		if(n == 0) {
			mul = 1;
			return mul;
		} else {
			mul *= facto(n-1);			
		}
		
		return mul;
	}
}
