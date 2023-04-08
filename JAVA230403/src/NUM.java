import java.util.Scanner;

public class NUM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력하세요 : ");
		
		int n = sc.nextInt();
		int cnt = 0;
		
		while(n > 0) {
			n /= 10;
			cnt++;
		}
		
		System.out.println("그 수는 " + cnt + "자리입니다.");
	}
}
