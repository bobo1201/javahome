import java.util.Scanner;
import java.util.Random;

public class D07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int n = scanner.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Math.abs(random.nextInt()%45) + 1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("i : " + i + " "+ arr[i]);
					System.out.println("j : " + j + " "+ arr[j]);
					arr[j] = Math.abs(random.nextInt()%45) + 1;
					j = j-1;
				}
				else {
					arr[j] = arr[i];
				}
			}
			System.out.print(arr[i] + " ");
		}
	}

}
