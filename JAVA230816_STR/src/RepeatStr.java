import java.util.Scanner;

public class RepeatStr {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
				
		for(int i=0; i<num; i++) {
			int input = sc.nextInt();
			
			String a = sc.next();
			
			String result = "";
			
			for(char arr : a.toCharArray()) {
				result += (arr+"").repeat(input);
			}
			
			System.out.println(result);
		}

	}
}
