import java.util.Scanner;

public class TriangleLB2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");
		
		do {
			System.out.print("몇 단 삼각형입니까?");
			n = sc.nextInt();
		} while(n<=0);
		
		TriangleLB(n);
	}
	
	
	static void TriangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
