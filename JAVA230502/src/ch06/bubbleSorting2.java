package ch06;
import java.util.Scanner;

public class bubbleSorting2 {
	
	static void swap(int a[], int b, int c) {
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}
	
	static void bubbleSort(int a[], int n) {
		for(int i=0; i<n; i++) {
			int cnt = 0;
			for(int j=n-1;j>0; j--) {
				if(a[j-1] > a[j]) {
					swap(a, j - 1, j);
					cnt++;
				}
			}
			if(cnt == 0) break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 1)");
		System.out.print("요솟수: ");
		int n = sc.nextInt();
		int x[] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, n);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<n; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}