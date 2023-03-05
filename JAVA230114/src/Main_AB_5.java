
import java.util.Scanner;

public class Main_AB_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a[] = new int[100];
		int b[] = new int[100];
		
		
		for(int i=0; true; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			
			if(a[i] == 0 && b[i] == 0) {
				break;
			}
		}
		
		for(int i = 0; i < a.length-1; i++) {
			if(a[i] + b[i] != 0) 
				System.out.println(a[i] + b[i]);
		}
	}
}
