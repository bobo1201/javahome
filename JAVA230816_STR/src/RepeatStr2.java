import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatStr2 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
				
		int num = Integer.parseInt(br.readLine());
				
		for(int i=0; i<num; i++) {
			String input[] = br.readLine().split(" ");
			
			int inNum = Integer.parseInt(input[0]);
						
			
			for(char arr : input[1].toCharArray()) {
				sb.append((arr+"").repeat(inNum));
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);

	}
}
