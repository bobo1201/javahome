import java.util.Scanner;

public class Recur3 {
	static void recur(int n) {
		while(n > 0) {
			recur(n-1);
			System.out.println(n);
			n = n-2;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("������ �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		recur(n);
	}
}