package JAVA230110;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] arr = new String[6][6];
		
		System.out.print("�� �ε��� �Է� : ");
		int n = sc.nextInt();
		
		System.out.print("�� �ε��� �Է� : ");		
		int m = sc.nextInt();
		
		String a = "0";

		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j < arr[i].length; j++) {
				if(i == 0 && j > 0) {
					arr[i][j] = a;
					arr[j][i] = a;
					
					int b = Integer.parseInt(a) + 1;
					a = Integer.toString(b);
					
					System.out.print("\t" + arr[i][j]);
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i > 0) {
				System.out.print("\n" + arr[i][0]);
			}
			for(int j=0; j < arr[i].length; j++) {
				if(i == n + 1 && j == m + 1) {
					System.out.print("X");
				}
				System.out.print("\t");						
			}
		}
	}
}
