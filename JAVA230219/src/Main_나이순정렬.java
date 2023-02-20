
import java.util.Scanner;

public class Main_나이순정렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int age[] = new int[n];
		String name[] = new String[n];
		
		for(int i=0; i<n; i++) {
			age[i] = sc.nextInt();
			name[i] = sc.nextLine();
		}
		
		for(int i=n; i > 0; i--) {
			for(int j=0; j < i-1; j++) {
				int temNum = 0;
				String temStr = "";
				if(age[j] > age[j+1]) {
					temNum = age[j];
					age[j] = age[j+1];
					age[j+1] = temNum;
					
					temStr = name[j];
					name[j] = name[j+1];
					name[j+1] = temStr;
				}		
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(age[i] + " " + name[i]);
		}
	}
}
