package JAVA1231;

import java.util.Scanner;

public class Main_숫자의개수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int mul = 1;
		int arr[] = new int[10];
		
		for(int i=0; i < 3; i++) {
			a = sc.nextInt();
			mul *= a;
		}
		
		String temp = String.valueOf(mul);
		
		for(int i=0; i<temp.length(); i++) {
			arr[Integer.parseInt(temp.substring(i,i+1))]++;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
	}
}
