import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class yosepuse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
				
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		
		String answer = "<";
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<k; j++) {
				queue.add(queue.poll());
			}
			answer += queue.poll();
			if(i != n-1) answer += ", ";
		}
		
		answer += ">";
		
		System.out.println(answer);

		
	}
}
