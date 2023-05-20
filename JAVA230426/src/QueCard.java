
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueCard {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<Integer>();
		
		int n;
		
		do {
			n = sc.nextInt();
		} while(n < 1 || n > 500000);
				
		for(int i=0; i<n; i++) {
			que.add(i+1);
		}
		
		while(n > 1) {			
			que.poll();
			
			int a = que.poll();
			
			que.add(a);
						
			n--;
		}
		
		System.out.println(que.poll());
	}
}