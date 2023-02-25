
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int num = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
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
