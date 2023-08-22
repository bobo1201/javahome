import java.util.Scanner;

public class NumSum {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String input = sc.next();
		
		int sum = 0;
		
		for(char str : input.toCharArray()) {
			sum += (int)str - 48;
		}
		
		System.out.println(sum);
	}
}
