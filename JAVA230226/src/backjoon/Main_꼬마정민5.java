package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_��������5  {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String str[] = s.split(" ");
		
		String sum = "";
		
		for(int i = 0; i<str.length; i++) {
			sum += str[i]; 
			bw.write(sum);
			bw.newLine();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}

//	�Է� : a bc def
//	��� : 
//	a
//	abc
//	abcdef

