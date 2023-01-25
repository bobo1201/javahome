
import java.util.Scanner;

public class Main_그룹단어체커 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String arr[] = new String[n]; 
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.next();
			for(int j=0; j<arr[i].length(); j++) {
				char a = arr[i].charAt(j);
				for(int k=j+1; k<arr[i].length(); k++) {
					if(a == arr[i].charAt(k)) {
						if(a != arr[i].charAt(i+1) && )
					}
				}
			}
		}
	}
}
