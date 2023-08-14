import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class printerQueue {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
	
		for(int i=0; i<num; i++) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			Queue<Integer> queue = new LinkedList<>(); // 중요도
			Queue<Integer> numQue = new LinkedList<>(); // 인덱스

			for(int j=0; j<n; j++) {
				queue.add(sc.nextInt());
				numQue.add(j);
			}
			
			int cnt = 0;
			
			while(!queue.isEmpty()) {
				int max = Collections.max(queue);
				int idx = numQue.poll();
				int now = queue.poll();
				
				if(now == max) {
					cnt++;
					if(idx == m) {
						System.out.println(cnt);
						break;
					}
					
				} else {
					numQue.add(idx);
					queue.add(now);
				}
				
			}
		}
	}
}
