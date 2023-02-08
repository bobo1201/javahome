import java.util.Scanner;

public class Main_대표값2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
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
		System.out.println(sum/arr.length);
		System.out.println(arr[2]);
	}
}
