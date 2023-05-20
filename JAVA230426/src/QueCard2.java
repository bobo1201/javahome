
import java.util.Scanner;

public class QueCard2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			n = sc.nextInt();
		} while(n < 1 || n > 500000);
		
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		while(n > 1) {			
			for(int i=0; i<n; i++) {
				if(i == n-1) {
					arr[i] = 0;
				} else {					
					arr[i] = arr[i+1];
				}
			}
						
			int a = arr[0];
			
			for(int i=0; i<n-1; i++) {
				if(i == n-2) {
					arr[i] = a;
				} else {					
					arr[i] = arr[i+1];
				}
			}
						
			n--;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
		
	}
}