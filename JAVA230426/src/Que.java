import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Que {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
//		 Integer.parseInt(sc.nextLine());

		int[] arr = new int[n];
		int ft = 0; // front
		int rear = 0;
		String a;
						
		for(int i=0; i<n; i++) {
			a = br.readLine();
			
			switch(a) {
			case "front" : 
				if(rear-ft == 0) System.out.println(-1);
				else System.out.println(arr[ft]);
				break;
			case "back":
				if(rear-ft == 0) System.out.println(-1);
				else System.out.println(arr[rear - 1]);
				break;
			case "pop" : 
				if(rear-ft == 0) System.out.println(-1);
				else System.out.println(arr[ft++]);
				break;
			case "size" : System.out.println(rear-ft);
				break;
			case "empty" : 
				if(rear-ft == 0) System.out.println(1);
				else System.out.println(0);
				break;
			default :
				if(a.substring(0, 4).equals("push")) {
					arr[rear++] = Integer.parseInt(a.substring(5));
				}
				break;
			}
		}				
        br.close();
	}
}