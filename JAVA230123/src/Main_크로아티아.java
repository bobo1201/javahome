
import java.util.Scanner;

public class Main_크로아티아 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arr[] = {"c=", "c-", "dz=", "d-",
				"lj", "nj", "s=", "z="};
		
		String a = sc.nextLine();
		
		int cnt = 0;
		
		for(int i=0; i<arr.length-2; i++) {
			String b = a.substring(i, i+3);
			System.out.println("b : " + b);
			for(int j=0; j<arr.length; j++) {
				System.out.println("index :" + b.indexOf(arr[j]));
				System.out.println("2 :" + arr[j]);
				if(b.indexOf(arr[j]) > -1) {
					cnt++;
				}
			}
			System.out.println("cnt : " + cnt);
			System.out.println();
		}
//		a = a.replace(arr[i], " ");
		int len = a.length() - a.replace(" ", "").length();
		a = a.replace(" ", "");
		System.out.println(a);
		
		System.out.println(cnt + a.length());

	}
}
