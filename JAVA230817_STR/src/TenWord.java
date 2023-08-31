import java.util.Scanner;

public class TenWord {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		int end = input.length() % 10;
		
		while(input.length() > 0) {
			if(input.length()/10 > 0) {
				System.out.println(input.substring(0, 10));
				input = input.substring(10);
			} else {
				System.out.println(input.substring(0));
				break;
			}
			
		}
	}
}
