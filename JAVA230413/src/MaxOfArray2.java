import java.util.Scanner;

public class MaxOfArray2 {
	public static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int b[] = new int[n];
		
		for(int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("최댓값은 " + maxOf(b) + "입니다.");
		
	}

}
