package JAVA230108;

import java.util.Scanner;

public class Main_상수2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[2];
		
		for(int i=0; i<num.length; i++) {
			String str = sc.next();
			num[i] = (str.charAt(2) - '0') * 100 + (str.charAt(1) - '0') * 10
					+ (str.charAt(0) - '0');
		}
		
		if(num[0] > num[1]) {
			System.out.println(num[0]);
		} else {
			System.out.println(num[1]);			
		}
	}
}
