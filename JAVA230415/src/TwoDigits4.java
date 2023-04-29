import java.util.Scanner;

public class TwoDigits4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정사각형을 출력합니다.");
		System.out.print("변의 길이 : ");
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("정사각형을 출력합니다.");
		System.out.print("변의 길이 : ");
		n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			System.out.println("*".repeat(n));
		}
	}
}
