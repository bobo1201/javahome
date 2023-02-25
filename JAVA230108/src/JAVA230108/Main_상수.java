package JAVA230108;

import java.util.Scanner;

public class Main_상수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int a1 = 0;
		int b1 = 0;
		
		for(int i=0; i < 3; i++) {
			a1 += a % 10 * (int)Math.pow(10, 2-i);
			b1 += b % 10 * (int)Math.pow(10, 2-i);
			a /= 10;
			b /= 10;
		}
		
		if(a1 > b1) {
			System.out.println(a1);
		} else {
			System.out.println(b1);			
		}
	}
}
