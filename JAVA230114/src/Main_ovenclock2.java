
import java.util.Scanner;

public class Main_ovenclock2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		b = b + c;
		
		if(b / 60 >= 1) {
			a = a + (b / 60);
			if(a > 23) {
				a = (a-24);
			}
			b = b % 60;
		}
		
		System.out.println(a + " " + b);
	}
}


//System.out.println(((h + (m + t) / 60) % 24) + " " + ((m + t) % 60));