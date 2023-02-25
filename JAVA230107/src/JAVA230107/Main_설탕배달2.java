package JAVA230107;

import java.util.Scanner;

public class Main_설탕배달2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 0;
		while(n%5!=0){
			n -= 3;
			num++;
		}
		if(n < 0) System.out.println(-1);
		else{
			num += n/5;				
			System.out.println(num);
		}
		
	}
}
