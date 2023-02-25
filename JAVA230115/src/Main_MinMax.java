
import java.util.Scanner;

public class Main_MinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int max = -1000000;
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		int min = max;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}		
		}
		System.out.println(min + " " + max);
	}
}
