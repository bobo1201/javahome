import java.util.Scanner;

public class Palindrome_backjoon2 {
	static int cnt;
	
	static int check(String a, int x, int y) {
		cnt++;
		if(x >= y) return 1;
		else if(a.charAt(x) != a.charAt(y)) return 0;
		else return check(a, x+1, y-1);
	}
	
	static int isPalindrome(String a) {
		return check(a, 0, a.length()-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			String a = sc.next();
			System.out.println(isPalindrome(a) + " " + cnt);
			cnt = 0;
		}
	}

}