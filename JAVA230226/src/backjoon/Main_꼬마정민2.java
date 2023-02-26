package backjoon;

import java.util.Scanner;

public class Main_²¿¸¶Á¤¹Î2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		System.out.println(sum(a,b,c));
	}
	
	public static long sum(long a, long b, long c) {
		return a+b+c;
	}
}
