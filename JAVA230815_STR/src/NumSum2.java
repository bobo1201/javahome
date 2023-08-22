import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumSum2 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		
		int sum = 0;
		
		for(char str : input.toCharArray()) {
			sum += (int)str - 48;
		}
		
		sb.append(sum);
		
		System.out.println(sb);
	}
}
