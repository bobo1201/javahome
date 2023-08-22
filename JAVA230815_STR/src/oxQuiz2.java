import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class oxQuiz2 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		int sum[] = new int[num];

		
		for(int i=0; i<num; i++) {
			String input = br.readLine();		
			
			int cnt = 1;
			
			for(char str : input.toCharArray()) {
				if(str == 'O') {
					sum[i] += cnt++;
				} else {
					cnt = 1;
				}
			}
		}
		
		for(int result : sum) {
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
}
