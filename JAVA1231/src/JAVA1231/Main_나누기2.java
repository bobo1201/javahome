package JAVA1231;

import java.util.Arrays;
import java.util.Scanner;

public class Main_³ª´©±â2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		
		for(int i=0; i < 10; i++) {
			a[i] = sc.nextInt() % 42;

		}
		
		Arrays.sort(a);
		
		int temp = a[0];
		int num = 1;
		
		for(int i=1; i < 10; i++) {
			if(temp != a[i]) {
				num++;
			}
			temp = a[i];
		}
		
		System.out.println(num);
	}
}
