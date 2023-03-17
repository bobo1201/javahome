package JAVA1213;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String password;
		
		do {
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			password = scan.next();
			
			if(password.length() < 10) {
				System.out.println("��ȣ�� ��ȿ���� �ʴ�.");
				System.out.println("���� : ��ȣ�� ���̰� 10���� �۴�.");
				
				if(numCount(password, password.length()) == 0) {
					System.out.println("���� : ��ȣ ���� ���ڰ� ����.");
				}
				
				if(enCount(password, password.length()) == 0) {
					System.out.println("���� : ��ȣ ���� �����ڰ� ����.");
				}
			} else {
				System.out.println("��ȣ�� ��ȿ�ϴ�.");
				break;
			}
		} while(true);
		
		scan.close();
		
	}
	
	public static int numCount(String a, int num) {
		
		int cnt = 0;
		
		if(num <= 0) {
			cnt = 0;
		} else if(a.charAt(num-1) >= 49 && a.charAt(num-1) <= 57) {
				cnt = numCount(a, num-1) + 1;
		} else {
			cnt = numCount(a, num-1);
		}
		return cnt;
	}
	
	public static int enCount(String a, int num) {
		int cnt = 0;
		
		if(num <= 0) {
			cnt = 0;
		} else if(a.charAt(num-1) >= 65 && a.charAt(num-1) <= 90) {
			cnt = enCount(a, num-1) + 1;
		} else if(a.charAt(num-1) >= 97 && a.charAt(num-1) <= 122){
			cnt = enCount(a, num-1) + 1;
		} else {
			cnt = enCount(a, num-1);
		}
		return cnt;
	}
}
