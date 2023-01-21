
import java.util.Scanner;

public class Main_repeat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String arr[] = new String[t];
		
		for(int i=0; i<t; i++) {
			arr[i] = "";
			int r = sc.nextInt();
			String s = sc.next();
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<r; k++) {
					arr[i] += s.charAt(j);
				}
			}
		}
		for(int i=0; i<t; i++) {
			System.out.println(arr[i]);
		}
	}
}
