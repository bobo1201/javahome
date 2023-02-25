package JAVA230108;

import java.util.Scanner;

public class Main_손익분기점 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int n = 0;
				
		while(true) {
			n++;
			if(b > c) {
				System.out.println(-1);
				break;
			} else if( a < (c-b)*n ) {
				System.out.println(n);
				break;
			}			
		}
	}
}


