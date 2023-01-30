
import java.util.Scanner;

public class Main_ACMÈ£ÅÚ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for(int i=0; i<a; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int c = (n%h) * 100;
			
			if(n%h == 0) c = h * 100;
			
			arr[i] = c + (int)(Math.ceil((double)n/h));
		}
		
		for(int i=0; i<a; i++) {
			System.out.println(arr[i]);
		}
	}
}
