import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutTree {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		List<Integer> inputList = new ArrayList<>();

		int min = 0;
		
		long sum = 0;
		
		for(int i=0; i<n; i++) {
			int input = sc.nextInt();
			inputList.add(input);
			
			sum += input;
		}
		
		int max = Collections.max(inputList);
		
		while(true) {
			int mid = (min+max)/2;
						
			long tempSum = sum;
			
			for(int i=0; i<n; i++) {
				int temp = inputList.get(i);
				if(temp>mid) {
					tempSum -= mid;
				} else {
					tempSum -= temp;
				}
			}
			
			if(tempSum == m) {
				System.out.println(mid);
				break;
			} else if(tempSum > m) {
				min = mid;
			} else {
				max = mid;
			}
		}
	}
}
