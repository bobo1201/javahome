import java.util.Scanner;

public class Piramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
				
		do {
			System.out.print("단 수를 입력하세요 : ");
			n = sc.nextInt();
		} while(n<=0);
		
		System.out.println();
		
		spira(n);
		
		System.out.println();
		
		npira(n);
		
	}
	
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j <= (n-1)*2 + 1; j++) {
				if(j <= n-i) {
					System.out.print(" ");
				} else if(j >= n+i) {
					System.out.print(" ");
				} else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}
	}

	static void npira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j <= (n-1)*2 + 1; j++) {
				if(j <= n-i) {
					System.out.print(" ");
				} else if(j >= n+i) {
					System.out.print(" ");
				} else {
					System.out.print(i);					
				}
			}
			System.out.println();
		}
	}
}
