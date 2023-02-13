
import java.util.Scanner;

public class Main_ÆÑÅä¸®¾ó {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			int temp = 0;
			
			for(int j=i + 1; j<arr.length; j++) {
				if(arr[i] >= arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
			
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		
		if(sum > 0) {
			System.out.println((int)((float)sum/arr.length + 0.5));		
		} else {
			System.out.println((int)((float)sum/arr.length - 0.5));					
		}
		
		System.out.println(arr[arr.length/2]);
		
		if(n == 1) {
			System.out.println(arr[0]);
			System.out.println(0);
		} else {
			System.out.println(arr[1]);
			System.out.println(arr[n-1] - arr[0]);
		}
	}
}
