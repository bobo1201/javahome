package java1208;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int rest = 0;
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		num = scan.nextInt();
		
		System.out.print("�������� ǥ���� �Է� ���� = ");

		while(num > 0) {
			rest = num % 10;
			num /= 10;
			System.out.print(rest);
		}
		scan.close();
	}
}
