
import java.util.Scanner;

public class Main_Submit2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a[] = new String[n];
		int sum[] = new int[n];
		
		for(int i=0; i<a.length; i++) {
			
			int num = 0;
			
			a[i] = sc.next();
			for(int j=0; j<a[i].length(); j++) {
				num++;
				if(a[i].charAt(j) != 'X') {
					sum[i] += num;
				} else {
					num = 0;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(sum[i]);
		}
	}
}
