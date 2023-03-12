package JAVA1225;

import java.util.Scanner;

public class Main_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			int a = 0;
			int b = 0;
			
			do {
				a = sc.nextInt();
				b = sc.nextInt();						
			}while(a < 0 || a > 10 || b < 0 || b> 10);
			
			double div = (double)a/b;
			
			System.out.println( div );
	}
}
