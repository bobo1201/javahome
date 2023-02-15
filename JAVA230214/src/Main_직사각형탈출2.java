import java.util.Scanner;

public class Main_직사각형탈출2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int arr[] = {x, w-x, y, h-y};
		int min = x;
		
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(min);
	}
}
