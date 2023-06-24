import java.util.Scanner;

public class Fibonacci_backjoon2 {
	static long fibonacci(long n) {
		if(n > 1) return fibonacci(n-1) +  fibonacci(n-2);	
		else if(n == 1) return 1;
		else return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(fibonacci(n));
	}
}