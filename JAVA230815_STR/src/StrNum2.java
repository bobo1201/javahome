import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StrNum2 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
				
		String input = br.readLine().trim();
				
		String[] inputTrim = input.split(" ");
		
		
		if(input.equals("")) {
			sb.append(0);
		} else {
			sb.append(inputTrim.length);
		}
		System.out.println(sb);
	}
}
