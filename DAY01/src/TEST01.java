import java.util.Scanner;

public class TEST01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int oddNumber = 0;
		int evenNumber = 0;
		
		for(int i = 0; i <= 10; i++) {
			if(i%2 == 0) {
				evenNumber = evenNumber + i;
//			if(i%2 == 1) {
//				System.out.println(i);
//				oddNumber = oddNumber + i;
			}
		}
//		System.out.println("È¦¼öÀÇ ÇÕÀº : " + oddNumber);
		System.out.println("Â¦¼öÀÇ ÇÕÀº : " + evenNumber);
	}
}
