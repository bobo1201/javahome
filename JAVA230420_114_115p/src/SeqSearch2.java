import java.util.Scanner;

public class SeqSearch2 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cnt = -1;
		for(int i=0; i<n; i++) {
			if(i == 0) {
				cnt = 0;
			}
			if(a[i] == key) {
				idx[cnt++] = i;				
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int x[] = new int[num];
		int y[] = new int[num];
		
		for(int i=0; i<x.length; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = searchIdx(x, num, ky, y);
		
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println("일치하는 요소수는 " + idx + "개 입니다.");
			for(int i=0; i<idx; i++) {
				System.out.println("그 값은 idx[" + y[i] + "]에 있습니다.");				
			}
		}
	}
}
