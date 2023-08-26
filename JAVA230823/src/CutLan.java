import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutLan {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		String inputArr[] = br.readLine().split(" ");
		
		int k = Integer.parseInt(inputArr[0]);
		
		int n = Integer.parseInt(inputArr[1]);
		
		List<Integer> inputList = new ArrayList<>();

		for(int i=0; i<k; i++) {
			inputList.add(Integer.parseInt(br.readLine()));
		}
				
		long max = Collections.max(inputList);
		
		max++; 
		
		long min = 0;
		
		while(min < max) {
			long mid = (min+max)/2;
			
			long sum = 0;
			
			for(int lan : inputList) {
				sum += (lan/mid);
			}
			
			if(sum < n) {
				max = mid;
			} else {		
				min = mid +1;
			}
		}
	
		System.out.println(min - 1);			
		
	}
}
