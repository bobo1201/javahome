package ch05;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class HanoiTop {	
	static int num = 0;
	static ArrayList<String> list = new ArrayList<>(); 
	
//	String arr[] = new String[] {};
	
	static void hanoi(int n, int a, int b) {
		if(n > 0) {
			num++;
			hanoi(n-1, a, 6-a-b);

//			System.out.println(a + " " + b);
			
			list.add(a + " " + b);
			
			hanoi(n-1, 6-a-b, b);
		}
		
			
	}
	
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();       
		
        int n = Integer.parseInt(br.readLine());
		
		hanoi(n, 1, 3);
		
		sb.append(num).append("\n");
		
		for(String arr : list) {
            sb.append(arr).append("\n");
		}
		
        System.out.println(sb.toString());
		
        br.close();
	}
}