import java.util.Scanner;

public class EuclidGCD {
	static int gcd(int n, int m) {
		if(m == 0) {
			return n;
		} else {
			return gcd(m, n%m);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �ִ������� ���մϴ�.");
		
		System.out.print("������ �Է��ϼ��� : ");
		int n = sc.nextInt();

		System.out.print("������ �Է��ϼ��� : ");
		int m = sc.nextInt();
		
		System.out.println("�ִ������� " + gcd(n, m) + "�Դϴ�.");
	}
}