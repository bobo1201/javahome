import java.util.HashMap;
import java.util.Map.Entry;

public class NumberCard {
	public static void main(String args[]) {
		HashMap<Integer,Integer> map1 = new HashMap<>();//new���� Ÿ�� �Ķ���� ��������

		map1.put(1, 10);
		map1.put(1, 10);
		map1.put(3, 11);
		map1.put(1, 10);
		map1.put(5, 15);
		map1.put(6, 10);
		map1.put(7, 16);
		map1.put(8, 11);
		
		System.out.println(map1);
		
		for(int i=0; i<map1.size(); i++) {
			System.out.println("[key]:" + i + " [Value]:" + map1.get(i));
		}
		
		for(Integer i : map1.keySet()){ //����� key�� Ȯ��
		    System.out.println("[Key]:" + i + " [Value]:" + map1.get(i));
		}
		
	}
}
