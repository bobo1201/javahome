import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TenWord2 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		
		int end = input.length() % 10;
		
		while(input.length() > 0) {
			if(input.length()/10 > 0) {
				sb.append(input.substring(0, 10)).append("\n");
				input = input.substring(10);
			} else {
				sb.append(input.substring(0)).append("\n");
				break;
			}
		}
		
		System.out.println(sb);
	}
}
