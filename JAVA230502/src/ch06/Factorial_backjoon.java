package ch06;
import java.util.Scanner;

public class Factorial_backjoon {
	static long factorial(long n) {
		if(n > 0) {
			return n * factorial(n-1);
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(factorial(n));
	}
}