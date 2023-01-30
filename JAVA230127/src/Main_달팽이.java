
import java.util.Scanner;

public class Main_¥ﬁ∆ÿ¿Ã {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		int sum = 0;
		int num = 0;
		
		while(sum <= v) {
			num++;
			sum += a;
			if(sum >= v) break;
			sum -= b;
		}
		System.out.println(num);
	}
}
