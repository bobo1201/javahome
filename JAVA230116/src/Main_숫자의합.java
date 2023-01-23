
import java.util.Scanner;

public class Main_숫자의합 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		int sum = 0;
		
		for(int i=0; i<b.length(); i++) {
			sum += b.charAt(i)-48;
		}
		
		System.out.println(sum);
	}
}
