import java.util.Scanner;

public class Recur2 {
	static void recur(int n) {
		if(n > 0) {
			recur(n-2);
			System.out.println(n);
			recur(n-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		
		recur(n);
	}
}