import java.util.Scanner;

public class GroupWordChecker {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int cnt = num;
				
		for(int i=0; i<num; i++) {
			String input = sc.next();
			
			boolean[] word = new boolean[26];
			
			word[(int)input.charAt(0)-97] = true;
			
			for(int j=1; j<input.length(); j++) {
				char now = input.charAt(j);
				
				if(now == input.charAt(j-1)) continue;
				
				if(word[(int)now - 97]) {
					cnt--;
					break;
				}
				
				word[(int)now - 97] = true;
			}
		}
		
		System.out.println(cnt);
	}
}
