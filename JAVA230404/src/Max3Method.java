import java.util.Scanner;

public class Max3Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.print("a�� �� : ");
		int a = sc.nextInt();
		System.out.print("b�� �� : ");
		int b = sc.nextInt();
		System.out.print("c�� �� : ");
		int c = sc.nextInt();
		
		System.out.println("�ִ��� " + max3(a, b, c) + "�Դϴ�.");
	}
	
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		return max;
	}
}
