package java1208;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int inter = 0, sum, min;
		
		System.out.println("당월 카드 이용 대금 명세서");
		
		System.out.print("미결제금액 : ");
		int nonPay = scan.nextInt();
		System.out.print("당월 사용금액 : ");
		int mPay = scan.nextInt();
		
		sum = nonPay + mPay;
		
		if(nonPay > 0) {
			inter = sum * 2 / 100;
		}
				
		if(sum < 100000) {
			min = sum;
		} else if(sum <= 300000) {
			min = 100000;
		} else {
			min = sum * 20 / 100;
		}
		
		System.out.println("연체이자 : " + inter);
		System.out.println("\n입금해야할 총금액 : " + sum);
		System.out.println("최소입금액 : " + min);
		
	}

}
