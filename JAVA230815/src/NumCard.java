import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumCard {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int input = sc.nextInt();
			hashMap.put(input, hashMap.getOrDefault(input, 0) + 1);
		}
		
		int m = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
				
		for(int i=0; i<m; i++) {
			int find = sc.nextInt();
			
			sb.append(hashMap.getOrDefault(find, 0)).append(" ");
			
		}
		
		System.out.println(sb);
		
	}
}
