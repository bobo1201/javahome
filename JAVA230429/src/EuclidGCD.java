import java.util.Scanner;

public class EuclidGCD {
	static int gcd(int n, int m) {
		if(m == 0) {
			return n;
		} else {
			return gcd(m, n%m);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수의 최대공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();

		System.out.print("정수를 입력하세요 : ");
		int m = sc.nextInt();
		
		System.out.println("최대공약수는 " + gcd(n, m) + "입니다.");
	}
}