import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class absHip2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1) < Math.abs(o2)) {
					return -1;
				} else if(Math.abs(o1) > Math.abs(o2)) {
					return 1;
				} else {
					if(o1 < o2) {
						return -1;
					} else if(o1 > o2) {
						return 1;
					} else {						
						return 0;
					}
				}
			}
			
		});
		
		
		for(int i=0; i<num; i++) {
			
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0) {
				if(priorityQueue.size() <= 0) sb.append("0").append("\n");
				else {
					sb.append(priorityQueue.poll()).append("\n");
				}
			}else {priorityQueue.add(input);}
			
		}
		System.out.println(sb);
	}
}
