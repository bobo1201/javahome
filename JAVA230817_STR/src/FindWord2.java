import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindWord2 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
				
		String word = br.readLine();
				
		int index[] = new int[26];
		
		for(int i=0; i<index.length; i++) {
			index[i] = -1;
		}
		
		for(char str : word.toCharArray()) {
				index[str - 97] = word.indexOf(str);
		}
		
		for(int i=0; i<index.length; i++) {
			sb.append(index[i]).append(" ");
		}
		
		System.out.println(sb);
	}
}
