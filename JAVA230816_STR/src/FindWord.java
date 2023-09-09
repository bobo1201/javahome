import java.util.Scanner;

public class FindWord {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
				
		int index[] = new int[26];
		
		for(int i=0; i<index.length; i++) {
			index[i] = -1;
		}
		
		for(char str : word.toCharArray()) {
			if(word.indexOf(str) > -1) {
				index[str - 97] = word.indexOf(str);
			}
		}
		
		for(int i=0; i<index.length; i++) {
			System.out.print(index[i] + " ");
		}
	}
}
