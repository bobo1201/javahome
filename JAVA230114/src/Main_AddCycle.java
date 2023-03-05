
import java.util.Scanner;

public class Main_AddCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		int num = 0;
		int temp = 0;
		int b = a;
		
		while(true) {
			num++;
			temp = (a/10) + (a%10);
			a = (temp%10) + (a % 10) * 10;

			if(b == a) break;
		}
		
		System.out.println(num);
	}
}
