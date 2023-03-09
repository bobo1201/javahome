package java1208;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		int cnt = 0;
		
		do {
	
			System.out.print("한 정수를 입력하세요 : ");
			n = scan.nextInt();
			
		}while(n <= 0);
		
		System.out.println("모든 나누어 떨어지는 정수들의 쌍은 다음과 같다.");

		for(int i=1; i <= n; i++) {
			for(int j=1; j <= n; j++) {
				if(i > j) {
					if(i % j == 0) {
						cnt++;
						System.out.println("(" + i + ", " + j + ")");	
					}
				}
			}
		}
		System.out.println("모든 정수 쌍의 수는 : " + cnt);
		scan.close();
	}
}
