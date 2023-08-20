import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DBo2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		String inNum[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(inNum[0]) + Integer.parseInt(inNum[1]);
		
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			
			hashMap.put(input, hashMap.getOrDefault(input, 0) + 1);
		}
				
		StringBuilder sb = new StringBuilder();
		
        List<String> keySet = new ArrayList<>();
				
		for(String key : hashMap.keySet()) {
			if(hashMap.get(key) > 1) {
				keySet.add(key);
			}
		}
		
		Collections.sort(keySet);
		
		sb.append(keySet.size()).append("\n");
		
		for(String key : keySet) {
			sb.append(key).append("\n");
		}		
		System.out.println(sb);
	}
}
