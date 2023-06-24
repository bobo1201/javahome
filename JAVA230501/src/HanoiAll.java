import java.util.Scanner;

public class HanoiAll {
	
	static void move(int n, int x, int y) {
		if(n > 1) {
			move(n-1, x, 6-y-x);
		}
		
		System.out.println("����[" + n + "]��(��) " + x + "�� ��տ��� " + y + "�� ������� �ű�");
		
		if(n > 1) {
			move(n-1, 6-y-x, y);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		
		System.out.print("������ ���� : ");
		int n = sc.nextInt();
		
		System.out.print("�ű�� ��ġ : ");
		int m = sc.nextInt();
		
		move(n, 1, m);
		
	}

}