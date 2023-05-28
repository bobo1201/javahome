import java.util.Scanner;
import java.util.Stack;

public class Recur4 {
	static void recur(int n) {
		Stack s = new Stack();
		while(true) {
			if(n > 0) {
				s.add(n);
				n = n-1;
				continue;
			}
			if(s.isEmpty() != true) {
				n = (int)s.pop();
				System.out.println(n);
				n = n-2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("������ �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		recur(n);
	}
}