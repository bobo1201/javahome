import java.util.Scanner;

public class SumIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a�� : ");
		int a = sc.nextInt();
		System.out.print("b�� : ");
		int b = sc.nextInt();
		
		System.out.println(a + "���� "+ b + "������ ���� " + sumof(a, b) + "�Դϴ�.");
	}
	
	static int sumof(int a, int b) {
		
		if((b-a+1)%2 == 0) {
			return (a+b) * (int)((b-a+1) / 2); 
		} else {
			return (a+b) * (int)((b-a+1) / 2) + (a+b)/2;
		}
	}
}
