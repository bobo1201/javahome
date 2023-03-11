package JAVA1231;

import java.util.Scanner;

public class Main_평균은넘겠지 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int n;
		int sum = 0;
		float avg = 0;
		int num = 0;
				
		for(int i=0; i < c; i++) {
			n = sc.nextInt();
			int score[] = new int[n];
			
			for(int j=0; j < n; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
				
				if(j == n-1) {
					avg = (float)sum / n;
					
					for(int k=0; k < n; k++) {
						if(score[k] > avg) {
							num++;
						}
					}					
				}
			}
			double result = (double)num/n * 100;			
			System.out.println(String.format("%.3f", result) + "%");
			
			sum = 0;
			avg = 0;
			num = 0;
		}
	}
}
