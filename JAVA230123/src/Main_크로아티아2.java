
import java.util.Scanner;

public class Main_크로아티아2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arr[] = {"c=", "c-", "dz=", "d-",
				"lj", "nj", "s=", "z="};
		
		String a = sc.nextLine();
		
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(a.indexOf(arr[i]) > -1) {
				if(arr[i].length() == 2) {
					cnt += a.length() - a.replace(arr[i], " ").length();					
					a = a.replace(arr[i], " ");
				} else {
					int b = a.length() - a.replace(arr[i], " ").length();
					cnt += b / 2;
					a = a.replace(arr[i], " ");
				}
			}
		}
		a = a.replace(" ", "");
		
		System.out.println(cnt + a.length());

	}
}
