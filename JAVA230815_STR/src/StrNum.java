import java.util.Scanner;

public class StrNum {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine().trim();
		
		System.out.println(input);
				
		String[] inputTrim = input.split(" ");
		
		if(input.equals("")) {
			System.out.println(0);
		} else {
			System.out.println(inputTrim.length);

		}
	}
}
