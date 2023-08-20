import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StrSet {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			String input = sc.next();
			hashMap.put(input, hashMap.getOrDefault(input, 0) + 1);
		}
		
		StringBuilder sb = new StringBuilder();
		
		int cnt = 0;
				
		for(int i=0; i<m; i++) {
			String find = sc.next();
			
			if(hashMap.containsKey(find)) {
				cnt++;
			}	
		}
		
		System.out.println(cnt);
		
	}
}
