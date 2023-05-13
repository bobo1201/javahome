
import java.util.Scanner;

public class answer8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[3];
		for(int i=0; i<3; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		if(a[0] == a[1] && a[1] == a[2]) {
			sum = 10000 + a[0]*1000;
		} else if(a[0] == a[1] || a[0] == a[2]) {
			sum = 1000 + a[0]*100;
		} else if(a[1] == a[2]) {
			sum = 1000 + a[1]*100;
		} else {
			int max = a[0];
			
			for(int i=1; i<3; i++) {
				if(max < a[i]) {
					max = a[i];
				}
			}
			
			sum = 100*max;
		}
		
		System.out.println(sum);
	
	}
}
