import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Stack2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int ptr = 0;
        String a;
        
        for(int i=0; i<n; i++) {
            a = br.readLine();
            
            
			switch(a) {
			case "top" : 
				if(ptr == 0) System.out.println(-1);
				else System.out.println(arr[ptr - 1]);
				break;
			case "pop" : 
				if(ptr == 0) System.out.println(-1);
				else System.out.println(arr[--ptr]);
				break;
			case "size" : System.out.println(ptr);
				break;
			case "empty" : 
				if(ptr == 0) System.out.println(1);
				else System.out.println(0);
				break;
			default :
				if(a.substring(0, 4).equals("push")) {
					arr[ptr++] = Integer.parseInt(a.substring(5));
				}
				break;
			}
        }       
        br.close();
        bw.flush();
        bw.close();
    }
}
