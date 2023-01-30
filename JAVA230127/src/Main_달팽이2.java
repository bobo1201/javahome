
import java.util.Scanner;

public class Main_´ŞÆØÀÌ2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		int num = 0;
		if(a - b == 1) {
			num = v - b - 1;
		} else {
			num = v/(a-b);
		}
		int sum = (a-b)*num;
		
		while(true) {
			num++;
			sum += a;
			if(sum >= v) break;
			sum -= b;
		}
		System.out.println(num);
	}
}
