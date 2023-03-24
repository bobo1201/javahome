import java.util.Scanner;
import java.util.Random;

public class D01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int computerChoice = Math.abs(random.nextInt()%3)+1;
		int myChoice = scanner.nextInt();
		
		System.out.println(computerChoice);
		
		if(myChoice == computerChoice) {
			System.out.println("¹«½ÂºÎ");
		}
		else if(myChoice == 1) {
			if(computerChoice == 2) {
				System.out.println("½Â¸®");
			}
			else {
				System.out.println("ÆÐ¹è");
			}
		}
		else if(myChoice == 2) {
			if(computerChoice == 3) {
				System.out.println("½Â¸®");
			}
			else {
				System.out.println("ÆÐ¹è");
			}
		}
		else {
			if(computerChoice == 1) {
				System.out.println("½Â¸®");
			}
			else {
				System.out.println("ÆÐ¹è");
			}
		}
	}	
}