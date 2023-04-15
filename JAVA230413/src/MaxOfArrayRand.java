import java.util.Scanner;
import java.util.Random;

public class MaxOfArrayRand {

	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i< a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		
		System.out.print("사람 수 : ");
		int n = sc.nextInt();
		
		int height[] = new int[n];
		

		for(int i=0; i<height.length; i++) {
			height[i] = 100 + rd.nextInt(90);
			System.out.println("height[" + i + "] = " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
}
