import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack4 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		int ptr = 0;
						
		for(int i=0; i<n; i++) {
			String[] input = br.readLine().split(" ");

            switch (input[0]) {
			case "top" : 
                if (ptr == 0) sb.append("-1\n");
                else sb.append(arr[ptr - 1] + "\n");
				break;
			case "pop" : 
                if (ptr == 0) sb.append("-1\n");
                else sb.append(arr[--ptr] + "\n");
				break;
			case "size" : 
                sb.append(ptr + "\n");
				break;
			case "empty" : 
                if (ptr == 0) sb.append("1\n");
                else sb.append("0\n");
				break;
			default :
				if(input[0].substring(0, 4).equals("push")) {
                    arr[ptr++] = Integer.parseInt(input[1]);
				}
				break;
			}
		}				
        System.out.print(sb.toString());
	}
}