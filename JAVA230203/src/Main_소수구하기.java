import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_소수구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=m; i<=n; i++) {
			int a = 0;
			for(int j=2; j<=Math.sqrt(i); j++) {	
				if(i % j == 0) {
					a++;
				}
				if(a > 0) break;
			}
			if(i > 1) {
				if(a == 0) {
					System.out.println(i);
				}				
			}
		}
		
		br.close();
	}
}
