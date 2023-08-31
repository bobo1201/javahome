import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordChecker2 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
				
		int num = Integer.parseInt(br.readLine());
		
		
		int cnt = num;
						
		for(int i=0; i<num; i++) {
			String word = br.readLine();
			
			boolean[] tf = new boolean[26];
			
			int first = word.charAt(0)-97;
			
			tf[first] = true;
			
			for(int j=1; j<word.length(); j++) {
				char now = word.charAt(j);
				
				if(now == word.charAt(j-1)) continue;
				
				if(tf[now-97]) {
					cnt--;
					break;
				}
				
				tf[now-97] = true;
			}
		}
		
		System.out.println(sb.append(cnt));
	}
}
