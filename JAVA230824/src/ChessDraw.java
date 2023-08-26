import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChessDraw {
	public static boolean[][] arr;
	public static int min = 64;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String inputArr[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(inputArr[0]);
		int m = Integer.parseInt(inputArr[1]);
		
		arr = new boolean[n][m];
		
		for(int i=0; i<n; i++) {			
			String input = br.readLine();
			
			for (int j = 0; j < m; j++) {
				if (input.charAt(j) == 'W') {
					arr[i][j] = true;		// W일 때는 true 
				} else {
					arr[i][j] = false;		// B일 때는 false
				}
			}
		}
		
		for (int i = 0; i < n-7; i++) {
			for (int j = 0; j < m-7; j++) {
				min = find(i, j);
			}
		}
		System.out.println(min);
	}
	

	static int find(int x, int y) {
		int cnt = 0;
 
		boolean tf = arr[x][y];	// 첫 번째 칸의 색 
 
		for (int i = x; i < x+8; i++) {
			for (int j = y; j < y+8; j++) {
 
				if (arr[i][j] != tf) {	
					cnt++;
				}
				tf = !tf;
			}
			tf = !tf;
		}
		
		cnt = Math.min(cnt, 64 - cnt);
		
		return Math.min(min, cnt);
	}
}
