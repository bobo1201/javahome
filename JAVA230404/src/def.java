import java.util.Scanner;

public class def {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a�� : ");
		int a = sc.nextInt();
		int b;
		
		do {
			System.out.print("b�� : ");
			b = sc.nextInt();
			
			if(b <= a) {
				System.out.println("a���� ū ���� �Է��ϼ���!");
			}
		} while(b <= a);
		
		System.out.println("b-a�� " + (b-a) + "�Դϴ�.");
	}
}
