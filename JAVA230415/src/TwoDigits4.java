import java.util.Scanner;

public class TwoDigits4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���簢���� ����մϴ�.");
		System.out.print("���� ���� : ");
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("���簢���� ����մϴ�.");
		System.out.print("���� ���� : ");
		n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			System.out.println("*".repeat(n));
		}
	}
}
