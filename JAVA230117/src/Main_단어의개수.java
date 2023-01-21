
import java.util.Scanner;

public class Main_단어의개수 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		String b[] = a.split(" ");
		
		int num = 0;
		
		for(int i=0; i<b.length; i++) {
			if(b[i] != "") {
				num++;
			}
		}
		
		System.out.println(num);
	}
}
