import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class StrSet2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		String inputStr[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(inputStr[0]);
		
		int m = Integer.parseInt(inputStr[1]);
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			hashMap.put(input, hashMap.getOrDefault(input, 0) + 1);
		}
		
		
		int cnt = 0;
				
		for(int i=0; i<m; i++) {
			String find = br.readLine();

			if(hashMap.containsKey(find)) {
				cnt++;
			}	
		}
		
		System.out.println(cnt);
		
	}
}
