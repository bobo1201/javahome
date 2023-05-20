import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		int ft = 0; // front
		int rear = 0;
						
		for(int i=0; i<n; i++) {
			String[] input = br.readLine().split(" ");
			
			switch(input[0]) {
			case "front" : 
				if(rear-ft == 0) sb.append("-1\n");
				else sb.append(arr[ft] + "\n");
				break;
			case "back":
				if(rear-ft == 0) sb.append("-1\n");
				else sb.append(arr[rear - 1] + "\n");
				break;
			case "pop" : 
				if(rear-ft == 0) sb.append("-1\n");
				else sb.append(arr[ft++] + "\n");
				break;
			case "size" : sb.append(rear-ft + "\n");
				break;
			case "empty" : 
				if(rear-ft == 0) sb.append("1\n");
				else sb.append("0\n");
				break;
			default :
				if(input[0].substring(0, 4).equals("push")) {
					arr[rear++] = Integer.parseInt(input[1]);
				}
				break;
			}
		}
        System.out.print(sb.toString());
        br.close();
	}
}