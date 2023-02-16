
import java.util.Scanner;

public class Main_네번째점 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[4][2];
		int x = 0;
		int y = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();		
			}
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");				
			}
			System.out.println();
		}
	}
}
