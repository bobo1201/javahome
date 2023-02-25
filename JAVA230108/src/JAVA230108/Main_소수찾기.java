package JAVA230108;

import java.util.Scanner;

public class Main_소수찾기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 0;
		
		for(int i=0; i < n; i++) {
			int num = sc.nextInt();
			int b = 0;
			for(int j=2; j <= num; j++) {
				if(num % j == 0) {
					b++;
				}
				if(b > 1) {
					break;
				}
			}
			if(b == 1) {
				a++;
			}
		}
		System.out.println(a);
	}
}


