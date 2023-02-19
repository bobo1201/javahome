
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_최소공배수2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
	
			int max = 1;
			int c = 2;
			
			if(a == 1 || b == 1) {
				if(a > b) {
					bw.write(a + "\n");					
				} else {
					bw.write(b + "\n");										
				}
			} else {
				while(a*b/c > 0) {
					if(a % c == 0 && b % c == 0) {
						a /= c;
						b /= c;
						max *= c;
					} else {
						c++;
					}
				}					
				bw.write((max * a * b) + "\n");
			}
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}
}




		


