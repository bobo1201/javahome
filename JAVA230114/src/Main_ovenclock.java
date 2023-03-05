
import java.util.Scanner;

public class Main_ovenclock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a < 23) {
			b = b + c;
			if(b / 60 >= 1) {
				a = a + (b / 60);
				b = b - (b/60) * 60;
			}
		} else {
			b = b + c;
			if(b / 60 >= 1) {
				a = 0 + (b / 60 - 1);
				b = b - (b/60) * 60;
			}
		}
		
		System.out.println(a + " " + b);
	}
}
