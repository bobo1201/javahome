import java.util.Scanner;

public class HanoiAll {
	
	static void move(int n, int x, int y) {
		if(n > 1) {
			move(n-1, x, 6-y-x);
		}
		
		System.out.println("원반[" + n + "]을(를) " + x + "번 기둥에서 " + y + "번 기둥으로 옮김");
		
		if(n > 1) {
			move(n-1, 6-y-x, y);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		
		System.out.print("원반의 개수 : ");
		int n = sc.nextInt();
		
		System.out.print("옮기는 위치 : ");
		int m = sc.nextInt();
		
		move(n, 1, m);
		
	}

}