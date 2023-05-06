import java.util.Scanner;

public class Stack {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
//		 Integer.parseInt(sc.nextLine());

		int[] arr = new int[n];
		int ptr = 0;
		String a;
		
		a = sc.nextLine();
				
		for(int i=0; i<n; i++) {
			a = sc.nextLine();
			
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
	}
}