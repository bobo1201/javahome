import java.util.Scanner;

public class LostGwalHo {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String input[] = sc.nextLine().split("-");
		
		int sum = 0;
		
		for(int i=0; i<input.length; i++) {
			String plus[] = input[i].split("\\+");
			
			for(int j=0; j<plus.length; j++) {
				if(i==0) {
					sum += Integer.parseInt(plus[j]);
				} else {
					sum -= Integer.parseInt(plus[j]);
				}
			}
		}
		System.out.println(sum);
		
	}
}
