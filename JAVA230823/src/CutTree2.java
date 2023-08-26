import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CutTree2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String inputArr[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(inputArr[0]);
		
		int m = Integer.parseInt(inputArr[1]);
		
		List<Integer> inputList = new ArrayList<>();

		int min = 0;
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) { 
			inputList.add(Integer.parseInt(st.nextToken()));
	    }
		
		int max = Collections.max(inputList);
		
		while(min < max) {
			int mid = (min+max)/2;
						
			long sum = 0;
			
			for(int tree : inputList) {
				if(tree-mid > 0) {
					sum += (tree-mid);					
				}
			}
			
			if(sum >= m) {
				min = mid+1;
			} else {
				max = mid;
			}
		}
		
		System.out.println(min - 1);
	}
}
