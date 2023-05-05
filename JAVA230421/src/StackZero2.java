import java.util.Scanner;
import java.util.Stack;

public class StackZero2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// stack 내장 함수 사용하기
		Stack<Integer> s = new Stack<>();
		
		int k = sc.nextInt();
		int a;
		int sum = 0;
		
		for(int i=0; i<k; i++) {
			do {
				a = sc.nextInt();
				
				if(a == 0) {
					sum -= s.pop();
				} else {
					
					sum += s.push(a);
				}
				
			} while(a > 100000 && a < 1);
		}
				
		System.out.println(sum);
	}
}