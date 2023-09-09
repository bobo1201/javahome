import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudyWord {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next().toUpperCase();
		
		HashMap<String, Integer> hashMap = new HashMap<>();
				
		for(int i=0; i<word.length(); i++) {
			char arr[] = word.toCharArray();
			hashMap.put(arr[i]+"", hashMap.getOrDefault(arr[i]+"", 0) + 1);
		}
		
//		System.out.println(hashMap);
//		System.out.println(Collections.max(hashMap.values()));
		
		int i=0;
		
		int max = Collections.max(hashMap.values());
		
		String maxKey = "";
		
//		System.out.println(hashMap.values());

		
//		for(int val : hashMap.values()) {
//			if(val == max) {
//				i++;
////				maxKey = hashMap.get(hashMap.keySet());
//			}
//		}
		

        for(Entry<String, Integer> map : hashMap.entrySet()){
        	if(max == map.getValue()) {
        		i++;
        		maxKey = map.getKey();
        	}
        }
        
//		System.out.println(i);
		
		System.out.println(i==1?maxKey:"?");

		
	}
}
