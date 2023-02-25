
import java.util.Scanner;

public class Main_손익분기점 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int n = 0;
        
        if( c != b ){
            n = a / (c-b) + 1;
        } else {
            n = -1;
        }
        
		if(b > c) {
			System.out.println(-1);
        } else {
			System.out.println(n);
		}
	}
}
