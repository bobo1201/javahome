
import java.util.Scanner;

public class answer10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		String str[] = new String[t];
		
		for(int i=0; i<t; i++) {
			str[i] = sc.next();
			
			str[i] = str[i].charAt(0) + "" + str[i].charAt(str[i].length()-1);
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(str[i]);
		}
	}
}
