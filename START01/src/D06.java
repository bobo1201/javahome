import java.util.Scanner;

public class D06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
			sum = sum + arr[i];
		}
		
		avg = sum/n;
		
		System.out.println(sum);
		System.out.println(avg);
				
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= avg) {
				System.out.println(arr[i]);
			}
		}
	}
}
