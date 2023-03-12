package JAVA1225;

import java.util.Scanner;

public class Main_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);

		int a, b;
		
		do {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);

		}while(sc.hasNext());
	}
}