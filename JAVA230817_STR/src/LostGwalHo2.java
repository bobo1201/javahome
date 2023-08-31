import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LostGwalHo2 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input[] = br.readLine().split("-");
		
		int sum = 0;
		
		for(int i=0; i<input.length; i++) {
			String plus[] = input[i].split("\\+");
			
			for(int j=0; j<plus.length; j++) {
				if(i==0) {
					sum += Integer.parseInt(plus[j]);
				} else {
					sum -= Integer.parseInt(plus[j]);
				}
			}
		}
		System.out.println(sum);
		
	}
}
