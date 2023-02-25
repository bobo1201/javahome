
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println(sum(arr));
	}
	
	static long sum(int[] a) {
		
		long sum1 = 0;
		
		for(int i=0; i<a.length; i++) {
			a[i] = i;
			sum1 += a[i];
		}
		
		return sum1;
	}
}
