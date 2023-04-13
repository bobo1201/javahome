import java.util.Scanner;

public class TriangleEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
				
		do {
			System.out.print("단 수를 입력하세요 : ");
			n = sc.nextInt();
		} while(n<=0);
		
		System.out.println();
		
		TriangleLB(n);
		
		System.out.println();
		
		TriangleLU(n);
		
		System.out.println();
		
		TriangleRU(n);
		
		System.out.println();
		
		TriangleRB(n);
		
	}
	
	
	static void TriangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void TriangleLU(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void TriangleRU(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j <= n; j++) {
				if(j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}
	}
	
	static void TriangleRB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j <= n; j++) {
				if(j <= n-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}
	}
}
