package JAVA230107;

import java.util.Scanner;

public class Main_설탕배달 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = -1;
		
		int len = n / 5;
		int len2 = n / 3;
		
		for(int i=len; i >= 0 ; i--) {
			for(int j=0; j <= len2; j++) {
				if(5*i + 3*j == n) {
					num = i + j;
					n = 0;
					break;
				}
			}
			if(n == 0) break;
		}	
		System.out.println(num);
	}
}
