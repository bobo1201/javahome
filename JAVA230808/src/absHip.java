import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class absHip {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
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
			
			int input = sc.nextInt();
			
			if(input == 0) {
				if(priorityQueue.size() <= 0) System.out.println("0");
				else {
					System.out.println(priorityQueue.poll());
				}
			}else {priorityQueue.add(input);}
			
		}
		
	}
}
