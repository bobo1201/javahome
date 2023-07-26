import java.util.HashMap;
import java.util.Scanner;

public class NumberCard2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer,Integer> map = new HashMap<>();//new에서 타입 파라미터 생략가능
		HashMap<Integer,Integer> map1 = new HashMap<>();//new에서 타입 파라미터 생략가능

		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int key = sc.nextInt();

//			map1.put(i, sc.nextInt());
			map.put(key, map.getOrDefault(key, 0) + 1);		
		}		
		
		int M = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M; i++) {
			int key = sc.nextInt();

//			map1.put(i, sc.nextInt());
//			map1.put(key, map1.getOrDefault(key, 0) + 1);
			
			sb.append(map.getOrDefault(key, 0)).append(' ');
		}	
		
//		System.out.println(map);
		
		System.out.println(sb);
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
