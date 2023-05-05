import java.util.Scanner;

public class StackZero {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int x[] = new int[k];
		int cnt = 0;
		
		for(int i=0; i<k; i++) {
			do {
				x[cnt] = sc.nextInt();
				
				if(x[cnt] == 0) {
					cnt--;
				} else {
					cnt++;
				}
				if(cnt == k) break;
			} while(x[cnt] > 100000 && x[cnt] < 1);
		}
		
//		System.out.println("cnt : " + cnt);
		
		int sum = 0;
		
		for(int i=0; i<cnt; i++) {
			sum += x[i];
		}
		
		System.out.println(sum);
	}
}
