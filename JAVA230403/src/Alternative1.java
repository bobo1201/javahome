import java.util.Scanner;

public class Alternative1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("+�� -�� ������ n�� ����մϴ�.");
		
		do {
			System.out.print("n��: ");
			n = sc.nextInt();
		} while(n <= 0);
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			if(i % 2 == 0)
				System.out.print("+");
			else
				System.out.print("-");
		}
	}
}