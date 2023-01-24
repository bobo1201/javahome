
import java.util.Scanner;

public class Main_ÇÑ¼ö {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int num = 0;
		if(a >= 100) {
			num = 99;
			for(int i=num+1; i<=a; i++) {
				int b = i%10;
				int c = i%100/10;
				if(i/100 - c == c - b) {
					num++;
				}
			}
		} else {
			num = a;
		}
		System.out.println(num);
	}
}
