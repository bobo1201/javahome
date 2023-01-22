
import java.util.Scanner;

public class Main_´ÙÀÌ¾ó {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		a = a.toUpperCase();
		
		int sum = 0;
		
		for(int i=0; i<a.length(); i++) {
			int b = a.charAt(i);
			if(b >= 65 && b <= 67) {
				sum += 3;
			} else if(b >= 68 && b <= 70) {
				sum += 4;				
			} else if(b >= 71 && b <= 73) {
				sum += 5;				
			} else if(b >= 74 && b <= 76) {
				sum += 6;				
			} else if(b >= 77 && b <= 79) {
				sum += 7;				
			} else if(b >= 80 && b <= 83) {
				sum += 8;				
			} else if(b >= 84 && b <= 86) {
				sum += 9;				
			} else if(b >= 87 && b <= 90) {
				sum += 10;				
			}
		}
		System.out.println(sum);
	}
}
