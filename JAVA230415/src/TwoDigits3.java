import java.util.Scanner;

public class TwoDigits3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("  | 1  2  3  4  5  6  7  8  9");
		System.out.println("--+---------------------------");
		
		for(int i=1; i <= 9; i++) {
			for(int j=1; j <= 9; j++) {
				if(j == 1) {
					System.out.printf("%2d|%2d", i, i * j);
				} else {
					System.out.printf("%3d", i * j);					
				}
			}
			System.out.println();
		}
	}
}
