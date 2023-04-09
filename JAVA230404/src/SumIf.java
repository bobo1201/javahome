import java.util.Scanner;

public class SumIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a값 : ");
		int a = sc.nextInt();
		System.out.print("b값 : ");
		int b = sc.nextInt();
		
		System.out.println(a + "부터 "+ b + "까지의 합은 " + sumof(a, b) + "입니다.");
	}
	
	static int sumof(int a, int b) {
		
		if((b-a+1)%2 == 0) {
			return (a+b) * (int)((b-a+1) / 2); 
		} else {
			return (a+b) * (int)((b-a+1) / 2) + (a+b)/2;
		}
	}
}
