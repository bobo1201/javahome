package java1208;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int inter = 0, sum, min;
		
		System.out.println("��� ī�� �̿� ��� ����");
		
		System.out.print("�̰����ݾ� : ");
		int nonPay = scan.nextInt();
		System.out.print("��� ���ݾ� : ");
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
		
		System.out.println("��ü���� : " + inter);
		System.out.println("\n�Ա��ؾ��� �ѱݾ� : " + sum);
		System.out.println("�ּ��Աݾ� : " + min);
		
	}

}
