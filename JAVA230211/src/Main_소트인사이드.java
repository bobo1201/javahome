
import java.util.Scanner;

public class Main_소트인사이드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char arr[] = new char[a.length()];
		
		for(int i=0; i<a.length(); i++) {
			arr[i] = a.charAt(i);
		}
		
		for(int i=0; i<a.length(); i++) {
			char temp = 0;
			
			for(int j=i + 1; j<arr.length; j++) {
				if(arr[i] >= arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<a.length(); i++) {
			System.out.print(arr[a.length()-i-1]);
		}
	}
}
