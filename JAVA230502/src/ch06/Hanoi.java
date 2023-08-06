package ch06;
import java.util.Scanner;

public class Hanoi {
	
	static void move(int n, int x, int y) {
		if(n > 1) {
			move(n-1, x, 6-x-y);
		}
		
		System.out.println("����[" + n + "]��(��) " + x + "�� ��տ��� " + y + "�� ������� �ű�");
		
		if(n > 1) {
			move(n-1, 6-x-y, y);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		
		System.out.print("������ ���� : ");
		int n = sc.nextInt();
		
		move(n, 1, 3);
		
	}

}