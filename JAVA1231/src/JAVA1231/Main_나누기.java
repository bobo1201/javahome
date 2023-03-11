package JAVA1231;

import java.util.Scanner;

public class Main_³ª´©±â {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int num = 10;
		
		for(int i=0; i < 10; i++) {
			a[i] = sc.nextInt();
			
			a[i] = a[i] % 42;
		}
		
		for(int i=0; i < 10; i++) {
			for(int j=i+1; j < 10; j++) {
				if(a[i] == a[j]) {
					num--;
					break;
				}
				if(j == 9) {
					i = i+1;
					j = i;
				}
			}
		}
		System.out.println(num);
	}
}
