
import java.util.Scanner;

public class Main_ÇÑ¼ö {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int num = 0;
		
		for(int i=0; i<a.length; i++) {
			if(i>0 && i<100) {
				num++;
			} else {
				a[i] = n%10;
				n /= 10;				
			}
			
		}
		
		int c = sc.nextInt();
		
		while(n-->0) {
			if(arr[n] == c) {
				num++;
			}
		}
		
		System.out.println(num);
	}
}
