import java.util.Scanner;

public class Fibonacci_backjoon {
	static long fibonacci(long n) {
		if(n == 1) return 1;
		else if(n < 1) return 0;
		else {
			return fibonacci(n-1) +  fibonacci(n-2);	
		}		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(fibonacci(n));
	}
}