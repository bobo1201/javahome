package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_��������4  {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����

		String s = br.readLine();
		String str[] = s.split(" ");
		
		long sum = 0;
		
		for(int i = 0; i<str.length; i++) {
			sum += Long.parseLong(str[i]); 
		}
		
		System.out.println(sum);
	}
}
