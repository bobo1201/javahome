import java.util.Scanner;

public class Max3Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		System.out.print("c의 값 : ");
		int c = sc.nextInt();
		
		System.out.println("최댓값은 " + max3(a, b, c) + "입니다.");
	}
	
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		return max;
	}
}
