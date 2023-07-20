package ch05;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Star2 {	
	
	static void star(int n) {
		if(n > 0) {
			for(int i=0; i<n; i++) {
				if(i/(n/3) == 1) {
					for(int j=0; j<n; j++) {
						if(j/9==1) {
							System.out.print(" ");
						} else {
							if(i%3==1) {
								if(j%3 == 1) {
									System.out.print(" ");
								} else {
									System.out.print("*");
								}
							} else {
								System.out.print("*");
							}
						}
					}
					System.out.println();
				} else {
					for(int j=0; j<n; j++) {
						if(i%3==1) {
							if(j%3 == 1) {
								System.out.print(" ");
							} else {
								System.out.print("*");
							}
						} else {
							System.out.print("*");
						}
					}
					System.out.println();
				}
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();       
		
		int n;
		
		do {
			n = Integer.parseInt(br.readLine());
			
		} while (n % 3 != 0);
		
		star(n);
		
        br.close();
	}
}