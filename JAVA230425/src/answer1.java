
import java.util.Scanner;

public class answer1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			n = sc.nextInt();
		} while(n < 1 || n > 100);
		
		String sNum = sc.next();
		
		char cNum[] = new char[n];
		
		int sum = 0;
		
		for(int i=0; i<sNum.length(); i++) {
			cNum[i] = sNum.charAt(i);
			
			sum += (cNum[i]-48);
		}
						
		System.out.println(sum);		
	}
}
