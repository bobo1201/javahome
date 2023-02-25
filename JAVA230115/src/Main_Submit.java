
import java.util.Scanner;

public class Main_Submit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[28];
		int n = 0;
		int temp = 0;
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++) {			
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		
	}
}
