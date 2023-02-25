
import java.util.Scanner;

public class Main_Max2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[9];
		int max = 0;
		int n = 0;
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			
			if(a[i] > max) {
				max = a[i];
				n = i+1;
			}
		}
		System.out.println(max);
		System.out.println(n);
	}
}
