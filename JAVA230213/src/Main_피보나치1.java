
import java.util.Scanner;

public class Main_피보나치1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(pibo(n));
	}
	
	public static int pibo(int n) {
		int arr[] = new int[n+5];
		arr[0] = 0;
		arr[1] = 1;
		
		if(n == 0) {
			return 0;
		} else {
			if(n == 1) {
				return 1;
			} else {
				return arr[n] = pibo(n-1) + pibo(n-2);				
			}
		}
	}
}
