package JAVA1225;

import java.util.Scanner;

public class Main_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			int H = 0;
			int M = 0;
			
			do {
				H = sc.nextInt();
				M = sc.nextInt();						
			}while(H < 0 || H > 24 || M < 0 || M > 60);
			
			
			if(M < 45) {
				if(H > 0) {
					H -= 1;
				} else {
					H = 23;
				}
				M = 60 + M - 45 ;				
			} else {
				M -= 45;
			}
			
			System.out.println(H + " " + M);
	}
}

//		Scanner s=new Scanner(System.in);
//		int h=60*s.nextInt()+s.nextInt()+1395;
//		System.out.print(h/60%24+" "+h%60);
