import java.util.Scanner;

public class Main_�ڵ���ü�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String a = "";
		
		for(int i=0; i<(n)/4; i++) {
			a += "long ";
		}
		
		a+= "int";
		
		System.out.println(a);
	}
}
