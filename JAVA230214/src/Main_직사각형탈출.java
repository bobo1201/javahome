import java.util.Scanner;

public class Main_직사각형탈출 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		
		if(x-0 < w-x) {
			if(y-0 < h-y) {
				if(x-0 < y-0) {
					System.out.println(x-0);
				} else {
					System.out.println(y-0);
				}				
			} else {
				if(x-0 < h-y) {
					System.out.println(x-0);
				} else {
					System.out.println(h-y);
				}	
			}
		} else {
			if(y-0 > h-y) {
				if(w-x < h-y) {
					System.out.println(w-x);
				} else {
					System.out.println(h-y);
				}
			} else {
				if(w-x < y-0) {
					System.out.println(w-x);
				} else {
					System.out.println(y-0);
				}
			}
		}
	}
}
