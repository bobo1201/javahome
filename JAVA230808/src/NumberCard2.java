import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NumberCard2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,Integer> map = new HashMap<>();//new에서 타입 파라미터 생략가능
		HashMap<String,Integer> map1 = new HashMap<>();//new에서 타입 파라미터 생략가능

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i=0; i<N+M; i++) {
			String key = sc.next();

			map.put(key, map.getOrDefault(key, 0) + 1);		
		}		
				
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		List<String> result = new ArrayList<>();
		
				
		for(String key : map.keySet()) {		
			if(map.get(key) > 1) {
				cnt++;
				result.add(key);
			}
		}
		
		System.out.println(cnt);
		
		Collections.sort(result);
		
		for(String key : result) {		
			System.out.println(key);
		}		
		
		
//		System.out.println(sb);
//		System.out.println(map1);
		
//		System.out.println(map.getOrDefault(map1, 0));
		
//		for(int i=0; i<map.size(); i++) {
//			System.out.println("[key]:" + i + " [Value]:" + map.get(i));
//		}
		
//		for(Integer i : map.keySet()){ //저장된 key값 확인
//		    System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
//		}
		
	}
}
