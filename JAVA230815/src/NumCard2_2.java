import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class NumCard2_2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		
		String inputStr[] = br.readLine().split(" ");

		for(int i=0; i<n; i++) {
			int input = Integer.parseInt(inputStr[i]);
			hashMap.put(input, hashMap.getOrDefault(input, 0) + 1);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		String findStr[] = br.readLine().split(" ");

				
		for(int i=0; i<m; i++) {
			int find = Integer.parseInt(findStr[i]);
			
			sb.append(hashMap.getOrDefault(find, 0)).append(" ");
			
		}
		
		System.out.println(sb);
		
	}
}
