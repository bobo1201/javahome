package java1208;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int rest = 0;
		
		System.out.print("양의 정수를 입력하세요 : ");
		num = scan.nextInt();
		
		System.out.print("역순으로 표시한 입력 정수 = ");

		while(num > 0) {
			rest = num % 10;
			num /= 10;
			System.out.print(rest);
		}
		scan.close();
	}
}
