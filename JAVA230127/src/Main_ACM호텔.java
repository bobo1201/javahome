
import java.util.Scanner;

public class Main_ACMÈ£ÅÚ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for(int i=0; i<a; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int c = n%h;
			
			if(n%h == 0) {
				arr[i] = h*100 + n/h;
			} else {
				arr[i] = (n%h)*100 + n/h+1;
			}
		}
		
		for(int i=0; i<a; i++) {
			System.out.println(arr[i]);
		}
	}
}
