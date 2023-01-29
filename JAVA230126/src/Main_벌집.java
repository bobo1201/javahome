
import java.util.Scanner;

public class Main_¹úÁı {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int cnt = 0;
		int sum = 1;
		
		for(int i=0; i<a; i++) {
			cnt++;
			sum += 6*i;
			if(a <= sum) {
				break;
			}
		}
		
		System.out.println(cnt);
				
//		1 
//		2~7   +6
//		8~19  +12
//		20~37 +18
//		38~61 +24
	}
}
