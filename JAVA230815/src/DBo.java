import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DBo {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();

		
		for(int i=0; i<n+m; i++) {
			String input = sc.next();
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
