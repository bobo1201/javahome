
import java.util.Scanner;

public class answer2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			n = sc.nextInt();
		} while(n < 1 || n > 1000);
		

		double[] arr = new double[n];
		
		double sum = 0;
		int max = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			
			if(max < arr[i]) {
				max = (int)arr[i];
			}						
		}
				
		for(int i=0; i<n; i++) {
			arr[i] = (arr[i] * 100/max);
						
			sum += arr[i];
		}
			
		System.out.println(sum/n);		
	}
}
